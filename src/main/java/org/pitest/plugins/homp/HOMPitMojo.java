package org.pitest.plugins.homp;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.pitest.functional.Option;
import org.pitest.maven.AbstractPitMojo;
import org.pitest.maven.MojoToReportOptionsConverter;
import org.pitest.maven.SurefireConfigConverter;
import org.pitest.mutationtest.config.ReportOptions;
import org.pitest.mutationtest.tooling.CombinedStatistics;
import org.pitest.plugins.homp.config.HOReportOptionsDelegate;

@Mojo(name = "mutationCoverage",
        defaultPhase = LifecyclePhase.VERIFY,
        requiresDependencyResolution = ResolutionScope.TEST,
        threadSafe = true)
public class HOMPitMojo extends AbstractPitMojo {

    @Parameter(property = "strategy")
    private String strategy;

    @Override
    protected Option<CombinedStatistics> analyse() throws MojoExecutionException {
        final ReportOptions data = new MojoToReportOptionsConverter(this,
                new SurefireConfigConverter(), this.filter).convert();
        HOReportOptionsDelegate hoData = new HOReportOptionsDelegate(data);
        hoData.setHigherOrderMutation(getStrategy());

        return Option.some(this.goalStrategy.execute(detectBaseDir(), hoData,
                this.plugins, getEnvironmentVariables()));
    }

    public String getStrategy() {
        return strategy;
    }
}

package org.pitest.plugins.homp.plugin;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.pitest.maven.AbstractPitMojo;

@Mojo(name = "mutationCoverage",
        defaultPhase = LifecyclePhase.VERIFY,
        requiresDependencyResolution = ResolutionScope.TEST,
        threadSafe = true)
public class HOMPitMojo extends AbstractPitMojo {
}

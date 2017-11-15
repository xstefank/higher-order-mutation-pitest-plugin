package org.pitest.plugins.homp.config;

import org.pitest.classpath.ClassFilter;
import org.pitest.classpath.ClassPath;
import org.pitest.classpath.ProjectClassPaths;
import org.pitest.functional.Option;
import org.pitest.functional.predicate.Predicate;
import org.pitest.mutationtest.config.ReportOptions;
import org.pitest.mutationtest.incremental.WriterFactory;
import org.pitest.testapi.TestGroupConfig;
import org.pitest.util.ResultOutputStrategy;

import java.io.File;
import java.io.Reader;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

public class HOReportOptionsDelegate extends ReportOptions {

    private final ReportOptions delegate;

    private String higherOrderMutation;

    public HOReportOptionsDelegate(ReportOptions delegate) {
        this.delegate = delegate;
    }

    public String getHigherOrderMutation() {
        return higherOrderMutation;
    }

    public void setHigherOrderMutation(String higherOrderMutation) {
        this.higherOrderMutation = higherOrderMutation;
    }


    @Override
    public boolean isVerbose() {
        return delegate.isVerbose();
    }

    @Override
    public String getReportDir() {
        return delegate.getReportDir();
    }

    @Override
    public void setReportDir(String reportDir) {
        delegate.setReportDir(reportDir);
    }

    @Override
    public Collection<File> getSourceDirs() {
        return delegate.getSourceDirs();
    }

    @Override
    public Collection<String> getClassPathElements() {
        return delegate.getClassPathElements();
    }

    @Override
    public void setClassPathElements(Collection<String> classPathElements) {
        delegate.setClassPathElements(classPathElements);
    }

    @Override
    public void setSourceDirs(Collection<File> sourceDirs) {
        delegate.setSourceDirs(sourceDirs);
    }

    @Override
    public Collection<String> getMutators() {
        return delegate.getMutators();
    }

    @Override
    public void setMutators(Collection<String> mutators) {
        delegate.setMutators(mutators);
    }

    @Override
    public Collection<String> getFeatures() {
        return delegate.getFeatures();
    }

    @Override
    public void setFeatures(Collection<String> features) {
        delegate.setFeatures(features);
    }

    @Override
    public int getDependencyAnalysisMaxDistance() {
        return delegate.getDependencyAnalysisMaxDistance();
    }

    @Override
    public void setDependencyAnalysisMaxDistance(int dependencyAnalysisMaxDistance) {
        delegate.setDependencyAnalysisMaxDistance(dependencyAnalysisMaxDistance);
    }

    @Override
    public List<String> getJvmArgs() {
        return delegate.getJvmArgs();
    }

    @Override
    public void addChildJVMArgs(List<String> args) {
        delegate.addChildJVMArgs(args);
    }

    @Override
    public ClassPath getClassPath() {
        return delegate.getClassPath();
    }

    @Override
    public Collection<Predicate<String>> getTargetClasses() {
        return delegate.getTargetClasses();
    }

    @Override
    public Predicate<String> getTargetClassesFilter() {
        return delegate.getTargetClassesFilter();
    }

    @Override
    public void setTargetClasses(Collection<Predicate<String>> targetClasses) {
        delegate.setTargetClasses(targetClasses);
    }

    @Override
    public void setTargetTests(Collection<Predicate<String>> targetTestsPredicates) {
        delegate.setTargetTests(targetTestsPredicates);
    }

    @Override
    public boolean isMutateStaticInitializers() {
        return delegate.isMutateStaticInitializers();
    }

    @Override
    public void setMutateStaticInitializers(boolean mutateStaticInitializers) {
        delegate.setMutateStaticInitializers(mutateStaticInitializers);
    }

    @Override
    public int getNumberOfThreads() {
        return delegate.getNumberOfThreads();
    }

    @Override
    public void setNumberOfThreads(int numberOfThreads) {
        delegate.setNumberOfThreads(numberOfThreads);
    }

    @Override
    public float getTimeoutFactor() {
        return delegate.getTimeoutFactor();
    }

    @Override
    public long getTimeoutConstant() {
        return delegate.getTimeoutConstant();
    }

    @Override
    public void setTimeoutConstant(long timeoutConstant) {
        delegate.setTimeoutConstant(timeoutConstant);
    }

    @Override
    public void setTimeoutFactor(float timeoutFactor) {
        delegate.setTimeoutFactor(timeoutFactor);
    }

    @Override
    public Collection<Predicate<String>> getTargetTests() {
        return delegate.getTargetTests();
    }

    @Override
    public Predicate<String> getTargetTestsFilter() {
        return delegate.getTargetTestsFilter();
    }

    @Override
    public Collection<String> getLoggingClasses() {
        return delegate.getLoggingClasses();
    }

    @Override
    public void setLoggingClasses(Collection<String> loggingClasses) {
        delegate.setLoggingClasses(loggingClasses);
    }

    @Override
    public Collection<Predicate<String>> getExcludedMethods() {
        return delegate.getExcludedMethods();
    }

    @Override
    public void setExcludedMethods(Collection<Predicate<String>> excludedMethods) {
        delegate.setExcludedMethods(excludedMethods);
    }

    @Override
    public void setVerbose(boolean verbose) {
        delegate.setVerbose(verbose);
    }

    @Override
    public void setExcludedClasses(Collection<Predicate<String>> excludedClasses) {
        delegate.setExcludedClasses(excludedClasses);
    }

    @Override
    public void addOutputFormats(Collection<String> formats) {
        delegate.addOutputFormats(formats);
    }

    @Override
    public Collection<String> getOutputFormats() {
        return delegate.getOutputFormats();
    }

    @Override
    public Collection<Predicate<String>> getExcludedClasses() {
        return delegate.getExcludedClasses();
    }

    @Override
    public boolean shouldFailWhenNoMutations() {
        return delegate.shouldFailWhenNoMutations();
    }

    @Override
    public void setFailWhenNoMutations(boolean failWhenNoMutations) {
        delegate.setFailWhenNoMutations(failWhenNoMutations);
    }

    @Override
    public ProjectClassPaths getMutationClassPaths() {
        return delegate.getMutationClassPaths();
    }

    @Override
    public ClassFilter createClassesFilter() {
        return delegate.createClassesFilter();
    }

    @Override
    public Collection<String> getCodePaths() {
        return delegate.getCodePaths();
    }

    @Override
    public void setCodePaths(Collection<String> codePaths) {
        delegate.setCodePaths(codePaths);
    }

    @Override
    public void setGroupConfig(TestGroupConfig groupConfig) {
        delegate.setGroupConfig(groupConfig);
    }

    @Override
    public TestGroupConfig getGroupConfig() {
        return delegate.getGroupConfig();
    }

    @Override
    public int getMutationUnitSize() {
        return delegate.getMutationUnitSize();
    }

    @Override
    public void setMutationUnitSize(int size) {
        delegate.setMutationUnitSize(size);
    }

    @Override
    public ResultOutputStrategy getReportDirectoryStrategy() {
        return delegate.getReportDirectoryStrategy();
    }

    @Override
    public void setShouldCreateTimestampedReports(boolean shouldCreateTimestampedReports) {
        delegate.setShouldCreateTimestampedReports(shouldCreateTimestampedReports);
    }

    @Override
    public boolean shouldCreateTimeStampedReports() {
        return delegate.shouldCreateTimeStampedReports();
    }

    @Override
    public boolean isDetectInlinedCode() {
        return delegate.isDetectInlinedCode();
    }

    @Override
    public void setDetectInlinedCode(boolean b) {
        delegate.setDetectInlinedCode(b);
    }

    @Override
    public WriterFactory createHistoryWriter() {
        return delegate.createHistoryWriter();
    }

    @Override
    public Option<Reader> createHistoryReader() {
        return delegate.createHistoryReader();
    }

    @Override
    public void setHistoryInputLocation(File historyInputLocation) {
        delegate.setHistoryInputLocation(historyInputLocation);
    }

    @Override
    public void setHistoryOutputLocation(File historyOutputLocation) {
        delegate.setHistoryOutputLocation(historyOutputLocation);
    }

    @Override
    public File getHistoryInputLocation() {
        return delegate.getHistoryInputLocation();
    }

    @Override
    public File getHistoryOutputLocation() {
        return delegate.getHistoryOutputLocation();
    }

    @Override
    public void setExportLineCoverage(boolean value) {
        delegate.setExportLineCoverage(value);
    }

    @Override
    public boolean shouldExportLineCoverage() {
        return delegate.shouldExportLineCoverage();
    }

    @Override
    public int getMutationThreshold() {
        return delegate.getMutationThreshold();
    }

    @Override
    public void setMutationThreshold(int value) {
        delegate.setMutationThreshold(value);
    }

    @Override
    public String getMutationEngine() {
        return delegate.getMutationEngine();
    }

    @Override
    public void setMutationEngine(String mutationEngine) {
        delegate.setMutationEngine(mutationEngine);
    }

    @Override
    public int getCoverageThreshold() {
        return delegate.getCoverageThreshold();
    }

    @Override
    public void setCoverageThreshold(int coverageThreshold) {
        delegate.setCoverageThreshold(coverageThreshold);
    }

    @Override
    public String getJavaExecutable() {
        return delegate.getJavaExecutable();
    }

    @Override
    public void setJavaExecutable(String javaExecutable) {
        delegate.setJavaExecutable(javaExecutable);
    }

    @Override
    public void setIncludeLaunchClasspath(boolean b) {
        delegate.setIncludeLaunchClasspath(b);
    }

    @Override
    public boolean isIncludeLaunchClasspath() {
        return delegate.isIncludeLaunchClasspath();
    }

    @Override
    public Properties getFreeFormProperties() {
        return delegate.getFreeFormProperties();
    }

    @Override
    public void setFreeFormProperties(Properties props) {
        delegate.setFreeFormProperties(props);
    }

    @Override
    public int getMaximumAllowedSurvivors() {
        return delegate.getMaximumAllowedSurvivors();
    }

    @Override
    public void setMaximumAllowedSurvivors(int maxSurvivors) {
        delegate.setMaximumAllowedSurvivors(maxSurvivors);
    }

    @Override
    public Collection<String> getExcludedRunners() {
        return delegate.getExcludedRunners();
    }

    @Override
    public void setExcludedRunners(Collection<String> excludedRunners) {
        delegate.setExcludedRunners(excludedRunners);
    }

    @Override
    public String toString() {
        String s = delegate.toString();
        return s.substring(0, s.length() - 1) + ", higherOrderMutation="
                + higherOrderMutation + "]";
    }
}

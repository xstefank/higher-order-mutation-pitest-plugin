package org.pitest.plugins.homp.group;

import org.pitest.classpath.CodeSource;
import org.pitest.mutationtest.build.MutationGrouper;
import org.pitest.mutationtest.build.MutationGrouperFactory;

import java.util.Properties;

public class NotGroupingMutationGrouperFactory implements MutationGrouperFactory {

    public String description() {
        return "not grouping mutation factory";
    }

    public MutationGrouper makeFactory(Properties properties, CodeSource codeSource, int i, int i1) {
        return new NotGroupingGrouper();
    }
}

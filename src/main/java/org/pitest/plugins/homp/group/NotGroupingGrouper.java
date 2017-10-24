package org.pitest.plugins.homp.group;

import org.pitest.classinfo.ClassName;
import org.pitest.mutationtest.build.MutationGrouper;
import org.pitest.mutationtest.engine.MutationDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NotGroupingGrouper implements MutationGrouper {

    public List<List<MutationDetails>> groupMutations(Collection<ClassName> codeClasses, Collection<MutationDetails> mutations) {
        List<MutationDetails> singleton = new ArrayList<MutationDetails>(mutations);
        List<List<MutationDetails>> groupedMutations = new ArrayList<List<MutationDetails>>(1);
        groupedMutations.add(singleton);

        return groupedMutations;
    }
}

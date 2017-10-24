package org.pitest.plugins.homp.strategy;

import org.pitest.mutationtest.engine.MutationDetails;
import org.pitest.mutationtest.engine.MutationEngine;
import org.pitest.plugins.homp.build.HigherOrderMutationDetails;

import java.util.List;

public class LastToFirstMutationStrategy implements MutationStrategy {

    public List<HigherOrderMutationDetails> processMutations(List<MutationDetails> firstOrderMutants, MutationEngine mutationEngine) {
        //TODO stub for now
        return null;
    }
}

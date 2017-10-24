package org.pitest.plugins.homp.strategy;

import org.pitest.mutationtest.engine.MutationDetails;
import org.pitest.mutationtest.engine.MutationEngine;
import org.pitest.plugins.homp.build.HigherOrderMutationDetails;

import java.util.List;

/**
 * Transforms a list of {@link MutationDetails}
 * into a list of {@link HigherOrderMutationDetails} by specific criteria
 */
public interface MutationStrategy {

    /**
     * Processes first order mutants to create a list of higher order mutants
     * @param firstOrderMutants FOM list or null
     * @return list of {@link HigherOrderMutationDetails} or null
     */
    List<HigherOrderMutationDetails> processMutations(List<MutationDetails> firstOrderMutants, MutationEngine mutationEngine);
}

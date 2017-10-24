package org.pitest.plugins.homp.strategy;

public enum StrategyDefinition {

    LAST_TO_FIRST("lastToFirst", new LastToFirstMutationStrategy())

    ;

    private String id;
    private MutationStrategy strategy;

    StrategyDefinition(String id, MutationStrategy strategy) {
        this.id = id;
        this.strategy = strategy;
    }

    public static StrategyDefinition findById(String id) {
        for (StrategyDefinition strategyDefinition : values()) {
            if (strategyDefinition.getId().equals(id)) {
                return strategyDefinition;
            }
        }

        return null;
    }

    public String getId() {
        return id;
    }

    public MutationStrategy getStrategy() {
        return strategy;
    }
}

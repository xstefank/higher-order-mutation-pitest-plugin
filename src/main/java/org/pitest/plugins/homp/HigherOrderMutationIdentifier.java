package org.pitest.plugins.homp;

import org.pitest.mutationtest.engine.MutationIdentifier;

import java.util.List;

public class HigherOrderMutationIdentifier {

    private List<MutationIdentifier> identifiers;

    public HigherOrderMutationIdentifier(List<MutationIdentifier> identifiers) {
        this.identifiers = identifiers;
    }

    public List<MutationIdentifier> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<MutationIdentifier> identifiers) {
        this.identifiers = identifiers;
    }
}

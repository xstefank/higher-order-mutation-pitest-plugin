package org.pitest.plugins.homp.group;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.pitest.classinfo.ClassName;
import org.pitest.mutationtest.engine.MutationDetails;

import java.util.Arrays;
import java.util.List;

public class NotGroupingGrouperTest {

    private NotGroupingGrouper testee;

    @Before
    public void setUp() {
        testee = new NotGroupingGrouper();
    }

    @Test
    public void testOnlyOneGroupIsCreated() {

        final List<List<MutationDetails>> actual = this.testee.groupMutations(
                Arrays.asList(ClassName.fromString("foo")), Arrays.asList(
                        createDetails("foo"), createDetails("foo"), createDetails("foo")));

        Assert.assertEquals(1, actual.size());
    }

    private MutationDetails createDetails(String name) {
        return new MutationDetails(null, name, "", 1, 1);
    }

}

package com.axxes.test;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CollectionUtilsTest {

    private CollectionUtils collectionUtils;

    @Before
    public void setUp() throws Exception {
        collectionUtils = new CollectionUtils();
    }

    @Test
    public void testSum() throws Exception {
        assertThat(collectionUtils.sum(Lists.newArrayList(0, 1, 2))).isEqualTo(3L);
    }
}
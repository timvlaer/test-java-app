package com.axxes.test;

import java.util.Collection;

public class CollectionUtils {
    public Long sum(Collection<Integer> collection) {
        long sum = 0;
        for (Integer elem : collection) {
            sum += elem;
        }
        return sum;
    }

}

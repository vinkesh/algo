package datastructures;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SegmentTreeTest {

    @Test
    public void shouldReturnSumOfWholeArray() throws Exception {
        SegmentTree segmentTree = new SegmentTree(Arrays.asList(1, 3, 2, 9, 10, 12));
        assertEquals((Integer) 37, segmentTree.getRangeSum(0, 5));
    }

    @Test
    public void shouldReturnSumOfRangeExactlyMatchingANode() throws Exception {
        SegmentTree segmentTree = new SegmentTree(Arrays.asList(1, 3, 2, 9, 10, 12));
        assertEquals((Integer) 6, segmentTree.getRangeSum(0, 2));
        assertEquals((Integer) 31, segmentTree.getRangeSum(3, 5));
    }

    @Test
    public void shouldReturnSumOfRangePartiallyMatchingANode() throws Exception {
        SegmentTree segmentTree = new SegmentTree(Arrays.asList(1, 3, 2, 9, 10, 12));
        assertEquals((Integer) 15, segmentTree.getRangeSum(0, 3));
        assertEquals((Integer) 24, segmentTree.getRangeSum(1, 4));
    }

    @Test
    public void shouldReturnSumOfRangeHavingOneValue() throws Exception {
        SegmentTree segmentTree = new SegmentTree(Arrays.asList(1, 3, 2, 9, 10, 12));
        assertEquals((Integer) 3, segmentTree.getRangeSum(1, 1));
        assertEquals((Integer) 1, segmentTree.getRangeSum(0, 0));
    }


    @Test
    public void update_shouldChangeSumOfRangeStoredInCorrespondingSegments() throws Exception {
        SegmentTree segmentTree = new SegmentTree(Arrays.asList(1, 3, 2, 9, 10, 12));
        segmentTree.update(2, 40);

        assertEquals((Integer) 42, segmentTree.getRangeSum(2, 2));
        assertEquals((Integer) 46, segmentTree.getRangeSum(0, 2));
        assertEquals((Integer) 77, segmentTree.getRangeSum(0, 5));

        assertEquals((Integer) 31, segmentTree.getRangeSum(3, 5));
    }



}
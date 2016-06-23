package datastructures;

import java.util.List;

public class SegmentTree<T> {
    SegmentNode node;
    public SegmentTree(List<T> data) {
        this.node = generateTree(data, 0, data.size() - 1);
    }

    private SegmentNode generateTree(List<T> data, int i, int j) {
        Integer sum = 0;
        for(int index = i; index <= j ; index++) {
            sum = sum + (Integer) data.get(index);
        }
        SegmentNode rootNode = new SegmentNode(i, j, sum);
        if(i != j) {
            Integer mid = (i + j)/2;
            rootNode.setLeft(this.generateTree(data, i, mid));
            rootNode.setRight(this.generateTree(data, mid+1, j));
        }

        return rootNode;
    }

    public Integer getRangeSum(int i, int j) {
        return this.node.getRangeSum(i, j);
    }

    public void update(int index, int diff) {
        node.update(index, diff);
    }


    private class SegmentNode {
        private Integer min;
        private Integer max;
        private Integer sum;
        private SegmentNode left = null;
        private SegmentNode right = null;

        public SegmentNode(Integer i, Integer j, Integer sum) {
            this.min = i;
            this.max = j;
            this.sum = sum;
        }

        public void setLeft(SegmentNode node) {
            this.left = node;
        }

        public void setRight(SegmentNode node) {
            this.right = node;
        }

        public Integer getMin() {
            return this.min;
        }

        public Integer getMax() {
            return this.max;
        }

        public Integer getSum() {
            return this.sum;
        }

        public Integer getRangeSum(int i, int j) {
            if(j < getMin() || i > getMax()) {
                return 0;
            }
            if(this.min == i && this.max == j) {
                return this.getSum();
            } else {
                return left.getRangeSum(i, Math.min(j, left.getMax())) + right.getRangeSum(Math.max(i, right.getMin()), j);
            }
        }


        public void update(int index, int diff) {
            if(index >= getMin() && index <= getMax()) {
                this.sum += diff;
            }
            int mid = (min + max) / 2;
            if(index <= mid && left != null) {
                left.update(index, diff);
            } else if(index > mid && right != null) {
                right.update(index, diff);
            }
        }
    }
}

package leecode;

import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftValue {
    public int findBottomLeftValue(FindBottomLeftValue.TreeNode root) {
        Queue<FindBottomLeftValue.TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.right != null) queue.offer(root.right);
            if (root.left != null) queue.offer(root.left);
        }
        return root.val;
    }

    class TreeNode {
        int val;
        FindBottomLeftValue.TreeNode left;
        FindBottomLeftValue.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, FindBottomLeftValue.TreeNode left, FindBottomLeftValue.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}


package leecode;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class IsCousins {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3, null, null));

    }

    static int xDeep;
    static int yDeep;
    static TreeNode xFather;
    static TreeNode yFather;
    static int xx;
    static int yy;

    public   boolean isCousins(TreeNode root, int x, int y) {
        xx = x;
        yy = y;
        add(root, null, 0);
        return (xDeep == yDeep) && (xFather != yFather);
    }

    public   void add(TreeNode root, TreeNode father, int deep) {
        if (root == null) {
            return;
        }
        if (root.val == xx) {
            xDeep = deep;
            xFather = father;
        }
        if (root.val == yy) {
            yDeep = deep;
            yFather = father;
        }
        deep += 1;
        add(root.left, root, deep);
        add(root.right, root, deep);
    }
}
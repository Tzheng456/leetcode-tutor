package Trees;


public class TreeProblems {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int key) {
            this.left = null;
            this.right = null;
            this.val = key;
        }
    }

    public void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    public void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    public int height(TreeNode root) {
        if (root == null) return 0;
        int leftH = height(root.left);
        int rightH = height(root.right);
        return 1 + Math.max(leftH, rightH);
    }

    public boolean identical(TreeNode rootA, TreeNode rootB) {
        if (rootA == null && rootB == null) return true;
        if (rootA == null || rootB == null) return false;
        if (rootA.val != rootB.val) return false;
        return identical(rootA.right, rootB.right) && identical(rootA.left, rootB.left);
    }

    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        return countNodes(root.left) + 1 + countNodes(root.right);
    }

//    public int countAncestors(TreeNode root) {
//        if (root == null) return 0;
//
//    }
    public static void main(String[] args) {

    }
}

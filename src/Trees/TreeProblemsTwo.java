package Trees;

import java.util.LinkedList;
import java.util.List;

public class TreeProblemsTwo {
    public static void main(String[] args) {

    }

    public boolean symmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        if (root.left == null || root.right == null) return false;
        return symmetric(root.left) && symmetric(root.right);
    }

    public int countNodesInRange(TreeNode root, int B, int C) {
        if (root == null) return 0;
        if (root.val < B) return countNodesInRange(root.right, B, C);
        if (root.val > C) return countNodesInRange(root.left, B, C);
        return 1+ countNodesInRange(root.left,B,C) + countNodesInRange(root.right,B,C);
    }

    public TreeNode invert(TreeNode root) {
        if (root == null) return null;
        TreeNode right = invert(root.right);
        TreeNode left = invert(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

    public void pathContsructor(TreeNode root, LinkedList<String> paths, String path) {
        if (root != null) {
            path += Integer.toString(root.val);
            if ((root.left == null) && (root.right == null)) paths.add(path);
            else {
                path += "->";
                pathContsructor(root.left, paths, path);
                pathContsructor(root.right, paths, path);
            }
        }
    }

    public List<String> pathToNode(TreeNode root) {
        LinkedList<String> paths = new LinkedList<>();
        pathContsructor(root, paths, "");
        return paths;
    }

    public boolean findKey(TreeNode root, int k) {
        if (root == null) return false;
        if (root.val == k) return true;
        else if (root.val > k) return findKey(root.left, k);
        else return findKey(root.right, k);
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

class Solution {
   HashMap<Integer, TreeNode> nodeMap = new HashMap<>();
    ArrayList<Integer> arr = new ArrayList<>();
    int ind = 0;

    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            arr.add(root.val);
            nodeMap.put(root.val, root);
            inorder(root.right);
        }
    }

    public TreeNode bstToGst(TreeNode root) {
        inorder(root);
        int sum = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            sum += arr.get(i);
            TreeNode node = nodeMap.get(arr.get(i));
            node.val = sum;
        }
        return root;
    }
}

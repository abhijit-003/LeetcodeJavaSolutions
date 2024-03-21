//Binary Tree Level Order Traversal
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();

        if (root == null)
            return resultList;

        q.offer(root);
        while (!q.isEmpty()) {
            List<Integer> subList = new LinkedList<>();
            int subLen = q.size();
            for (int i = 0; i < subLen; i++) {
                if (q.peek().left != null)
                    q.offer(q.peek().left);
                if (q.peek().right != null)
                    q.offer(q.peek().right);
                subList.add(q.poll().val);
            }
            resultList.add(subList);
        }
        return resultList;
    }
}

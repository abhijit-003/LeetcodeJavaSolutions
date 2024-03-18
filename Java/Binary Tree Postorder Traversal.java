//Binary Tree Postorder Traversal
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        while(true){
            if(root!=null){
                list.addFirst(root.val);
                stack.push(root);
                root = root.right;
            }else{
                if(stack.isEmpty())
                    break;
                root = stack.pop();
                root = root.left;
            }
        }
        return list;
    }
}

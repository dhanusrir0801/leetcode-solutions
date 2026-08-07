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

    List<Integer> ans = new ArrayList<>();
    int index = 0;

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {

        if (check(root, voyage)) {
            return ans;
        }

        return Arrays.asList(-1);
    }

    public boolean check(TreeNode node, int[] voyage) {

        if (node == null) {
            return true;
        }

        
        if (node.val != voyage[index]) {
            return false;
        }

        index++;

        
        if (node.left != null &&
            index < voyage.length &&
            node.left.val != voyage[index]) {

            ans.add(node.val);

            return check(node.right, voyage) &&
                   check(node.left, voyage);
        }

        
        return check(node.left, voyage) &&
               check(node.right, voyage);
    }
}
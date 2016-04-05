/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        if(root==null || (root.left==null && root.right==null))
        return true;

        if(root.left==null || root.right==null)
        return false;

    return isitSymmetric(root.left,root.right);
    }

        public boolean isitSymmetric(TreeNode n1,TreeNode n2)
        {
    if(n1==null && n2==null)
        return true;

    if(n1==null || n2==null)
        return false;
   
    if(n1.val==n2.val)
    {
        return isitSymmetric(n1.left,n2.right) && isitSymmetric(n1.right,n2.left);
    }
    else
    return false;
    }
}
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
    private Map<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map= new HashMap<>();
        for(int i=0; i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,0,0,inorder.length-1);
    }

    public TreeNode build(int[] preorder, int prestart, int instart, int inend){
        if(prestart > preorder.length-1 || instart > inend) return null;

        int root=preorder[prestart];
        TreeNode rootNode= new TreeNode(root);

        int mid=map.get(root);
        int leftside=mid- instart;

        rootNode.left=build(preorder, prestart+1, instart, mid-1);
        rootNode.right=build(preorder, prestart+leftside+1, mid+1, inend);

        return rootNode;
    }
}

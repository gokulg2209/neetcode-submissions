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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "";

        Queue<TreeNode> q=new LinkedList<>();
        StringBuilder s= new StringBuilder();

        q.add(root);

        while(!q.isEmpty()){
            TreeNode tree=q.poll();
            if(tree == null){
                s.append("n ");
                continue;
            }
            s.append(tree.val+" ");
            q.add(tree.left);
            q.add(tree.right);
        }
        // System.out.println(s.toString());
        return s.toString();   
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == "") return null;

        Queue<TreeNode> q=new LinkedList<>();
        String[] values= data.split(" ");

        TreeNode root=new TreeNode(Integer.parseInt(values[0]));
        q.add(root);

        for(int i=1; i<values.length;i++){
            TreeNode tree=q.poll();
            if(!values[i].equals("n")){
                TreeNode leftTree=new TreeNode(Integer.parseInt(values[i]));
                tree.left=leftTree;
                q.add(leftTree);
            }
            if(!values[++i].equals("n")){
                TreeNode rightTree=new TreeNode(Integer.parseInt(values[i]));
                tree.right=rightTree;        
                q.add(rightTree);
            }
        }
        return root;
    }
}

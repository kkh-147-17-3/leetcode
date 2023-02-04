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
    public static int LENGTH = 2 * (int)Math.pow(10,5) + 1;
    public static int MAG = (int)Math.pow(10,5);
    public static int[] DIC;
    
    public int[] findMode(TreeNode root) {
        DIC = new int [LENGTH -1];
        traverseTree(root);

        int max = 0;
        for (int num : DIC){
            max = num > max ? num : max;
        }

        System.out.println(max);
        
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < LENGTH - 1; i++){
            if (DIC[i] == max){
                System.out.println(i);
                set.add(i - MAG);
            }
        }
        
        int[] result = set.stream()
                        .mapToInt(Number::intValue)
                        .toArray();
            
        return result;
        
    }
    
    public void traverseTree(TreeNode root){
        DIC[root.val + MAG]++;

        if(root.left != null){
            traverseTree(root.left);
        }
        if(root.right != null){
            traverseTree(root.right);
        }
    }
}
// Last updated: 18/08/2026, 09:55:39
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode invertTree(TreeNode root) {
18        
19            if(root==null){
20                return null;
21            }
22            TreeNode swap=root.left;
23            root.left=root.right;
24            root.right=swap;
25
26            invertTree(root.left);
27            invertTree(root.right);
28            
29            return root;
30
31
32        
33        
34    }
35}
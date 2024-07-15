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
    HashMap<Integer,Pair> map= new HashMap<>();
    public TreeNode createBinaryTree(int[][] descriptions) {
        
        HashMap<Integer,Integer> m= new HashMap<>();
        int root=-1;
        for(int i=0;i<descriptions.length;i++)
        {
            int a=descriptions[i][0];
            if(map.containsKey(a))
            {
                if(descriptions[i][2]==1)
                {
                    Pair p= map.get(a);
                    
                    p.l=descriptions[i][1];

                    map.put(a,p);
                }
                else
                {
                    Pair p= map.get(a);
                    p.r=descriptions[i][1];
                    map.put(a,p);
                }
            }
            else
            {
                if(descriptions[i][2]==1)
                {
                    
                   
                    map.put(a,new Pair( descriptions[i][1],0));
                }
                else
                {
                   map.put(a,new Pair(0,descriptions[i][1]));
                }
            }

            // m.put(a,m.getOrDefault(a,0)+1);
            m.put(descriptions[i][1],m.getOrDefault(descriptions[i][1],0)+1);
          
           
        }
        for(int i=0;i<descriptions.length;i++)
        {
            if(!m.containsKey(descriptions[i][0]))
            {
                root=descriptions[i][0];
                break;
            }
        }
       
       System.out.println(root);
        return solve(root);
    }
    public TreeNode solve(int root)
    {
            //   System.out.println(root);
        if(!map.containsKey(root))
        return new TreeNode(root);
        
  
        TreeNode nn= new TreeNode(root);
        if(map.get(root).l!=0)
        nn.left=solve(map.get(root).l);
         if(map.get(root).r!=0)
        nn.right=solve(map.get(root).r);
        return nn;
    }
}
class Pair{
    int l;
    int r;
    Pair(int l,int r)
    {
        this.l=l;
        this.r=r;

    }
}
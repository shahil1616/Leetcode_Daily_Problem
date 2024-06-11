class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        int ans[]= new int[arr1.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        int k=0;
        for(int i=0;i<arr2.length;i++)
        {
            int a=map.get(arr2[i]);
            while(a>0)
            {
                ans[k++]=arr2[i];
                a--;
            }
            map.put(arr2[i],0);
        }
        if(!map.isEmpty()){
       for(int a:arr1)
       {
          int b=map.get(a);
          while(b>0)
          {
            ans[k++]=a;
            b--;
          }
          map.put(a,0);

       }
    }
       return ans;
        
    }
}
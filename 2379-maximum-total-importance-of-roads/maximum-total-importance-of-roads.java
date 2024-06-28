class Solution {
    public long maximumImportance(int n, int[][] roads) {
        HashMap<Integer,Long> map = new HashMap<>();
        for(int i=0;i<roads.length;i++)
        {
            map.put(roads[i][0],map.getOrDefault(roads[i][0],0l)+1);
            map.put(roads[i][1],map.getOrDefault(roads[i][1],0l)+1);
        }
        List<Long> l = new ArrayList<>();
        for(int a:map.keySet())
        {
            long max=map.get(a);
            l.add(max);
        }
        Collections.sort(l);
        long ans=0;
        for(int i=l.size()-1;i>=0;i--)
        {
            ans=ans+(l.get(i))*n;
            n=n-1;

        }
        return ans;

        
    }
}
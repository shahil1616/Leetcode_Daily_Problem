class Solution {
    public double averageWaitingTime(int[][] customers) {
        double ans=customers[0][1];
        int time=customers[0][0]+customers[0][1];
        for(int i=1;i<customers.length;i++)
        {
            if(customers[i][0]<=time)
            {
                time=time+customers[i][1];
                ans=ans+(time-customers[i][0]);
            }
            else
            {
                time=customers[i][0]+customers[i][1];
                ans=ans+(time-customers[i][0]);
            }
        }
        return ans/customers.length;
    }
}
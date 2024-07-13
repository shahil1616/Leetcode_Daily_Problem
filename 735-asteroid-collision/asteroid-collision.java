class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<asteroids.length;i++)
        {
            int a=asteroids[i];

            if(a>0)
            {
                stack.push(a);
            }
            else
            {
                boolean f=true;
                while(!stack.isEmpty() && stack.peek()>0 && f)
                {
                    if(!stack.isEmpty() && Math.abs(a)>stack.peek())
                    {
                        stack.pop();
                        
                    }
                    else if(!stack.isEmpty() && Math.abs(a)< stack.peek())
                    {
                        f=false;

                    }
                    else
                    {
                        stack.pop();
                        f=false;
                    }
                }
                if(f==true)
                stack.push(a);
            }
        }
        int arr[]= new int[stack.size()];
        int i=stack.size()-1;
        while(!stack.isEmpty())
        {
            arr[i--]=stack.pop();
        } 
        return arr;
        
    }
}
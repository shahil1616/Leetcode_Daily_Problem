class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<pair>  list= new ArrayList<>();
        for(int i=0;i<positions.length;i++)
        {
            list.add(new pair(positions[i],healths[i],directions.charAt(i),i));
        }
        Collections.sort(list,new robcom());
        Stack<pair> stack = new Stack<>();
        for(int i=0;i<list.size();i++)
        {
            pair p1=list.get(i);
            if(p1.d=='R')
              stack.push(p1);
            else
            {
                
                
                    boolean and=true;
                while(!stack.isEmpty() && stack.peek().d=='R' && and==true)
                {
                    if(!stack.isEmpty()&& p1.h>stack.peek().h)
                    {
                         stack.pop();
                    
                         p1.h=p1.h-1;
                    }
                    else if(!stack.isEmpty()&& p1.h<stack.peek().h)
                    {
                        pair t=stack.pop();
                     
                        stack.push(new pair(t.pos,t.h-1,t.d,t.index));
                        and=false;
                    }
                    else if(!stack.isEmpty()&& p1.h==stack.peek().h)
                    {
                       
                        stack.pop();
                        and=false;
                    }
                }
                if(and==true)
                stack.push(p1);

            }
            
        }
        
        List<p> t= new ArrayList<>();
        while(!stack.isEmpty())
        {
            pair dd=stack.pop();
            t.add(new p(dd.h,dd.index));
        }
        Collections.sort(t, new com());
        for(int i=0;i<t.size();i++)
        {
            // System.out.println(t.get(i).index);
            ans.add(t.get(i).h);
        }





        return ans;
    }
}
public class p{
    int h;
    int index;
    public  p(int h,int index )
    {
        this.h=h;
        this.index=index;


    }
}
 class pair{
    int pos;
    int h;
    char d;
    int index;
   public  pair(int pos,int h,char d,int index)
   {
    this.pos=pos;
    this.h=h;
    this.d=d;
    this.index=index;

   }
}
class robcom implements Comparator<pair>{
    @Override
	public int compare(pair p1, pair p2) {
		if (p1.pos > p2.pos)
			return 1;
		else 
			return -1;
		
	}
}
class com implements Comparator<p>
{
    @Override
    public int compare(p p1, p p2) {
		if (p1.index > p2.index)
			return 1;
		else 
			return -1;
		
	}


}
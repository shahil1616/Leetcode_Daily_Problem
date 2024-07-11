class Solution {
    public String reverseParentheses(String s) {
        Stack<String> stack = new Stack();
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(ch!=')')
            {
                if(ch=='(')
                stack.push("*");
                else
                stack.push(ch+"");

            }
            else
            {
                String ans="";
                
                while(!stack.isEmpty() && stack.peek()!="*")
                {
                    
                    ans=stack.pop()+ans;
                    //   System.out.println(ans);
                }
               System.out.println(ans);
                String a=reverse(ans);
              
                if(!stack.isEmpty()&& stack.peek()=="*")
                 stack.pop();
                 stack.push(a);
            }


        }
        String ans="";
        while(!stack.isEmpty())
        {
            ans=stack.pop()+ans;
        }
        return ans;
        
    }
    public  String reverse(String str)
    {
        StringBuilder ans= new StringBuilder();
        ans.append(str);
        return ans.reverse().toString();

    }
}
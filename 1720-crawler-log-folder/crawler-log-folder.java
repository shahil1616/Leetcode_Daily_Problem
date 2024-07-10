class Solution {
    public int minOperations(String[] logs) {
    Stack<String>  stack= new Stack<>();
    for(int i=0;i<logs.length;i++)
    {
        String s=logs[i];
        if(!stack.isEmpty() && s.equals("../"))
        stack.pop();
         else if(!s.equals("./") && !s.equals("../"))
         stack.push(s);
    }
        return stack.size();
    }
}
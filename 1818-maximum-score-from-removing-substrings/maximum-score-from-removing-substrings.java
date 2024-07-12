class Solution {
    public int maximumGain(String s, int x, int y) {
         StringBuilder temp = new StringBuilder();
int ctr=0,ctr1=0;
        Stack<Character> st=new Stack<>();
        if(x>=y){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='b'){
                    if((st.size()!=0)&&(st.peek()=='a')){
                        st.pop();
                        ctr++;
                    }
                    else
                    st.add(s.charAt(i));
                }
                else
                st.add(s.charAt(i));
            }
          
           while (!st.isEmpty()) {
                temp.append(st.pop());
            }

            StringBuilder rev = new StringBuilder(temp).reverse();
            for(int i=0;i<rev.length();i++){
                if(rev.charAt(i)=='a'){
                    if((st.size()!=0)&&(st.peek()=='b')){
                        st.pop();
                        ctr1++;
                    }
                    else
                    st.add(rev.charAt(i));
                }
                else
                st.add(rev.charAt(i));
            }
        }
        else{
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a'){
                    if((st.size()!=0)&&(st.peek()=='b')){
                        st.pop();
                        ctr1++;
                    }
                    else
                    st.add(s.charAt(i));
                }
                else
                st.add(s.charAt(i));
            }
          
           while (!st.isEmpty()) {
                temp.append(st.pop());
            }

            StringBuilder rev = new StringBuilder(temp).reverse();
            for(int i=0;i<rev.length();i++){
                if(rev.charAt(i)=='b'){
                    if((st.size()!=0)&&(st.peek()=='a')){
                        st.pop();
                        ctr++;
                    }
                    else
                    st.add(rev.charAt(i));
                }
                else
                st.add(rev.charAt(i));
            }

        }
        return ctr*x+ctr1*y;
    }
}
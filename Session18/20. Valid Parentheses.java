class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n==0)
        {
            return true;
        }
        Stack<Character> st=new Stack<Character>();
        for(char c:s.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[')
            {
                st.push(c);
            }
            else
            {
                if(st.size()>0)
                {
                    char top=st.peek();
                    if(
                        (c=='}' && top=='{') || 
                        (c==']' && top=='[') || 
                        (c==')' && top=='(')
                    )
                    {
                        System.out.println(top+" "+c);
                        st.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
        }
        return st.size()==0;
    }
}
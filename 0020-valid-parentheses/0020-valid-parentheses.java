class Solution {
    public boolean isValid(String st) {
        int n=st.length();
        if(n==1)return false;

        char[] total=st.toCharArray();

        Stack<Character>s=new Stack<>();

        for(char ch:total){

           if(ch=='(' || ch=='[' || ch=='{'){
            s.push(ch);
           }else{

            if(s.isEmpty()){
            return false;
            }else if(ch==')' && s.peek()=='('){
            s.pop();

           }else if(ch=='}' && s.peek()=='{'){
             s.pop();
           }else if(ch==']' && s.peek()=='['){
            s.pop();
           }else{
            return false;
           }

        }

         } return s.isEmpty() ;

       


        
    }
    }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
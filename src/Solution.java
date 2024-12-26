import java.util.Stack;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(BracketMatcher("((hello (world))"));
    }

    public static String BracketMatcher(String str){
        if(!str.contains("(") && !str.contains(")")){
            return "1";
        }else{
            Stack<Character> parantheses = new Stack<>();
            for(int i=0; i<str.length(); i++){
                if((str.charAt(i) == '(' || str.charAt(i) == ')'))
                {
                    if(parantheses.isEmpty())
                    {
                        parantheses.push(str.charAt(i));
                    }else if(str.charAt(i) != parantheses.lastElement() && str.charAt(i) < parantheses.lastElement())//if current char is not equal to last one on stack then they match () hence remove the brackets
                    {
                        parantheses.pop();
                    }else{ //if char is equal to last char on stack then we havent made a match store it on stack
                        parantheses.push(str.charAt(i));
                    }
                }
            }
            //emptiness of the stacks reveals that all brackets were correctly matched and acounted for.
            if(parantheses.isEmpty()){
                return "1";
            }else{
                return "0";
            }
        }
    }
}

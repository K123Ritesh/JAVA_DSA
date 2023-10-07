public class Balanced_Parenthesis(){
    boolean isBalanced(String str){
        Stack<Character>st=new Stack<>();
        for(char x:str.tocharArray()){
            if(x=='('||x=='{'||x=='['){
                st.push(x);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                if(!matching())
            }
        }
    }
}
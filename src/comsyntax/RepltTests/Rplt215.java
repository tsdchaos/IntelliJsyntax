package comsyntax.RepltTests;

public class Rplt215 {
    /*
    Complete the function isBalanced in the editor below.

    isBalanced has the following parameter(s):

    string s: a string of brackets Returns

    string: either true or false
     */
    public boolean isBalanced(String s){
        StringBuilder sb=new StringBuilder(s);
        int open = (int) s.chars().filter(ch-> ch=='(').count();
        int close = (int) s.chars().filter(ch-> ch==')').count();
        if(open == close){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Rplt215 main1=new Rplt215();
        System.out.println(main1.isBalanced("()()())())()(("));
    }
}

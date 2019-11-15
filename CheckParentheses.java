import java.util.*;

public class CheckPar1 {
    public static void main(String args[])
    {
        Stack<Character> stack = new Stack<>();
        Scanner input=new Scanner(System.in);
        String str=input.next();
        boolean checker=true;

        for(int i=0;i<str.length();i++)
        {
            if(str.length()%2!=0)
            {
                checker=false;
                break;
            }


            char par=str.charAt(i);
            if(par=='{' || par=='[' || par=='(')
            {
               stack.push(par);
            }
            else
            {
                if(par==')' && stack.peek()=='(')
                {
                    stack.pop();
                }
                else if(par=='}' && stack.peek()=='{')
                {
                    stack.pop();
                }
                else if(par==']' && stack.peek()=='[')
                {
                    stack.pop();
                }
                else
                {
                    checker=false;
                    break;
                }
            }
        }

        if(checker==true)
        {
            System.out.println("Balanced");
        }
        else if(checker==false)
        {
            System.out.println("Not Balanced");
        }

    }
}

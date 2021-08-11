import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String string = scan.nextLine();

        System.out.println(isValid(string));
    }

    public static boolean isValid(String s) {
        Stack<Character> symbols = new Stack<>();

        boolean isValid = true;

        for (int i = 0; i < s.length(); i++) {
            char currentSymbol = s.charAt(i);
            if(currentSymbol == '(' || currentSymbol == '[' || currentSymbol == '{'){
                symbols.push(currentSymbol);
            }

            if(symbols.isEmpty()){
                return false;
            }

            switch (currentSymbol) {
                case ')':
                    if(symbols.peek() == '('){
                        symbols.pop();
                    }else {
                        return false;
                    }
                    break;
                case ']':
                    if(symbols.peek() == '['){
                        symbols.pop();
                    }else {
                        return false;
                    }
                    break;
                case '}':
                    if(symbols.peek() == '{'){
                        symbols.pop();
                    }else {
                        return false;
                    }
                    break;
            }
        }

        if(!symbols.isEmpty()){
            return false;
        }

        return isValid;
    }
}

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main implements CalculatorInterface {


    public TokenList readTokens(String input) {
        Scanner in = new Scanner(input);
        TokenList result = new WordList();

        // Loop
        while(in.hasNext()) {
            String token = in.next();
            if (tokenIsDouble(token)) {
                result.add(parseNumber(token));
            } else if (tokenIsOperator(token)) {
                result.add(parseOperator(token));
            } else if (tokenIsParantheses(token)) {
            } else {
                // Error:invalid input
            }
        }
        return result;
    }

    private boolean tokenIsDouble(String token){

        try {
            Double number = Double.parseDouble(token);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }

        
    }

    private Token parseNumber(String token){
        return null;
    }

    private boolean tokenIsOperator(String token){
        return false;
    }
     private Token parseOperator(String token){
        return null;
     }

     public boolean tokenIsParantheses(String token){
         return false;
     }
    public Double rpn(TokenList tokens) {
        // TODO: Implement this
        return null;
    }

    public TokenList shuntingYard(TokenList tokens) {
        // TODO: Implement this
        return null;
    }

    private void start() {
        // Create a scanner on System.in

        Loader sequence = new Loader(new File("input.txt")) ;
        String data = sequence.loadFile();
        TokenList words = readTokens(data);
        System.out.println("Size of list is: " + words.size());

        // While there is input, read line and parse it.

    }

    public static void main(String[] argv) {
        new Main().start();
    }
}

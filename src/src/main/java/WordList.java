import java.util.ArrayList;
import java.util.List;

public class WordList implements TokenList {

    List<Token> tokenList = new ArrayList<Token>();

    public void add(Token token){
    tokenList.add(token);
    }

    public void remove(int index){
        tokenList.remove(index);


    }
    public void set(int index, Token token){
            tokenList.set(index, token);
    }

    public Token get(int index){
        return tokenList.get(index);
    }

    public int size(){
        return tokenList.size();
    }
}

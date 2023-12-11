import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String [] words = new String[] {"leet","code"};
        char x = 'e';
        System.out.println(findWordsContaining(words, x));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i< words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                lista.add(i);
            }
        }
        return lista;
    }
}

import java.util.ArrayList;
import java.util.Random;

/**
 * Escreva uma descrição da classe WordGenerartor aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGenerartor
{
    //Atributos
    private ArrayList<String> words;

    /**
     * Construtor para objetos da classe WordGenerartor
     */
    public WordGenerartor()
    {
        words = new ArrayList<String>();
        fillArrayList();
        
    }

    private void fillArrayList()
    {
        words.add("boolean");
        words.add("break");
        words.add("byte");
        words.add("case");
        words.add("char");
        words.add("class");
        words.add("continue");
        words.add("do");
        words.add("double");
        words.add("else");
        words.add("enum");
        words.add("for");
        words.add("if");
        words.add("import");
        words.add("int"); 

    }

    public String generateWord()
    {
        Random random = new Random();
        int a = random.nextInt(words.size());
        return words.get(a);
    }
    
    public void addWord(String newWord)
    {
        if(newWord != null && newWord != "")
        {
            for(int i = 0; i < words.size(); i++)
            {
                if(newWord == words.get(i))
                {
                    System.out.println("Não pode adicionar palavras iguais!");
                    System.out.println("A palavra " + newWord + " já existe.");
                    return;
                }
            }

            words.add(newWord);
            System.out.println("A palavra " + newWord + " foi adicionada com sucesso!.");
        }

        else
        System.out.println("Por favor não insira um valor válido.");
        
    }
}

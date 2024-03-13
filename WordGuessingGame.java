
/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGuessingGame
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;


    public WordGuessingGame()
    {
        this.hiddenWord = "abc";
        this.guessedWord = "___";
    }

    String getHiddenWord()
    {
        return this.hiddenWord;
    }

    String getGuessedWord()
    {
        return this.guessedWord;
    }

    int getNumberOfTries()
    {
        return this.numberOfTries;
    }

    void showGuessedWord()
    {
        System.out.println("Palavras adivinhada: " + this.guessedWord);
    }
    
}


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

    InputReader reader;


    public WordGuessingGame()
    {
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.reader = new InputReader();
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
    
    public void play()
    {
        showWelcome();

        showGuessedWord();

        guess(reader.getChar(guessedWord));

        if (guessedWord.equals(hiddenWord)) {
            showResult();
        }

    }

    private void showWelcome()
    {
        System.err.println("Welcome!");
    }

    private void guess(char character)
    {
        for(char letter: this.hiddenWord.toCharArray())
        {
            if (character == letter) {
                this.guessedWord.replace(letter, character);
            } 
        }
    }

    private void showResult()
    {
        System.err.println("Número de tentativas: " + this.numberOfTries);
    }
}

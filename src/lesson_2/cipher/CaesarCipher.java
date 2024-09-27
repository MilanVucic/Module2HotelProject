package lesson_2.cipher;

public class CaesarCipher extends SubstitutionCipher{
    private int shift;

    public CaesarCipher(char[] alphabet, int shift) {
        super(alphabet);
        this.shift = shift;
    }

    @Override
    public String decrypt(String text) {
        return null;
    }

    @Override
    public char getLetterToReplace(char letter) {
        return ' ';// custom logic to get the shifted letter
    }
}

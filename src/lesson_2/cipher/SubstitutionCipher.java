package lesson_2.cipher;

public abstract class SubstitutionCipher implements Cipher{
    protected char[] alphabet;

    public SubstitutionCipher(char[] alphabet) {
        this.alphabet = alphabet;
    }

    @Override
    public String encrypt(String text) {
        StringBuilder sb = new StringBuilder();
        for (char c: text.toCharArray()) {
            sb.append(getLetterToReplace(c));
        }
        return sb.toString();
    }

    public abstract char getLetterToReplace(char letter);
}

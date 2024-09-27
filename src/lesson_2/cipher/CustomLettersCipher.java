package lesson_2.cipher;

import java.util.Map;

public class CustomLettersCipher extends SubstitutionCipher{
    // a -> j
    // j -> g
    // g -> b
    Map<Character, Character> substitutionMap;

    public CustomLettersCipher(char[] alphabet, Map<Character, Character> substitutionMap) {
        super(alphabet);
        this.substitutionMap = substitutionMap;
    }


    @Override
    public String decrypt(String text) {
        return null;
    }

    @Override
    public char getLetterToReplace(char letter) {
        return substitutionMap.get(letter);
    }
}

package de.katas.tdd.romanletter.util;


public class CharacterUtil {
    public static String concatCharacters(Character firstCharacter, Character secondCharacter) {
        return new StringBuilder().append(firstCharacter).append(secondCharacter).toString();
    }
}

package org.launchcode.java.studios;

import java.util.HashMap;

public class Countingcharacters {
    public static void main(String[] args) {
        String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] textChars = text.toCharArray();

        HashMap<Character, Integer> characterList = new HashMap<>();

        for (char letter : textChars) {

//                letter = Character.toLowerCase(letter);
                if (!characterList.containsKey(letter)) {
                    characterList.put(letter, 1);
                } else {
                    characterList.put(letter, characterList.get(letter) + 1);
                }

        }
        System.out.println(characterList);
    }
}

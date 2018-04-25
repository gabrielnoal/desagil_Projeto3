package com.br.insper.morssenger;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TranslatorHashMap {

    private HashMap<Character, String> charMorse = new HashMap<Character, String>();
    private HashMap<String, Character> morseChar = new HashMap<String, Character>();

    List<Character> abc = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'j', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'w', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
    List<String> morse = Arrays.asList(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-....","--...","---..","----.");


    public TranslatorHashMap() {
        for(int i = 0; i < abc.size(); i++) {
            morseChar.put(morse.get(i), abc.get(i));
            charMorse.put(abc.get(i), morse.get(i));
        }
    }

    public String charToMorse(char c){
        return charMorse.get(c);
    }

    public Character morseToChar(String morse){

        return morseChar.get(morse);
    }

    public String getCodes(String encoded){
        String[] splited = encoded.split("\\s+");
        StringBuilder resp = new StringBuilder();
        for (String part : splited){
            resp.append(morseToChar(part));
        }
        return resp.toString();
    }
}

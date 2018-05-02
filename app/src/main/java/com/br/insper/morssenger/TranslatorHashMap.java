package com.br.insper.morssenger;

import android.content.Context;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TranslatorHashMap {

    private HashMap<Character, String> charMorse = new HashMap<Character, String>();
    private HashMap<String, Character> morseChar = new HashMap<String, Character>();

    List<Character> abc = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'w', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
    List<String> morse = Arrays.asList(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.");


    public TranslatorHashMap() {
        for (int i = 0; i < abc.size(); i++) {
            morseChar.put(morse.get(i), abc.get(i));
            charMorse.put(abc.get(i), morse.get(i));
        }
    }

    public String charToMorse(char c) {
        return charMorse.get(c);
    }
    public Character morseToChar(String morse, Context c) {
        Character resp = morseChar.get(morse);
        if (null == resp) {
            Utils.showToast(c, "Morse inválido!");
            return ' ';
        } else {
            return resp;
        }
    }

    public List<Character> getABC() {
        return abc;
    }

    public List<String> getMorse() {
        return morse;
    }


    public String getCodes(String encoded, Context c) {
        String[] splited = encoded.split("\\s+");
        StringBuilder resp = new StringBuilder();
        for (String part : splited) {
            resp.append(morseToChar(part, c));
        }
        return resp.toString();
    }
}

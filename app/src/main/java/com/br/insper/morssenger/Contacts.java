package com.br.insper.morssenger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Contacts {
    private HashMap<String, String> contacts = new HashMap<String, String>();

    public Contacts() {
        contacts.put("Bruno", "+5511976488314");
        contacts.put("mochila de crianca", "a9999999999999999");
    }

    public HashMap<String, String> getContacts() {
        return contacts;
    }

    public void addContact(String name, String cellphone) {
        contacts.put(name, cellphone);
    }

    public Set<String> getNames() {
        return contacts.keySet();

    }

    public List<String> getNumbers() {
        List<String> numbers = new ArrayList<>();
        for (String key : contacts.keySet()) {
            numbers.add(contacts.get(key));
        }
        return numbers;
    }

    public String getNumber(String name){
        return contacts.get(name);
    }


}

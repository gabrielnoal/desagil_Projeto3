package com.br.insper.morssenger;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Translator {
    // ESTA CLASSE NÃO PODE SER MODIFICADA!
    private class Node {
        private char value;
        private Node parent;
        private Node leftChild;
        private Node rightChild;

        public Node() {
            this.value = ' ';
            this.parent = null;
            this.leftChild = null;
            this.rightChild = null;
        }
        public Node(char value) {
            this.value = value;
            this.parent = null;
            this.leftChild = null;
            this.rightChild = null;
        }

        public char getValue() {
            return value;
        }
        public Node getParent() {
            return parent;
        }
        public void setParent(Node parent) {
            this.parent = parent;
        }
        public Node getLeftChild() {
            return leftChild;
        }
        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }
        public Node getRightChild() {
            return rightChild;
        }
        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }
    }


    // ESTE CONJUNTO DE ATRIBUTOS NÃO PODE SER MODIFICADO, OU
    // SEJA, NÃO É PERMITIDO ADICIONAR NEM REMOVER ATRIBUTOS!
    private Node root;
    private HashMap<Character, Node> map;


    // ESTE CONSTRUTOR DEVE SER PREENCHIDO DE ACORDO COM O ENUNCIADO!
    public Translator() {
        map = new HashMap<Character, Node>();
        
        
        		Node node28 = new Node('z');
        map.put('z', node28);
        Node node29 = new Node('q');
        map.put('q', node29);
        node14.setLeftChild(node28);
        node14.setRightChild(node29);

        Node node30 = new Node();

        Node node31 = new Node();
        node15.setLeftChild(node30);
        node15.setRightChild(node31);
		
		Node node32 = new Node('5');
        map.put('5', node32);
        Node node33 = new Node('4');
        map.put('4', node33);
        Node node34 = new Node();
        Node node35 = new Node('3');
        map.put('3', node35);
        Node node36 = new Node();
        Node node37 = new Node();
        Node node38 = new Node();
        Node node39 = new Node('2');
        map.put('2', node39);
        Node node40 = new Node();
        Node node41 = new Node();
        Node node42 = new Node();
        Node node43 = new Node();
        Node node44 = new Node();
        Node node45 = new Node('1');
        map.put('1', node45);
        Node node46 = new Node('6');
        map.put('6', node46);
        Node node47 = new Node();
        Node node48 = new Node();
        Node node49 = new Node();
        Node node50 = new Node('7');
        map.put('7', node50);
        Node node51 = new Node();
        Node node52 = new Node('8');
        map.put('8', node52);
        Node node53 = new Node();
        Node node54 = new Node('9');
        map.put('9', node54);
        Node node55 = new Node('0');
        map.put('0', node55);
		//----------------------------------------------------------------------
        node28.setParent(node14);
        node29.setParent(node14);
        node30.setParent(node15);
        node31.setParent(node15);
		node32.setParent(node16);
        node33.setParent(node16);
        node34.setParent(node17);
        node35.setParent(node17);
        node36.setParent(node18);
        node37.setParent(node18);
        node38.setParent(node19);
        node39.setParent(node19);
        node40.setParent(node20);
        node41.setParent(node20);
        node42.setParent(node21);
        node43.setParent(node21);
        node44.setParent(node23);
        node45.setParent(node23);
        node46.setParent(node24);
        node47.setParent(node24);
        node48.setParent(node25);
        node49.setParent(node25);
        node50.setParent(node28);
        node51.setParent(node28);
        node52.setParent(node30);
        node53.setParent(node30);
        node54.setParent(node31);
        node55.setParent(node31);
    }


    // ESTE MÉTODO DEVE SER PREENCHIDO DE ACORDO COM O ENUNCIADO!
    public char morseToChar(String code) {
        return ' ';
    }


    // ESTE MÉTODO DEVE SER PREENCHIDO DE ACORDO COM O ENUNCIADO!
    public String charToMorse(char c) {
        return null;
    }


    // ESTE MÉTODO DEVE SER PREENCHIDO DE ACORDO COM O ENUNCIADO!
    public LinkedList<String> getCodes() {
        return null;
    }
}

package com.br.insper.morssenger;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

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


    private Node root;
    private HashMap<Character, Node> map;


    public Translator() {
        map = new HashMap<Character, Node>();
        root = new Node();
        Node node2 = new Node('e');
        map.put('e', node2);
        Node node3 = new Node('t');
        map.put('t', node3);
        root.leftChild = node2;
        root.rightChild = node3;

        Node node4 = new Node('i');
        map.put('i', node4);
        Node node5 = new Node('a');
        map.put('a', node5);
        node2.leftChild = node4;
        node2.rightChild = node5;

        Node node6 = new Node('n');
        map.put('n', node6);
        Node node7 = new Node('m');
        map.put('m', node7);
        node3.leftChild = node6;
        node3.rightChild = node7;

        Node node8 = new Node('s');
        map.put('s', node8);
        Node node9 = new Node('u');
        map.put('u', node9);
        node4.leftChild = node8;
        node4.rightChild = node9;

        Node node10 = new Node('r');
        map.put('r', node10);
        Node node11 = new Node('w');
        map.put('w', node11);
        node5.leftChild = node10;
        node5.rightChild = node11;

        Node node12 = new Node('d');
        map.put('d', node12);
        Node node13 = new Node('k');
        map.put('k', node13);
        node6.leftChild = node12;
        node6.rightChild = node13;

        Node node14 = new Node('g');
        map.put('g', node14);
        Node node15 = new Node('o');
        map.put('o', node15);
        node7.leftChild = node14;
        node7.rightChild = node15;

        Node node16 = new Node('h');
        map.put('h', node16);
        Node node17 = new Node('v');
        map.put('v', node17);
        node8.leftChild = node16;
        node8.rightChild = node17;

        Node node18 = new Node('f');
        map.put('f', node18);
        Node node19 = new Node();
        node9.leftChild = node18;
        node9.rightChild = node19;

        Node node20 = new Node('l');
        map.put('l', node20);
        Node node21 = new Node();
        node10.leftChild = node20;
        node10.rightChild = node21;

        Node node22 = new Node('p');
        map.put('p', node22);
        Node node23 = new Node('j');
        map.put('j', node23);
        node11.leftChild = node22;
        node11.rightChild = node23;

        Node node24 = new Node('b');
        map.put('b', node24);
        Node node25 = new Node('x');
        map.put('x', node25);
        node12.leftChild = node24;
        node12.rightChild = node25;

        Node node26 = new Node('c');
        map.put('c', node26);
        Node node27 = new Node('y');
        map.put('y', node27);
        node13.leftChild = node26;
        node13.rightChild = node27;

        node2.setParent(root);
        node3.setParent(root);

        node4.setParent(node2);
        node5.setParent(node2);

        node6.setParent(node3);
        node7.setParent(node3);

        node8.setParent(node4);
        node9.setParent(node4);

        node10.setParent(node5);
        node11.setParent(node5);

        node12.setParent(node6);
        node13.setParent(node6);

        node14.setParent(node7);
        node15.setParent(node7);

        node16.setParent(node8);
        node17.setParent(node8);

        node18.setParent(node9);
        node19.setParent(node9);

        node20.setParent(node10);
        node21.setParent(node10);

        node22.setParent(node11);
        node23.setParent(node11);

        node24.setParent(node12);
        node25.setParent(node12);

        node26.setParent(node13);
        node27.setParent(node13);

        // =====================================================================
        // Parte do CescoRnetto

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
        node16.setLeftChild(node32);
        node16.setRightChild(node33);
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
        node17.setLeftChild(node34);
        node17.setRightChild(node35);
        node18.setLeftChild(node36);
        node18.setRightChild(node37);
        node19.setLeftChild(node38);
        node19.setRightChild(node39);
        node20.setLeftChild(node40);
        node20.setRightChild(node41);
        node21.setLeftChild(node42);
        node21.setRightChild(node43);
        node23.setLeftChild(node44);
        node23.setRightChild(node45);
        node24.setLeftChild(node46);
        node24.setRightChild(node47);
        node25.setLeftChild(node48);
        node25.setRightChild(node49);
        node28.setLeftChild(node50);
        node28.setRightChild(node51);
        node30.setLeftChild(node52);
        node30.setRightChild(node53);
        node31.setLeftChild(node54);
        node31.setRightChild(node55);
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


    public char morseToChar(String code) {
        Node current = root;
        for (Character c : code.toCharArray()) {
            if (current.getLeftChild() != null & current.getRightChild() != null ){
                if (c == '.') {
                    current = current.getLeftChild();
                } else {
                    current = current.getRightChild();
                }
            }

        }
        return current.getValue();
    }


    public String charToMorse(char c) {
        Node current = map.get(c);
        StringBuilder result = new StringBuilder();
        while (current != root) {
            if (current.getParent().getLeftChild() == current) {
                result.append('.');
            } else {
                result.append('-');
            }
            current = current.getParent();

        }
        return result.reverse().toString();
    }


    public LinkedList<String> getCodes() {
        Queue<Node> queue = new LinkedList<>();
        LinkedList<String> result = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node current = queue.peek();

            if (current.getLeftChild() != null){
                queue.add(current.getLeftChild());
                if (current.getLeftChild().getValue() != ' '){
                    result.add(charToMorse(current.getLeftChild().getValue()));
                }

            }

            if (current.getRightChild() != null){
                queue.add(current.getRightChild());
                if (current.getRightChild().getValue() != ' '){
                    result.add(charToMorse(current.getRightChild().getValue()));
                }

            }

            queue.remove();

        }
        return result;
    }
}

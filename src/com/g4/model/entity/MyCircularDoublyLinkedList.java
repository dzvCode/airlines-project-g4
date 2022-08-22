package com.g4.model.entity;

public class MyCircularDoublyLinkedList {
    
    public static Node head;
    public static Node current;
    
    public static class Node {
        public String destination;
        public Node prev;
        public Node next;    
        
        public Node(String destination) {
            this.destination = destination;
            this.prev = null;
            this.next = null;
        }
    }
    
    
    public static void insertAtTail(String destination) {
        Node newNode = new Node(destination);
        if (head == null) {
            newNode.next = newNode.prev = newNode;
            head = newNode;
            current = head;
            return;
        }
        Node tail = head.prev;
        newNode.next = head;
        head.prev = newNode;
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    } 
    
    // Metodo para mostrar las imagenes en orden
    public static void printCDLL() {
        if (head == null) {
            System.out.println("No hay elementos\n");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.destination + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    
    public static void printBackwardsCDLL() {
        if (head == null) {
            System.out.println("No hay elementos\n");
            return;
        }
        Node tail = head.prev;
        Node temp = tail;
        do {
            System.out.print(temp.destination + " ");
            temp = temp.prev;
        } while (temp != tail);
        System.out.println();
    }
    
    public static String nextDestination(){
        current = current.next; 
        return current.destination;
    }
    
    public static String prevDestination(){
        current = current.prev;
        return current.destination;
    }
    
}

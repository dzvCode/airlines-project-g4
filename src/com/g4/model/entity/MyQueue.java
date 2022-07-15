package com.g4.model.entity;

public class MyQueue {
    public static int capacity = 4;
    public static int counter;
    public static Node front, rear;
    
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Metodo para encolar un nodo
    public static void enqueue(int data) {
        if (counter > capacity) {
            System.out.println("La cola esta llena");
            return;
        }

        Node newNode = new Node(data);
        // Si la cola esta vacia, el nuevo nodo es front y rear
        if (front == null) {
            front = rear = newNode;
            counter++;
            return;
        }

        // Añade el nuevo nodo al final de la cola y actualiza rear
        rear.next = newNode;
        rear = newNode;
        counter++;
    }

    // Metodo para desencolar un nodo
    public static void dequeue() {
        // Si la cola esta vacia
        if (front == null) return;

        // Guarda front previo y lo mueve un nodo adelante
        //Node temp = front;
        front = front.next;
        counter--;

        // Si front es null, tambien rear es null
        if (front == null) {
            rear = null;
        }
    }

    public static void display() {
        if (front == null) {
            System.out.println("Cola vacia");
            return;
        }

        Node temp = front;
        while (temp != null) {
            System.out.println("Ticket #" + temp.data);
            temp = temp.next;
        }
        System.out.println("Tickets generados: " + Integer.toString(counter));
    }
}
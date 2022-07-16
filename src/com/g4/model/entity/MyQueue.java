package com.g4.model.entity;

import java.util.ArrayList;

public class MyQueue {
    public static int capacity = 4;
    public static int counter;
    public static Node front, rear;
    
    static class Node {
        String name;
        Node next;

        public Node(String name) {
            this.name = name;
            this.next = null;
        }
    }

    // Metodo para encolar un nodo
    public static void enqueue(String name) {
        if (counter > capacity) {
            System.out.println("La cola esta llena");
            return;
        }

        Node newNode = new Node(name);
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
    
    // Metodo para cargar los elementos de la cola en la tabla
    public static ArrayList<Object[]> upload() {
        ArrayList<Object[]> data = new ArrayList<>();
        if (front == null) {
            return data;
        }

        Node temp = front;
        while (temp != null) {
            Object[] aux = new Object[]{temp.name};
            data.add(aux);
            temp = temp.next;
        }
        return data;
    }
}
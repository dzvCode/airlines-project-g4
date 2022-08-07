package com.g4.model.entity;

import java.util.ArrayList;

public class MyQueue {
    public static int capacity = 2;
    public static int counter = 0;
    public static Node front, rear;
    
    public static class Node {
        public User user;
        public Node next;

        public Node(User user) {
            this.user = user;
            this.next = null;
        }
    }

    // Metodo para encolar un nodo
    public static void enqueue(User user) {
        if (counter > capacity) {
            //System.out.println("La cola esta llena");
            return;
        }

        Node newNode = new Node(user);
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
            Object[] aux = new Object[]{temp.user.getName()};
            data.add(aux);
            temp = temp.next;
        }
        return data;
    }
    
    // Metodo para imprimir los usuarios de la cola en consola
    public static void print() {
        if (front == null) {
            System.out.println("Vacio");
            return;
        }

        Node temp = front;
        while (temp != null) {
            System.out.println(temp.user);
            temp = temp.next;
        }
    }
}
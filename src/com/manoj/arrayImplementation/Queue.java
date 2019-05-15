package com.manoj.arrayImplementation;

public class Queue {

    private int size;

    private int front,rear;

    private final int capacity;

    private  int[] queue;

    Queue(int capacity){
        this.capacity = capacity;
        queue = new int[this.capacity];
        size = 0;
        front = 0;
        rear = 0;
    }

    public void enQueue(int data){
        if ( size==capacity ) {
            System.out.println("Queue is full. overflow");
        }
            //throw new RuntimeException("Queue is full. overflow");
        else {
            size++;
            queue[rear] =data;
            rear = (rear+1)%capacity;
        }
    }

    public int deQueue(){
        if ( size==0 ) {
            System.out.println("Queue is empty. underflow");
            return Integer.MIN_VALUE;
        }
            /* throw new RuntimeException("Queue is empty. underflow"); */
        else {
            size--;
            int data = queue[front%capacity];
            queue[front] = Integer.MIN_VALUE;
            front = (front+1)%capacity;
            return data;
        }
    }

    boolean isFull(){
        return    size == capacity;
    }

    boolean isEmpty(){
        return size==0;
    }
}

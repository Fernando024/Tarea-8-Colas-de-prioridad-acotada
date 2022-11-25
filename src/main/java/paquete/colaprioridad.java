/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package paquete;
import java.util.Arrays;
/**
 *
 * @author MargaritaT
 */
public class colaprioridad<T>{
    private colas<T>[] boundedQueue;
    private int size, length;

    public colaprioridad(int size) {
        boundedQueue = new colas[size];
        this.size = size;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void enqueue(int priority, T value) {
        if(priority < 0 && priority >= size) {
            throw new IllegalArgumentException("Priority must be between 0 and " + (size - 1));
        }

        if(boundedQueue[priority] == null) {
            boundedQueue[priority] = new colas<T>();
        }

        boundedQueue[priority].enqueue(value);
        length++;
    }

    public T dequeue() {
        if(isEmpty()) {
            return null;
        }

        for(int i = 0; i < size; i++) {
            if(boundedQueue[i] != null && !boundedQueue[i].isEmpty()) {
                length--;
                return boundedQueue[i].dequeue();
            }
        }

        return null;
    }

    public T front() {
        if(isEmpty()) {
            return null;
        }

        for(int i = 0; i < size; i++) {
            if(boundedQueue[i] != null && !boundedQueue[i].isEmpty()) {
                return boundedQueue[i].front();
            }
        }
        
        return null;
    }

   
    
    
}

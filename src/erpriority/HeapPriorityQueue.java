package erpriority;

import java.util.ArrayList;

public class HeapPriorityQueue {

    ArrayList<Patient> heap = new ArrayList<>();

    private int parent(int i){
        return (i-1)/2;
    }

    private int left(int i){
        return 2*i+1;
    }

    private int right(int i){
        return 2*i+2;
    }

    private void swap(int i,int j){
        Patient temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j,temp);
    }

    // Insert patient into heap
    public void insert(Patient p){

        heap.add(p);
        int i = heap.size()-1;

        while(i>0 && heap.get(parent(i)).compareTo(heap.get(i))>0){
            swap(i,parent(i));
            i = parent(i);
        }
    }

    // Remove highest priority patient
    public Patient removeMax(){

        if(heap.size() == 0)
            return null;

        Patient root = heap.get(0);

        // If only one element
        if(heap.size() == 1){
            heap.remove(0);
            return root;
        }

        // Move last element to root
        heap.set(0, heap.remove(heap.size()-1));

        heapify(0);

        return root;
    }

    // Restore heap property
    private void heapify(int i){

        int leftChild = left(i);
        int rightChild = right(i);
        int smallest = i;

        if(leftChild < heap.size() &&
           heap.get(leftChild).compareTo(heap.get(smallest)) < 0)
            smallest = leftChild;

        if(rightChild < heap.size() &&
           heap.get(rightChild).compareTo(heap.get(smallest)) < 0)
            smallest = rightChild;

        if(smallest != i){
            swap(i,smallest);
            heapify(smallest);
        }
    }
}
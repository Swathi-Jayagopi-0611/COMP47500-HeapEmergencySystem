package erpriority;

import java.util.Random;

public class Experiment {

    public static void runExperiment(){

        int n = 10000;
        Random rand = new Random();

        HeapPriorityQueue heap = new HeapPriorityQueue();

        long start = System.nanoTime();

        for(int i=0;i<n;i++){

            Patient p = new Patient("P"+i, rand.nextInt(10), i);
            heap.insert(p);
        }

        for(int i=0;i<n;i++)
            heap.removeMax();

        long end = System.nanoTime();

        System.out.println("Heap execution time: " + (end-start));
    }
}
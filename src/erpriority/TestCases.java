package erpriority;

public class TestCases {

    public static void runTests(){

        System.out.println("===== AUTOMATED TEST CASES =====\n");

        testPriorityOrder();
        testEmptyQueue();
        testSinglePatient();
        testSameSeverity();
        testManyPatients();
        testInsertAfterRemove();
        testLargeSeverity();
        testNegativeSeverity();
        testDuplicatePatients();
        testSequentialOperations();

    }

    // Test 1
    public static void testPriorityOrder(){

        System.out.println("Test 1: Priority Order");

        HeapPriorityQueue heap = new HeapPriorityQueue();

        heap.insert(new Patient("John",5,1));
        heap.insert(new Patient("Anna",9,2));
        heap.insert(new Patient("Sara",8,3));

        System.out.println(heap.removeMax());
        System.out.println(heap.removeMax());
        System.out.println(heap.removeMax());

        System.out.println();
    }

    // Test 2
    public static void testEmptyQueue(){

        System.out.println("Test 2: Remove from Empty Queue");

        HeapPriorityQueue heap = new HeapPriorityQueue();

        System.out.println(heap.removeMax());

        System.out.println();
    }

    // Test 3
    public static void testSinglePatient(){

        System.out.println("Test 3: Single Patient");

        HeapPriorityQueue heap = new HeapPriorityQueue();

        heap.insert(new Patient("Tom",7,1));

        System.out.println(heap.removeMax());

        System.out.println();
    }

    // Test 4
    public static void testSameSeverity(){

        System.out.println("Test 4: Same Severity");

        HeapPriorityQueue heap = new HeapPriorityQueue();

        heap.insert(new Patient("A",6,1));
        heap.insert(new Patient("B",6,2));
        heap.insert(new Patient("C",6,3));

        System.out.println(heap.removeMax());
        System.out.println(heap.removeMax());
        System.out.println(heap.removeMax());

        System.out.println();
    }

    // Test 5
    public static void testManyPatients(){

        System.out.println("Test 5: Many Patients");

        HeapPriorityQueue heap = new HeapPriorityQueue();

        heap.insert(new Patient("P1",3,1));
        heap.insert(new Patient("P2",7,2));
        heap.insert(new Patient("P3",2,3));
        heap.insert(new Patient("P4",9,4));
        heap.insert(new Patient("P5",4,5));

        while(true){

            Patient p = heap.removeMax();

            if(p == null)
                break;

            System.out.println(p);
        }

        System.out.println();
    }

    // Test 6
    public static void testInsertAfterRemove(){

        System.out.println("Test 6: Insert After Remove");

        HeapPriorityQueue heap = new HeapPriorityQueue();

        heap.insert(new Patient("John",5,1));
        heap.insert(new Patient("Anna",8,2));

        System.out.println(heap.removeMax());

        heap.insert(new Patient("Mike",9,3));

        System.out.println(heap.removeMax());
        System.out.println(heap.removeMax());

        System.out.println();
    }

    // Test 7
    public static void testLargeSeverity(){

        System.out.println("Test 7: Large Severity Values");

        HeapPriorityQueue heap = new HeapPriorityQueue();

        heap.insert(new Patient("Critical",100,1));
        heap.insert(new Patient("Normal",10,2));

        System.out.println(heap.removeMax());
        System.out.println(heap.removeMax());

        System.out.println();
    }

    // Test 8
    public static void testNegativeSeverity(){

        System.out.println("Test 8: Negative Severity");

        HeapPriorityQueue heap = new HeapPriorityQueue();

        heap.insert(new Patient("A",-1,1));
        heap.insert(new Patient("B",-5,2));
        heap.insert(new Patient("C",2,3));

        System.out.println(heap.removeMax());
        System.out.println(heap.removeMax());
        System.out.println(heap.removeMax());

        System.out.println();
    }

    // Test 9
    public static void testDuplicatePatients(){

        System.out.println("Test 9: Duplicate Patients");

        HeapPriorityQueue heap = new HeapPriorityQueue();

        heap.insert(new Patient("John",5,1));
        heap.insert(new Patient("John",5,2));

        System.out.println(heap.removeMax());
        System.out.println(heap.removeMax());

        System.out.println();
    }

    // Test 10
    public static void testSequentialOperations(){

        System.out.println("Test 10: Sequential Operations");

        HeapPriorityQueue heap = new HeapPriorityQueue();

        heap.insert(new Patient("A",4,1));
        heap.insert(new Patient("B",9,2));
        heap.insert(new Patient("C",1,3));

        System.out.println(heap.removeMax());

        heap.insert(new Patient("D",7,4));

        System.out.println(heap.removeMax());
        System.out.println(heap.removeMax());
        System.out.println(heap.removeMax());

        System.out.println();
    }
}
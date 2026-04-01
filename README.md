# COMP47500 – Assignment 3: Heaps

## Emergency Room Priority Queue System (Java)

# Project Overview

This project implements a **Priority Queue system for an Emergency Room** using **Heap Data Structures in Java**.

In a hospital emergency room, patients must be treated based on the **severity of their medical condition**, not simply the order in which they arrive.

This project simulates such a system using different implementations of **Priority Queues** and compares their performance.

The following implementations are included:

• Heap Priority Queue  
• Sorted Sequence Priority Queue  
• Unsorted Sequence Priority Queue  

The project also includes **automated test cases and experimental performance analysis**.

---

# Problem Statement

Emergency rooms must manage patients efficiently by prioritizing those with the most severe conditions.

The system must:

• Insert new patients into the queue  
• Remove the highest priority patient for treatment  
• Maintain correct priority ordering  
• Efficiently manage large numbers of patients  

A **Heap-based Priority Queue** provides an efficient solution for this problem.

---

# Technologies Used

* Java  
* Eclipse IDE  
* GitHub  
* Data Structures – Heap, Priority Queue  

---

# Project Structure

```
COMP47500-HeapEmergencySystem
│
├── src
│   └── erpriority
│       ├── HeapPriorityQueue.java
│       ├── SortedSequencePQ.java
│       ├── UnsortedSequencePQ.java
│       ├── Patient.java
│       ├── TestCases.java
│       ├── Experiment.java
│       └── Main.java
│
├── README.md
├── .gitignore
├── .classpath
└── .project
```

---

# System Components

## Patient.java

This class represents a patient in the emergency room.

Attributes:

• Patient name  
• Severity level (priority value)  
• Arrival time  

Patients are compared based on **severity**, which determines their treatment priority.

Example:

```
Patient("Anna", 9, 2)
```

Severity scale example:

| Severity | Condition |
| -------- | --------- |
| 10       | Critical  |
| 8        | Serious   |
| 5        | Moderate  |
| 2        | Mild      |

---

# Heap Priority Queue

The Heap Priority Queue stores patients in a **binary heap structure**.

Operations implemented:

• Insert patient  
• Remove highest priority patient  
• Maintain heap property  

Time Complexity:

| Operation  | Complexity |
| ---------- | ---------- |
| Insert     | O(log n)   |
| Remove Max | O(log n)   |
| Peek       | O(1)       |

This implementation is efficient for large datasets.

---

# Sorted Sequence Priority Queue

In this implementation, patients are stored in a **sorted list**.

Properties:

• Insert requires shifting elements  
• Removal is fast  

Time Complexity:

| Operation  | Complexity |
| ---------- | ---------- |
| Insert     | O(n)       |
| Remove Max | O(1)       |

---

# Unsorted Sequence Priority Queue

In this implementation, patients are stored in an **unsorted list**.

Properties:

• Insert is very fast  
• Removal requires searching for the maximum element  

Time Complexity:

| Operation  | Complexity |
| ---------- | ---------- |
| Insert     | O(1)       |
| Remove Max | O(n)       |

---

# Automated Test Cases

The project includes **10 automated test cases** to validate system correctness.

### Test Case 1 – Priority Ordering

Verifies that patients are removed based on highest severity.

### Test Case 2 – Empty Queue

Tests system behaviour when removing from an empty queue.

### Test Case 3 – Single Patient

Ensures the heap works correctly with only one element.

### Test Case 4 – Equal Severity

Checks behaviour when multiple patients have the same priority.

### Test Case 5 – Multiple Patients

Tests the system with several patient insertions.

### Test Case 6 – Insert After Removal

Verifies that heap structure remains correct after mixed operations.

### Test Case 7 – Large Severity Values

Ensures large priority values are handled correctly.

### Test Case 8 – Negative Severity

Tests robustness with unusual values.

### Test Case 9 – Duplicate Patients

Ensures duplicates are processed correctly.

### Test Case 10 – Sequential Operations

Simulates real emergency room behaviour with continuous insert and remove operations.

---

# Experimental Analysis

The project includes experiments to compare the performance of different priority queue implementations.

The experiment measures execution time for:

• Heap Priority Queue  
• Sorted Sequence Priority Queue  
• Unsorted Sequence Priority Queue  

The experiment inserts and removes large numbers of patients and measures runtime.

Example dataset sizes:

| Dataset Size |
| ------------ |
| 1000         |
| 5000         |
| 10000        |
| 20000        |

---

# Performance Comparison

| Implementation    | Insert   | Remove   |
| ----------------- | -------- | -------- |
| Heap              | O(log n) | O(log n) |
| Sorted Sequence   | O(n)     | O(1)     |
| Unsorted Sequence | O(1)     | O(n)     |

### Observations

• Heap provides balanced performance for both operations  
• Sorted sequence has slow insertion  
• Unsorted sequence has slow removal  

Therefore, **Heap-based Priority Queue is the most efficient solution for emergency triage systems.**

---

# Learning Outcomes

This project demonstrates:

• Implementation of Heap data structures  
• Design of Priority Queue ADT  
• Comparison of different algorithmic approaches  
• Experimental algorithm analysis  
• Real-world application of data structures  

---

# Conclusion

This project demonstrates how **Heap-based Priority Queues can efficiently manage emergency room triage systems**.

Through testing and experimental analysis, it is shown that the **Heap implementation provides the best balance between insertion and removal operations**, making it ideal for real-time priority scheduling systems.

---

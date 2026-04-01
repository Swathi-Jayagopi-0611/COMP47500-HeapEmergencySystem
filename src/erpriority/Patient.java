package erpriority;

public class Patient implements Comparable<Patient>{

    String name;
    int severity;
    int arrivalTime;

    public Patient(String name, int severity, int arrivalTime){
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public int compareTo(Patient other){
        return other.severity - this.severity;
    }

    public String toString(){
        return name + " (Severity:" + severity + ")";
    }
}
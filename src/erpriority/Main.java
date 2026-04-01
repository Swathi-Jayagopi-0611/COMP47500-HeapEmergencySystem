package erpriority;

public class Main {

    public static void main(String[] args){

        TestCases.runTests();

        System.out.println("\nRunning Experiment...\n");

        Experiment.runExperiment();
    }
}
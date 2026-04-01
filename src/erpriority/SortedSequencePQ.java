package erpriority;

import java.util.ArrayList;

public class SortedSequencePQ {

    ArrayList<Patient> list = new ArrayList<>();

    public void insert(Patient p){

        int i=0;

        while(i<list.size() && list.get(i).severity > p.severity)
            i++;

        list.add(i,p);
    }

    public Patient removeMax(){

        if(list.size()==0)
            return null;

        return list.remove(0);
    }
}
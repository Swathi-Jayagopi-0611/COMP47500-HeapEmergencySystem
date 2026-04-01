package erpriority;

import java.util.ArrayList;

public class UnsortedSequencePQ {

    ArrayList<Patient> list = new ArrayList<>();

    public void insert(Patient p){
        list.add(p);
    }

    public Patient removeMax(){

        if(list.size()==0)
            return null;

        int maxIndex = 0;

        for(int i=1;i<list.size();i++){
            if(list.get(i).severity > list.get(maxIndex).severity)
                maxIndex = i;
        }

        return list.remove(maxIndex);
    }
}
package org.acme;


import jakarta.enterprise.context.RequestScoped;

import java.util.ArrayList;
import java.util.List;

@RequestScoped
public class AlticciService {

    List<Long> sequence = new ArrayList<Long>();

    public List<Long> showSequence(long n){
        if(n == 0){
            sequence.add(0L);
            return sequence;
        }
        if(n == 1){
            sequence.add(0L);
            sequence.add(1L);
            return sequence;
        }
        if (n == 2){
            sequence.add(0L);
            sequence.add(1L);
            sequence.add(1L);
            return sequence;
        }
        sequence.add(0L);
        sequence.add(1L);
        sequence.add(1L);
        for (int i = 3; i <= n; i++) {
            long nextValue = sequence.get(i-3) + sequence.get(i-2);
            sequence.add(nextValue);
        }
        return sequence;
    }
}

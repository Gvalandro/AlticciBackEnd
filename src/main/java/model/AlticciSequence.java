package model;


import org.acme.AlticciService;

import java.util.ArrayList;
import java.util.List;

public class AlticciSequence {

private List<Long> sequence = new ArrayList<Long>();
private long value;

    public AlticciSequence(AlticciService alticciService, long value) {
        this.sequence = alticciService.showSequence(value);
        this.value = sequence.get(sequence.size()-1);
    }

    public List<Long> getSequence() {
        return sequence;
    }

    public long getValue() {
        return value;
    }
}

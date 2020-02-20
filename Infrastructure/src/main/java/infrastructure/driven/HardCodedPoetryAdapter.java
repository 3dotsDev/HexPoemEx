package infrastructure.driven;

import domain.poem.IObtainPoems;

public class HardCodedPoetryAdapter implements IObtainPoems {

    public String getMeAPoem() {
        return "HardCodeBase ChingChangChung";
    }
}

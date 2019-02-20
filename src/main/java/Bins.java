import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Bins {


    private SortedMap<Integer, Integer> binMap = new TreeMap<Integer, Integer>();

    public Bins(Integer minRollValue, Integer maxRollValue) {

        for(int i = minRollValue; i <= maxRollValue; i++ ) {
            binMap.put(i,0);

        }
    }

    public Integer getBin(Integer key) {

        return binMap.get(key);
    }

    public void incrementBin(Integer key) {

        binMap.put(key,binMap.get(key)+1);
    }

    public Set<Integer> getKeySet(){

        return binMap.keySet();
    }



}

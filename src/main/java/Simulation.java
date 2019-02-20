import java.util.Set;
import java.util.TreeMap;

public class Simulation {


    private Integer numberOfDies;
    private Integer numberOfTosses;
    private Bins bin;
    private Dice newDice;


    public Simulation(Integer numberOfDies, Integer numberOfTosses) {

        Integer minRollValue = numberOfDies * 1;
        Integer maxRollValue = numberOfDies * 6;

        this.bin = new Bins(minRollValue, maxRollValue);
        this.newDice = new Dice(numberOfDies);
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
    }

    public void runSimulation() {

        for (int i = 0; i < numberOfTosses; i++) {
            Integer val = newDice.tossAndSum();
            bin.incrementBin(val);
        }

    }

    public void printResults() {

        String output = "";

        for (int i = numberOfDies; i <= numberOfDies*6; i++) {
            output += printBinLine(i);
        }

        System.out.println(output);
    }

    private String printBinLine(int key) {

        Double percentage = (double)bin.getBin(key)/(double)numberOfTosses;
        String stars = stars(percentage);

        String outputString = String.format("%2d : %9d  : %2.2f %s\n", key, bin.getBin(key),
                percentage, stars);

        return outputString;
    }

    public String stars(Double value) {

        String stars = "";

        for(double i = 0; i < value; i += 0.01) {
            stars = stars + "*";
        }
        return stars;
    }

}


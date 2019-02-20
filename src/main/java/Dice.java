

public class Dice {

    private Integer numberOfDice;

    public Dice(Integer num) {
        this.numberOfDice = num;
    }

    public Integer tossAndSum() {

        Integer sum = 0;

        for(int i = 0; i < numberOfDice; i++){
            sum += roll();
        }
        return sum;
    }

    private Integer roll() {
        Integer rollValue = (int) (Math.random() * 6 + 1);

        return rollValue;
    }


}

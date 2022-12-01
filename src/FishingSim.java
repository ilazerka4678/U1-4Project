import java.text.DecimalFormat;

/**
 * The FishingSim class is responsible for all the logic of the program and the methods, while the FishingSimRunner is responsible for user input and display.
 *
 */
public class FishingSim {
DecimalFormat df = new DecimalFormat("###.###");
private double biggestFish;
private int fishCaught;
private int baitPower;

    /**
     * Constructor for FishingSim. Creates a new instance of FishingSim with no parameters, setting all variables to 0.
     */
    public FishingSim(){
    biggestFish = 0;
    fishCaught = 0;
    baitPower = 0;
    }

    /**
     * Constructor for FishingSim. Creates a new instance of FishingSim, setting the baitPower to the specified parameter.
     * @param baitPower
     */
    public FishingSim(int baitPower){
    this.baitPower = baitPower;
    biggestFish = 0;
    fishCaught = 0;
    }

    /**
     * Sets baitPower to a number that corresponds with the baitName the user inputs.
     * @param baitName used to represent the bait the user chose.
     */
    public void setBait(String baitName){
    if (baitName.equals("Worm") || baitName.equals("worm")){
        baitPower = 7;
    }
    else if (baitName.equals("Cheese") || baitName.equals("cheese")){
        baitPower = 1;
    }
    else {
        baitPower = 5;
    }
}

    /**
     * a getter method to show the user what bait they have equipped.
     * @return
     */
    public String getBait(){
    if (baitPower == 7){
        return "Worm";
    }
    else if (baitPower == 1){
        return "Cheese";
    }
    else{
        return "Bread";
    }
}

    /**
     * a method that is responsible for catching a random fish. The chances are influenced by baitPower
     * @return returns the type of fish the user has caught.
     */
    public String catchFish(){
    int randNum = (int)(Math.random()*baitPower)+1;
    double fishWeight = (((Math.random()*17) + 1));
    String fishType;
    if (randNum == 1){
       fishType = "slurper";
    }
    else if (randNum > 1 && randNum < 4){
        fishType = "bluegilled bubblefish";
    }
    else if (randNum == 5 || randNum == 6 ){
        fishType = "gloomoid";
    }
    else if (randNum > 6){
        fishType = "skippy";
    }
    else {
        fishType = "flippy";
    }
    if (fishWeight > biggestFish){
        biggestFish = fishWeight;
    }
    fishCaught++;
    return "You caught a " + fishType + ". It weighs " + df.format(fishWeight) + " pounds." ;
}

    /**
     * a toString method used to show the user statistics.
     * @return returns a string with the user stats.
     */
    public String toString(){
    return "Biggest fish: " + df.format(biggestFish) + " pounds. Total fish caught: " +  fishCaught;

}
}

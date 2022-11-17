import java.text.DecimalFormat;

public class FishingSim {
DecimalFormat df = new DecimalFormat("###.###");
private double biggestFish;
private int fishCaught;
private int baitPower;

public FishingSim(){
    biggestFish = 0;
    fishCaught = 0;
    baitPower = 0;
    }
public FishingSim(int baitPower){
    this.baitPower = baitPower;
    }
public char generateChar(){
    int randomNum = (int)(Math.random()*3)+1;
    if (randomNum == 1){
        return 'W';
    }
    else if (randomNum == 2){
        return 'A';
    }
    else if (randomNum == 3){
        return 'S';
    }
    return 'D';
}
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
public String toString(){
    return "Biggest fish: " + df.format(biggestFish) + " pounds. Total fish caught: " +  fishCaught;

}
}

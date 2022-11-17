import java.util.Scanner;
public class FishingSimRunner {
    public static void main(String[] args) {
String Input = "";
Scanner s = new Scanner(System.in);
FishingSim test = new FishingSim();
System.out.println("Welcome to the Fishing Simulator 2022 Deluxe Edition!\n" +
        "This game features 4 types of fishes for you to catch!");
System.out.println("First, you have to set your bait! It affects the chance for what type of fish you can catch. Your options are: Cheese, bread, and worm. If you misspell the bait, it will default to bread.");
System.out.print("Select your bait: ");
test.setBait(s.nextLine());
System.out.println("Your bait: " + test.getBait());
while (!Input.equals("-1")){
    System.out.print("Type 1 to fish, 2 to select different bait, 3 to view your fish stats, and -1 to exit. Type your input: ");
    Input = s.nextLine();
    if (Input.equals("1")){
        System.out.println();
        System.out.println(test.catchFish());
        System.out.println();
    }
    if (Input.equals("2")){
        System.out.print("Bait options: Cheese, bread, worm. Input your bait: "
                );
        test.setBait(s.nextLine());
        System.out.println("You chose " + test.getBait() + "!" );

    }
    if (Input.equals("3")){
        System.out.println(test);
    }
    if (Input.equals("-1")){
        System.out.println("Thank you for playing!");
    }
}
    }
}

package testProjects;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RouletteTest {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
	        names.add("AMARA");
	        names.add("AVEJANE");
	        names.add("CARL");
	        names.add("CHARLES");
	        names.add("JEROME");
	        names.add("LARS");
	        names.add("ALEXIS");
	        names.add("MICAELLA");
	        names.add("NATHANIEL");

        ArrayList<String> pickednames = new ArrayList<>();
        	Random random = new Random();
        	Scanner scanner = new Scanner(System.in);

        while (!names.isEmpty()) {
        	System.out.print("Press '1' to spin the roulette or '2' to stop: ");
        	String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("1")) {
            	int index = random.nextInt(names.size());
            	String pickedNames = names.get(index);
            	pickednames.add(pickedNames);
            	names.remove(index);
            	System.out.println("NICE " + pickedNames + "! CONGRATS!");
            } else if (userInput.equals("2")) {
                System.out.println("Tnx for playing!");
                break;
            } else {
            System.out.println("Unacceptable choice. Please enter '1' to spin or '2' to stop.");
            }
        }

        if (names.isEmpty()) {
        System.out.println("All names have been picked!");
        }
        scanner.close();
    }
}

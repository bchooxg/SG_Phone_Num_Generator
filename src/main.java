import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("How many SG numbers do you require? ");

        var count = scanner.nextInt();
        scanner.close();

        System.out.printf("Got it! Generating %d numbers for you now%n",count);

        for (int i = 0; i < count; i++){

            Random rand = new Random();
            int random_integer = rand.nextInt(3)+1;
            int firstNum = 0;

            switch (random_integer){
                case 1: firstNum = 6;
                        break;
                case 2: firstNum = 8;
                        break;
                case 3: firstNum = 9;
                        break;
            }


            int restNums = rand.nextInt(9999999)+1000000;

            System.out.printf("+65 %d%d%n",firstNum,restNums);



        }




    }

}

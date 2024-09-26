
import java.util.Scanner;

public class SeatsReserve{
    public static void main(String[] args) {
        char seats [][] = new char[10][10];
        boolean flag = false;
        Scanner keyboard = new Scanner(System.in);
        int fila, asiento;
        String answer = "";

        for(int f=0; f<10;f++){
            for (int c=0; c<10; c++){
                seats[f][c] = 'L';
            }
        }
        System.out.println("++++++++++++++++++++++ Welcome to the seats reserve system ++++++++++++++++++++++");
        
        while(flag == false){
            System.out.println("Please enter row and seat to reserve");
            System.out.print("Row (0-9)");
            fila = keyboard.nextInt();

            System.out.println("Seat (0-9)");
            asiento = keyboard.nextInt();

            
            if(seats[fila][asiento] == 'L'){
                seats[fila][asiento] = 'X';
                System.out.println("Seat selected correctly");
            } 
            else System.out.println("The seat selected is not available");

            System.out.println("Do you want to select another seat? (Y/N) ");
            answer = keyboard.next();

            if(answer.equalsIgnoreCase("N")) flag = true;
        }

    }
}
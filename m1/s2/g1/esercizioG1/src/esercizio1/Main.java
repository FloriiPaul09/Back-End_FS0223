package esercizio1;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		
		int[] array = randomArray();
		
		printArray(array);
		
		readNumberPosition(array);
		
	}
	
	private static void readNumberPosition(int[] array){
		
		Scanner scan = new Scanner(System.in);
		int i, number, position;
		boolean continues = true;
		
		
		do {
			
			System.out.println("Press a number after the enter, press 0 to exit.");
			number = scan.nextInt();
			
			if(number != 0){
				System.out.println("Decide the position of the number that you want to add.");
				position = scan.nextInt();
				
				try{
					array[position] = number;
					printArray(array);
				}catch(ArrayIndexOutOfBoundsException e){
					System.out.println("Position out of the limit of the array: " + position);
				}
				
			}else {
				continues = false;
			}
			
		}while(continues);
	
	}
	
	private static void printArray(int[]array){
		for(int i = 0; i < array.length; i++){
			System.out.println("Position is " + i + array[i]);
		}
	}
	
	private static int[] randomArray() {
		int[]array = new int[5];
		
		Random random = new Random();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(11);
		}
		
		return array;
	}
}

import java.util.Scanner;   //input class 

public class EvenArrayDemo {   //Public class with main method
	
	public static void main(String Args[]) {  //Main method of the program
	int EvenArray[] = new int[10]; //Integer type array with only 10 digits..
	
	System.out.println("All even number of the array are as follow:");
	
	for(int i=0 ; i < 10; i++) {   //for loop till the size of array, i.e. array will start from 0 till 9..
		EvenArray[i] = i;
		
		int b = EvenArray[i];   //getting individual value of array in integer "b" which will change every time it integers for loop 
		
		if( b%2 == 0) {   		//Taking modulus of integer received in b, if it is divisible by 2 than it is even else odd
			
			System.out.println(b);   //printing value of b with only integer value
			}
		}
	}
}

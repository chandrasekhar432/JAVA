package com.cloudvandana;
import java.util.Random;

public class ArrayShuffle {

	    public static void main(String[] args) {
	        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
	        shuffleArray(myArray);
	        
	        for (int element : myArray) {
	            System.out.print(element + " ");
	        }
	    }

	    public static void shuffleArray(int[] array) {
	        Random rand = new Random();
	        for (int i = array.length - 1; i > 0; i--) {
	            int j = rand.nextInt(i + 1);
	            // Swap array[i] and array[j]
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	    }
	}

	



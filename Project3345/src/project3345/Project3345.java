/*
Name: Mary Grace Doviak
Class: CS 3345
Section: 004
Semester: Spring 2019
Project #1, project will take an integer greater than 1 as input and calculates 
all the prime numbers that are smaller than or equal to than input. 
 */
package project3345;

import java.util.Scanner;

public class Project3345 {

     void findPrimes(int N) {
        boolean primeNumbers[] = new boolean[N+1];
        
        // set all the elements in primeNumbers to true
        for(int i = 0; i <= N; i++) {
            primeNumbers[i] = true;
        } 
        
        // calculate primes
        for(int i = 2; i <= Math.sqrt(N); i++) {
            if(primeNumbers[i] == true) {
                for(int j = i * i; j < N; j += i) {
                    primeNumbers[j] = false;
                }
            }
        }
        
        // print out all the elements in the array that are prime
        for(int i = 2; i <= N; i++) {
            if(primeNumbers[i] == true) 
                System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        
        do { // loop until user chooses to exit
            System.out.println("Enter an integer or enter -1 to exit: ");
            N = input.nextInt();
            if(N > 1) {
                System.out.println("Prime numbers smaller than or equal to " + N + " are: ");
                Project3345 p1 = new Project3345();
                p1.findPrimes(N);
            }
            else if(N == -1) { // if user chooses to exit
                System.exit(0);
            }
            else {
                System.out.println("Invalid input, please enter a number greater than 1");
            }
        } while(N != -1);
        
    }
    
}

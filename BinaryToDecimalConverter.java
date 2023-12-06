package com.tech.task;
import java.util.Scanner;
public class BinaryToDecimalConverter 
{
	public static void main(String[] args) 
	{
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a binary number: ");
		        String binaryNumber = scanner.next();

		        try {
		            long decimalNumber = binaryToDecimal(binaryNumber);
		            System.out.println("Decimal equivalent: " + decimalNumber);
		        } catch (NumberFormatException e) {
		            System.out.println("Invalid binary number format.");
		        }

		        scanner.close();
		    }

		    public static long binaryToDecimal(String binaryNumber) {
		        return Long.parseLong(binaryNumber, 2);
		    }
		}





package assiment1;

import java.util.Scanner;

public class P1 {

			public static void main(String[] args) {
			
				char operator;
				double number1,number2,result;
				Scanner scan=new Scanner(System.in);
				 System.out.println("choose an operator:+,-,*,/");
				 operator=scan.next().charAt(0);
				 System.out.println("enter first number");
				 number1=scan.nextDouble();
				 System.out.println("enter second number");
				 number2=scan.nextDouble();
				 switch(operator) {
				 case '+':
					 result=number1+number2;
					 System.out.println(number1+"+"+number2+"="+result);
					 break;
				 case '-':
					 result=number1-number2;
					 System.out.println(number1+"-"+number2+"="+result);
					 break;
				 case '*':
					 result=number1*number2;
					 System.out.println(number1+"*"+number2+"="+result);
					 break;
				 case '/':
					 result=number1/number2;
					 System.out.println(number1+"/"+number2+"="+result);
					 break;
				default:
					System.out.println("invalid operator!");
					break;
						 
				 }
			}
			}





package JavaPractic.JavaPractic;

import java.util.Arrays;

public class JavaPractic10 {

	//****************************************************************************************//	
		// This method takes parameter and calculate the area of circle.
		public static void calculateAreaofcirclewithParam(double raduis){
			double rad = raduis;
			double area = Math.PI * (raduis *raduis);
			System.out.println("The area of the circle is : " + area);
			double circumference = Math.PI * 2*raduis;
			System.out.println("The circumference of the circle is: " + circumference);
		 }

		
	//****************************************************************************************//	
		// This method takes the user input and calculate the area of triangle.
		public static void calculateAreaoftrianglewithrparameter(double trianglebase, double triangleheight){
			double base = trianglebase;
			double height = triangleheight;
			double area = (base*height)/2;
			System.out.println("Area of triangle is: " + area);		
		}



	//****************************************************************************************//
		//sum the elements of the array
		public static void sumthearray(int[]array){
			int sum = 0;
			for (int num : array){
				sum = sum+num;
				
			}
			System.out.println("Sum of the array is: " + sum);
		}
		

	//****************************************************************************************//	
		//find out the given number is odd or even
		public static void checktheNumberisEvenorOdd( int number){
			int num = number;
			if (num % 2 == 0){
				System.out.println("number is even");
			}
			else
				System.out.println("number is odd");
			
		}

	//****************************************************************************************//
		//linear search
		
		public static void linearsearch( int[] inputarray , int number){
			int[]array = inputarray;
			int counter = 0;
			for (counter = 0; counter<array.length; counter++){
				if (array[counter] == number){
					System.out.println(number+ " is present loncation " + (counter+1));
					break;
				}
			}
			if (counter == number){
				System.out.println(number + " does not exist in this array");
			}
			
		}
		

	//****************************************************************************************//
		//How to sort an array and search an element inside it?
		public static void binarySearch( int[] inputarray , int number){
			int[] array = inputarray;
			Arrays.sort(array);
			int index = Arrays.binarySearch(array, number);
			System.out.println("Found "+ number + " @ " + index);
		}
		
		
	//****************************************************************************************//	

		//replace specific character in string
		public static void replaceCharat(String s, int pos, char c) {
			String a = s.substring(0, pos);
			System.out.println(a);
			String b = s.substring(pos + 1);
			System.out.println(b);
			System.out.println(a + c + b);
		    //return s.substring(0, pos) + c + s.substring(pos + 1);
		  }
		
		
		
		
		
		public static String removeCharAt(String s, int i) {
		        StringBuffer buf = new StringBuffer(s.length() -1);
		        buf.append(s.substring(0, i)).append(s.substring(i+1));
		        return buf.toString();
		    }
		 
		  public static String removeChar(String s, char c) {
		        StringBuffer buf = new StringBuffer(s.length());
		        buf.setLength(s.length());
		        int current = 0;
		        for (int i=0; i<s.length(); i++){
		            char cur = s.charAt(i);
		            if(cur != c) buf.setCharAt(current++, cur);
		        }
		        System.out.println(buf.toString());
		        return buf.toString();
		    }
		 
		  public static String replaceCharAt(String s, int i, char c) {
		        StringBuffer buf = new StringBuffer(s);
		        buf.setCharAt(i, c);
		        return buf.toString();
		    }
		 
		  public static void extractDigits(String s){
			  StringBuilder abc = new StringBuilder();
			  for(int i=0; i<s.length(); i++){
				  char c = s.charAt(i);
				  if(Character.isLowerCase(c)){
					  abc.append(c);
				  }
			  }
			  System.out.println(abc);
				  
			  }
		  
		  public static String deleteAllNonDigit(String s) {
		        String temp = s.replaceAll("\\D", "");
		        return temp;
		    }
		 
		  public static String replaceAllChar(String s, String f, String r){
		        String temp = s.replace(f ,r);
		        System.out.println(temp);
		        return temp;
		    }
		
	//****************************************************************************************//
		  //Write a Java program to print Fibonacci series upto 100?
		  public static void printfibonacci(int limit ){
		               
		                //number of elements to generate in a series
		                //int limit = 20;
		               
		                long[] series = new long[limit];
		               
		                //create first 2 series elements
		                series[0] = 0;
		                series[1] = 1;
		               
		                //create the Fibonacci series and store it in an array
		                for(int i=2; i < limit; i++){
		                        series[i] = series[i-1] + series[i-2];
		                }
		               
		                //print the Fibonacci series numbers
		               
		                System.out.println("Fibonacci Series upto " + limit);
		                for(int i=0; i< limit; i++){
		                        System.out.print(series[i] + " ");
		                }
		        }

	//****************************************************************************************//	  
		  public void FizzBuzzTest(){ 
			   for(int i = 1; i <= 50; i++){ 
				   if(i % (3*5) == 0) System.out.println("FizzBuzz"); 
				   else if(i % 5 == 0) System.out.println("Buzz"); 
				   else if(i % 3 == 0) System.out.println("Fizz"); 
				   else System.out.println(i); } 
			   } 

	//****************************************************************************************//
		  
		  
		  //Finding the Most Common Character in a String
		  public static int countChars( String str, char searchChar ) {
		  // Count the number of times searchChar occurs in
		  // str and return the result.
			  int i; // A position in the string, str.
			  char ch; // A character in the string.
			  int count; // Number of times searchChar has been found in str.
			  count = 0;
			  for ( i = 0; i < str.length(); i++ ) {
				  ch = str.charAt(i); // Get the i-th character in str.
				  if ( ch == searchChar )
					  count++;
			  }
		  System.out.println(count);
		  return count;
		  }
		  
	//****************************************************************************************//	  

		  public static void mostfrequentletter(String sample)
		     {
			  String s = sample;
		        int highestFreq = 0;
		        char mostFreqChar = ' ';
		        for (int i = 0; i < s.length(); i++)
		        {
		            //Get a char and go through entire string to determine how many times that char occurs
		            char x = s.charAt(i);
		            int c = 0;
		            for (int j = s.indexOf(x); j != -1; j = s.indexOf(x, j + 1))
		            {
		                c++;
		            }
		            if (c > highestFreq)
		            {
		                highestFreq = c;
		                mostFreqChar = x;
		            }
		        }
		        System.out.println(mostFreqChar);
		        System.out.println(highestFreq);
		    }
		  
		  static int possibleWays(int stairs) {
			  int sum = 0;
			  if (stairs > 2) {
			    sum = possibleWays(stairs - 2) + possibleWays(stairs -1);
			} else if (stairs == 2) {
			    sum = 2;
			} else if (stairs == 1) {
			    sum =1;
			} else {
			    System.out.println("invalid number.");
			}
			  System.out.println(sum);
			  return sum;
			}
		  
		  
		  
		  
		//****************************************************************************************//	  
		  //Reverse String
		  public static void ReverseString(String newstring){
			  String mystring  = newstring;
			  String reverse = new StringBuffer(mystring).reverse().toString();
			  System.out.println(reverse);
		  }
		  
		  
	public static void main(String[] args) {
		//calculateareofcirclewithuser();
		//calculateAreaofcirclewithParam(3.6);
		//int[]array = {1, 3, 6, 9, 15, 16};
		//sumthearray(array);
		//checktheNumberisEvenorOdd(54);
		//linearsearch(array,15);
		//binarySearch(array, 9);
		//mostfrequentletter("abcdasea");
		//replaceCharat("Facebook", 5, 'l');
		//removeChar("FaceBook", 'o');
		//extractDigits("Face12Book34Face43Book");
//		replaceAllChar("Face12Book34Face43Book", "F", "B");
//		printfibonacci(20);
//		String abc = "mystring";
//		int a = abc.compareTo("yourstring");
//		System.out.println(a);
//		possibleWays(5);
	//	ReverseString("whatever");
		
	
	/*int limit = 10;
	for(int i =2;i<limit;i++) {
		boolean isPrime = true;
		for(int j=1;j<i;j++) {
			if(i%j==0) {
			isPrime =false;
			break;
			}
		}
		if(isPrime)
			System.out.println(isPrime);*/
	
	
	int num = 10;
	//for(int i =0;i <num; i++) {
		if(num%3==0) {
			System.out.println("FIZZ");
		}else if(num%5==0) {
			System.out.println("Buzz");
		} else if (num%3 ==0 &num%5==0) {
			System.out.println("FIZZBUZZ");
		} else {
			System.out.println(num);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}




















}

package week1day1;

public class Fibinocciseries1 {

	 public static void main(String[] args) {

		    int n = 8, firstNum = 0, secondNum = 1;
		    System.out.println("Fibonacci Series till " + n + ":");

		    for (int i = 1; i <= n; ++i) {
		      System.out.print(firstNum + ", ");

		      // compute the next term
		      int nextNum = firstNum + secondNum;
		      firstNum = secondNum;
		      secondNum = nextNum;
		    }
		  }
		}


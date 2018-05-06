//  Mark Villa
//  4/20/18
//  Fibonacci

public class P8.1 {
  
  public static void main(Strings arg[]) {
    System.out.println(fib(5));
  }
  
  public static int fib(int n) {
	    return (n <= 1) ? n: fib(n-1) + fib(n-2);
  }
}

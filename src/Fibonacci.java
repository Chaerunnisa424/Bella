import java.util.ArrayList;
import java.util.List;


public class Fibonacci {


        public static List<Integer> fibonacci(int n) {
            List<Integer> fib = new ArrayList<>();
            fib.add(0);
            fib.add(1);
            while (fib.get(fib.size() - 1) < n) {
                int nextFib = fib.get(fib.size() - 1) + fib.get(fib.size() - 2);
                fib.add(nextFib);
            }
            fib.remove(fib.size() - 1);
            return fib;
        }

        public static int sumFibonacci(List<Integer> fibSeq) {
            int sum = 0;
            for (int num : fibSeq) {
                if (num % 2 == 0) {
                    sum += num;
                }
            }
            return sum;
        }

        public static void main(String[] args) {
            List<Integer> fibonacciSeq = fibonacci(4500);
            int evenFibonacciSum = sumFibonacci(fibonacciSeq);

            System.out.println("Deret Fibonacci dari 10 hingga 4500:");
            System.out.println(fibonacciSeq);
            System.out.println("\nBilangan Fibonacci yang genap:");
            List<Integer> evenFibonacci = new ArrayList<>();
            for (int num : fibonacciSeq) {
                if (num % 2 == 0) {
                    evenFibonacci.add(num);
                }
            }
            System.out.println(evenFibonacci);
            System.out.println("\nTotal bilangan Fibonacci genap:");
            System.out.println(evenFibonacci.size());
            System.out.println("\nJumlah bilangan Fibonacci genap:");
            System.out.println(evenFibonacciSum);
        }
}



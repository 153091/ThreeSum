package src;

import java.util.Arrays;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class ThreeSumDeluxe {

    public static int count(int[] a){
        int n = a.length;
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i<n; i++)
            for (int j = i + 1; j < n; j++) {
                int k = Arrays.binarySearch(a, -(a[i] + a[j]));
                    if (k > j)
                    count++;
                }
        return count;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] a = in.readAllInts();
        Stopwatch time = new Stopwatch();

        StdOut.println(count(a));
        StdOut.println("Затрачено времени = " + time.elapsedTime());

    }
}
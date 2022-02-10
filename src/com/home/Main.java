package com.home;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateFibNumbers(100));

    }

    private static long calculateFibNumbers(int n) {
      long [] array = new long [n + 1];
      array[0] = 0;
      array [1] = 1;
      for (int i = 2; i <= n ; i++)
          array[i] = array[i-2] + array[i-1];
      return array[n];
    }
}


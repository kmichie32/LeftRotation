package com.kevinmichie;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import static java.util.Arrays.asList;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        List<Integer> intList = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            intList.add(in.nextInt());
        }
        for(int j = 0; j < k; j++) {
            int holder = intList.remove(0);
            intList.add(holder);
        }

        for(int values : intList) {
            System.out.print(values + " ");
        }
    }
}

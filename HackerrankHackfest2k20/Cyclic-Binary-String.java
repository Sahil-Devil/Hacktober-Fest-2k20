/* Problem Link */
/**
** https://www.hackerrank.com/contests/hackerrank-hackfest-2020/challenges/cyclic-binary-string
**/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'maximumPower' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int maximumPower(String s) {
    // Write your code here
        s+=s;
        int l = s.length();
        int c=0, max=0;
        
        // Maximum count of continuous zeroes
        for(int i=0; i<l; i++){
            if(s.charAt(i)=='1'){ if(c>max)max=c; c=0; }
            else c++;
        }
        
        // Handle Zeroes at start and end of string
        if(s.charAt(l-1)=='0' && c>max) max = c;
        if(max==l) return -1;
        return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.maximumPower(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

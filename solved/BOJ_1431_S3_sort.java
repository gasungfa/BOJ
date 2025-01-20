package solved;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class BOJ_1431_S3_sort{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<String> serialNums = new ArrayList<>(n);
        for(int i = 0;i<n;i++){
            serialNums.add(br.readLine());
        }
        serialNums.sort((a,b)->{
            if(a.length() != b.length()){
                return a.length() - b.length();
            }
            int sumA = sumOfDigit(a);
            int sumB = sumOfDigit(b);
            if(sumA != sumB){
                return sumA - sumB;
            }
            return a.compareTo(b);
        });

        for(String str: serialNums){
            bw.write(str);
            bw.newLine();
        }
        bw.flush();
    }

    private static int sumOfDigit(String str){
        int sum = 0;
        for(char c: str.toCharArray()){
            if(Character.isDigit(c)){
                sum += c;
            }
        }
        return sum;
    }
}


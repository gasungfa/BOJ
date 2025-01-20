package solved;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_10828_S4_stack {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 0;i<n;i++){
            StringTokenizer st = new StringTokenizer(scanner.nextLine(), " ");
            String str = st.nextToken();
            if(str.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
                continue;
            }
            if(str.equals("pop")){
                if(stack.isEmpty()){
                    stringBuilder.append("-1\n");
                }
                else{
                    stringBuilder.append(stack.pop()).append("\n");
                }
                continue;
            }
            if(str.equals("size")){
                stringBuilder.append(stack.size()).append("\n");
                continue;
            }
            if(str.equals("empty")){
                if(stack.isEmpty()){
                    stringBuilder.append("1\n");
                }
                else{
                    stringBuilder.append("0\n");
                }
                continue;
            }
            if(str.equals("top")){
                if(stack.isEmpty()){
                    stringBuilder.append("-1\n");
                }
                else{
                    stringBuilder.append(stack.peek()).append("\n");
                }
                continue;
            }

        }
        System.out.println(stringBuilder);
    }
}

package challenging;

import java.util.*;

public class BOJ_1260_S2 {
    static int n,m,v;
    static boolean[] check;
    static int[][] arr;

    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringTokenizer st = new StringTokenizer(scanner.nextLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        check = new boolean[n+1];
        arr = new int[n+1][n+1];

        for(int i = 0;i<m;i++){
            st = new StringTokenizer(scanner.nextLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(v);
        sb.append("\n");
        check  = new boolean[n+1];
        bfs(v);
        System.out.println(sb);

    }
    public static void dfs(int start){
        check[start] = true;
        sb.append(start).append(" ");

        for(int i = 0;i<=n;i++){
            if(arr[start][i] == 1 &&!check[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int start){
        check[start] = true;
        queue.add(start);

        while(!queue.isEmpty()){
            start = queue.poll();
            sb.append(start).append(" ");

            for(int i = 0;i<=n;i++){
                if(arr[start][i] == 1 && !check[i]){
                    queue.add(i);
                    check[i] = true;
                }
            }
        }

    }
}

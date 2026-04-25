import java.util.*;
public class Main {
    static class Edge{
        int u, v,idx;
        Edge(int u, int v, int idx) {
            this.u = u;
            this.v = v;
            this.idx = idx;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Edge> edges = new ArrayList<>();
        int[] deg = new int[n + 1];
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            edges.add(new Edge(u, v, i));
            deg[u]++;
            deg[v]++;
        }
        int special = -1;
        for (int i = 1; i <= n; i++) {
            if (deg[i] >= 3) {
                special = i;
                break;
            }
        }
        int[] ans = new int[n - 1];
        Arrays.fill(ans, -1);
        int label = 0;
        if (special != -1) {
            for (Edge e : edges) {
                if (e.u == special || e.v == special) {
                    if (label < 3) {
                        ans[e.idx] = label++;
                    }
                }
            }
        }
        for (Edge e : edges) {
            if (ans[e.idx] == -1) {
                ans[e.idx] = label++;
            }
        }
        for(int x:ans){
            System.out.println(x);
        }
        sc.close();
    }
}

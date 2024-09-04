import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class jun11724 {
    static boolean visited[];
    static ArrayList<Integer>[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());  // 노드의 수
        int m = Integer.parseInt(st.nextToken());  // 간선의 수

        visited = new boolean[n + 1]; // 노드 방문 여부를 확인하기 위한 배열
        A = new ArrayList[n + 1]; // 그래프를 저장할 인접 리스트 배열

        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>(); // 각 노드에 대해 인접 리스트 초기화
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); // 간선의 시작 노드
            int e = Integer.parseInt(st.nextToken()); // 간선의 끝 노드

            A[s].add(e); // 시작 노드에서 끝 노드로의 간선 추가
            A[e].add(s); // 끝 노드에서 시작 노드로의 간선 추가 (무방향 그래프이므로)
        }

        int count = 0; // 연결 요소의 개수를 세기 위한 변수

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) { // 노드가 방문되지 않았다면 새로운 연결 요소임
                count++;
                DFS(i); // 해당 연결 요소에 속한 모든 노드를 방문
            }
        }
        System.out.println(count); // 연결 요소의 개수 출력
    }

    private static void DFS(int v) {
        if (visited[v]) return; // 이미 방문한 노드라면 종료

        visited[v] = true; // 노드를 방문했다고 표시
        for (int j : A[v]) { // 현재 노드에 인접한 모든 노드 탐색
            if (!visited[j]) {
                DFS(j); // 재귀적으로 연결된 모든 노드를 방문
            }
        }
    }
}

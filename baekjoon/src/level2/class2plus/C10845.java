package level2.class2plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class C10845 {
    static Queue<Integer> q;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        q = new LinkedList<>();
        StringTokenizer st;
        sb = new StringBuilder();
        String s;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            s = st.nextToken();
            if (s.equals("push")) push(Integer.parseInt(st.nextToken()));
            if (s.equals("pop")) pop();
            if (s.equals("size")) size();
            if (s.equals("empty")) empty();
            if (s.equals("front")) front();
            if (s.equals("back")) back();
        }
        System.out.println(sb);
    }

    static void push(int x) {
        q.add(x);
    }

    static void pop() {
        if (q.isEmpty()) {
            sb.append("-1\n");
        } else {
            sb.append(q.remove()).append("\n");
        }
    }

    static void size() {
        sb.append(q.size()).append("\n");
    }

    static void empty() {
        if (q.isEmpty()) {
            sb.append("1\n");
        } else {
            sb.append("0\n");
        }
    }

    static void front() {
        if (q.isEmpty()) {
            sb.append("-1\n");
        } else {
            sb.append(q.peek()).append("\n");
        }
    }

    static void back() {
        if (q.isEmpty()) {
            sb.append("-1\n");
            return;
        }
        int n = q.size();
        for (int i = 1; i <= n - 1; i++) {
            q.add(q.remove());
        }
        sb.append(q.peek()).append("\n");
        q.add(q.remove());
    }
}
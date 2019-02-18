

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Inheritance {

}


class Stack {
    Node head;








    public Stack() {
        head = new Node();
    }

    public int pop() {




//
//        int temp = list.get(list.size() - 1);
//        list.remove(list.size() - 1);
//        return temp;
        return 1;
    }






    public void push(Integer i) {

      //  list.add(i);
    }
}





class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;


    public TreeNode(int i) {
        this.value = i;
        this.left = this.right = null;
    }


}
class Node{
    int i;
    Node next;
}











class BST {
    TreeNode root;
    public BST() {


    }
    public int find(TreeNode root) {

        if (root == null) return 0;
        if (root.left != null) {
            return find(root.left);
        }

        return root.value;
    }





    public void insert(int i) {

        root = insertHelper(root, i);
    }
    public TreeNode insertHelper(TreeNode root, int i) {

        if (root == null) {
            return new TreeNode(i);
        } else if (root.value > i) {
            root.left = insertHelper(root.left, i);
            return root;
        } else {


            root.right = insertHelper(root.right, i);
            return root;
        }

    }
//    public void insertHelper(TreeNode tn, int i) {
////        if (root != null) {
////            System.out.println(root.left.value);
////        }
//        if (tn != null) {
//            tn = new TreeNode(1);
//
//
//
//
//
//
//
//            tn.value = tn.value + 1;
//            System.out.println(tn.value);
//        }
//        TreeNode cur = root;
//        TreeNode parent = root;
//
//
//
//
//        boolean left = false;
//        while (cur != null) {
//            parent = cur;
//            left = false;
//            if (cur.value > i) {
//                left = true;
//                cur = cur.left;
//            }else {
//                cur = cur.right;
//            }
//        }
//        cur = new TreeNode(i);
//        if (left == true) {
//            parent.left = cur;
//        }else {
//            parent.right = cur;
//        }
//    }
    public void traverse() {
        traverseHelper(root);
//        System.out.println();
//        System.out.println();
//        System.out.println(root.value);

    }

    public void traverseHelper(TreeNode root) {
        if (root == null) {
            return;
        }
        traverseHelper(root.left);



        System.out.println(root.value);
        traverseHelper(root.right);
    }

}

class Graph {

    List<List<Integer>> graph = new ArrayList<>();

    public Graph(int n) {
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }


    }

    public void increaseEdge(int a, int c) {
        graph.get(a).add(c);
        graph.get(c).add(a);
    }
}


class Derive extends Inheritance{

    public static int c(int n, int a) {   //n >=0  a>=0 a<=n
        int[][] f = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= a && j <= i; j++) {
                if (j == 0 || i == 0) {
                    f[i][j] = 1;
                    continue;
                }
                f[i][j] = f[i - 1][j] + f[i - 1][j - 1];
            }
        }
        return f[n][a];
    }
    public static int Fabonachi(int n) {
        int[] array = new int[n + 1];
        array[0] = 0;




        array[1] = 1;

        if (n == 0 || n == 1) return array[n];
        for (int i = 2; i <= n; i++) {

            array[i] = array[i - 1] + array[i - 2];
        }






        return array[n];
    }
    public static void dfs(int[] array, ArrayList<Integer> cur, Set<Integer> visited, List<List<Integer>> res) {
        int n = array.length;
        if (cur.size() == n) {
            res.add(new ArrayList(cur));




            return;
        }







        for (int i = 0; i < n; i++) {








            if (!visited.contains(i)) {
                visited.add(i);
                cur.add(array[i]);
                dfs(array, cur, visited, res);
                visited.remove(i);
                cur.remove(cur.size() - 1);
            }
        }
    }

    public static void main(String[] args) {

        Derive der1 = new Derive();
        Derive der2 = new Derive();



        int[] array = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        dfs(array, new ArrayList<Integer>(), new HashSet<Integer>(), res);






        System.out.println(Fabonachi(7) == 13);


        System.out.println(c(3, 3) == 1);


        //        for (List<Integer> pair: res) {
//            for (Integer i: pair) {
//                System.out.print(i + ", ");
//            }
//
//
//
//
//
//            System.out.println();
//        }
//        BST tree = new BST();
//        tree.insert(3);
//        tree.insert(1);
//        tree.insert(5);
//        //tree.insert(5);
//
//
//
//
//        tree.traverse();
////        System.out.println(tree.find(tree.root));
//        Integer[] array = {1,3,7,5,2};
//        Arrays.sort(array, new Comparator<Integer>() {
//            public int compare(Integer a, Integer c) {
//                return a - c;
//            }
//        });
//
//
//        for (Integer i: array) {
//            System.out.println(i);
//        }
        Graph g = new Graph(6);
        g.increaseEdge(1,2);
        g.increaseEdge(1,3);
        g.increaseEdge(1,4);
        g.increaseEdge(1,5);
        g.increaseEdge(3,4);
        g.increaseEdge(3,6);
        g.increaseEdge(4,6);
        g.increaseEdge(2,6);
        g.increaseEdge(5,6);


        boolean[] visited = new boolean[7];
        visited[1] = true;


        List<Integer> cur = new ArrayList<>();









        cur.add(1);
        List<List<Integer>> r = new ArrayList<>();







        dfsGraph(g, 1, 3, cur, 1, visited, r);

        //visited.add(1);
        //dfsG(g, 1, visited);

        for (List<Integer> pair: r) {
            for (Integer i: pair) {
                System.out.print(i + ", ");
            }





            System.out.println();
        }

     //   System.out.println(edgeCount);
        //int[] array = {1,2,3,4,5,6,7,8,9,10};
        //        int[] array = {7,2,3,1,4};
//        selectionSort(array);
//
//
//
//
//
//        for (int i : array) {
//            System.out.println(i);
//        }
//        System.out.println(find("ab", "aaaabba"));


//        List<Integer> a = new ArrayList<>();
//
//
//
//
//
//        for (int i = 1; i < 11; i++) {
//            a.add(i);
//        }
//
//
//
//        Stack i = new Stack();
//        i.push(1);
//        i.push(3);
//
//
//
//        System.out.println(i.pop());
//
//        Set<List<Integer>> result = selectP(a, 3);
//        for (List<Integer> s : result) {
//            for (Integer i : s) {
//                System.out.print(i +",");
//            }
//
//
//
//
//
//
//        System.out.println();
//        }
//
//
//
//
//
//
//        System.out.println(result.size());
        //        List<Integer> list = new ArrayList<>();
//
//        Character i = new Character('a');
//        if (der1.equals(der2)) {
//
//            System.out.println(i.hashCode());
//        }
//
//
//        System.out.println(sigma(10) == 55);
//
//        System.out.println(sigma(0) == 0);
//        String str = new String("acount=? & balance=?");
//        for (String s : str.split("&")) {
//            System.out.println(s.trim());
//
//
//            BigDecimal a = new BigDecimal(1.375);
//            double f = a.setScale(2, RoundingMode.HALF_UP).doubleValue();
//            System.out.println(f);
//        }
//
//
//
//
//        Map<Integer, HashMap<String, Integer>> accounts = new HashMap<>();
//        accounts.put(1, new HashMap<String, Integer>());
//        accounts.get(1).put("account", 123);
//
//        accounts.get(1).put("password", 23);
//
//        System.out.println(accounts.get(1).get("account"));
    }

    public static int sigma(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sigma(n - 1);
        }
    }
    @Override
    public boolean equals(Object o) {
        System.out.println(hashCode());
        return super.hashCode() == super.hashCode();
    }
    @Override
    public int hashCode() {
        return 1;
    }
// 7, 2, 3, 1, 4
    //"abba", "aaaabba"
    public static int find(String p, String t) {
        if (p == null || p.length() == 0) {
            return 0;
        }
        if (t == null){
            return -1;
        }



        for (int i = 0; i <= t.length() - p.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (t.charAt(i + j) != p.charAt(j)) {
                    break;
                }
                if (j == p.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void selectionSort(int [] a) {
        if (a == null) {
            return;
        }

        for (int i = 0; i < a.length; i++) {


            int index = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[index]) {
                    index = j;

                }
            }
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
        return;
    }


    // choose a element from a
    public static Set<Set<Integer>> select(List<Integer> a, int n) {
        if (a == null) {
            return null;
        }
        Set<Set<Integer>> result = new HashSet<>();
        Set<Integer> cur = new HashSet<>();
        dfs(a, n, cur, result, 0);
        return result;
    }
    public void bfs(GraphNode n) {



        Queue<GraphNode> queue = new LinkedList<GraphNode>();
        queue.offer(n);

        Set<GraphNode> s = new HashSet<>();
        s.add(n);
        while (!queue.isEmpty()) {
            GraphNode cur = queue.poll();
            while (cur.next != null) {
                if (!s.contains(cur.next)) {
                    queue.offer(cur.next);
                }
                cur = cur.next;
            }
        }
    }
    static int edgeCount = 0;
    public static void dfsG(Graph g, int cur, Set<Integer> set) {


        System.out.println("visit" + cur);
        for(int neighbor: g.graph.get(cur))
            if (!set.contains(neighbor)) {
                edgeCount = edgeCount + 1;
                set.add(neighbor);
                System.out.println("visit edge from" + cur +" to " + neighbor);
                dfsG(g, neighbor, set);
            } else {
                edgeCount = edgeCount + 1;
                System.out.println("visit from" + cur + "to " + neighbor);
            }


    }

    public static void dfsGraph(Graph g, int s, int e, List<Integer> cur, int c, boolean[] visited, List<List<Integer>> res) {
        if (c == e) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int neighbor: g.graph.get(c)) {
            if (visited[neighbor] == false) {
                visited[neighbor] = true;
                cur.add(neighbor);
                dfsGraph(g, s, e, cur, neighbor, visited, res);
                cur.remove(cur.size() -1);
                visited[neighbor] = false;
            }
        }
    }
    class GraphNode {
        int label;
        GraphNode next;

    }
    public static void dfs(List<Integer> a, int n, Set<Integer> cur, Set<Set<Integer>> result, int index) {

        if (cur.size() == n) {
            result.add(new HashSet<>(cur));
            return;
        }
        for (int i = index; i < a.size(); i++) {
            cur.add(a.get(i));
            dfs(a, n, cur, result, i + 1);
            cur.remove(a.get(i));
        }
    }

    public static Set<List<Integer>> selectP(List<Integer> a, int n) {
        if (a == null) {
            return null;
        }
        Set<List<Integer>> result = new HashSet<>();
        List<Integer> cur = new ArrayList<>();
        boolean[] visited = new boolean[a.size()];
        dfsP(a, visited, n, cur, result);
        return result;
    }



    public static void dfsP(List<Integer> a, boolean[] visited, int n, List<Integer> cur, Set<List<Integer>> result ) {

        if (cur.size() == n) {
            result.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < a.size(); i++) {
            if (!visited[i]) {
                cur.add(a.get(i));
                visited[i] = true;
                dfsP(a, visited, n, cur, result);
                cur.remove(a.get(i));
                visited[i] = false;
            }
        }
    }
}

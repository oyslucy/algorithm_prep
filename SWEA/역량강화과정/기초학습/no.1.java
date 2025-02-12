import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int L = sc.nextInt();
            sc.nextLine();
            List<String> list = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));


            for(int i = 0; i < M; i++) {
                String[] cmd = sc.nextLine().split(" ");
                switch (cmd[0]) {
                    case "I":
                        insert(Integer.parseInt(cmd[1]), cmd[2], list);
                        break;

                    case "D":
                        delete(Integer.parseInt(cmd[1]), list);
                        break;

                    case "C":
                        change(Integer.parseInt(cmd[1]), cmd[2], list);
                        break;
                }
            }
            if(list.size() <= L) {
                System.out.println("#" + test_case + " -1");
            } else {
                System.out.println("#" + test_case + " " + list.get(L));
            }
        }
    }

    static void insert(int index, String value, List<String> list) {
        list.add(index, value);
    }

    static void delete(int index, List<String> list) {
            list.remove(index);
    }

    static void change(int index, String value, List<String> list) {
            list.set(index, value);
    }
}

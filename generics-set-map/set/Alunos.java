import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Alunos {

    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.println("How many students for course A?");
        int n = sc.nextInt();
        for(int i=0; i < n; i++ ){
            int number = sc.nextInt();
			a.add(number);
        }

        System.out.println("How many students for course B?");
        n = sc.nextInt();
        for(int i=0; i < n; i++ ){
            int number = sc.nextInt();
			b.add(number);
        }

        System.out.println("How many students for course C?");
        n = sc.nextInt();
        for(int i=0; i < n; i++ ){
            int number = sc.nextInt();
			c.add(number);
        }

        Set<Integer> t = new HashSet<>(a);
        t.addAll(b);
        t.addAll(c);

        System.out.println("Total: " + t.size());

        sc.close();
    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Tstudent{
    public static void main(String[] args){
        Map<Integer,String> st =new HashMap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int m=sc.nextInt();
        System.out.println("Enter the age & name of student:");
        for (int i = 1; i <= m; i++) {
            st.put(sc.nextInt(), sc.nextLine());
        }
        System.out.println("Age & Name");
        for(Map.Entry<Integer,String>n: st.entrySet()){
            System.out.println(n.getKey() + " -->" + n.getValue());
        }
    }

}
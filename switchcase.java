import java.util.*;
public class switchcase
{
    public static void main (String[] args) {
        
        int choice;
        System.out.println("pick One  : 1 hi\t2 , hey\t3 , hello\t");
        Scanner s = new Scanner(System.in);
        choice  = s.nextInt();
        switch(choice)
        {
            case 1 : System.out.println("You said hi ");
                     break;
            case 2 : System.out.println("You said hey ");
                     break;
            case 3 : System.out.println("You said hello ");
                     break;
             default : System.out.println("Invalid Choice");
            }
}
}
        
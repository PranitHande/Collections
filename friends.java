import java.util.LinkedList;
import java.util.*;

class Friends{
  public static void main(String[] args){
   Scanner s1=new Scanner(System.in);
    LinkedList<String> friends = new LinkedList<>();

  
   System.out.println("Enter a no of friends:");
   int n=s1.nextInt();
   
for (int i=0;i<n;i++)
{  
       System.out.println("Enter names:");
       String input=s1.next();
       friends.add(input);
	 
}
	System.out.println("LinkedList: " + friends);

  }
}


import java.util.*;

class City{
  public static void main(String[] args) {
    ArrayList<String> cities = new ArrayList<>();
  Scanner s1=new Scanner(System.in);
  System.out.println("Enter a number of elements :");
  int n=s1.nextInt();
for (int i=0;i<n;i++)
{  
       System.out.println("Enter an elements :");
       String input=s1.next();
    cities.add(input);
}

    System.out.println("ArrayList: " + cities); 
    cities.removeAll(cities);
    System.out.println("After Removing all elements");
    System.out.println("Updated ArrayList: " + cities);

  }
}

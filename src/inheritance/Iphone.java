package inheritance;

public class Iphone {
public static void main(String[] args) {
    Mobile mobile = new Mobile(); 
    int hashCode = mobile.hashCode();
System.out.println("hashcode of the mobile object :" + hashCode);
}
}
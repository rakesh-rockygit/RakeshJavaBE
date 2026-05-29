package inheritance;

public class Iphone {
public static void main(String[] args) {
    Mobile mobile = new Mobile(); 
    int hashCode = mobile.hashCode();
System.out.println("hashcode of the mobile object :" + hashCode);

   // 
    int hashCode1 = mobile.hashCode();
System.out.println("hashcode of the mobile object :" + hashCode1);

Mobile mobile1 = new Mobile(); 
System.out.println("hashcode of the mobile object :" + mobile1.hashCode());

}
}
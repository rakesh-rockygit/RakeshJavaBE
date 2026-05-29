package inheritance;

public class Iphone extends Mobile{
public static void main(String[] args) {
    Iphone mobile = new Iphone();
    System.out.println(("calling parent of iphone : " + mobile.parentModel()));
}
}
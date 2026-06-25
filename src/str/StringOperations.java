package str;

public class StringOperations {

    public static void main(String[] args) {
        
        String a = "world";
        String b = "world";
        String c = new String("world");

        System.out.println(a.hashCode());
        System.out.println(c.hashCode());

// operator compares only references

        System.out.println(a == b);
        System.out.println(a == c);

        //equals method compares references and numbers, values
        System.out.println(a.equals(c));
        System.out.println(a.equals(b));

    }
}

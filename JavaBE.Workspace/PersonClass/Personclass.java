public class Personclass {

    String name;
    int age;
    String city;

    public Personclass(String name, int age, String city) {
        this.name = name;
        this.city = city;
        this.age = age;
        System.out.printf("Hi, I'm %s, I'm %d years old and I live in %s.", name, age, city);

    }

    public void greet() {

        System.out.printf("Hi, I'm %s, I'm %d years old and I live in %s.", name, age, city);

    }

    public static void main(String[] args) {
        Personclass person1 = new Personclass("rocky", 31, "vancouver");
        Personclass person2 = new Personclass("rakesh", 27, "toronto");
        Personclass person3 = new Personclass("suresh", 35, "montreal");
        person1.greet();
        person2.greet();
        person3.greet();
    }
}

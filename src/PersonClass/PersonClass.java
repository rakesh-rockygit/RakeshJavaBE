package PersonClass;

public class PersonClass {

    String name;
    int age;
    String city;

    public PersonClass(String name, int age, String city) {
        this.name = name;
        this.city = city;
        this.age = age;
        System.out.printf("Hi, I'm %s, I'm %d years old and I live in %s." + name, age, city);

    }

    public void greet() {

        System.out.printf("Hi, I'm %s, I'm %d years old and I live in %s." + name, age, city);

    }

    public static void main(String[] args) {
        PersonClass person1 = new PersonClass("rocky", 30, "vancouver");
        PersonClass person2 = new PersonClass("rakesh", 2, "toronto");
        person1.greet();
        person2.greet();
    }
}

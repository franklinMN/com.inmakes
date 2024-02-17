// 6. Write A Program To sort ArrayList Using Comparable And Comparator Interface

class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return this.name.compareTo(otherPerson.name);
    }

    @Override
    public String toString() {
        return "Person { name : " + this.name + " ; age : " + this.age + " }";
    }

}

public class ArrayListSorting {
    public static void main(String[] args) {

    }
}

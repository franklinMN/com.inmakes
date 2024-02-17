package Module03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {return age;}
    public void setAge(int age) { this.age = age; }
    public String getName() { return name;}
    public void setName(String name) {this.name = name;}

    @Override
    public int compareTo(Student that) {
        return this.getAge() > that.getAge() ? 1 : -1; // for ascending order
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}

class NameLengthComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        
        return o1.getName().length() > o2.getName().length() ? 1 : -1;
    }

}

class NameAlphaComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        
        return o1.getName().compareTo(o2.getName());

    }

}

public class CompareArrayList {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add( new Student(12, "Amrit") );
        studentList.add( new Student(33, "Nithish") );
        studentList.add( new Student(18, "Karen") );
        studentList.add( new Student(24, "Sanjai") );

        System.out.println("\nBefore Sorting.....");
        for( Student stud : studentList ) {
            System.out.println(stud.toString());
        }

        Collections.sort(studentList);

        System.out.println("\nAfter Sorting with age.....");
        for( Student stud : studentList ) {
            System.out.println(stud.toString());
        }

        Collections.sort(studentList, new NameLengthComparator());

        System.out.println("\nAfter Sorting with Name length.....");
        for( Student stud : studentList ) {
            System.out.println(stud.toString());
        }

        Collections.sort(studentList, new NameAlphaComparator());

        System.out.println("\nAfter Sorting with Name Alphabatically.....");
        for( Student stud : studentList ) {
            System.out.println(stud.toString());
        }
    }
}

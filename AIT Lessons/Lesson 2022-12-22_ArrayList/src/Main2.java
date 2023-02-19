import java.util.ArrayList;

public class Main2 {
    public static void main (String[] args){
        Student student1 = new Student("Jack");
        Student student2 = new Student("Ivan");

        System.out.println(student1);
        student1.addSubjects("Java");
        student1.addSubjects("QA");
        System.out.println(student1);

        System.out.println(student2);
        student2.addSubjects("QA");
        student2.addSubjects("C++");
        student2.addSubjects("Java");
        System.out.println(student2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        System.out.println();
        for (Student stud: students){
            System.out.println(stud);
        }

        // поменяли студентов местами
        Student temp = students.get(1);
        students.set(1,students.get(0));
        students.set(0,temp);

        // вывели после смены
        System.out.println();
        for (Student stud: students){
            System.out.println(stud);
        }

        //сделали перечень предметов
        ArrayList<String> listOfSubjects = new ArrayList<>();
        listOfSubjects.add("Go");
        listOfSubjects.add("JavaScript");
        listOfSubjects.add("PhotoShop");

        // метод добавления сразу переченя предметов студенту
        student1.addSubjects(listOfSubjects);
        student2.addSubjects(listOfSubjects);

        System.out.println();
        for (Student stud: students){
            System.out.println(stud);
        }
    }
}

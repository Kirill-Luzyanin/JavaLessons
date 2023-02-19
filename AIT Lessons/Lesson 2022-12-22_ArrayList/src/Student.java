import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<String> subjects;

    public Student(String name) {
        this.name = name;
        subjects=new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, subjects);
    }

    public void addSubjects(String subject){
        subjects.add(subject);
    }

    public void addSubjects(ArrayList<String> subject){
        //for (String str: subject){
        //    addSubjects(str);
        //}
        // можно заменить на:
        this.subjects.addAll(subject);
    }

}

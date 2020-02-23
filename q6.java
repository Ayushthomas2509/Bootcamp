
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    String Name;
    Double Score;
    Double Age;

    Student(String Name,Double Score,Double Age){
        this.Name=Name;
        this.Score=Score;
        this.Age=Age;
    }
}
class Compare implements Comparator<Student> {

    @Override
    public int compare(Student student1,Student student2) {
        if(student1.Score>student2.Score){
            return 1;
        }
        if(student1.Score<student2.Score){
            return -1;
        }
        else {

                return student1.Name.compareTo(student2.Name);
            }
    }


    public static void main(String[] args) {
        Student s1=new Student("kartik",23.0,18.0);
        Student s2=new Student("sxxg",20.0,18.0);
        Student s3=new Student("abc",23.0,18.0);
        Student s4=new Student("xdgjgdx",25.0,18.0);
        ArrayList<Student> list=new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        Compare cmpr=new Compare();
        Collections.sort(list,cmpr);
        for (Student stdnt:list){
        System.out.println(stdnt.Name+" Score "+stdnt.Score+" Age "+stdnt.Age);
        }
    }
}

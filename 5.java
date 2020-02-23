import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


    class Employee {

        Double age;
        Double salary;
        String name;
       Employee(Double age,Double salary,String name){
           this.age=age;
           this.salary=salary;
           this.name=name;
       }
        static class Compare implements Comparator<Employee>

        {
            @Override
            public int compare (Employee employee1, Employee employee2){
            double salary1 = employee1.salary;
            double salary2 = employee2.salary;
            if (salary1 > salary2) {
                return 1;
            } else {
                return -1;
            }
        }
        }





    public static void main(String[] args) {
        List<Employee> list=new ArrayList<Employee>();

        Employee e1=new Employee(20.0,2000.0,"ab");
        Employee e2=new Employee(50.0,5000.0,"mk");
        Employee e3=new Employee(30.0,3000.0,"cz");

        list.add(e1);
        list.add(e2);
        list.add(e3);
        Compare cmpr=new Compare();
        Collections.sort(list,cmpr);
        for(Employee emp:list){
            System.out.println(emp.salary);
        }

    }
    }

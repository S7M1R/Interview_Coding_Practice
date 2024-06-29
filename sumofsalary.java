import java.util.*;

public class sumofsalary {
    public static void main(String[] args) {
        List<Emplyoe> emp = new ArrayList<>();
        emp.add(new Emplyoe("aman", 44, 38485));
        emp.add(new Emplyoe("rahul ", 28, 70000));
        emp.add(new Emplyoe("avej", 33, 40000));

        Map<String, Integer> sum = calculateSum(emp);
        System.out.println("total salary sum : " + sum.get("SalarySum"));
        System.out.println("toatl age sum : " + sum.get("ageSum"));

    }

    public static Map<String, Integer> calculateSum(List<Emplyoe> emplyoes) {
        Map<String, Integer> sum = new HashMap<>();
        int salarySum = 0;
        int ageSum = 0;
        for (Emplyoe e : emplyoes) {
            salarySum += e.getSalary();
            ageSum += e.getAge();
        }
        sum.put("SalarySum", salarySum);
        sum.put("ageSum", ageSum);

        return sum;
    }
}

class Emplyoe {
    private String name;
    private int age;
    private int salary;

    public Emplyoe(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}

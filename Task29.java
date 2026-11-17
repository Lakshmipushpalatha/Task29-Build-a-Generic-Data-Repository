import java.util.*;

class GenericRepository<T> {

    private Map<Integer, T> data = new LinkedHashMap<>();

    public void save(int id, T object) {
        data.put(id, object);
        System.out.println("Object saved successfully!");
    }

    public T findById(int id) {
        return data.get(id);
    }

    public void update(int id, T object) {
        if (data.containsKey(id)) {
            data.put(id, object);
            System.out.println("Object updated successfully!");
        } else {
            System.out.println("Object not found!");
        }
    }

    public void delete(int id) {
        if (data.containsKey(id)) {
            data.remove(id);
            System.out.println("Object deleted successfully!");
        } else {
            System.out.println("Object not found!");
        }
    }

    public void displayAll() {
        System.out.println(data);
    }
}

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Employee{Name='" + name + "', Age=" + age + "}";
    }
}

public class Task29 {
    public static void main(String[] args) {

        GenericRepository<Employee> employees =
                new GenericRepository<>();

        employees.save(1, new Employee("Rahul", 22));
        employees.save(2, new Employee("Priya", 21));

        System.out.println("\nAll Employees:");
        employees.displayAll();

        System.out.println("\nFind Employee:");
        System.out.println(employees.findById(1));

        System.out.println("\nUpdate Employee:");
        employees.update(1, new Employee("Rahul", 23));
        employees.displayAll();

        System.out.println("\nDelete Employee:");
        employees.delete(2);
        employees.displayAll();

        GenericRepository<String> students =
                new GenericRepository<>();

        students.save(101, "Lakshmi");
        students.save(102, "Anjali");

        System.out.println("\nStudent Repository:");
        students.displayAll();
    }
}

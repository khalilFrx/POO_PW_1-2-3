public class TestEmployee {

    public static void main(String[] args) {

        Employee[] emp = new Employee[5];

        emp[0] = new Employee();
        emp[0].name = "Ali";
        emp[0].salary = 5000;

        emp[1] = new Employee();
        emp[1].name = "Sara";
        emp[1].salary = 7000;

        emp[2] = new Employee();
        emp[2].name = "Karim";
        emp[2].salary = 6000;

        emp[3] = new Employee();
        emp[3].name = "Lina";
        emp[3].salary = 5500;

        emp[4] = new Employee();
        emp[4].name = "Amine";
        emp[4].salary = 6500;

        // display
        for(int i = 0; i < 5; i++){
            System.out.println(emp[i]);
        }

        // increase
        for(int i = 0; i < 5; i++){
            emp[i].increaseSalary(1000);
        }

        // display again
        for(int i = 0; i < 5; i++){
            System.out.println(emp[i]);
        }

        // total
        double sum = 0;
        for(int i = 0; i < 5; i++){
            sum = sum + emp[i].salary;
        }
        System.out.println("Total: " + sum);

        // average
        double avg = sum / 5;
        System.out.println("Average: " + avg);

        // max
        double max = emp[0].salary;
        String nameMax = emp[0].name;

        for(int i = 1; i < 5; i++){
            if(emp[i].salary > max){
                max = emp[i].salary;
                nameMax = emp[i].name;
            }
        }

        System.out.println("Highest: " + nameMax);

        // search
        Employee.searchEmployee(emp, "Sara");
    }
}

class Employee {

    String name;
    double salary;

    void increaseSalary(double amount){
        salary = salary + amount;
    }

    double getSalary(){
        return salary;
    }

    public String toString(){
        return name + " - " + salary + " DA";
    }

    static void searchEmployee(Employee[] arr, String name){

        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i].name.equals(name)){
                System.out.println(arr[i]);
                found = true;
            }
        }

        if(found == false){
            System.out.println("Employee not found");
        }
    }
}

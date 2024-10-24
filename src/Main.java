class Person {
    String name;
    String lastName;
    int age;
    String gender;

    Person(String name, String lastName, int age, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String introduce() {
        return "mam na imie" + name + " mam na nazwisko " + lastName + " mam " + age + " lat, moje przyimki to  " + gender;
    }

    public void changeAge(int newAge) {
        this.age = newAge;
    }

    public void changeGender(String newGender) {
        this.gender = newGender;
    }

    public String getName(String firstName) {
        return firstName;
    }

    public String getLastName(String lastName) {
        return lastName;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setAge(int newAge) {
        this.age = newAge;

    }

    public void setGender(String newGender) {
        this.gender = newGender;
    }
}

    class Employee extends Person {
        String position;
        String salary;
        int ID;
        boolean jobStatus;

        public Employee(String name, String lastName, int age, String gender, String position, String salary, int ID) {
            super(name, lastName, age, gender);
            this.position = position;
            this.salary = salary;
            this.ID = ID;
            this.jobStatus = false;
        }

}
    public class Main {
        public static void main(String[] args) {
            Employee e=new Employee("Jan", "Kowalski", 69, "Mężczyzna", "Dyrektor", "2137", 9453);
            System.out.println(e.introduce());


        }
    }



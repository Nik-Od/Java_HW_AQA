package HW10.Employee;
public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Developer");
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String workInformation() {
        return "Developer " + name + " writes code in " + programmingLanguage + ".";
    }
}


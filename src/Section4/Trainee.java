package Section4;

public class Trainee {
    public static final String COHORT_CODE = "CHNAJI9004";
    int employeeId;
    String name;

    public Trainee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCohortCode() {
        return COHORT_CODE;
    }

    void display(Trainee[] t) {
        for (Trainee emp : t) {
            System.out.println(emp.employeeId + " " + emp.name + " " + COHORT_CODE);

        }
    }

}

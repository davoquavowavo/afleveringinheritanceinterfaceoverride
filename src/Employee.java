public class Employee {
    String jobTitle;

    int salary;

    boolean adminItAccess;

    public Employee(String jobTitle, int salary, boolean adminItAccess){
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.adminItAccess = adminItAccess;
    }

    void work(){
        System.out.println(jobTitle + " is now working!");
    }

}

import java.util.ArrayList;

public class School {
    public static void main(String[] args) {
        //Modelling
        System.out.println("This is the school system");

        Employee niels = new Employee("Teacher", 30000, false);

        Employee bent = new Employee("Janitor", 20000, false);

        Employee ida = new Employee("Headmaster", 50000, false);

        Employee paul = new Employee("It Admin", 40000, true);

        niels.work();

        bent.work();

        ida.work();

        paul.work();


        SchoolClass english = new SchoolClass("English", "12B");

        SchoolClass math = new SchoolClass("Mathematics", "8A");

        english.startClass();

        math.startClass();

        Student albert = new Student("Albert", 18);

        Student line = new Student("Line", 19);

        Student franz = new Student("Franz", 20);

        Student sarah = new Student("Sarah", 19);

        albert.study();

        line.study();

        franz.study();

        sarah.study();


Employee[] employees = {niels, bent, ida, paul};

SchoolClass[] schoolClasses = {english, math};

Student[] englishClassStudentList = {albert, sarah};

Student[] mathClassStudentList = {line, franz};


    }
}

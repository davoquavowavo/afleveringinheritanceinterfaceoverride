public class Student {
    String name;

    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void study(){
        System.out.println(name + " is now studying!");
    }

}

class Person {
    int id;
    String name;
    int bone = 206;

    Person(){
        System.out.println("I am DEATHLORD");
    }

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println(id +" " + name);
    }
}

class Student extends Person{
    double cgpa;
    Student(int roll,String name,double cgpa){
        super(roll, name);
        this.cgpa = cgpa;
    }
    void show(){
        super.display();
        System.out.println(id + " " + name + " " + cgpa);

        System.out.println(super.bone);
    }
}

class Emp extends Person {
    float salary;

    Emp(int id, String name, float salary) {
        super(id, name);// reusing parent constructor
        this.salary = salary;
        
    }
    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
class Manager extends Emp{
    String post;
    Manager(String post,int id, String name, float salary) {
        super(id, name, salary);
        this.post=post;
    }
    void display() {
        System.out.println(id + " " + name + " " + salary+ " "+post);
    }   
}

class TestSuper {
    public static void main(String[] args) {

        Emp e1 = new Emp(2, "uttam", 45000f);
        e1.display();

        Student s =new Student(1, "Babushka", 9.8);
        s.show();

        Manager M = new Manager("Manager", 120, "Sonu Bhai", 95000);
        M.display();
    }
} 
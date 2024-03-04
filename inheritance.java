
class Parent {
    int id;
    public String name;

    Parent() {
        System.out.println("i am a Parent class constructor.");
    }

    Parent(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public void uttam(){
        System.out.println("i am trying .");
    }

    public void dispalyData() {
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
    }
}

class Child extends Parent {
    int adhar;
    public String home ;

    Child(){
        System.out.println("I am a child class.");
    }
    Child(int adhar,String home){
        super();
        this.adhar = adhar;
        this.home = home;
    }
    void showData(){
        super.uttam();
        System.out.println("Adhar: "+adhar);
        System.out.println("Home: "+home);
    }

}

public class inheritance {
    public static void main(String[] args) {
        Child babu = new Child();
        Child chua = new Child(123,"jls");
        babu.showData();
        chua.showData();

    }
}

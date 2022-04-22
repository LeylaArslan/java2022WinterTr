package day28_constructor;

public class Student2 {
    String name ;
    int age;
    String phone;
    Student2(){
    }
    Student2(String name,int age, String phone){
        this.phone =phone;
        this.name =name;
    }

    public static void main(String[] args) {
        Student2 s1 =new Student2();
        Student2 s2 =new Student2("John",25,"029-998877");
        System.out.print(s2.name + ", " + s2.age + ", " + s2.phone);
    }

}

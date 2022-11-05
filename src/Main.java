import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    MyClass myClass = new MyClass("Syimyk","Saparov",24,"Plov");

    MyClass myClass1 = new MyClass(new String[]{"Java","Soft skills","English"},"plov");
        MyClass [] massive = {myClass};
        for (MyClass array:massive) {
            array.getInfo();
        }
        MyClass [] massive1 ={myClass1};
        for (MyClass array1:massive1) {
            array1.getInfo1();
        }

    }

}
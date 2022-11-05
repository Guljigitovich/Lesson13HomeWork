import java.util.Arrays;

public class MyClass {
    private String name;
    private String surname;
    private int age;
    private String [] peaksoftLesson;
    private String food;


    public MyClass (String name,String surname,int age,String food){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.food=food;


    }public MyClass (String [] peaksoftLesson,String food){

        this.peaksoftLesson=peaksoftLesson;
        this.food=food;

    }public void setName (String name){
        this.name=name;
    }public String getName (){
            return name;
    }public void setSurname (String surname) {
        this.surname = surname;
    }public String getSurname (){
            return surname;

    }public void setAge (int age){
        this.age=age;
    } public int getAge (){
        return age;
    }
    public void setPeaksoftLesson (String [] peaksoftLesson){
        this.peaksoftLesson=peaksoftLesson;

    }public String [] getPeaksoftLesson (){
        return peaksoftLesson;
    }
    public  void setFood (String food){
        this.food=food;
    }public String getFood (){
        return food;

    }public void getInfo(){
        System.out.printf("""
                Name: %s
                Surname: %s
                Age : %s
            
                """,getName(),getSurname(),getAge());
    }public void getInfo1(){
        System.out.printf("""
                Lesson : %s
                Food : %s
                """, Arrays.toString(getPeaksoftLesson()),getFood());
    }

}

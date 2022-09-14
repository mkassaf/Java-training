public class Main {
    public static void main(String[] args) {
        int x =10;
        int y = 10;



        Student student1 = new Student(22,"Ahmad");
        Student student2 = new Student(22,"Loai");

        Course course = new Course();


        System.out.println(student1.getName() + " " + student1.getAge());
        System.out.println(student2.getName() + " " + student2.getAge());

        if(student1.equals(student2)){
            System.out.println("They are same ");
        } else {
            System.out.println("The are not !");
        }


    }
}
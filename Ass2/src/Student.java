
public class Student {

    public Student(){
        this.name = "";
        this.age = 0;
    }
    public Student(int age, String name){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    private String name;



    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if (obj instanceof  Course){
            System.out.println("This is course object.");
        }
        if (!(obj instanceof  Student)){
            return false;
        }
        Student tmp = (Student)obj;//type casting

        if(tmp.getAge() != this.age){
            return false;
        }
        if (!this.name.equals(tmp.getName())){
            return false;
        }

        return true;
    }


}

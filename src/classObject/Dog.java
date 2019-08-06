package classObject;

public class Dog {

    // Instance Variables
    private String breed;
    private String name;
    private Integer age;
    private String color;



    // Constructor Declaration of Class

    public Dog(String breed, String name, Integer age, String color) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.color = color;
    }


    // method 1
    public String getName(){
        return name;
    }

    public void setName(String aName){
        name = aName;
    }


    // method 2
    public Integer getAge(){
        return age;
    }

    public void setAge(Integer aAge){
        age = aAge;
    }

    // method 3

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // method 4
//    @Override
//    public String toString()
//    {
//        return getName();
//    }

//
//    public static void main(String[] args) {
//        Dog tuffy = new Dog("papillion", "tuff", 2, "white");
//        System.out.println ( tuffy.toString () );
//    }





    /*Hi my name is tuffy.
    My breed,age and color are papillon,5,white*/

}
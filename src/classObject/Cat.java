package classObject;

public class Cat {

    private String name;
    private Integer age;
    private String breed;
    private Integer weight;


    public Cat(String aName, Integer age, String aBreed, Integer aWeight){
        name = aName;
        this.age = age;
        breed = aBreed;
        weight = aWeight;
    }

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

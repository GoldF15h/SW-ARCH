// DO NOT MODIFY ANYTHING BELOW THIS LINE!!
public class Person {
    private String name;
    private Integer age;
    private Integer height;
    private Integer weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String showDetail(){
        return  "==============================\nNAME : " + this.name.toString() + "\nAGE : " + this.age.toString() + "\nHEIGHT : " + this.height.toString()  + "\nWEIGHT : " + this.weight.toString();
//        return "TEST" ;
    }
}

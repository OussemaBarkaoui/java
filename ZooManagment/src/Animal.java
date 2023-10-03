public class Animal {
    private String family,name;
    private Boolean isMammal;
    private int age;
    public Animal(String name,String family,int age,Boolean isMammal)

    {
        this.name = "simba";
        this.age = 5;
        this.family = "cats";
        this.isMammal = false;
    }
    public String tostring()
    {
        return "Animal Name: " + this.name + "\nanimal family: " + this.family + "\nanimal age: " + this.age+ "\nmammal: " + this.isMammal;
    }
}

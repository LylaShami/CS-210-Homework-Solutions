public class Lizard extends Pet{
    private double age;

    public double getAge() {
        return this.age;
    }

    public void setAge(double userAge) {
        this.age = userAge;
    }

    public String speak() {
        return "I'm a lizard, this is my age: " + this.age;
    }
}

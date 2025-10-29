package lesson06.animals;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("Кошка ест");
    }
    private String name;
    public Cat(String name) { this.name = name; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public void voice() {
        System.out.println(getName() + " мяукает ");
    }
}

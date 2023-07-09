package JavaKodnest;

public class Dog {
    String name;
    String breed;

    void bark() {
        System.out.println("bow bow!");
    }

}
class DogApp{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "scooby";
        d1.breed = "PUG";
        System.out.println("dtails of dog d1:");
        System.out.println("Name is:"+d1.name);
        System.out.println("Breed is:"+d1.breed);
         d1.bark();
        Dog d2 = new Dog();
        d2.name = "pluto";
        d2.breed = "pitbull";
        System.out.println("dtails of dog d2:");
        System.out.println("Name is:"+d2.name);
        System.out.println("Breed is:"+d2.breed);
        d2.bark();
    }
}

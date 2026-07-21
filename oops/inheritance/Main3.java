class Animal{
    void eat(){
        System.out.println("Animal is Eating");
    }
    void sleep(){
        System.out.println("Animal is Sleeping");
    }
}
class Bird extends Animal{
    @Override
    void eat(){
        System.out.println("Bird is peacking at seeds");
    }
    @Override
    void sleep(){
        System.out.println("Bird is sleeping in nest");
    }
    void fly(){
        System.out.println("Bird can fly in sky");
    }
}
public class Main3{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();

    }
}
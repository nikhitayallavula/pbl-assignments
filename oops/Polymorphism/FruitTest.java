class Fruit{
    String name;
    String taste;
    String size;
    Fruit(String name,String taste,String size){
        this.name=name;
        this.taste=taste;
        this.size=size;
    }
    void eat(){
        System.out.println("Eating "+name+" which tastes "+ taste+".");
    }
}
class Apple extends Fruit{
    Apple(String size){
        super("Apple","sweet",size);
    }
    @Override
    void eat(){
        System.out.println("Biting into a crunchy " + size + " Apple. It tastes " + taste + "!");
    }
}
class Orange extends Fruit {
    public Orange(String size) {
        super("Orange", "tangy and sweet", size);
    }

    @Override
    public void eat() {
        System.out.println("Peeling a juicy " + size + " Orange. It tastes " + taste + "!");
    }
}
public class FruitTest {
    public static void main(String[] args) {
        Fruit generalFruit = new Fruit("Generic Fruit", "unknown", "medium");
        Apple myApple = new Apple("large");
        Orange myOrange = new Orange("small");

        System.out.println("--- Testing eat() methods ---");
        generalFruit.eat();
        myApple.eat();
        myOrange.eat();
    }
}
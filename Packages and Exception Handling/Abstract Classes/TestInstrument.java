import java.util.Random;
abstract class Instrument{
    abstract void play();
}
class Piano extends Instrument{
    @Override
    void play(){
        System.out.println("Piano is Playing tan tan tan tan");
    }
}
class Flute extends Instrument{
    @Override
    void play(){
        System.out.println("Flute is Playing toot toot toot toot");
    }
}
class Guitar extends Instrument{
    @Override
    void play(){
        System.out.println("Guitar is Playing tin tin tin");
    }
}


public class TestInstrument {

    public static void main(String[] args) {

        Instrument[] instruments = new Instrument[10];

        Random random = new Random();

        // Store random instruments
        for (int i = 0; i < instruments.length; i++) {

            int n = random.nextInt(3) + 1;

            switch (n) {

                case 1:
                    instruments[i] = new Piano();
                    break;

                case 2:
                    instruments[i] = new Flute();
                    break;

                case 3:
                    instruments[i] = new Guitar();
                    break;
            }
        }

        // Print object type and call play()
        for (int i = 0; i < instruments.length; i++) {

            System.out.print("Index " + i + " : ");

            if (instruments[i] instanceof Piano)
                System.out.print("Piano -> ");

            else if (instruments[i] instanceof Flute)
                System.out.print("Flute -> ");

            else if (instruments[i] instanceof Guitar)
                System.out.print("Guitar -> ");

            instruments[i].play();
        }
    }
}
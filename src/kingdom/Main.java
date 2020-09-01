package kingdom;

public class Main {
    public static void main(String[] args){
        System.out.println("yooooo!");

        Mammals panda = new Mammals ("Panda", 1869);
        System.out.println(panda);
        Mammals zebra = new Mammals ("Zebra", 1778);
        System.out.println(zebra);
        Mammals koala = new Mammals ("Koala", 1816);
        System.out.println(koala);
        Mammals sloth = new Mammals ("Sloth", 1804);
        System.out.println(sloth);
        Mammals armadillo = new Mammals ("Armadillo", 1758);
        System.out.println(armadillo);
        Mammals raccoon = new Mammals ("Raccoon", 1758);
        System.out.println(raccoon);
        Mammals bigfoot = new Mammals ("Bigfoot", 2021);
        System.out.println(bigfoot);

        Birds pigeon = new Birds("Pigeon", 1837);
        System.out.println(pigeon);
        Birds peacock = new Birds("Peacock", 1821);
        System.out.println(peacock);
        Birds toucan = new Birds("Toucan", 1758);
        System.out.println(toucan);
        Birds parrot = new Birds("Parrot", 1824);
        System.out.println(parrot);
        Birds swan = new Birds("Swan", 1758);
        System.out.println(swan);

        Fish salmon = new Fish("Salmon", 1758);
        System.out.println(salmon);
        Fish catfish = new Fish("Catfish", 1817);
        System.out.println(catfish);
        Fish perch = new Fish("Perch", 1758);
        System.out.println(perch);


    }
}



// javac kingdom/*.java
// jar cvfe kingdom.jar kingdom.Main kingdom/*.class
// java -jar kingdom.jar
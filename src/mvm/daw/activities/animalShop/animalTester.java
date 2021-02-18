package mvm.daw.activities.animalShop;
import java.util.Scanner;

public class animalTester {

    //variables globales
    public static Scanner sc = new Scanner(System.in);
    public static String name = "", breed="", colour="";
    public static double weight=0.0;
    //public static String country = "German";

    public static void main(String[] args) {

        int operation;

        do {
            System.out.println("Que animal quieres introducir:\n" +
                    "1. perro\n" +
                    "2. gato\n" +
                    "3. pez");
            operation = sc.nextInt();
        }while (operation<1 || operation>3);

        switch (operation){
            case 1: getDogDetails();
            break;
            case 2: getCatDetails();
            break;
            case 3: getFishDetails();
            break;
        }
    }

    public static void getDogDetails(){
        /*
         * @version 1.0 08 Feb 2021
         * @author Lovedeep Singh
         */

        String barkNoise="";

        /*Dog dog1 = new Dog(name, breed, colour, weight);

        System.out.println("Introduce nombre: ");
        dog1.setName(sc.next());
        System.out.println("Introduce raza: ");
        dog1.setBreed(sc.next());
        System.out.println("Introduce su color: ");
        dog1.setColour(sc.next());
        System.out.println("Introduce peso: ");
        dog1.setWeight(sc.nextDouble());*/


        Dog dog2 = new Dog(name, breed, colour, weight, barkNoise);

        System.out.println("Introduce nombre: ");
        //name = sc.next();
        dog2.setName(sc.next()); //dog2.setName(name)
        System.out.println("Introduce raza: ");
        dog2.setBreed(sc.next());
        System.out.println("Introduce su color: ");
        dog2.setColour(sc.next());
        System.out.println("Introduce ruido de ladridos: ");
        dog2.setBarkNoise(sc.next());
        System.out.println("Introduce peso: ");
        dog2.setWeight(sc.nextDouble());

        //dog1.printValues();
        dog2.printValues();
        dog2.eat();
        dog2.goesToSleep();
        dog2.makesSound();
        System.out.println(dog2.country(dog2));

        /*if (dog1.getWeight()>dog2.getWeight()){
            System.out.println("El "+dog1.getName()+" pesa más.");
        }
        else if (dog1.getWeight()<dog2.getWeight()){
            System.out.println("El "+dog2.getName()+" pesa más.");
        }
        else{
            System.out.println("Los pesan igual");
        }*/
    }

    public static void getCatDetails(){

        int mush=0;

        Cat cat1 = new Cat(name, breed, colour, weight, mush);

        System.out.println("Introude nombre: ");
        cat1.setName(sc.next());
        System.out.println("Introduce su raza: ");
        cat1.setBreed(sc.next());
        System.out.println("Introduce su color: ");
        cat1.setColour(sc.next());
        System.out.println("Introduce peso:");
        cat1.setWeight(sc.nextDouble());
        System.out.println("Introduce numero de bigotes: ");
        cat1.setMustaches(sc.nextInt());

        cat1.knowWeight(cat1, 5.6);
        //System.out.println("peso: "+cat1.weight);

        //cat1.printValues();
    }

    public static void getFishDetails(){

        String waterType="";

        Fish fish1 = new Fish(name, breed, colour, weight, waterType);

        System.out.println("Introude nombre: ");
        fish1.setName(sc.next());
        System.out.println("Introduce su raza: ");
        fish1.setBreed(sc.next());
        System.out.println("Introduce su color: ");
        fish1.setColour(sc.next());
        System.out.println("Introduce peso:");
        fish1.setWeight(sc.nextDouble());
        System.out.println("Introduce tipo de agua: ");
        fish1.setWaterType(sc.next());

        fish1.printValues();
    }

}

package mvm.daw.activities.animalShop;

public class Dog extends Animal implements Animable{

    private String barkNoise = "Woof";
    private String country = "German";


    //constructores
    /*public Dog(String name, String breed, String colour, double weight) {
        super(name, breed, colour,weight);
    }// constructor 1 con atributos de super*/

    public Dog(String name, String breed, String colour,double weight, String barkNoise){
        super(name, breed, colour, weight);
        this.barkNoise = barkNoise;

    }// constructor 2 con todos los atributos


    //getters, setters
    public String getBarkNoise(){
        return barkNoise;
    }
    public void setBarkNoise(String barkNoise) {
        this.barkNoise = barkNoise;
    }


    public void printValues(){
        System.out.println("Nombre: "+name+ " raza: "+breed+" ruido: "+barkNoise+" peso: "+weight+"kg.");
    }

    public void eat(){
        System.out.println("I'am done");
    }

    @Override
    public void makesSound() {
        System.out.println("The dog says: bow wow");
    }

    @Override
    public void goesToSleep() {
        System.out.println("I'm in bed");
    }

    @Override
    public String country(Dog d) {
        return d.country;
    }
}

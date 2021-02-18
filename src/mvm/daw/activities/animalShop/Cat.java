package mvm.daw.activities.animalShop;

public class Cat extends Animal{

    private int mustaches;

    public Cat(String name, String breed, String colour, double weight, int mustaches){
        super(name, breed, colour, weight);
        this.mustaches = mustaches;
    }

    //getters, setters
    public int getMustaches() {
        return mustaches;
    }
    public void setMustaches(int mustaches) {
        this.mustaches = mustaches;
    }

    public void printValues(){
        System.out.println("Nombre: "+name+ " raza: "+breed+" colour: "+colour+" Bigotes: "+mustaches+" peso: "+weight+"kg.");
    }

    public void eat(){
        System.out.println("I'am done");
    }
}


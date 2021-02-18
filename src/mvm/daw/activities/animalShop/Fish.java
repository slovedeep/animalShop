package mvm.daw.activities.animalShop;

public class Fish extends Animal {

    private String waterType;

    public Fish(String name, String breed, String colour, double weight, String waterType){
        super(name, breed, colour, weight);
        this.waterType = waterType;
    }

    public String getWaterType() {
        return waterType;
    }
    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public void printValues(){
        System.out.println("Nombre: "+name+ " raza: "+breed+" colour: "+colour+" Tipo agua: "+waterType+" peso: "+weight+"kg.");
    }

    public void eat(){
        System.out.println("I'am done");
    }
}

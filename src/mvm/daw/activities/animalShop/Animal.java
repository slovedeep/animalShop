package mvm.daw.activities.animalShop;

abstract class Animal {
    String name;
    String breed;
    String colour;
    double weight;
    String eat;

    public Animal(String name, String breed, String colour, double weight){
        this.name= name;
        this.breed = breed;
        this.weight = weight;
        this.colour= colour;
    }

    //getters, setters
    public String getName() {
        return name;
    }//end method getName
    public void setName(String n) {
        name = n;
    }//end method setName

    public String getBreed(){
        return breed;
    }
    public void setBreed(String br) {
        breed = br;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getColour(){return colour;}
    public void setColour(String colour){this.colour = colour;}

    public void knowWeight(Cat cat, double w){
        cat.weight = w;
        //System.out.println("peso: "+weight);
    }

    abstract void eat();

}

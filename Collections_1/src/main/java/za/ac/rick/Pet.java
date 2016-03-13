package za.ac.rick;

/**
 * Created by Rick on 12-Mar-16.
 */


public abstract class Pet implements PetInterface{

    private String petName;
    private String petGender;

    public Pet(String petName, String petGender)
    {
        this.petName = petName;
        this.petGender = petGender;
    }

    public void setName(String petName)
    {
        this.petName = petName;
    }

    public String getName()
    {
        return petName;
    }

    public String toString(){
        return String.format("\nname: %s \ngender: %s", petName, petGender);
    }


}



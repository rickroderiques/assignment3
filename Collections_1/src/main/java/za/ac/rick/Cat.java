package za.ac.rick;

/**
 * Created by Rick on 12-Mar-16.
 */
public class Cat extends Pet{
    public Cat(String petName, String petGender) {

        super(petName, petGender);
    }

    public String speak(){
        return "meoww";
    }
}

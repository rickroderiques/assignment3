package za.ac.rick;

/**
 * Created by Rick on 12-Mar-16.
 */
public class Dog extends Pet{

    public Dog(String petName, String petGender) {
        super(petName, petGender);
    }

    public String speak(){
        return "woof woof";
    }
}

package za.ac.rick;

/**
 * Created by Rick on 12-Mar-16.
 */


import java.util.*;

public class RunPet {

    public static void main(String[] args) {
        List<PetInterface> petList = new ArrayList();
        Set <PetInterface> hashSet = new HashSet();
        Map <String ,PetInterface> hashMap = new HashMap();


        Dog dog = new Dog("Rufus", "male");
        Dog dog2 = new Dog("Levi", "male");
        Cat cat = new Cat("Spookels", "female");

        petList.add(dog);
        petList.add(dog2);
        petList.add(cat);

        hashSet.add(dog);
        hashSet.add(dog2); //by making both names the same assertNotSame

        hashMap.put("key1", dog);
        hashMap.put("key2", cat);

        for(int i=0;i<petList.size();i++){
            System.out.println(petList.get(i) + "\nanimal sound: " +petList.get(i).speak());
        }

        System.out.println(hashSet);

        System.out.println(hashMap);
    }

}

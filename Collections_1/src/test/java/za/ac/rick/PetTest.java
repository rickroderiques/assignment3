package za.ac.rick;

/**
 * Created by Rick on 12-Mar-16.
 */

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;


public class PetTest {


    List<PetInterface> petList = new ArrayList();
    Set<PetInterface> hashSet = new HashSet();
    Map<String ,PetInterface> hashMap = new HashMap();


    Dog dog1 = new Dog("Levi", "male");
    Dog dog2 = new Dog("snowy", "male");
    Dog dog3;
    Cat cat = new Cat("Spookels", "female");


    @Test
    public void testListObjectsNotSame() throws Exception {

        petList.add(0, dog1);
        petList.add(1, cat);

        assertNotSame( petList.get(0).speak(), petList.get(1).speak());

    }

    @Test
    public void testHashSetObjectsNotNull() throws Exception {
        hashSet.add(dog2);
        hashSet.add(dog1);

        //check if there is values in the list
        assertNotNull(hashSet);
    }

    @Test
    public void testHashMapObjectNull() throws Exception {

        hashMap.put("pet1", dog1);
        assertNull(hashMap.get("pet2")); // checks if the key exist

    }
}

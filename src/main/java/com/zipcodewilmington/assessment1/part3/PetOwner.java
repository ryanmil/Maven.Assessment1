package com.zipcodewilmington.assessment1.part3;

import com.zipcodewilmington.assessment1.part1.IntegerArrayUtils;
import com.zipcodewilmington.assessment1.part2.ArrayUtils;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String name = "";
    Pet[] pets = null;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
        if(pets != null) {
            for (Pet p : pets) {
                p.setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if(pets != null) {
            Pet[] resized = new Pet[pets.length + 1];
            for (int i = 0; i < pets.length; i++) {
                resized[i] = pets[i];
            }
            resized[pets.length] = pet;
            pets = resized;
        } else {
            pets = new Pet[1];
            pets[0] = pet;
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].equals(pet)) {
                pets[i] = null;
            }
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for (Pet p : pets) {
            if (p.equals(pet)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngest = pets[0].getAge();
        for (Pet p : pets) {
            if (p.getAge() < youngest) {
                youngest = p.getAge();
            }
        }
        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldest = pets[0].getAge();
        for (Pet p : pets) {
            if (p.getAge() > oldest) {
                oldest = p.getAge();
            }
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer[] ages = new Integer[pets.length];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = pets[i].getAge();

        }
        return IntegerArrayUtils.getAverage(ages).floatValue();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}

package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if(objectArray[i].equals(objectToCount)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Integer removedCount = getNumberOfOccurrences(objectArray, objectToRemove);
        Object[] resized = new Object[objectArray.length - removedCount];

        for (int i = 0, j = 0; i < objectArray.length; i++) {
            if(!objectArray[i].equals(objectToRemove)){
                resized[j] = objectArray[i];
                j++;
            }
        }

        return resized;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Integer indexOfCommon = 0;
        for (int i = 1; i < objectArray.length; i++) {
            if(getNumberOfOccurrences(objectArray, objectArray[indexOfCommon]) < getNumberOfOccurrences(objectArray, objectArray[i])) {
                indexOfCommon = i;
            }
        }
        return objectArray[indexOfCommon];
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Integer indexOfCommon = 0;
        for (int i = 1; i < objectArray.length; i++) {
            if(getNumberOfOccurrences(objectArray, objectArray[indexOfCommon]) > getNumberOfOccurrences(objectArray, objectArray[i])) {
                indexOfCommon = i;
            }
        }
        return objectArray[indexOfCommon];
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Object[] merged = new Object[objectArray.length + objectArrayToAdd.length];

        for (int i = 0; i < objectArray.length; i++) {
            merged[i] = objectArray[i];
        }
        for (int i = 0; i < objectArrayToAdd.length; i++) {
            merged[objectArray.length + i] = objectArrayToAdd[i];
        }
        return merged;
    }
}

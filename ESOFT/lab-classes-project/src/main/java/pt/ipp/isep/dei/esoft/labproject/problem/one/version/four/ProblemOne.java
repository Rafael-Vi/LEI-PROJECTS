package pt.ipp.isep.dei.esoft.labproject.problem.one.version.four;

public class ProblemOne {

    /**
     * Sort an array of integers in ascending order. Implementation (2/2)
     *
     * @param array array of integers
     * @return sorted array of integers
     */
    public static int[] sortArrayAscending(int[] array) {
        if (array != null) {
            //Sort the array in ascending order using two for loops
            parseTheArrayAsManyTimesAsSize(array);
        }
        return array;
    }

    private static void parseTheArrayAsManyTimesAsSize(int[] array) {
        int arraySize = array.length;
        for (int i = 0; i < arraySize; i++) {
            moveHigherElementToTheLastIndexablePositionOfTheArray(array, arraySize - i - 1);
        }
    }

    private static void moveHigherElementToTheLastIndexablePositionOfTheArray(int[] array, int lastIndexablePosition) {
        for (int i = 0; i < lastIndexablePosition; i++) {
            if (firstIsHigherThanSecond(array[i], array[i + 1])) {
                swapArrayElements(array, i, i + 1);
            }
        }
        
        //throw new UnsupportedOperationException(); //it means that the method is not implemented yet
        //TODO: Students should implement this method
    }

    private static boolean firstIsHigherThanSecond(int first, int second) {
        return first > second;
    }

    private static void swapArrayElements(int[] array, int indexOne, int indexTwo) {
        int temp;
        temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}
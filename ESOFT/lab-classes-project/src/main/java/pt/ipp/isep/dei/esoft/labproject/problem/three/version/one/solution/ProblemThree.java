package pt.ipp.isep.dei.esoft.labproject.problem.three.version.one.solution;

public class ProblemThree {

    // "Tell" approach - preferable over getter approach (below)
    public static boolean sortStudentsByAscendingNumber(Student[] students) {
        if (students == null) {
            return false;
        }

        int arraySize = students.length;
        //Sort the students in ascending order using two for loops
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize - i - 1; j++) {
                if (students[j].compareToByNumber(students[j+1])>0) {
                    //swap elements if not in order - in students
                    swapStudentArrayElements(students, j, j + 1);
                }
            }
        }
        return true;
    }

    // Getter approach
//    public static boolean sortStudentsByAscendingNumber(Student[] students) {
//        if (students == null) {
//            return false;
//        }
//
//        int arraySize = students.length;
//        //Sort the students in ascending order using two for loops
//        for (int i = 0; i < arraySize; i++) {
//            for (int j = 0; j < arraySize - i - 1; j++) {
//                if (students[j].getNumber() > students[j + 1].getNumber()) {
//                    //swap elements if not in order - in students
//                    swapStudentArrayElements(students, j, j + 1);
//                }
//            }
//        }
//        return true;
//    }

    private static void swapStudentArrayElements(Student[] array, int indexOne, int indexTwo) {
        Student temp;
        temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    // "Tell" approach - preferable over getter approach (below)
    public static boolean sortStudentsByDescendingGrade(Student[] students) {
        if (students == null) {
            return false;
        }

        int arraySize = students.length;
        //Sort the students in ascending order using two for loops
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize - i - 1; j++) {
                if (students[j].compareToByGrade(students[j + 1]) < 0) {
                    //swap elements if not in order - in students
                    swapStudentArrayElements(students, j, j + 1);
                }
            }
        }
        return true;
    }

    // Getter approach
//    public static boolean sortStudentsByDescendingGrade(Student[] students) {
//        if (students == null) {
//            return false;
//        }
//
//        int arraySize = students.length;
//        //Sort the students in ascending order using two for loops
//        for (int i = 0; i < arraySize; i++) {
//            for (int j = 0; j < arraySize - i - 1; j++) {
//                if (students[j].getGrade(students[j]) < students[j].getGrade(students[j + 1])) {
//                    //swap elements if not in order - in students
//                    swapStudentArrayElements(students, j, j + 1);
//                }
//            }
//        }
//        return true;
//    }
}
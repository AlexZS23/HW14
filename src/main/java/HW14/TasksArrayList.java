package HW14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TasksArrayList {

    public static void main(String[] args) {

        TasksArrayList tasksArrayList = new TasksArrayList();
        tasksArrayList.arrayListTask1();
        tasksArrayList.arrayListTask2();
        tasksArrayList.arrayListTask3();
        tasksArrayList.arrayListTask4();
        tasksArrayList.arrayListTask5();
        tasksArrayList.arrayListTask6();
        tasksArrayList.arrayListTask7();
        tasksArrayList.arrayListTask8();
        tasksArrayList.arrayListTask9();
        tasksArrayList.arrayListTask10();
        tasksArrayList.arrayListTask11();
        tasksArrayList.arrayListTask12();
        tasksArrayList.arrayListTask13();
        tasksArrayList.arrayListTask14();
        tasksArrayList.arrayListTask15();
        tasksArrayList.arrayListTask16();
        tasksArrayList.arrayListTask17();
        tasksArrayList.arrayListTask18();
        tasksArrayList.arrayListTask19();
        tasksArrayList.arrayListTask20();
        tasksArrayList.arrayListTask21();
        tasksArrayList.arrayListTask22();


    }

    public void arrayListTask1() {
//        1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
        List<String> firstTask = new ArrayList<>();
        firstTask.add("Blue");
        firstTask.add("Green");
        firstTask.add("Yellow");

        System.out.println("First task: " + firstTask);
    }

    public void arrayListTask2() {
//        2. Write a Java program to iterate through all elements in an array list.
        List<String> colourArray = new ArrayList<>();
        colourArray.add("Blue");
        colourArray.add("Green");
        colourArray.add("Yellow");

        System.out.println("Second task:");

        for (String iterate : colourArray) {
            System.out.println(iterate);
        }
    }

    public void arrayListTask3() {
//        3. Write a Java program to insert an element into the array list at the first position.
        List<String> colourArray = new ArrayList<>();
        colourArray.add("Blue");
        colourArray.add("Green");
        colourArray.add("Yellow");

        colourArray.add(0, "Black");
        System.out.println("Third task: " + colourArray);
    }

    public void arrayListTask4() {
//        4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        List<String> colourArray = new ArrayList<>();
        colourArray.add("Blue");
        colourArray.add("Green");
        colourArray.add("Yellow");

        System.out.println("Fourth task: " + colourArray.get(2));
    }

    public void arrayListTask5() {
        //5. Write a Java program to update specific array element by given element.
        List<String> colourArray = new ArrayList<>();
        colourArray.add("Blue");
        colourArray.add("Green");
        colourArray.add("Yellow");

        colourArray.set(0, "Violet");
        System.out.println("Fifth task: " + colourArray);
    }

    public void arrayListTask6() {
        //6. Write a Java program to remove the third element from an array list.
        List<String> colourArray = new ArrayList<>();
        colourArray.add("Blue");
        colourArray.add("Green");
        colourArray.add("Yellow");
        colourArray.add("White");
        colourArray.add("Purple");

        colourArray.remove(3);
        System.out.println("Sixth task: " + colourArray);
    }

    public void arrayListTask7() {
        //7. Write a Java program to search an element in an array list.
        List<String> colourArray = new ArrayList<>();
        colourArray.add("Blue");
        colourArray.add("Green");
        colourArray.add("Yellow");

        boolean isElement = colourArray.contains("Green");
        System.out.println("Seventh task: Does an array " + colourArray + " contain element 'Green'? Answer: " + isElement);
    }

    public void arrayListTask8() {
        //8. Write a Java program to sort a given array list.
        List<String> colourArray = new ArrayList<>();
        colourArray.add("Yellow");
        colourArray.add("Green");
        colourArray.add("Grey");
        colourArray.add("Blue");

        Collections.sort(colourArray);
        System.out.println("Eights task: " + colourArray);
    }

    public void arrayListTask9() {
        //9. Write a Java program to copy one array list into another.
        List<String> colourArray = new ArrayList<>();
        colourArray.add("Yellow");
        colourArray.add("Green");

        List<String> figureArray = new ArrayList<>();
        figureArray.add("Square");
        figureArray.add("Triangle");

        Collections.copy(colourArray, figureArray);

        System.out.println("Ninth task: Copied array " + colourArray);
    }

    public void arrayListTask10() {
        //10. Write a Java program to shuffle elements in a array list.
        List<String> colourArray = new ArrayList<>();
        colourArray.add("Yellow");
        colourArray.add("Green");
        colourArray.add("Grey");
        colourArray.add("Blue");

        Collections.shuffle(colourArray);
        System.out.println("Tenth task: Shuffled array " + colourArray);
    }

    public void arrayListTask11() {
        //11. Write a Java program to reverse elements in a array list.
        List<String> colourArray = new ArrayList<>();
        colourArray.add("Yellow");
        colourArray.add("Green");
        colourArray.add("Grey");
        colourArray.add("Blue");
        System.out.println("Eleventh task: Standard array " + colourArray);
        Collections.reverse(colourArray);
        System.out.println("And Reversed array " + colourArray);
    }

    public void arrayListTask12() {
        //12. Write a Java program to extract a portion of an array list.
        List<String> colourArray = new ArrayList<>();
        colourArray.add("Yellow");
        colourArray.add("Green");
        colourArray.add("Grey");
        colourArray.add("Blue");

        List<String> portionArray = colourArray.subList(1, 3);
        System.out.println("Twelfth task: " + portionArray);
    }

    public void arrayListTask13() {
        //13. Write a Java program to compare two array lists.
        List<String> firstColourArray = new ArrayList<>();
        firstColourArray.add("Yellow");
        firstColourArray.add("Green");
        firstColourArray.add("Grey");
        firstColourArray.add("Blue");
        firstColourArray.add("Violet");

        List<String> secondColourArray = new ArrayList<>();
        secondColourArray.add("Yellow");
        secondColourArray.add("Orange");
        secondColourArray.add("Violet");
        secondColourArray.add("Grey");
        secondColourArray.add("Blue");

        List<String> compareColourArray = new ArrayList<>();

        for (String compare : firstColourArray) {
            if (secondColourArray.contains(compare)) {
                compareColourArray.add(compare);
            } else {
                compareColourArray.add("No matched element");
            }
        }
        System.out.println("Thirteenth task: " + compareColourArray);
    }

    public void arrayListTask14() {
        //14. Write a Java program of swap two elements in an array list.
        List<String> colourArray = new ArrayList<>();
        colourArray.add("Yellow");
        colourArray.add("Green");
        colourArray.add("Grey");
        colourArray.add("Blue");
        colourArray.add("Violet");

        System.out.println("Fourteenth task: Array " + colourArray);
        Collections.swap(colourArray, 0, 4);
        System.out.println("And swapped array 0<->4 " + colourArray);
    }

    public void arrayListTask15() {
        //Write a Java program to join two array lists.
        List<String> firstColourArray = new ArrayList<>();
        firstColourArray.add("Yellow");
        firstColourArray.add("Green");
        firstColourArray.add("Grey");

        List<String> secondColourArray = new ArrayList<>();
        secondColourArray.add("Orange");
        secondColourArray.add("Black");
        secondColourArray.add("Blue");

        firstColourArray.addAll(secondColourArray);
        System.out.println("Fifteenth task: Joined array " + firstColourArray);
    }

    public void arrayListTask16() {
        //16. Write a Java program to clone an array list to another array list.
        ArrayList<String> firstColourArray = new ArrayList<>();
        firstColourArray.add("Yellow");
        firstColourArray.add("Green");
        firstColourArray.add("Grey");

        ArrayList<String> cloneArray = (ArrayList<String>) firstColourArray.clone();
        System.out.println("Sixteenth task: Cloned array " + cloneArray);
    }

    public void arrayListTask17() {
        //17. Write a Java program to empty an array list.
        ArrayList<String> colourArray = new ArrayList<>();
        colourArray.add("Yellow");
        colourArray.add("Green");
        colourArray.add("Grey");

        colourArray.removeAll(colourArray);
        System.out.println("Seventeenth task: Empty array " + colourArray);
    }

    public void arrayListTask18() {
        //18. Write a Java program to test an array list is empty or not.
        ArrayList<String> firstColourArray = new ArrayList<>();
        firstColourArray.add("Yellow");
        firstColourArray.add("Green");
        firstColourArray.add("Grey");

        boolean isArrayEmpty = firstColourArray.isEmpty();

        System.out.println("Eighteen task: Is array " + firstColourArray + " empty? Answer: " + isArrayEmpty);
    }

    public void arrayListTask19() {
        //19. Write a Java program to trim the capacity of an array list the current list size.
        ArrayList<String> firstColourArray = new ArrayList<>();
        firstColourArray.add("Yellow");
        firstColourArray.add("Green");
        firstColourArray.add("Grey");

        firstColourArray.trimToSize();
        System.out.println("Nineteenth task: Trim the capacity of an array list the current list size" + firstColourArray);
    }

    public void arrayListTask20() {
        //20. Write a Java program to increase the size of an array list.
        ArrayList<String> firstColourArray = new ArrayList<>();
        firstColourArray.add("Yellow");
        firstColourArray.add("Green");
        firstColourArray.add("Grey");

        firstColourArray.ensureCapacity(5);
        firstColourArray.add("Violet");
        firstColourArray.add("Pink");
        System.out.println("Twelfth task: Increased array " + firstColourArray);
    }

    public void arrayListTask21() {
        //21. Write a Java program to replace the second element of a ArrayList with the specified element.
        ArrayList<String> colourArray = new ArrayList<>();
        colourArray.add("Yellow");
        colourArray.add("Green");
        colourArray.add("Grey");
        colourArray.add("Blue");
        colourArray.add("Violet");
        System.out.println("Twenty first task: Original array " + colourArray);
        colourArray.set(1, "Gold");
        System.out.println("And an array with replaced of the second element " + colourArray);
    }

    public void arrayListTask22(){
        //22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
        ArrayList<String> colourArray = new ArrayList<>();
        colourArray.add("Yellow");
        colourArray.add("Green");
        colourArray.add("Grey");
        colourArray.add("Blue");
        colourArray.add("Violet");

        System.out.println("Twenty second task: an Array using the position of the elements: ");
        int arraySize = colourArray.size();
        for (int i = 0; i < arraySize; i++)
            System.out.println(colourArray.get(i));
    }

}

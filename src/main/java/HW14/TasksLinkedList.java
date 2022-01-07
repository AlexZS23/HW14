package HW14;

import java.util.*;

public class TasksLinkedList {

    public static void main(String[] args) {

        TasksLinkedList tasksLinkedList = new TasksLinkedList();
        tasksLinkedList.linkedListTask1();
        tasksLinkedList.linkedListTask2();
        tasksLinkedList.linkedListTask3();
        tasksLinkedList.linkedListTask4();
        tasksLinkedList.linkedListTask5();
        tasksLinkedList.linkedListTask6();
        tasksLinkedList.linkedListTask7();
        tasksLinkedList.linkedListTask8();
        tasksLinkedList.linkedListTask9();
        tasksLinkedList.linkedListTask10();
        tasksLinkedList.linkedListTask11();
        tasksLinkedList.linkedListTask12();
        tasksLinkedList.linkedListTask13();
        tasksLinkedList.linkedListTask14();
        tasksLinkedList.linkedListTask15();
        tasksLinkedList.linkedListTask16();
        tasksLinkedList.linkedListTask17();
        tasksLinkedList.linkedListTask18();
        tasksLinkedList.linkedListTask19();
        tasksLinkedList.linkedListTask20();
        tasksLinkedList.linkedListTask21();
        tasksLinkedList.linkedListTask22();
        tasksLinkedList.linkedListTask23();
        tasksLinkedList.linkedListTask24();
        tasksLinkedList.linkedListTask25();
        tasksLinkedList.linkedListTask26();
    }

    public void linkedListTask1() {
        //1. Write a Java program to append the specified element to the end of a linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");

        System.out.println("LinkedList, Task1: " + colourList);
    }

    public void linkedListTask2() {
        //2. Write a Java program to iterate through all elements in a linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");

        System.out.println("LinkedList, Task2: ");
        for (String iterate : colourList) {
            System.out.println(iterate);
        }
    }

    public void linkedListTask3() {
        //3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");

        Iterator<String> iterator = colourList.listIterator(1);
        System.out.println("LinkedList, Task3: ");
        while (iterator.hasNext()) { //hasNext возвращает true если итерация содержит больше элементов
            System.out.println(iterator.next()); //next метод возвращает следующий элемент в итерации
        }
    }

    public void linkedListTask4() {
        //4. Write a Java program to iterate a linked list in reverse order.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");

        //1st variant
//        Collections.reverse(colourList);
//        System.out.println("LinkedList, Task4: ");
//        for (String iterate : colourList) {
//            System.out.println(iterate);

        //2nd variant
        Iterator<String> iterator = colourList.descendingIterator();
        System.out.println("LinkedList, Task4: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void linkedListTask5() {
        //5. Write a Java program to insert the specified element at the specified position in the linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");

        colourList.add(2, "Black");
        System.out.println("LinkedList, Task5: " + colourList);
    }

    public void linkedListTask6() {
        //6. Write a Java program to insert elements into the linked list at the first and last position.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");
        colourList.addFirst("White");
        colourList.addLast("Black");

        System.out.println("LinkedList, Task6: " + colourList);
    }

    public void linkedListTask7() {
        //7. Write a Java program to insert the specified element at the front of a linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");
        colourList.offerFirst("White");

        System.out.println("LinkedList, Task7: " + colourList);
    }

    public void linkedListTask8() {
        //8. Write a Java program to insert the specified element at the end of a linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");
        colourList.offerLast("White");

        System.out.println("LinkedList, Task8: " + colourList);
    }

    public void linkedListTask9() {
        //9. Write a Java program to insert some elements at the specified position into a linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");

        LinkedList<String> colourListAdd = new LinkedList<>();
        colourListAdd.add("Grey");
        colourListAdd.add("White");

        colourList.addAll(1, colourListAdd);
        System.out.println("LinkedList, Task9: " + colourList);
    }

    public void linkedListTask10() {
        //10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");
        colourList.add("Grey");
        colourList.add("White");

        Object firstElement = colourList.getFirst();
        Object lastElement = colourList.getLast();
        System.out.println("LinkedList, Task10: First element - " + firstElement + ", Last element - " + lastElement);
    }

    public void linkedListTask11() {
        //11. Write a Java program to display the elements and their positions in a linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");
        colourList.add("Grey");
        colourList.add("White");

        System.out.println("LinkedList, Task11:");
        for (int i = 0; i < colourList.size(); i++) {
            System.out.println("Position " + i + ", Element " + colourList.get(i));
        }
    }

    public void linkedListTask12() {
        //12. Write a Java program to remove a specified element from a linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");
        colourList.add("Grey");
        colourList.add("White");

        colourList.remove(2);
        System.out.println("LinkedList, Task12: " + colourList);
    }

    public void linkedListTask13() {
        //13. Write a Java program to remove first and last element from a linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");
        colourList.add("Grey");
        colourList.add("White");

        Object firstElement = colourList.removeFirst();
        Object lastElement = colourList.removeLast();

        System.out.println("LinkedList, Task13: " + colourList + " Removed elements: " + firstElement + " and " + lastElement);
    }

    public void linkedListTask14() {
        //14. Write a Java program to remove all the elements from a linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");

        colourList.clear();
        System.out.println("LinkedList, Task14: Removed all the elements " + colourList);
    }

    public void linkedListTask15() {
        //15. Write a Java program of swap two elements in a linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");
        colourList.add("Grey");
        colourList.add("White");

        Collections.swap(colourList, 0, 5);
        System.out.println("LinkedList, Task15: " + colourList);
    }

    public void linkedListTask16() {
        //16. Write a Java program to shuffle the elements in a linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");
        colourList.add("Grey");
        colourList.add("White");

        Collections.shuffle(colourList);
        System.out.println("LinkedList, Task16: Shuffled list " + colourList);
    }

    public void linkedListTask17() {
        //17. Write a Java program to join two linked lists.
        LinkedList<String> firstColourList = new LinkedList<>();
        firstColourList.add("Purple");
        firstColourList.add("Red");
        firstColourList.add("Yellow");

        LinkedList<String> secondColourList = new LinkedList<>();
        secondColourList.add("Blue");
        secondColourList.add("Grey");
        secondColourList.add("White");

        firstColourList.addAll(secondColourList);
        System.out.println("LinkedList, Task17: Joined list " + firstColourList);
    }

    public void linkedListTask18() {
        //18. Write a Java program to clone an linked list to another linked list.
        LinkedList<String> firstColourList = new LinkedList<>();
        firstColourList.add("Purple");
        firstColourList.add("Red");
        firstColourList.add("Yellow");

        LinkedList<String> secondColourList = new LinkedList<>();
        secondColourList = (LinkedList) firstColourList.clone();
        System.out.println("LinkedList, Task18: Cloned list " + secondColourList);
    }

    public void linkedListTask19() {
        //19. Write a Java program to remove and return the first element of a linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");
        colourList.add("Grey");
        colourList.add("White");

        System.out.println("LinkedList, Task19: Removed element - " + colourList.poll());
    }

    public void linkedListTask20() {
        //20. Write a Java program to retrieve but does not remove, the first element of a linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");
        colourList.add("Grey");
        colourList.add("White");

        String firstElement = colourList.peekFirst(); //first variant
        String firstElementVariant = colourList.get(0); //second variant
        System.out.println("LinkedList, Task20: Retrieved the first element - " + firstElement);
    }

    public void linkedListTask21() {
        //21. Write a Java program to retrieve but does not remove, the last element of a linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");
        colourList.add("Grey");
        colourList.add("White");

        String lastElement = colourList.peekLast();
        System.out.println("LinkedList, Task21: Retrieved the last element - " + lastElement);
    }

    public void linkedListTask22() {
        //22. Write a Java program to check if a particular element exists in a linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");
        colourList.add("Grey");
        colourList.add("White");

        boolean checkElement = colourList.contains("Blue");
        System.out.println("LinkedList, Task22: Does LinkedList " + colourList + " contain element 'Blue'? Answer: " + checkElement);
    }

    public void linkedListTask23() {
        //23. Write a Java program to convert a linked list to array list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");
        colourList.add("Grey");
        colourList.add("White");

        List<String> convertList = new ArrayList<>(colourList);
        System.out.println("LinkedList, Task23: Converted to ArrayList: " + convertList);
    }

    public void linkedListTask24() {
        //24. Write a Java program to compare two linked lists.
        LinkedList<String> firstColourList = new LinkedList<>();
        firstColourList.add("Purple");
        firstColourList.add("Red");
        firstColourList.add("Yellow");

        LinkedList<String> secondColourList = new LinkedList<>();
        secondColourList.add("Blue");
        secondColourList.add("Red");
        secondColourList.add("White");

        List<String> compareColourArray = new ArrayList<>();

        for (String compare : firstColourList) {
            if (secondColourList.contains(compare)) {
                compareColourArray.add(compare);
            } else {
                compareColourArray.add("No matched element");
            }
        }
        System.out.println("LinkedList, Task24: Compared of Lists:" + compareColourArray);
    }

    public void linkedListTask25() {
        //25. Write a Java program to test a linked list is empty or not.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");

        boolean checkIsEmpty = colourList.isEmpty();
        System.out.println("LinkedList, Task25: Is LinkedList " + colourList + " empty? Answer: " + checkIsEmpty);
    }

    public void linkedListTask26() {
        //26. Write a Java program to replace an element in a linked list.
        LinkedList<String> colourList = new LinkedList<>();
        colourList.add("Purple");
        colourList.add("Red");
        colourList.add("Yellow");
        colourList.add("Blue");
        colourList.add("Grey");
        colourList.add("White");

        colourList.set(0, "Purple");
        System.out.println("LinkedList, Task25: " + colourList);
    }
}


package HW14;

import java.util.*;

public class TasksOther {

    public static void main(String[] args) {

        TasksOther tasksOther = new TasksOther();
        tasksOther.hashSetTask1();
        tasksOther.hashSetTask2();
        tasksOther.treeSetTask1();
        tasksOther.treeSetTask2();
        tasksOther.priorityQueueTask1();
        tasksOther.priorityQueueTask2();
    }

    public void hashSetTask1(){
        //1. Write a Java program to append the specified element to the end of a hash set.
        HashSet<String> colour = new HashSet<>();
        colour.add("Purple");
        colour.add("Red");
        colour.add("Orange");

        System.out.println("HashSet, Task1: " + colour);
    }

    public void hashSetTask2(){
        //8. Write a Java program to convert a hash set to a tree set.

        HashSet<String> colour = new HashSet<>();
        colour.add("Purple");
        colour.add("Red");
        colour.add("Orange");

        Set<String> convert = new TreeSet<>(colour);
        System.out.println("HashSet, Task8: Converted to TreeSet: " + convert);
    }

    public void treeSetTask1(){
        //1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
        TreeSet<String> colour = new TreeSet<>();
        colour.add("Purple");
        colour.add("Blue");
        colour.add("Orange");

        System.out.println("TreeSet, Task1: " + colour);
    }

    public void treeSetTask2(){
        //11. Write a Java program to get the element in a tree set which is less than or equal to the given element.
        TreeSet<Integer> numberValue = new TreeSet<Integer>();
        numberValue.add(5);
        numberValue.add(18);
        numberValue.add(14);
        numberValue.add(1);

        System.out.println("TreeSet, Task11: Element that less than or equal to 13 : " + numberValue.floor(13));
    }

    public void priorityQueueTask1(){
        //2. Write a Java program to iterate through all elements in priority queue.
        PriorityQueue<String> colourQueue = new PriorityQueue<String>();
        colourQueue.add("Yellow");
        colourQueue.add("Green");
        colourQueue.add("Purple");

        System.out.println("PriorityQueue, Task2: ");

        for (String element : colourQueue) {
            System.out.println(element);
        }
    }

    public void priorityQueueTask2(){
        //4. Write a Java program to insert a given element into a priority queue.
        PriorityQueue<String> colourQueue = new PriorityQueue<String>();
        colourQueue.add("Yellow");
        colourQueue.add("Green");
        colourQueue.add("Purple");

        colourQueue.offer("Red");
        System.out.println("PriorityQueue, Task4: " + colourQueue);
    }

}

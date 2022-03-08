package day49_Collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(1000, 12, 45, 67, 3532, 567, 132, 12, 45, 67));

        System.out.println("priorityQueue = " + priorityQueue);


        Queue<Integer> arrayQueue = new ArrayDeque<>();
        arrayQueue.addAll(Arrays.asList(1000, 12, 45, 67, 3532, 567, 132, 12, 45, 67));
        System.out.println("arrayQueue = " + arrayQueue);

        Queue<Integer> linkedList = new PriorityQueue<>();
        linkedList.addAll(Arrays.asList(1000, 12, 45, 67, 3532, 567, 132, 12, 45, 67));
        System.out.println("linkedList = " + linkedList);
    }
}

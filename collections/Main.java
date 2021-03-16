package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static void printCars(ArrayList<Car> cars)
    {
        for (Car c : cars) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {


        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("56-777-65", "Nissan", "Juke", LocalDateTime.of(2016,3,20,0,0,0), "Black", 5 ));
        cars.add(new Car("32-333-23", "Nissan", "Sentra", LocalDateTime.of(2019,4,20,0,0,0), "Black", 5 ));
        cars.add(new Car("55-333-56", "Lincoln", "Navigator ", LocalDateTime.of(2020,4,3,0,0,0), "White", 7 ));
        cars.add(new Car("55-333-55", "Bugatti", "Chiron", LocalDateTime.of(2021,11,15,0,0,0), "Red", 2 ));
        cars.add(new Car("77-888-77", "Hennessey", "VenomGT", LocalDateTime.of(2018,10,5,0,0,0), "Blue", 2 ));

        printCars(cars);
        System.out.println("==========================");
        System.out.println("Which car index to delete?");
        Scanner s = new Scanner(System.in);
        int car_index = 3; //s.nextInt();
        cars.remove(car_index);
        printCars(cars);

        for (Car c : cars) {
            //cars.remove(c); // why ? why? why ?
        }

        Set<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(2);
        set1.add(1);
        set1.add(3);
        for (Integer number : set1) {
            System.out.println(number);
        }
        // create a set of String , "a", "b", "c", "a"
        // 19:35
        set1.stream().forEach(System.out::println);

        Stack<Integer> numbersStack = new Stack<>();
        numbersStack.push(12);
        numbersStack.push(10);
        numbersStack.push(-3);
        numbersStack.push(0);
        numbersStack.stream().forEach(System.out::println); // does not change the Stack
        System.out.println("---------------------");
        Integer item = numbersStack.pop();
        System.out.println(item);
        System.out.println(numbersStack.peek());

        // stack: 4, -12, 20, 30, 0, -2, 200
        // stack: 200, 0...
        // in new stack only positive numbers (same order)
        numbersStack.add(-200);
        System.out.println(numbersStack.peek());
        //numbersStack.stream()

        Stack<Integer> numbersStackOpp = new Stack<>();
        numbersStackOpp.push(4);
        numbersStackOpp.push(-12);
        numbersStackOpp.push(20);
        numbersStackOpp.push(30);
        numbersStackOpp.push(0);
        numbersStackOpp.push(-2);
        numbersStackOpp.push(200);
        Stack<Integer> benaim = new Stack<>();
        Stack<Integer> pitaron = new Stack<>();
        while (!numbersStackOpp.empty()) {
            Integer stack_item = numbersStackOpp.pop();
            if (stack_item > 0) {
                benaim.push(stack_item);
            }
        }
        while (!benaim.empty()) {
            Integer stack_item = benaim.pop();
            pitaron.push(stack_item);
        }

        Queue<Customer> queue = new ArrayDeque<>();
        queue.add(new Customer(1, "Danny"));
        queue.add(new Customer(2, "Marry"));
        queue.add(new Customer(3, "Shahar"));
        Customer c = queue.poll();
        System.out.println(c);

        Customer danny = new Customer(7, "Danny");
        Customer marry = new Customer(2, "Marry");
        Customer shahar = new Customer(30, "Shahar");
        HashMap<Integer, Customer> map = new HashMap<>();
        map.put(7, danny);
        map.put(2, marry);
        map.put(30, shahar);

        Customer c_id_30 = map.get(30);
        System.out.println(String.format("Customer with id 30 = %s", c_id_30));

        HashMap<String, Customer> map_string = new HashMap<>();
        map_string.put("Danny", danny);
        map_string.put("Marry", marry);
        map_string.put("Shahar", shahar);

        Customer c_name_shahar = map_string.get("Shahar");
        System.out.println(String.format("Customer with name Shahar = %s", c_name_shahar));

    }

}

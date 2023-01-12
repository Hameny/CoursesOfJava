package secondLesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> employee = new ArrayList<>();
        employee.add("Kristina");
        employee.add("Milana");
        employee.add("Volha");
        employee.add("Eduard");



        int inputNumber;
        boolean x;


        do {
            System.out.println("Enter number 1-9 or 0(EXIT): ");
            inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1 -> {
                    System.out.println("You entered a number" + inputNumber + ". List of employee");
                    System.out.println("Employee : " + employee);
                    x = true;
                }
                case 2 -> {
                    System.out.println("You entered a number" + inputNumber + ". Add an employee.");
                    System.out.println("Employee : " + employee);
                    employee.add(scanner.next());
                    System.out.println("Employee after add new employee " + employee);
                    x = true;
                }
                case 3 -> {
                    System.out.println("You entered a number" + inputNumber + ". Delete an employee.");
                    System.out.println("Employee" + employee);
                    int indexOfLastElement = employee.size() - 1;
                    employee.remove(indexOfLastElement);
                    System.out.println("Employee after delete " + employee);
                    x = true;
                }
                case 4 -> {
                    System.out.println("You entered a number" + inputNumber + ".Print size array list of employee");
                    System.out.println("Employee : " + employee);
                    System.out.println("Size of array = " + employee.size());
                    x = true;
                }
                case 5 -> {
                    System.out.println("You entered a number" + inputNumber + ". Display sorted employee");
                    System.out.println("Employee : " + employee);
                    Collections.sort(employee);
                    System.out.println("Sort employee " + employee);
                    x = true;
                }
                case 6 -> {
                    System.out.println("You entered a number" + inputNumber + ". Display first employee");
                    System.out.println("Employee : " + employee);
                    System.out.println("First employee - " + employee.get(0));
                    x = true;
                }
                case 7 -> {
                    System.out.println("You entered a number" + inputNumber + ". Display first employee");
                    System.out.println("Employee : " + employee);
                    System.out.println("Last employee - " + employee.get(employee.size()-1));
                    x = true;
                }
                case  8 -> {
                    System.out.println("You entered a number" + inputNumber + ". Display first employee");
                    System.out.println("Input name of employee who are you looking for : ");
                    String nameSearch = scanner.next();
                    if(employee.contains(nameSearch)){
                        System.out.println("Name - " + nameSearch + " in list");
                    }
                    else{
                        System.out.println("Name not found");
                    }
                    x = true;
                }
                case 9 -> {
                    System.out.println("You entered a number" + inputNumber + ". Display list employee in string");
                    System.out.println("Employee : " + employee);
                    System.out.println("Employee " + String.join(",",employee));
                    x = true;
                }
                case 0 -> {
                    System.out.println("You entered a number " + inputNumber + ". PROGRAM EXIT");
                    x = false;
                }
                default -> {
                    System.out.println("Incorrect number.Inter number in the range  1-9 or 0 to EXIT");
                    x = true;
                }
            }
        }

        while (x);
    }
}

package com.saurabh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedSwitch {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the employee number: ");
        int employeeNumber = in.nextInt();
        System.out.println("Want to know department: (Answer in yes or no) ");
        String wantDepartment = in.next();

//        switch (employeeNumber) {
//            case 1:
//                System.out.println("Employee name is Kunal");
//                switch (wantDepartment) {
//                    case "yes":
//                        System.out.println("Kunal's department is IT.");
//                        break;
//                    case "no":
//                        System.out.println("You don't want to know his department.");
//                        break;
//                    default:
//                        System.out.println("Enter valid answer for department");
//                }
//                break;
//            case 2:
//                System.out.println("Employee name is Rahul");
//                switch (wantDepartment) {
//                    case "yes":
//                        System.out.println("Rahul's department is IT.");
//                        break;
//                    case "no":
//                        System.out.println("You don't want department.");
//                        break;
//                    default:
//                        System.out.println("Enter valid answer for department");
//                }
//                break;
//            default:
//                System.out.println("Enter valid employee number");
//        }

        switch (employeeNumber) {
            case 1 -> {
                System.out.println("Employee name is Kunal");
                switch (wantDepartment) {
                    case "yes" -> System.out.println("Kunal's department is IT.");
                    case "no" -> System.out.println("You don't want to know his department.");
                    default -> System.out.println("Enter valid answer for department");
                }
            }
            case 2 -> {
                System.out.println("Employee name is Rahul");
                switch (wantDepartment) {
                    case "yes" -> System.out.println("Rahul's department is IT.");
                    case "no" -> System.out.println("You don't want department.");
                    default -> System.out.println("Enter valid answer for department");
                }
            }
            default -> System.out.println("Enter valid employee number");
        }
    }
}

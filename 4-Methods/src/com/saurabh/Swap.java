package com.saurabh;

import static java.util.Collections.swap;

//| Type                 | What is Copied                    | Can you modify the original?                                 | Why                                                            |
//| -------------------- | --------------------------------- | ------------------------------------------------------------ | -------------------------------------------------------------- |
//| **Primitive**        | Actual value (e.g., `10`, `true`) | ❌ No (when doing swaping)                                   | Copy of value is separate                                      |
//| **Object Reference** | Reference (memory address)        | ✅ Yes, if you change the internal content (e.g., list items)| Because both reference variables point to same object          |
//| **String**           | Reference (memory address)        | ❌ No                                                        | Because `String` is immutable — changing it makes a new object |

public class Swap {
    public static void main(String[] args) {
        int a  = 10;
        int b = 20;
        //swapping numbers
//        int temp = a;
//        a = b;
//        b = temp;
        swaps(a,b);
        System.out.println(a+ " " + b);


     // changing Strings
        String  naam = "SaurabHarshita";
        naam = changeName(naam);
        System.out.println(naam);

    }

    static String changeName(String name) {
        name = "HarshitaSaurabh";
        return name;
    }

    static int swaps(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return a ;
    }
}

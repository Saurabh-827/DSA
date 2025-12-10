package com.saurabh;

public class PassValue {
    public static void main(String[] args) {
        {
            // NOTE ::: Any “modification” (concat, replace, assign new value) of String creates a new String object.

            String name = "Saurabh";  /*→ Creates "Saurabh" in the String Constant Pool (SCP).→ Variable name points to it.*/
            System.out.println(System.identityHashCode(name));
           name =  changeName(name); /* After function execution →
            The original variable name in main now points to that new object("Harshita").*/
            System.out.println(name);
            System.out.println(System.identityHashCode(name));

        }


    }
    static String changeName(String nam) {
        // here also the parameter nam points to the same object ("Saurabh").
        System.out.println(System.identityHashCode(nam));//That’s why the identity hash codes are equal
        nam = "Harshita";  /*→ You’re not modifying "Saurabh".
        → You’re making nam point to a different string literal "Harshita" in the pool.
        → "Saurabh" stays unchanged.*/
        System.out.println(System.identityHashCode(nam));
        return nam; //The method returns the new reference (pointing to "Harshita").
    }
}

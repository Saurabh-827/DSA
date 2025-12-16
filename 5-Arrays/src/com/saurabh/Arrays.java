public class Arrays {
    public static void main(String[] args) {
        //syntax of the array

//        //datatype[] variable_name = new datatype[size];
//        int[]  rollNum = new int[15];
//        //or directly
//        int[] rollNum2 = {1, 2, 3, 4 };

        int[] rolNum;  //DECLARATION: of array,  rolNum getting defined in the STACK

        rolNum = new int[5]; //INITIALISATION: here object is getting created in the HEAP

        System.out.println(rolNum[0]);   //By default, if no value assign than all index get value 0;

        String[] wordsArr = new String[5];

        System.out.println(wordsArr[2]); //By default, if no value assign than all index of string have null
System.out.println(wordsArr[1]);
System.out.println(wordsArr[0]);


    }
}
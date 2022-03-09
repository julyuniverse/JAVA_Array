import java.util.Arrays;

public class MyArrayTest {
    public static void main(String[] args) {
        MyArray myArray1 = new MyArray();

        myArray1.deletePositioningElement(0);
        System.out.println(Arrays.toString(myArray1.intArr));
        myArray1.addElement(10);
        System.out.println(Arrays.toString(myArray1.intArr));
        myArray1.addElement(30);
        System.out.println(Arrays.toString(myArray1.intArr));
        myArray1.addPositioningElement(0, 1000);
        System.out.println(Arrays.toString(myArray1.intArr));
        myArray1.addPositioningElement(5, 3000);
        System.out.println(Arrays.toString(myArray1.intArr));
        myArray1.deletePositioningElement(1);
        System.out.println(Arrays.toString(myArray1.intArr));
        myArray1.deletePositioningElement(6);
        System.out.println(Arrays.toString(myArray1.intArr));

        System.out.println("-------------------------------------------------------------------------------------");

        MyArray myArray2 = new MyArray(26);

        myArray2.deletePositioningElement(0);
        System.out.println(Arrays.toString(myArray2.intArr));
        myArray2.addElement(10);
        System.out.println(Arrays.toString(myArray2.intArr));
        myArray2.addElement(30);
        System.out.println(Arrays.toString(myArray2.intArr));
        myArray2.addPositioningElement(0, 1000);
        System.out.println(Arrays.toString(myArray2.intArr));
        myArray2.addPositioningElement(5, 3000);
        System.out.println(Arrays.toString(myArray2.intArr));
        myArray2.deletePositioningElement(1);
        System.out.println(Arrays.toString(myArray2.intArr));
        myArray2.deletePositioningElement(6);
        System.out.println(Arrays.toString(myArray2.intArr));

        // 결과
        // The array is empty.
        // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // [10, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // [10, 30, 0, 0, 0, 0, 0, 0, 0, 0]
        // [1000, 10, 30, 0, 0, 0, 0, 0, 0, 0]
        // Check the position.
        // [1000, 10, 30, 0, 0, 0, 0, 0, 0, 0]
        // [1000, 30, 0, 0, 0, 0, 0, 0, 0, 0]
        // Check the position.
        // [1000, 30, 0, 0, 0, 0, 0, 0, 0, 0]
        // -------------------------------------------------------------------------------------
        // The array is empty.
        // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // [10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // [10, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // [1000, 10, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // Check the position.
        // [1000, 10, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // [1000, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // Check the position.
        // [1000, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    }
}

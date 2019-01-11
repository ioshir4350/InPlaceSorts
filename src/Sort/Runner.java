package Sort;

public class Runner {

    public static void main(String[] args) {

        int[] testArr = InPlaceSorts.randIntArr(4);
        String[] testArr1 = InPlaceSorts.randStringArr(4,4);
        double[] testArr2 = InPlaceSorts.randDoubleArr((4));

        int[] copy = InPlaceSorts.copyIntArray(testArr);

        System.out.print("Before: ");
        for (int num: testArr)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Before: ");
        for (String num: testArr1)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Before: ");
        for (double num: testArr2)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        InPlaceSorts.InsertionSort(testArr);
        InPlaceSorts.bubbleSort(testArr1);
        InPlaceSorts.SelectionSort(testArr2);

        System.out.print("After: ");
        for (int num:testArr)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.print("After: ");
        for (String num:testArr1)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.print("After: ");
        for (double num:testArr2)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        boolean isSortedVAR =  InPlaceSorts.isSorted(copy);
        System.out.println("Original testArr is sorted? " + isSortedVAR);

        boolean isSortedVAR1 =  InPlaceSorts.isSorted(testArr);
        System.out.println("New testArr is sorted? " + isSortedVAR1);

        boolean isCheckedVAR = InPlaceSorts.checkSum(copy,testArr);
        System.out.println("Original testArr and new testArr have the same sum? " + isCheckedVAR);

        long time = System.nanoTime();
        InPlaceSorts.InsertionSort(testArr);
        time = System.nanoTime() - time;
        System.out.println("Time Taken for InsertionSort: " + time);

        InPlaceSorts.bubbleSort(testArr1);
        time = System.nanoTime() - time;
        System.out.println("Time Taken for BubbleSort: " + time);

        InPlaceSorts.SelectionSort(testArr2);
        time = System.nanoTime() - time;
        System.out.println("Time Taken for SelectionSort: " + time);
    }
}



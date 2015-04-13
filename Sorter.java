import java.util.Random;
/**
 * Evaluates different sorting algorithms
 * prints the evaluated sorting methods
 * creates a new random list in each method
 * method parameter: int n elements
 */
public class Sorter
{
    //     private int[] a1000; Adding to git
    //     private int[] a2000;
    //     private int[] a3000;
    //     private int[] a4000;
    //     private int[] a5000;
    //     private int[] a6000;
    //     private int[] a7000;
    //     private int[] a8000;
    //     private int[] a9000;
    //     private int[] a10000;
    private int[] intArray;
    private Random randomNum;

    /**
     * Constructor for objects of class SortingAlgorithm
     */
    public Sorter()
    {
        randomNum = new Random();

    }

    public static void main(String args[]){
        Sorter s = new Sorter();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("N       selection       insertion       Shell       Hibbard       Knuth       Gonnet       Sedgewick       heap       merge       quick");
        //int sorted = s.selection(1000);

        System.out.println("1,000   " + s.selection(1000));
        System.out.println("2,000   " + s.selection(2000));
        System.out.println("3,000   " + s.selection(3000));
        System.out.println("4,000   " + s.selection(4000));
        System.out.println("5,000   " + s.selection(5000));
        System.out.println("6,000   " + s.selection(6000));
        System.out.println("7,000   " + s.selection(7000));
        System.out.println("8,000   " + s.selection(8000));
        System.out.println("9,000   " + s.selection(9000));
        System.out.println("10,000   " + s.selection(10000));
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

    }

    /**
     * selection method
     * @ret returns number of comparisons
     * @param amount of random entries
     */
    public int selection(int n){    
        intArray = createList(n);
        int minIndex;
        int count =0;
        for(int index = 0; index < intArray.length - 1; index++){
            minIndex = index;
            for(int i = index + 1; i < intArray.length-1; i++){
                if(intArray[i] < intArray[minIndex]){
                    minIndex = i;
                }
            }
            if (minIndex != index){
                swap(intArray,index,minIndex);
                minIndex = index;
                count ++;
            }
        }
        return count;
    }

    /**
     * method to swap a and b
     */
    public static int[] swap(int[] intArray, int indexA, int indexB){
        int tempV = intArray[indexA];
        intArray[indexA] = intArray[indexB];
        intArray[indexB] = tempV;
        return intArray;
    }

    public int[] createList(int n){
        intArray = new int[n];
        for(int i = 0; i < n; i++){
            intArray[i] = randomNum.nextInt(i+1);
        }
        return intArray;
    }

    public int insertion(int n){
        intArray = createList(n);
        int count = 0;
        int x = intArray[0]; 
        for (int i = 1; i < n; i++) {             
            int j = i; 
            while (j > 0 && intArray[j] < x )  {
                swap(intArray,j,j-1);
                //intArray[j] = intArray[j-1];
                j--; //problem index of j is changing 
                count++;
            } 
            x = intArray[j]; 
        } 
        return count;
    }

    public static void testSelection(int n){
        Sorter s = new Sorter();
        int count = s.selection(n);
        for(int i = 0; i < s.intArray.length - 1; i++){
            System.out.println(s.intArray[i]);
        }
        System.out.println("Changes/Comparisons: " + count);
    }

    public static void testInsertion(int n){
        Sorter s = new Sorter();
        //         for(int j = 0; j < s.intArray.length - 1; j++){
        //             s.intArray[j] = s.randomNum.nextInt(n+1);
        //         }
        int count = s.insertion(n);
        for(int i = 0; i < s.intArray.length - 1; i++){
            System.out.println(s.intArray[i]);
        }
        System.out.println("Changes/Comparisons: " + count);
    }
}
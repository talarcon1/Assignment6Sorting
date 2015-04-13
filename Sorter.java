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

        System.out.println("1,000      " + s.selection(1000) + "         " + s.insertion(1000));
        System.out.println("2,000      " + s.selection(2000) + "        " + s.insertion(2000));
        System.out.println("3,000      " + s.selection(3000) + "        " + s.insertion(3000));
        System.out.println("4,000      " + s.selection(4000) + "        " + s.insertion(4000));
        System.out.println("5,000      " + s.selection(5000) + "       " + s.insertion(5000));
        System.out.println("6,000      " + s.selection(6000) + "       " + s.insertion(6000));
        System.out.println("7,000      " + s.selection(7000) + "       " + s.insertion(7000));
        System.out.println("8,000      " + s.selection(8000) + "       " + s.insertion(8000));
        System.out.println("9,000      " + s.selection(9000) + "       " + s.insertion(9000));
        System.out.println("10,000     " + s.selection(10000) + "       " + s.insertion(10000));
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

    }

    /**
     * selection method
     * @ret returns number of comparisons
     * @param amount of random entries
     */
    public int selection(int n){    
        intArray = createListRand(n);
        int minIndex;
        int count =0;
        for(int index = 0; index < intArray.length; index++){
            minIndex = index;
            for(int i = index + 1; i < intArray.length; i++){
                count++;
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

    public int insertion(int n){
        intArray = createListRand(n);
        int count = 0;
        for (int i = 1; i < n; i++) {             
            int j = i; 
            while (j > 0 && intArray[j] < intArray[j-1])  {
                swap(intArray,j-1,j);
                j--;
                count++;
            } 
            if(j>0){
                count++;
            }
        } 
        return count;
    }

    public int shell( int n )
    {
        int count = 0;
        intArray = createListRand(n);
    
        for( int gap = intArray.length / 2; gap > 0; gap /= 2 )
        {
            for(int j = 0; j < gap; j++){
                for( int i = j; i < intArray.length; i+= gap)
                {
                    if(i + gap <= n%gap){
                        count++;
                        if(intArray[i] > intArray[i+gap] ){
                            swap(intArray,i,i+gap);
                        }
                    }
                }
            }           
        }
        return count;
    }

    public int shellOld1( int n )
    {
        int count = 0;
        int j;
        intArray = createListOrd(n);
        for( int gap = intArray.length / 2; gap > 0; gap /= 2 )
        {
            count++;
            for( int i = gap; i < intArray.length; i++ )
            {
                int tmp = intArray[ i ];

                for( j = i; j >= gap && tmp < intArray[ j - gap ]; j -= gap )
                {
                    intArray[ j ] = intArray[ j - gap ];
                    count ++;
                }
                intArray[ j ] = tmp;
            }
        }
        return count;
    }

    public int shellOld(int n) {
        int count = 0;
        intArray = createListOrd(n);
        int increment = intArray.length / 2;
        while (increment >= 1) {
            for (int i = increment; i < n; i++) {
                int j = i;
                int temp = intArray[i];
                while (j >= increment && intArray[j - increment] > temp) {
                    intArray[j] = intArray[j - increment];
                    j = j - increment;
                    count++;
                }
                intArray[j] = temp;                
            }

            if (increment == 2) {
                increment = 1;
            } else {
                // increment *= (5.0 / 11);
                increment *= .5;
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

    public int[] createListRand(int n){
        intArray = new int[n];
        for(int i = 0; i < n; i++){
            intArray[i] = randomNum.nextInt(n+1);
        }
        return intArray;
    }

    public int[] createListOrd(int n){
        intArray = new int[n];
        for(int i =0; i < n; i++){
            intArray[i] = i;
        }
        return intArray;
    }

    public static void testSelection(int n){
        Sorter s = new Sorter();
        int count = s.selection(n);
        for(int i = 0; i < s.intArray.length; i++){
            System.out.println(s.intArray[i]);
        }
        System.out.println("Changes/Comparisons: " + count);
    }

    public static void testInsertion(int n){
        Sorter s = new Sorter();
        int count = s.insertion(n);
        for(int i = 0; i < s.intArray.length; i++){
            System.out.println(s.intArray[i]);
        }
        System.out.println("Changes/Comparisons: " + count);
    }

    public static void testShell(int n){
        Sorter s = new Sorter();
        int count = s.shell(n);
        for(int i = 0; i < s.intArray.length; i++){
            System.out.println(s.intArray[i]);
        }
        System.out.println("Changes/Comparisons: " + count);
    }
}
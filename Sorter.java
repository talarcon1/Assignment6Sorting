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
    //     private int[] a2000; anopther add to git
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
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("N       selection       insertion       Shell       Hibbard       Knuth       Gonnet       Sedgewick       heap       merge       quick        NlogN");
        //int sorted = s.selection(1000);

        System.out.println("1,000      " + s.selection(1000) + "         " + s.insertion(1000)  + "         " + s.shell(1000));
        System.out.println("2,000      " + s.selection(2000) + "        " + s.insertion(2000)  + "         " + s.shell(2000));
        System.out.println("3,000      " + s.selection(3000) + "        " + s.insertion(3000)  + "         " + s.shell(3000));
        System.out.println("4,000      " + s.selection(4000) + "        " + s.insertion(4000)  + "         " + s.shell(4000));
        System.out.println("5,000      " + s.selection(5000) + "       " + s.insertion(5000)  + "         " + s.shell(5000));
        System.out.println("6,000      " + s.selection(6000) + "       " + s.insertion(6000)  + "         " + s.shell(6000));
        System.out.println("7,000      " + s.selection(7000) + "       " + s.insertion(7000)  + "         " + s.shell(7000));
        System.out.println("8,000      " + s.selection(8000) + "       " + s.insertion(8000)  + "         " + s.shell(8000));
        System.out.println("9,000      " + s.selection(9000) + "       " + s.insertion(9000)  + "         " + s.shell(9000));
        System.out.println("10,000     " + s.selection(10000) + "       " + s.insertion(10000)  + "         " + s.shell(10000));
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");

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

    public int shellMy( int n )
    {
        int count = 0;
        intArray = createListRand(n);

        for( int gap = intArray.length / 2; gap > 0; gap /= 2 )
        {
            for(int j = 0; j < gap; j++){
                for( int i = j; i < intArray.length; i+= gap)
                {
                    if(i + gap <= n-1){
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

    /**
     * working where count?
     */
    public int shellWorking( int n )
    {
        intArray = createListRand(n);
        int count = 0;
        int j;
        for( int gap = intArray.length / 2; gap > 0; gap /= 2 )
        {
            for( int i = gap; i < intArray.length; i++ )
            {
                int temp = intArray[i];
                count++;
                for( j = i; j >= gap && temp<intArray[j-gap]; j -= gap )
                {
                    if(j!=i){
                        count++;
                    }
                    intArray[j] = intArray[j - gap];
                }
                count++;
                intArray[j] = temp;
            }
        }
        return count;
    }

    /**
     * shell method
     * fix conditional while 
     */
    public int shell(int n){
        //         int k = 1;
        //         int j;
        //         int temp;
        //         int count= 0;
        //         int[] a = createListRand(n);
        //         int inc = (n-1)/2;         
        //         while (inc >=1)
        //         {
        //             for (int i = inc; i<=a.length-1;i++)
        //             {
        //                 temp = a[i];
        //                 j = i;
        //                 count++;
        //                 while ( j>=inc && a[j-inc]>temp)
        //                 {
        //                     a[j] = a[j-inc];
        //                     j = j - inc;
        //                     if(j!=i){
        //                         count++;
        //                     }
        //                 }
        //                 a[j]=temp;
        //             }
        //             k++; 
        //             inc = (n-1)/(int)java.lang.Math.pow(2,k);// n / 2^k
        //         }
        //         return count;

        int j, p, gap;
        int tmp;
        int count = 0;
        int[] a = createListRand(n);
        for (gap = (n-1)/2; gap > 0; gap = gap/2)
            for ( p = gap; p < n ; p++)
            {
                tmp = a[p];
                count++;
                for (j = p; j >= gap && tmp < a[j- gap]; j = j - gap){
                    if(j!=p){
                        count++;
                    }
                    a[j] = a[j-gap];
                }
                a[j] = tmp;
            }
        return count;
    }

    /**
     * Shell Hibbard 
     * Needs fix: go through loop fix while statement
     */
    public int shellHibbard(int n){        
        //         int k = 0;
        //         int j;
        //         int temp;
        //         int count= 0;
        //         int[] a = createListRand(n);
        //         int inc = (int)(java.lang.Math.pow(2,k))-(int)1; //2^k - 1
        //         while (a[inc] <= a.length-1)
        //         {
        //             for (int i = inc; i<=a.length-1;i++)
        //             {
        //                 temp = a[i];
        //                 j = i;
        //                 count++;
        //                 while ( j>=inc && a[j-inc]>temp)
        //                 {
        //                     a[j] = a[j-inc];
        //                     j = j - inc;
        //                     if(j!=i){
        //                         count++;
        //                     }
        //                 }
        //                 a[j]=temp;
        //             }
        //             k++; 
        //             inc = (int)(java.lang.Math.pow(2,k))-(int)1;
        //         }
        //         return count;

        int j, p, gap;
        int tmp;
        int count = 0;
        int[] a = createListRand(n);
        int k =0;
        for (gap = 0; gap > 0; gap = (int)java.lang.Math.pow(2,k)-(int)1){
            for ( p = gap; p < n ; p++)
            {
                tmp = a[p];
                count++;
                for (j = p; j >= gap && tmp < a[j- gap]; j = j - gap){
                    if(j!=p){
                        count++;
                    }
                    a[j] = a[j-gap];
                }
                a[j] = tmp;
            }
            k++;
        }
            
        return count;
    }

    /**
     * shell knuth
     * Fix go through loop to fix while statement
     */
    public int shellKnuth(int n){        
        int k = 0;
        int j;
        int temp;
        int count= 0;
        int[] a = createListRand(n);
        int inc = (int)((java.lang.Math.pow(3,k))-(int)1)/2; // (3^k -1) / 2
        while (inc <= a.length+1)
        {
            for (int i = inc; i<=a.length-1;i++)
            {
                temp = a[i];
                j = i;
                count++;
                while ( j>=inc && a[j-inc]>temp)
                {
                    a[j] = a[j-inc];
                    j = j - inc;
                    if(j!=i){
                        count++;
                    }
                }
                a[j]=temp;
            }
            k++; 
            inc = (int)((java.lang.Math.pow(3,k))-(int)1)/2;
        }
        return count;
    }

    private static int e;
    private static int c;
    /**
     * heap sort ***Working but take away static variables
     * uses heapify method to create heap, maxheap to swap largest in heap
     * @param n = number of elements
     * @ret count = number of comparisons
     */
    public int heap(int n){
        c = 0;
        intArray = createListRand(n);
        intArray = buildHeap(intArray);        
        for (int i = e; i > 0; i--)
        {
            intArray = swap(intArray,0, i);
            e--; 
            maxheap(intArray, 0);
        }

        return c;
    }

    public int[] buildHeap(int[] intArray)
    {
        e = intArray.length-1;
        for (int i = e/2; i >= 0; i--){
            maxheap(intArray, i);        
        }
        return intArray;
    }

    public void maxheap(int[] intArray, int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= e){
            c++;
            if( intArray[left] > intArray[i]){
                max = left;
            }
        }
        if (right <= e )    {   
            c++;
            if( intArray[right] > intArray[max]){
                max = right;
            }
        }
        if (max != i)
        {
            intArray = swap(intArray, i,max);
            maxheap(intArray, max);
        }
    }    
    //................Testing and Assisting Methods.............................//
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

    public static void testHeap(int n){
        Sorter s = new Sorter();
        int count = s.heap(n);
        for(int i = 0; i < s.intArray.length; i++){
            System.out.println(s.intArray[i]);
        }
        System.out.println("Changes/Comparisons: " + count);
    }

    public static void testShellHibbard(int n){
        Sorter s = new Sorter();
        int count = s.shellHibbard(n);
        for(int i = 0; i < s.intArray.length; i++){
            System.out.println(s.intArray[i]);
        }
        System.out.println("Changes/Comparisons: " + count);
    }

    public static void testShellKnuth(int n){
        Sorter s = new Sorter();
        int count = s.shellKnuth(n);
        for(int i = 0; i < s.intArray.length; i++){
            System.out.println(s.intArray[i]);
        }
        System.out.println("Changes/Comparisons: " + count);
    }

    public static void testBuildHeap(){
        //int[] a = {6,8,7,1,5,3,2,4};
        Sorter s = new Sorter();
        int[] a = s.createListRand(16);
        s.buildHeap(a);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
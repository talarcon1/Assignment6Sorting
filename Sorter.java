import java.util.Random;
import java.util.Collections;
import java.util.Arrays;
import java.lang.Math;
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
        int n1 = (int)(Math.log(1000) / Math.log(2) * 1000);

    }

    public static void main(String args[]){
        Sorter s = new Sorter();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("N       selection       insertion       Shell       Hibbard       Knuth       Gonnet       Sedgewick       heap       merge       quick        NlogN");
        //int sorted = s.selection(1000);

        System.out.println("1,000      " + s.selection(1000) + "         " + s.insertion(1000)  + "         " + s.shell(1000) + "         " + s.shellHibbard(1000) + "        "+ s.shellKnuth(1000) + "        "  + s.shellGonnet(1000) + "        " + s.shellSedgewick(1000) + "        " + s.heap(1000) + "        " + "        " + s.quick(s.createListRand(1000),0,999) + "        " + (int)(Math.log(1000) / Math.log(2) * 1000));
        System.out.println("2,000      " + s.selection(2000) + "        " + s.insertion(2000)  + "         " + s.shell(2000)+ "         " + s.shellHibbard(2000) + "        " + s.shellKnuth(2000) + "        "  + s.shellGonnet(2000) + "        " + s.shellSedgewick(2000) + "        " + s.heap(2000) + "        " +  "        " +s.quick(s.createListRand(2000),0,1999) + "        " + (int)(Math.log(2000) / Math.log(2) * 2000));
        System.out.println("3,000      " + s.selection(3000) + "        " + s.insertion(3000)  + "         " + s.shell(3000)+ "         " + s.shellHibbard(3000) + "        " + s.shellKnuth(3000) + "        "  + s.shellGonnet(3000) + "        " + s.shellSedgewick(3000) + "        " + s.heap(3000) + "        " +  "        " +s.quick(s.createListRand(3000),0,2999) + "        " + (int)(Math.log(3000) / Math.log(2) * 3000));
        System.out.println("4,000      " + s.selection(4000) + "        " + s.insertion(4000)  + "         " + s.shell(4000)+ "         " + s.shellHibbard(4000) + "        " + s.shellKnuth(4000) + "        "  + s.shellGonnet(4000) + "        " + s.shellSedgewick(4000) + "        " + s.heap(4000) + "        " +  "        " +s.quick(s.createListRand(4000),0,3999) + "        " + (int)(Math.log(4000) / Math.log(2) * 4000));
        System.out.println("5,000      " + s.selection(5000) + "       " + s.insertion(5000)  + "         " + s.shell(5000)+ "         " + s.shellHibbard(5000) + "        " + s.shellKnuth(5000) + "        "  + s.shellGonnet(5000) + "        " + s.shellSedgewick(5000) + "        " + s.heap(5000) + "        " +  "        " +s.quick(s.createListRand(5000),0,4999) + "        " + (int)(Math.log(5000) / Math.log(2) * 5000));
        System.out.println("6,000      " + s.selection(6000) + "       " + s.insertion(6000)  + "         " + s.shell(6000)+ "         " + s.shellHibbard(6000) + "        " + s.shellKnuth(6000) + "        "  + s.shellGonnet(6000) + "        " +s.shellSedgewick(6000) + "        " + s.heap(6000) + "        " + "        " + s.quick(s.createListRand(6000),0,5999) + "        " + (int)(Math.log(6000) / Math.log(2) * 6000));
        System.out.println("7,000      " + s.selection(7000) + "       " + s.insertion(7000)  + "         " + s.shell(7000)+ "         " + s.shellHibbard(7000) + "        " + s.shellKnuth(7000) + "        " + s.shellGonnet(7000) + "        "  +s.shellSedgewick(7000) + "        " + s.heap(7000) + "        " +  "        " +s.quick(s.createListRand(7000),0,6999) + "        " + (int)(Math.log(7000) / Math.log(2) * 7000));
        System.out.println("8,000      " + s.selection(8000) + "       " + s.insertion(8000)  + "         " + s.shell(8000)+ "         " + s.shellHibbard(8000) + "        " + s.shellKnuth(8000) + "        " + s.shellGonnet(8000) + "        "  +s.shellSedgewick(8000) + "        " + s.heap(8000) + "        " + "        " + s.quick(s.createListRand(8000),0,7999) + "        " + (int)(Math.log(8000) / Math.log(2) * 8000));
        System.out.println("9,000      " + s.selection(9000) + "       " + s.insertion(9000)  + "         " + s.shell(9000)+ "         " + s.shellHibbard(9000) + "        " + s.shellKnuth(9000) + "        " + s.shellGonnet(9000) + "        "  +s.shellSedgewick(9000) + "        " + s.heap(9000) + "        " +  "        " +s.quick(s.createListRand(9000),0,8999) + "        " + (int)(Math.log(9000) / Math.log(2) * 9000));
        System.out.println("10,000     " + s.selection(10000) + "       " + s.insertion(10000)  + "         " + s.shell(10000)+ "         " + s.shellHibbard(10000) + "        " + s.shellKnuth(10000) + "        " + s.shellGonnet(10000) + "        "  +s.shellSedgewick(10000) + "        " + s.heap(10000) + "        " +  "        " +s.quick(s.createListRand(10000),0,9999) + "        " + (int)(Math.log(10000) / Math.log(2) * 10000));
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

    /**
     * sort working
     */
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
<<<<<<< HEAD
     * shell method Working
     * fix conditional while
     * ~92 comparisons
=======
     * shell new
     */
    public int shell(int n){
        int[] a = createListRand(n);
        int[] gaps = createGapsShell(n);
        int count = 0;
        int j = 0;
        for(int index = gaps.length-1; index >= 0; index--){
            int gap = gaps[index];
            for(int i = 0; i+gap < n-1; i += gap){
                count++;
                if(a[i] > a[i+gaps[index]]){
                    swap(a,i ,i+index);
                }
            }
        }
        return count;
    }

    /**
     * shell method
     * fix conditional while 
>>>>>>> origin/master
     */
    public int shellW(int n){
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

    public int shellHibbard(int n){
        int[] a = createListRand(n);
        int[] gaps = createGapsHibbard(n);
        int count = 0;
        int j = 0;
        for(int index = gaps.length-1; index >= 0; index--){
            int gap = gaps[index];
            for(int i = 0; i+gap <= n-1; i += gap){
                count++;
                if(a[i] > a[i+gap]){
                    a = swap(a,a[i] ,a[i+gap]);
                }
            }
        }
        return count;       
    }

    /**
<<<<<<< HEAD
     * Shell Hibbard Sort working
     * Needs fix: go through loop fix while statement
     */
    public int shellHibbard(int n){        
        int k = 1;
        int j;
        int temp;
        int count= 0;
        int[] a = createListRand(n);
        int inc = (int)(java.lang.Math.pow(2,k))-(int)1; //2^k - 1
        while (inc <= a.length-1)
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
            inc = (int)(java.lang.Math.pow(2,k))-(int)1;
        }
        return count;
        // 
        //         int j, p, gap;
        //         int tmp;
        //         int count = 0;
=======
    /*   
     * Shell Hibbard 
     * Needs fix: go through loop fix while statement
     */
    public int shellHibbardW(int n){        
        //         int k = 0;
        //         int j;
        //         int temp;
        //         int count= 0;
>>>>>>> origin/master
        //         int[] a = createListRand(n);
        //         int k =1;
        //         for (gap = 0; gap > 0; gap = (int)java.lang.Math.pow(2,k)-(int)1){
        //             for ( p = gap; p < n ; p++)
        //             {
        //                 tmp = a[p];
        //                 count++;
        //                 for (j = p; j >= gap && tmp < a[j- gap]; j = j - gap){
        //                     if(j!=p){
        //                         count++;
        //                     }
        //                     a[j] = a[j-gap];
        //                 }
        //                 a[j] = tmp;
        //             }
        //             k++;
        //         }
        // 
        //         return count;
    }

    /**
     * shell Sedgewick Sort not working
     * Fix go through loop to fix while statement
     */
    public int shellSedgewick(int n){        
        int k = 1;
        int j;
        int temp;
        int count= 0;
        int[] a = createListRand(n);
        int inc = (int)((java.lang.Math.pow(4,k))+ (3*java.lang.Math.pow(2,k+1)+1)); 
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
            inc = (int)((java.lang.Math.pow(4,k))+ (3*java.lang.Math.pow(2,k+1)+1));
        }
        return count;
    }

    /**
     * shell Sedgewick not Gonnet
     * Used as placeholder
     */
    public int shellGonnet(int n){        
        int k = 1;
        int j;
        int temp;
        int count= 0;
        int[] a = createListRand(n);
        int inc = (int)((java.lang.Math.pow(4,k))+ (3*java.lang.Math.pow(2,k+1)+1)); 
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
            inc = (int)((java.lang.Math.pow(4,k))+ (3*java.lang.Math.pow(2,k+1)+1));
        }
        return count;
    }

    /**
     * shell knuth Sort Working
     * Fix go through loop to fix while statement
     * Too many Comparisons
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

    private static int z = 0;
    /**
     * Quick Sort Working
     * Work around static variable
     * Make a generic quick method
     */
    public static int quick(int[] a, int p, int r)
    {
        if(p<r)
        {
            int q = partition(a,p,r);
            quick(a,p,q);
            quick(a,q+1,r);
        }
        return z;
    }

    private static int partition(int[] a, int p, int r) {

        int x = a[p];
        int i = p-1 ;
        int j = r+1 ;

        while (true) {
            i++;
            while ( i< r && a[i] < x){
                i++;
                z++;
            }
            j--;
            while (j>p && a[j] > x){
                j--;
                z++;
            }

            if (i < j){
                swap(a, i, j);
                z++;
            }
            else{
                z++;
                return j;
            }
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

    //.......................Create Gaps.................................\\

    /**
     * Method to create gap array for Shell
     * n/2^k
     */
    public int[] createGapsShell(int n){
        int count = 0;   
        int i = n / 2;
        while(i >= 1){
            count++;
            i /= 2;
        }
        int[] gaps = new int[count];
        n /= 2;
        for(int j = 0; j < count; j++){
            gaps[j] = n;
            n /= 2;
        }
        return gaps;
    }

    /**
     * Method to create gap array for Hibbard
     * //2^k - 1
     */
    public int[] createGapsHibbard(int n){
        int count = 0;
        int i = 1;
        while(i <= n){
            count++;
            i = (int)(java.lang.Math.pow(2,count+1))-(int)1;            
        }
        int[] gaps = new int[count];
        for(int j = 0; j < count; j++){
            gaps[j] = (int)(java.lang.Math.pow(2,j+1))-1;
        }
        //Collections.reverse(Arrays.asList(gaps));
        return gaps;
    }

    /**
     * Method to create gap array for Knuth
     * (3^k - 1) / 2
     */
    public int[] createGapsKnuth(int n){
        int count = 0;
        int i = 1;
        while(i <= n){
            count++;
            i = (int)((java.lang.Math.pow(3,count+1))-(int)1)/2;            
        }
        int[] gaps = new int[count];
        for(int j = 0; j < count; j++){
            gaps[j] = (int)((java.lang.Math.pow(3,j+1))-(int)1)/2;
        }
        Collections.reverse(Arrays.asList(gaps));
        return gaps;
    }

    /**
     * Method to create gap array for Sedgewick
     * 4^k + 3*2^(k-1) + 1
     */
    public int[] createGapsSedgewick(int n){
        int count = 0;
        int i = 1;
        while(i <= n){
            count++;
            i = (int)((java.lang.Math.pow(4,count))+ (3*java.lang.Math.pow(2,count-1))+1);            
        }
        int[] gaps = new int[count];
        gaps[0] = 1;
        for(int j = 1; j < count; j++){
            gaps[j] = (int)((java.lang.Math.pow(4,j))+ (3*java.lang.Math.pow(2,j-1)+1));
        }
        return gaps;
    }

    //.............................Test Sorts........................................\\

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

    public static void testHeap(int n){
        Sorter s = new Sorter();
        int count = s.heap(n);
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

    public static void testShellSedgewick(int n){
        Sorter s = new Sorter();
        int count = s.shellSedgewick(n);
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

    //.....................................TEST GAPS..................................\\

    public static void testGapsShell(int n){
        Sorter s = new Sorter();
        int[] a = s.createGapsShell(n);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static void testGapsHibbard(int n){
        Sorter s = new Sorter();
        int[] a = s.createGapsHibbard(n);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static void testGapsKnuth(int n){
        Sorter s = new Sorter();
        int[] a = s.createGapsKnuth(n);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static void testGapsSedgewick(int n){
        Sorter s = new Sorter();
        int[] a = s.createGapsSedgewick(n);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static void testQuick(int n){
        Sorter s = new Sorter();
        int[] a = s.createListRand(n);
        s.quick(a,0,n-1);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
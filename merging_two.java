import java.util.Arrays;

public class merging_two {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={1,2,3,4};
        System.out.println(Arrays.toString(merge(arr1,arr2)));



    }




    public static int[] merge(int[] fir,int[] sec){
        int[] mix=new int[fir.length+sec.length];
        int i=0;
        int j=0;
        int k=0;
        while (i< fir.length){
            mix[k]=fir[i];
            i++;
            k++;
        }
        while (j< sec.length){
            mix[k]=sec[j];
            j++;
            k++;
        }
return mix;


    }
}

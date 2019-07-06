package specials.polymorphic.algorithm;

public class MergeSort {

    public static void main(String[] args) {
         int[] a = {2,4,5,7,9,34};
         int[] b = {3,6,8,10,12,23};
         int[] rs = mergeSort(a,b);
         for(int temp : rs){
             System.out.print(temp+" ");
         }
        System.out.println();
    }

    private static int[] mergeSort(int[] a, int[] b) {
        int[] rs = new int[a.length+b.length];
        int i=0, j=0, k=0;
        while (i<a.length&&j<b.length){
            if(a[i]>b[j]){
                rs[k]=b[j];
                j++;
                k++;
            }else {
                rs[k]=a[i];
                i++;
                k++;
            }
        }
        if(i<a.length){
            for (int p=i;p<a.length;p++){
                rs[k]=a[p];
                k++;
            }
        }
        if(j<b.length){
            for (int q=j;q<b.length;q++){
                rs[k]=b[q];
                k++;
            }
        }
        return rs;
    }
}

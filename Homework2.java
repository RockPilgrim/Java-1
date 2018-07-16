
/**
 * Java-1 Homework 2
 * @author Timofei Tokarev
 * @version dated 15.07.18
 */
public class Homework2 {

    private static int[] arr1=
            {0,1,0,1,1,1,0,0,1,0,1,0,0,1,1,0,0,1};
    private static int[] arr2=new int[8];
    private static int[] arr3=
            {1,5,3,2,11,4,5,2,4,8,9,1};
    private static int[][]arr4=
            {{3,4,6,8,9},
            {3,4,6,8,9},
            {3,4,6,8,9},
            {3,4,6,8,9},
            {3,4,6,8,9}};
    private static int[] arr5=
            {0,5,6,8,9,-500,2,3,10,11,55,7,1};
    private static int[] arr6=
            {-2,10,4,10,2};
    private static int[]arr7=
            {1,2,3,4,5};
    private static int n=2;

    public static void main(String[] args){
        task1(arr1);
        task2(arr2);
        task3(arr3);
        task4(arr4);
        task5(arr5);
        task6(arr6);
        task7(arr7,n);
    }
    private static void task1(int[] arr){
        int f=0;
        for (int i:arr) {
            if (i==1){
                arr[f]=0;
            }
            f++;
        }
        for (int o:arr){
//            System.out.print(o+", ");
        }
    }
    private static void task2(int[]arr){
        for (int i=0;i<=21/3;i++){
            arr[i]=i*3;
//            System.out.print(arr[i]+',');
        }
    }
    private static void task3(int[] arr){
        for (int i=0;i<arr.length;i++){
            if(arr[i]<6){
                arr[i]*=2;
            }
//            System.out.print(arr[i]+",");
        }
    }
    private static void task4(int[][] arr){
        for (int i=0;i<arr.length;i++){
            arr[i][i]=1;
            arr[i][arr.length-i-1]=1;
            for (int j=0;j<arr.length;j++) {
                if (j==arr.length-1){
//                    System.out.print(arr[i][j]);
//                    System.out.println();
                    break;
                }
//                System.out.print(arr[i][j]+",");
            }
        }
    }
    private static void task5(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i:arr) {
            if (i>max)
                max=i;
            if(i<min)
                min=i;
        }
//        System.out.println("Max="+max+"; Min="+min);
    }
    private static boolean task6(int[] arr){
        int left=arr[0];
        int right=arr[arr.length-1];
        int idLeft=1;
        int idRight=1;
        for (int i=1;i<arr.length;i++){
            if (right==left && idRight+idLeft==arr.length){
 //               System.out.println("good");
                return true;
            }
            if (right<left){
                right+=arr[arr.length-idRight-1];
                idRight++;
            }
            else if(right>left){
                left+=arr[idLeft];
                idLeft++;
            }
        }
//        System.out.println("bad");
        return false;
    }
    private static void task7(int[]arr,int n){

    }
}

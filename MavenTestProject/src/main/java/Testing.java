import java.util.Arrays;

public class Testing {
    public static void main(String[] arg){
        System.out.println("hi");
    Integer[] arry = {4,6,8};
    Integer[] arrayReverse = new Integer[arry.length];
    String[] str = {"a","b","e","c"};
    for (int i = arry.length-1;i>=0;i--){
        System.out.println(arry[i]);

    }
     String str1 =   Arrays.toString(str);
    Arrays.sort(str);
    Arrays.sort(arry);
    StringBuilder stringBuilder = new StringBuilder(str1);
    stringBuilder.reverse();

    }

}

import java.util.Arrays;

public class PrintArrayWithArrayClassMethods {
    public static void main(String[] args) {
        System.out.println("Java program to print array elements with array class methods");

        String a[] = {"Learn","Coding","Keypoints","Education"};

        System.out.println("toString()" + Arrays.toString(a));

        System.out.println("asList()"+Arrays.asList(a));

        int arr[][] = {{10,20},{30,40}};
        System.out.println("deeptostring()"+Arrays.deepToString(arr));





    }
}

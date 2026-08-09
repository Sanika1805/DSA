import java.util.Arrays;
import java.util.Collections;
public class Inbuild_sort {
    public static void main(String[] args) {
        Integer arr[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr,Collections.reverseOrder());
        System.err.println(Arrays.toString(arr));
    }
}

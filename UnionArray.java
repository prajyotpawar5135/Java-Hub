import java.util.HashSet;
import java.util.Set;

public class UnionArray{
    public static void main(String[] args) {
        int[] a = {5,10,5,15};
        int[] b = {5,10,4};
        unionArrayCount(a, b);
    }
    public static void unionArrayCount(int[] a, int[] b)
    {
        Set<Integer> set =new HashSet<>();
        for(int x : a)
        {
            set.add(x);
        }
        for(int x : b)
        {
            set.add(x);
        }
        //return set.size();
        System.out.println(set);
    }
    
}
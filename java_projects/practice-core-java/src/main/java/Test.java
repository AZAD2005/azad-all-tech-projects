import com.skb.basics.Student;

import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {

   IntPredicate even =  x ->{
     return x % 2 == 0;
    };
        boolean test = even.test(12);
        boolean test1 = even.test(13);

        System.out.println(test);
        System.out.println(test1);



       LongPredicate longPredicate =  y -> {
            return y >= 10000d;
        };
        boolean longpre  = longPredicate.test(12000);
        boolean longpre1  = longPredicate.test(1000);
        System.out.println(longpre);
        System.out.println(longpre1);

    }


}

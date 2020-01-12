import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Reading {
    int year;
    int month;
    int day;
    double value;

    public Reading(int year, int month, int day, double value) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.value = value;
    }


    public static void main(String[] args) {
        List<Reading> readings= Arrays.asList(new Reading(2017, 1, 1, 405.91),
                new Reading(2016, 1, 1, 405.98),
                new Reading(2018, 1, 1, 406.14),
                new Reading(2019, 7, 1, 906.48),
                new Reading(2017, 1, 1, 406.20),
                new Reading(2017, 1, 1, 406.12),
                new Reading(2017, 1, 1, 406.03));
//        System.out.println("Reading is : "+readings.stream().mapToDouble(v->v.value).filter(v -> v >= 406 && v < 407).average().getAsDouble());
        // or check if value is present
        OptionalDouble average = readings.stream().mapToDouble(v -> v.value).filter(v -> v >= 406 && v < 407).average();
        if(average.isPresent()){
            System.out.println("average is : "+average.getAsDouble());
        }
        else
            System.out.println("no values present ");

        /**
         * using max()
         */
        List<Reading> readingMax= Arrays.asList(new Reading(2017, 1, 1, 405.91),
                new Reading(2016, 1, 1, 405.98),
                new Reading(2018, 1, 1, 406.14),
                new Reading(2019, 7, 1, 906.48),
                new Reading(2017, 1, 1, 406.20),
                new Reading(2017, 1, 1, 406.12),
                new Reading(2017, 1, 1, 406.03));
        // max also returns optionaldouble
        OptionalDouble max = readingMax.stream().mapToDouble(v -> v.value).max();
        if(max.isPresent())
            System.out.println(max);
        else
            System.out.println("empty optional");

        /**
         * sum() does not returns Optional
         */
        List<Reading> readingList=Arrays.asList();
        double sum = readingList.stream().mapToDouble(v -> v.value).sum();
        System.out.println("sum is : "+sum);

        // sum without sum method -using DoubleBinaryOperator in reduce
        OptionalDouble reduce = readings.stream().mapToDouble(v -> v.value).reduce((v1, v2) -> (v1 + v2));
        if(reduce.isPresent())
            System.out.println("sum using own reduce : "+reduce.getAsDouble());
        // using another version reduce that takes one more argument i.e : identity
        // If you provide the identity value, you’re providing an initial value for the
        //result of applying the accumulator function, op. The sum is computed by
        //adding values from the stream to this initial value, and when the stream is
        //empty, the identity provides a default result for the sum
        double reduce1 = readings.stream().mapToDouble(v -> v.value).reduce(0.0, (v1, v2) -> (v1 + v2));
        System.out.println("using reduce with identity : "+reduce1);
        
        // average() using reduce ()
        OptionalDouble reduce2 = readings.stream().mapToDouble(v -> v.value).reduce((v1, v2) -> (v1 + v2) / 2);
        if(reduce2.isPresent())
            System.out.println("result of average using reduce : "+reduce2.getAsDouble());
        // The problem is that average()—unlike sum(), max(), and min()—is not
        //associative
        // u can see in o/p that result is diff
        /*Reduction operations must be associative in order to work correctly with
        streams.*/


    }

}

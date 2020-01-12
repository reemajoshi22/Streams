import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        Integer[] myNums={1,2,3,4};
        Stream<Integer> stream = Arrays.stream(myNums);
        System.out.println(stream);

        // count number of elements in the stream
        /**
         * count() is a terminal operation.
         */
        long count = stream.count();
        System.out.println("Number of elements in the stream are : "+count);

        // we can't perform anymore operations on the stream after count
        // as stream is converted into one single number.

        /**
         * Intermediate operations
         */
        Integer[] myNum={1,2,3,4};
        Stream<Integer> streamOfInteger = Arrays.stream(myNum);
        // filter method takes a predicate
        long countAfterFilterGreaterThan1 = streamOfInteger.filter(integer -> integer > 1).count();
        System.out.println("After filter count : "+countAfterFilterGreaterThan1);

        //stream from map- as we know map doesnot inherit from collection
        // so we need to use entry set to convert it inti set

        Map<String,Integer> stringIntegerMap=new HashMap<String, Integer>();
        stringIntegerMap.put("reema",1);
        stringIntegerMap.put("riya",2);
        stringIntegerMap.put("ronit",3);
        stringIntegerMap.put("kartik",4);
        System.out.println(" Stream from Map : "+stringIntegerMap.entrySet().stream().filter(v->v.getValue()>1).count());

        /**
         * Create Stream using Stream.of();
         */
        Integer[] streamOf={1,2,3,4};
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);

        /**
         * Create Stream using an Array.
         */
        String[] strings={"reema","riya","ronit"}; // make an array
        Stream<String> streamOfStringArray = Arrays.stream(strings);
        System.out.println("Count of string in stream"+streamOfStringArray.count());
        // another way to create stream from array is using Stream.of()
        String[] dogs={"a","b","c"}; // make an array
        Stream<String> stringStream=Stream.of(dogs);

        /**
         * Create Stream using File.
         */

        try {
            Stream<String> lines = Files.lines(Paths.get("C:/Users/Fujitsu/Documents/samplestreamread.txt"));
            lines.forEach(l-> System.out.println(l));
        } catch (IOException e) {
            e.printStackTrace();
        }
        /**
         * DoubleStream
         * there is a difference between the stream of doubles and doublestream.
         * The first is stream of double objects and second is stream of double values
         */
        DoubleStream doubleStream=DoubleStream.of(123.00,124.67,890.77);

        /**
         * Operating on streams
         */

        List<Integer> integerList=Arrays.asList(1,2,3,4,5,6);
        long result=integerList.stream().map(i->(i*i)).filter(i->(i>20)).count();
        System.out.println("Result is : "+ result);

        // with above code we are ot able to see the numbers
        /**
         * peek() takes a consumer and produces the same o/p.
         * it does not alters the input
         */
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        long count1 = integers.stream().peek(i -> System.out.print(i)).map(i -> (i * i)).filter(i -> (i > 20)).count();
        System.out.println("Count "+ count1);

    }
}

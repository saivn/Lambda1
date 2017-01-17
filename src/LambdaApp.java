import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by sasha on 10.01.2017.
 */
public class LambdaApp {
    static Integer x1=5,
            x2=3;

    static int summ(List<Integer> list, Predicate<Integer> predicat){
        return  list.stream().max(Comparator.naturalOrder()).get();
        //return list.parallelStream().filter(predicat).mapToInt(i->i).sum();
    }
    public static void main(String[] args) {
    /*    Operationable operationable;
        operationable = (x,y) -> x + y;
        System.out.println(operationable.calculate(10,10));

        String[] strings = {"qqww", "qwe", "wq", "qqww"};
        Integer[] integers ={1,2,3,4,5,6};
        List<Integer> list = Arrays.asList(integers);

        System.out.println(summ(list , i-> i>4 ));
*/

//        String[] strings = {"qqww", "qwe", "wq", "qqww"};
        Integer[] inte = {1, 1, 2, 34,5,44};
        //Arrays.sort(strings, new Compare());
        //Arrays.sort(strings, (o1,o2)->Integer.compare(o1.length(),o2.length()));
  /*      Arrays.sort(inte, (o1,o2)-> o1.compareTo(o2));
        for (Integer string : inte) {
            System.out.println(string);
        }
*/

       // Arrays.sort(strings,
       //            (String o1, String o2)->Integer.compare(o1.length(),o2.length()));


      /*  Runnable runnable = () -> {
            System.out.println("asdasd");
            System.out.println("asdasd");
            System.out.println(x1);

        };
        runnable.run();
        */
/*        Stream.of("dd2", "aa2", "bb1", "bb3", "cc4")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(System.out::println);   ;
*/

  /*      Stream.of("dd2", "aa2", "bb1", "bb3", "cc4")
                .sorted((s1,s2)->{
                    return s1.compareTo(s2);
                })
                .forEach(System.out::println);   ;
*/

        //.anyMatch(s -> {
                //    System.out.println("anyMatch: " + s);
                //   // return s.startsWith("A");
                //});

        // .anyMatch(s -> {
               //     System.out.println("anyMatch: " + s);
                //    return s.startsWith("A");
                //});

        List<Person> persons =
                Arrays.asList(
                        new Person("Andrew", 20),
                        new Person("Igor", 23),
                        new Person("Ira", 2),
                        new Person("Irrra", 3),
                        new Person("Vitia", 12));

        Map<Integer, String> map = persons
                .stream()
                .collect(Collectors.toMap(
                        p -> p.age,
                        p -> p.name,
                        (name1, name2) -> name1 + ";" + name2)
                );

        persons
                .stream()
                .reduce((person, person2) -> person.age> person2.age? person : person2)
                .ifPresent(System.out::println);

        //System.out.println(map);
    }
}

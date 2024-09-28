import com.amol.Person;

import java.io.File;
import java.io.IOException;
import java.util.function.*;

public class Main {

    public static void main(String[] args)  {

//        Predicate<Integer> evenOdd = num-> num%2==0;
//        System.out.println(evenOdd.test(30));
//
//        String[] names = {"Katrina","Karina","Karishma","Komal","Pooja","Alia"};
//        Predicate<String> nameStartWithK = s -> !s.startsWith("K");
//
//        for (String name : names){
//            if (nameStartWithK.test(name))
//                System.out.println(name);
//        }

        Person person1 = new Person("Ajay",32);
        Person person2 = new Person("Vijay",65);

        Predicate <Person> greaterThanEighteen = p-> p.getAge()>18;
        Predicate <Person> lessThanSixty = p-> p.getAge()<60;

//        boolean check = greaterThanEighteen.and(lessThanSixty).test(person1);
//        System.out.println(check);

//        Predicate<Person> predi = greaterThanEighteen.or(lessThanSixty);
//
//        boolean personEligible = Person.isPersonEligible(person1, predi);
//        System.out.println(personEligible);

//        BiPredicate<String,Integer> checkLength = (x,y)-> x.length()==y;
//
//        System.out.println(checkLength.test("Amol",5));


//        Consumer
//        Consumer<String> consumer1 = p-> System.out.println("Hello"+p);
//        Consumer<String> consumer2 = arg -> System.out.println("what about you?");
//        consumer1.andThen(consumer2).accept("My name is Amol");

//         BiConsumer

//        BiConsumer<Integer,Integer> sum = (num1, num2) -> System.out.println(num1+num2);
//        sum.accept(50,100);

//        Supplier

        Supplier<String> supplier = () -> {
            StringBuilder otp = new StringBuilder("");
            for(int i=1;i<=5;i++){
                otp.append((int) Math.random()*10);
            }
            return otp.toString();
        };
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());



//        Function
//        Function<String, Integer> lengthOfString = s->s.length();
//        Integer length = lengthOfString.apply("Amol");
//        System.out.println(length);

//        BiFunction
//        BiFunction<Integer,Integer,Integer> add = (num1, num2)-> num1+num2;
//
//        Integer sum = add.apply(10, 30);
//        System.out.println(sum);

    }
}
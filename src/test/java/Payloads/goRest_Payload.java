package Payloads;

import Utills.RandomDataGenerator;
import Utills.RandomDataTypeNames;
import net.datafaker.Faker;
import pojo.GoRest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

public class goRest_Payload {
    public static Faker faker = new Faker();
    public static Map<String, Object> payLoadGoRest(String name , String gender, String email, String status)
    {
        Map<String, Object> body = new HashMap<>() ;
        body.put("name" , name);
        body.put("gender" , gender);
        body.put("email", email);
        body.put("status", status) ;

        return body ;

    }

    public static Map<String, Object> updatPayLoadGoRest(String name , String email, String status, String gender)
    {
        Map<String, Object> body = new HashMap<>() ;
        body.put("name" , name);
        body.put("email", email);
        body.put("status", status) ;
        body.put("gender", gender);

        return body ;

    }

    public static Map<String, Object> updatPayLoadGoRest()
    {
        Map<String, Object> body = new HashMap<>() ;
        body.put("name" , RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.NAME));
        body.put("email", RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.EMAIL));
        body.put("status", RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.NAME));

        return body ;

    }

    public static GoRest getPayloadForGoRest()
    {
        return  GoRest.builder()
                    .name(RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.NAME))
                    .email(RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.EMAIL))
                    .status(Stream.of("active", "pending", "sold").findAny().get()
                    ).gender(Stream.of("male", "female").findAny().get()).build();





    }

    public static Map<String, Object> updatPayLoadGoRest_1()
    {

        Map<String, Object> body = new HashMap<>() ;
        body.put("name" , faker.name().firstName());
        body.put("email", faker.name().firstName()+"@email.com");
        body.put("status", Stream.of("active" , "pending" , "sold").findAny().get());
        //body.put("gender", Stream.of("male" , "female" , "other").findAny().get());
        return body ;

    }

    public static Map<String, Object> updatPayLoadGoRest_Faker()
    {
        Map<String, Object> body = new HashMap<>() ;
        body.put("name" , faker.name().firstName());
        body.put("email", faker.name().firstName()+"@email.com");
        body.put("status", Arrays.asList("active" , "pending" , "sold").get(new Random().nextInt(3))) ;
        body.put("gender", Arrays.asList("male" , "female").get(new Random().nextInt(2)));

        return body ;

    }


}

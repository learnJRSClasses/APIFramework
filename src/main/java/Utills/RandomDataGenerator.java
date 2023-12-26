package Utills;

import com.google.gson.internal.Streams;
import net.datafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.stream.Stream;

public class RandomDataGenerator {

    public static Faker faker = new Faker();

    public static String getRandomDataFor(RandomDataTypeNames dataTypesNames) {
        switch (dataTypesNames) {
            case NAME:
                return faker.name().firstName();
            case EMAIL:
                return faker.name().firstName()+"@gmail.com";
            case STATUS:
                return faker.name().fullName();
            case GENDER:
                return Stream.of("male", "female").findAny().get() ;

            default:
                return "Data type name not available";
        }
    }

    public static String getRandomNumber(int count) {
        return faker.number().digits(count);
    }

    public static int getRandomNumber(int min, int max) {
        return faker.number().numberBetween(min, max);
    }

    public static String getRandomAlphabets(int count) {
        return RandomStringUtils.randomAlphabetic(count);
    }

    public static String getRandomWebsiteName() {
        return "https://" + RandomDataGenerator.getRandomAlphabets(10) + ".com";
    }
}

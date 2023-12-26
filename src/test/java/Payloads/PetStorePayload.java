package Payloads;

import net.datafaker.Faker;
import pojo.PetStore;

public class PetStorePayload {
    public static Faker faker = new Faker();
    public static PetStore petStoreBody()
    {

        return PetStore.builder().username(faker.name().username())
                .firstname(faker.name().firstName())
                .lastanme(faker.name().lastName())
                .email(faker.internet().emailAddress())
                .phone(faker.phoneNumber().cellPhone())
                .password(faker.internet().password())
                .build();
    }
}

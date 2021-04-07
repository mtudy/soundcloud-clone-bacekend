package io.mtudy.soundcloud;

import com.github.javafaker.Faker;

import java.util.Locale;

public interface WithFaker {
    Faker faker = new Faker(Locale.KOREA);
}

package com.camunda.services;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class HeartofGold {

    private String[] sideEffects = {
            "The creation, and spontaneous upending, of a million-gallon vat of custard",
            "The transformation of a pair of guided nuclear missiles into a sperm whale and a bowl of petunias",
            "Redesigning the interior of the Heart of Gold",
            "Turning Ford Prefect into a penguin",
            "Causing Arthur Dent to temporarily lose three of his limbs",
            "Transforming the desert world of Kakrafoon into an incredibly habitable oasis during a Disaster Area concert",
            "Ridding the people of Kakrafoon of their telepathy during the same concert and allowing for the discovery of Magrathea by Zaphod Beeblebrox"
    };

    public String infiniteImprobabilityDrive()
    {
        Random random = new Random();
        return sideEffects[random.nextInt(0, sideEffects.length)];
    }

}

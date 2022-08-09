package ru.msaggik.spring;

import org.springframework.stereotype.Component;

@Component("someRockMusic") // создание бина к классу с id someRockMusic
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Earthlings Grass near the house";
    }
}

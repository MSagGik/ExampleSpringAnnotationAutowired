package ru.msaggik.spring;

import org.springframework.stereotype.Component;

@Component // создание бина к классу с id techno
public class Techno implements Music{
    @Override
    public String getSong() {
        return "Daft Punk Outlands";
    }
}
package ru.shipova.iteco_spring_homework.model;

import lombok.Getter;

@Getter
public class ExternalInfo {
    Integer id;
    String info;

    public ExternalInfo(Integer id, String info) {
        this.id = id;
        this.info = info;
    }
}

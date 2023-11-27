package ru.shipova.iteco_spring_homework.service;

import ru.shipova.iteco_spring_homework.model.ExternalInfo;

public interface Process {
    boolean run(ExternalInfo externalInfo);
}

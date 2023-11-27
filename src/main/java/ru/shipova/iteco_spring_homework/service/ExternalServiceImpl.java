package ru.shipova.iteco_spring_homework.service;

import org.springframework.stereotype.Component;
import ru.shipova.iteco_spring_homework.model.ExternalInfo;

import java.util.HashMap;
import java.util.Map;

@Component
public class ExternalServiceImpl implements ExternalService {

    private final Map<Integer, ExternalInfo> externalInfoMap = new HashMap<>();

    private Integer id;

    @Override
    public ExternalInfo getExternalInfo(Integer id) {
        return externalInfoMap.get(id);
    }
}

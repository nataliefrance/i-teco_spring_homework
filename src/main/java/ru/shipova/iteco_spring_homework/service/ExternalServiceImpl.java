package ru.shipova.iteco_spring_homework.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.shipova.iteco_spring_homework.model.ExternalInfo;

import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class ExternalServiceImpl implements ExternalService {

    private final Map<Integer, ExternalInfo> externalInfoMap = new HashMap<>();

    private Integer id;

    @Override
    public ExternalInfo getExternalInfo(Integer id) {
        return externalInfoMap.get(id);
    }

    @PostConstruct //Действие при инициализации
    public void init() {
        externalInfoMap.put(1, new ExternalInfo(1, "hasInfo"));
        externalInfoMap.put(2, new ExternalInfo(2, null));
        externalInfoMap.put(3, new ExternalInfo(3, "info"));
        externalInfoMap.put(4, new ExternalInfo(4, "information"));
    }

    @PreDestroy //Действие перед закрытием контекста
    public void destroy() {
        log.info("Map before destroy method: {}", externalInfoMap);
        externalInfoMap.clear();
        log.info("Map after destroy method: {}", externalInfoMap);
    }
}

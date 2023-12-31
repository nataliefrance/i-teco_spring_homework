package ru.shipova.iteco_spring_homework.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.shipova.iteco_spring_homework.model.ExternalInfo;

@Component
@Slf4j
public class Flow {

    private ExternalService externalService;
    private Process process;

    public Flow(ExternalService externalService, Process process) {
        this.externalService = externalService;
        this.process = process;
    }
    public void run(Integer id) {
        ExternalInfo externalInfo = externalService.getExternalInfo(id);
        if (externalInfo.getInfo() != null) {
            process.run(externalInfo);
        } else {
            log.info("Flow: External info is null: {}", externalInfo);
        }
    }
}

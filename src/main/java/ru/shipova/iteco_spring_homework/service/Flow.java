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

    //Метод run должен вызывать ExternalServiceImpl.getExternalInfo(id),
    // далее должна быть проверка полученного ExternalInfo:
    // если info != null, то вызов ExternalInfoProcess.run(ExternalInfo),
    // иначе логгируем ExternalInfoProcess.getClass().
    public void run(Integer id) {
        ExternalInfo externalInfo = externalService.getExternalInfo(id);
        if (externalInfo.getInfo() != null) {
            process.run(externalInfo);
        } else {
            log.info("Flow: External info is null: {}", externalInfo);
        }
    }
}

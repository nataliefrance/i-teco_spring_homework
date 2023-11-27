package ru.shipova.iteco_spring_homework.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import ru.shipova.iteco_spring_homework.model.ExternalInfo;

@Slf4j
public class ExternalInfoProcess implements Process {

    @Value("${id-not-process}")
    private Integer id;

    //Метод run должен: если externalInfo.id == id-not-process,
    // то возвращает false, иначе true (Добавить логи).
    @Override
    public boolean run(ExternalInfo externalInfo) {
        if (id.equals(externalInfo.getId())) {
            log.info("ExternalInfoProcess: id is equal {}", externalInfo);
            return false;
        }
        log.info("ExternalInfoProcess: id is not equal {}", externalInfo);
        return true;
    }
}

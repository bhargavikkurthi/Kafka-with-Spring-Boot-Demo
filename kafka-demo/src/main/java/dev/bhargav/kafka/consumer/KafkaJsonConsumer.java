package dev.bhargav.kafka.consumer;

import dev.bhargav.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaJsonConsumer {

    @KafkaListener(topics = "json", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info(format("Consuming the message from json Topic:: %s", student.toString()));
    }
}

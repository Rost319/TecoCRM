package ru.tecocrm.site.synchronizer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.uuid.Generators;

@JsonIgnoreProperties(ignoreUnknown = true)
public record KafkaMessage<T>(String messageId, T messageBody) {
    public KafkaMessage(T messageBody) {
        this(Generators.timeBasedEpochGenerator().generate().toString(),
                messageBody);
    }
}

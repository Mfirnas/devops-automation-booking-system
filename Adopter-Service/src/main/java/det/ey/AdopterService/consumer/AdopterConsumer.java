package det.ey.AdopterService.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class AdopterConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdopterConsumer.class);

    @KafkaListener(topics = "validation", groupId = "myGroup")
    public void consume(String message){
        LOGGER.info(String.format("Message received -> %s", message));
    }
}

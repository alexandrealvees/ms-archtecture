package tron.tech.pixms.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import static tron.tech.pixms.config.RabbitMqConfig.PJ_QUEUE;


@Component
public class PjListener {

    private final Logger logger = LoggerFactory.getLogger(PjListener.class);

    @RabbitListener(queues = PJ_QUEUE)
    public void listen(Message<PixReq> message){
        logger.info("PJ - Message consumed: {}", message);
    }
}

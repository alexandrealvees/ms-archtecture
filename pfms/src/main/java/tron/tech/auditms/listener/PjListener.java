package tron.tech.auditms.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import static tron.tech.auditms.config.RabbitMqConfig.PF_QUEUE;


@Component
public class PjListener {

    private final Logger logger = LoggerFactory.getLogger(PjListener.class);

    @RabbitListener(queues = PF_QUEUE)
    public void listen(Message<PixReq> message){
        logger.info("PF - Message consumed: {}", message);
    }
}

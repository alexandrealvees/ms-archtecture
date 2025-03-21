package tron.tech.pjms.config;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    public static final String PIX_EFETUADO_EXCHANGE = "pix-efetuado";

    @Bean
    public Jackson2JsonMessageConverter jackson2JsonMessageConverter() {

        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public TopicExchange pixEfetuadoExchange() {
        return new TopicExchange(PIX_EFETUADO_EXCHANGE);
    }

}

package com.jas.jms.producer;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * @author Jas
 * @create 2018-04-14 9:21
 **/
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    JmsTemplate jmsTemplate;
    @Autowired
    ActiveMQQueue activeMQQueue;

    @Override
    public void sendMessage(final String message) {
       jmsTemplate.send(activeMQQueue, new MessageCreator() {
           @Override
           public Message createMessage(Session session) throws JMSException {
               TextMessage textMessage = session.createTextMessage(message);
               return textMessage;
           }
       });
        System.out.println("消息已发送：" + message);
    }
}

package com.test5;

import org.springframework.stereotype.Component;

interface MessageService {
    public void sendMsg(String name);
}
@Component
class EmailService implements MessageService{
    @Override
    public void sendMsg(String message) {
        System.out.println(message);
    }
}
@Component
class SmsService implements MessageService {
    @Override
    public void sendMsg(String message) {
        System.out.println(message);
    }
}
interface MessageProcessor {
    public void processMsg(String message);
}
@Component
class MessageProcesserImpl implements MessageProcessor {
    @Override
    public void processMsg(String message) {
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

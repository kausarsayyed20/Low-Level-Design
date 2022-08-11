package Mock_Interview.service;

import Mock_Interview.handlers.TopicHandler;
import Mock_Interview.model.Message;
import Mock_Interview.model.Topic;
import Mock_Interview.model.TopicSubscriber;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Queue {
    Topic topic;
    ISubscriber subscriber;
    TopicHandler topicHandler;
    Map<String, TopicHandler> topicProcessor;
    //id,subscriber

    //createTopic
    //createsubscriber
    //createpublisher

    public Queue(){
        topicProcessor = new HashMap<>();
    }
    public Topic createTopic(String topicName)
    {
        Topic topic = new Topic(topicName, UUID.randomUUID().toString());
        TopicHandler topicHandler=new TopicHandler(topic);
        topicProcessor.put(topic.getTopicId(),topicHandler);
        System.out.println("Created topic"+ topicName);
        return topic;
    }

    public void subscriber(Topic topic, ISubscriber subscriber)
    {
        topic.addSubscriber(new TopicSubscriber(subscriber));
        System.out.println(subscriber.getId()+" Subscriber added to topic "+topic.getTopicName());
    }

    public void publish(Topic topic, Message message)
    {
        System.out.println(message.getMsg());
        topic.addMessage(message);
        System.out.println("publishing..");
        //addmsg to topic and notify to all the subscriber
       // System.out.println(topicProcessor);
        new Thread(()-> topicProcessor.get(topic.getTopicId()).publish()).start();
    }
}

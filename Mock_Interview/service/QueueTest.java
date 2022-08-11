package Mock_Interview.service;

import Mock_Interview.NormalSubscriber;
import Mock_Interview.handlers.TopicHandler;
import Mock_Interview.model.Message;
import Mock_Interview.model.Topic;
import Mock_Interview.model.TopicSubscriber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

class QueueTest {

    Queue queue=new Queue();
    @Test
    void createTopicTest() {
        Topic topic =new Topic("t1", UUID.randomUUID().toString());
        Topic topic2 =new Topic("t2", UUID.randomUUID().toString());
        TopicHandler topicHandler=new TopicHandler(topic);
        queue.createTopic(topic.getTopicName());
        queue.createTopic(topic2.getTopicName());
        Assertions.assertFalse(queue.topicProcessor.isEmpty());
        Assertions.assertEquals(2,queue.topicProcessor.size());
    }

    @Test
    void subscriber() {
        Topic topic = queue.createTopic("T1");
        NormalSubscriber sub1 = new NormalSubscriber("sub1");
        System.out.println(sub1.getId());
        NormalSubscriber sub2 = new NormalSubscriber("sub2");
        Message message = new Message("m1");
        queue.subscriber(topic, sub1);
        System.out.println(sub2.getId());
        List<TopicSubscriber> sub = topic.getSubscribers();
        //System.out.println(TopicSubscriber);
        Assertions.assertFalse(sub.contains(sub2.getId()));
        Assertions.assertFalse(topic.getSubscribers().isEmpty());
        Assertions.assertEquals(message.getMsg(),"m1");
    }

    @Test
    void publish() {

    }
}
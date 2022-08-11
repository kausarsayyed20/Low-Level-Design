package Mock_Interview;

import Mock_Interview.model.Message;
import Mock_Interview.model.Topic;
import Mock_Interview.service.Queue;

public class Main {
    //Topic
    //Message
    //Subscriber
    public static void main(String args[])
    {
        //m1 and m2->T1-> sub1
        System.out.println("Welcome");
        Queue queue = new Queue();
        Topic topic = queue.createTopic("T1");
        Topic topic2 = queue.createTopic("T2");
        NormalSubscriber sub1 = new NormalSubscriber("sub1");
        NormalSubscriber sub2 = new NormalSubscriber("sub2");
        NormalSubscriber sub3 = new NormalSubscriber("sub3");
        queue.subscriber(topic, sub1);
        queue.subscriber(topic, sub2);
        queue.subscriber(topic2, sub3);
        queue.publish(topic, new Message("m1"));
        queue.publish(topic, new Message("m2"));
        queue.publish(topic2, new Message("m3"));
    }

}

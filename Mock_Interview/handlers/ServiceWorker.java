package Mock_Interview.handlers;

import Mock_Interview.model.Message;
import Mock_Interview.model.Topic;
import Mock_Interview.model.TopicSubscriber;
import lombok.SneakyThrows;

public class ServiceWorker implements Runnable{
    Topic topic;
    TopicSubscriber topicSubscriber;
    public ServiceWorker(Topic topic, TopicSubscriber topicSubscriber) {
        this.topicSubscriber = topicSubscriber;
        this.topic = topic;
    }

    //main thread class
    @SneakyThrows
    @Override
    public void run() {
        synchronized (topicSubscriber) {
            System.out.println(topic.getMessages().size());

                while(topic.getMessages().size()==0) {
                    topicSubscriber.wait();
                }
            for (int i = 0; i < topic.getMessages().size(); i++)
            {
                System.out.println("Thread started");
                Message message = topic.getMessages().get(i);
                topicSubscriber.getSubscriber().consume(message);
            }

        }
    }

    public void NotifyToAllSubscriber(){
        synchronized (topicSubscriber){
            topicSubscriber.notify();
        }
    }
}

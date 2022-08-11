package Mock_Interview.handlers;

import Mock_Interview.model.Topic;
import Mock_Interview.model.TopicSubscriber;

import java.util.HashMap;
import java.util.Map;

public class TopicHandler {
    private final Topic topic;
    //every sub will have worker
    Map<String, ServiceWorker> workers;
   // private final TopicSubscriber topicSubscriber;
    public TopicHandler(Topic topic){
        this.topic = topic;
        workers=new HashMap<>();
    }

    public void publish()
    {
        //send to all the subscriber ->topic
        for(TopicSubscriber topicSubscriber : topic.getSubscribers())
        {
            StartPublishing(topicSubscriber);
        }
    }

    public void StartPublishing(TopicSubscriber topicSubscriber)
    {
        String subscriberId = topicSubscriber.getSubscriber().getId();
        if(!workers.containsKey(subscriberId))
        {
            ServiceWorker serviceWorker = new ServiceWorker(topic,topicSubscriber);
            workers.put(subscriberId,serviceWorker);
            new Thread(serviceWorker).start();
        }
        ServiceWorker serviceWorker = workers.get(subscriberId);
        serviceWorker.NotifyToAllSubscriber();
    }

}

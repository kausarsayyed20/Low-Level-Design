package Mock_Interview.model;

import Mock_Interview.service.ISubscriber;

public class TopicSubscriber {
        int id;
        ISubscriber subscriber;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ISubscriber getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(ISubscriber subscriber) {
        this.subscriber = subscriber;
    }
    public TopicSubscriber(ISubscriber subscriber)
    {
        this.subscriber = subscriber;
    }

}

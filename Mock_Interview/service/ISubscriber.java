package Mock_Interview.service;

import Mock_Interview.model.Message;

public interface ISubscriber {
    public String getId();
    public void consume(Message message);
}

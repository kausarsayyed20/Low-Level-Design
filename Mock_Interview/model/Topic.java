package Mock_Interview.model;


import java.util.ArrayList;
import java.util.List;


public class Topic {
    String topicId;
    String topicName;
    Message message;
    List<Message> messages;
    List<TopicSubscriber> subscribers;

    public List<TopicSubscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<TopicSubscriber> subscribers) {
        this.subscribers = subscribers;
    }


    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }





    public Topic(String topicName, String topicId)
    {
        this.topicName = topicName;
        this.topicId = topicId;
        messages = new ArrayList<>();
        subscribers = new ArrayList<>();
    }

    //addSubscriber
    //addMessages
    public void addSubscriber(TopicSubscriber subscriber)
    {
        subscribers.add(subscriber);
    }
    public void addMessage(Message message)
    {
        messages.add(message);
    }


}

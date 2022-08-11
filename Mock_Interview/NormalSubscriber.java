package Mock_Interview;

import Mock_Interview.model.Message;
import Mock_Interview.service.ISubscriber;

import java.time.LocalDateTime;

public class NormalSubscriber implements ISubscriber {

    String sub;

    public NormalSubscriber(String sub1) {
        this.sub = sub1;

    }

    @Override
    public String getId() {

        return sub;
    }

    @Override
    public void consume(Message message) {
        System.out.println(sub+" subscriber consume msg "+ message.getMsg() + " Time: "+ LocalDateTime.now().toString());
    }
}

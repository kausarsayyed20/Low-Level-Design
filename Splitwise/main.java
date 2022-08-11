import commands.CommandFactory;
import models.InteractiveMode;
import service.Splitwise;

public class main {
    public static void main(String args[]){
        Splitwise splitwise =new Splitwise();
        CommandFactory commandFactory = new CommandFactory(splitwise);
        InteractiveMode interactiveMode =new InteractiveMode().process();

    }
}

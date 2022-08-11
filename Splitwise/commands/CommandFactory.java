package commands;

import models.OperationEnums;
import service.Splitwise;

import java.util.HashMap;
import java.util.Map;
import java.util.Spliterator;

public class CommandFactory {
        static Map<String,IMainController> commands = new HashMap<>();
        public CommandFactory(Splitwise splitwise){
                commands.put(OperationEnums.EQUALS.getValue(), new EqualsController(splitwise));
                commands.put(OperationEnums.EXACT.getValue(), new ExactController(splitwise));
                commands.put(OperationEnums.PERCENTAGE.getValue(), new PercentageController(splitwise));
        }
       public static IMainController getCommand(String input){
                System.out.println(commands);
                IMainController mainController = commands.get(input);
                return mainController;
       }
}

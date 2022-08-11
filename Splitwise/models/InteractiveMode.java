package models;

import commands.CommandFactory;
import commands.IMainController;

import java.util.Scanner;

public class InteractiveMode {

    public InteractiveMode(){

    }

    public InteractiveMode process(){
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            String input = sc.nextLine();
            if(input.equals("EQUALS") || input.equals("EXACT") || input.equals("PERCENTAGE"))
            {
                System.out.println("call1");
                IMainController iMainController = CommandFactory.getCommand(input);
                iMainController.execute();
            }
        }
    }
}

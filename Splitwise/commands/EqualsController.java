package commands;

import service.Splitwise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EqualsController implements IMainController{
    public EqualsController(Splitwise splitwise) {
    }

    @Override
    public void execute() {
        System.out.println("Equals");
        Scanner sc =new Scanner(System.in);
        String mainUser= "u1";
       // String users = "u1 u2 u3 u4";
        int total_amount = 1000;
        int totaluser = 4;
        String strs[] = {"u1","u2","u3","u4"};
        List<String> userslist= new ArrayList<>();

        for(int i=0;i<strs.length;i++)
        {
            userslist.add(strs[i]);
        }
        System.out.println(userslist);
        Map<String, Map<String, Integer>> map= Splitwise.equals(mainUser, total_amount,totaluser,userslist);
        System.out.println(map);
    }
}

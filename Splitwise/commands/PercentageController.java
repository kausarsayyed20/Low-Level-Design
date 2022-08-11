package commands;

import service.Splitwise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PercentageController implements IMainController{
    public PercentageController(Splitwise splitwise) {
    }

    @Override
    public void execute() {
        String mainUser= "u4";
        // String users = "u1 u2 u3 u4";
        int total_amount = 1250;
        int totaluser = 4;
        String strs[] = {"u1","u2","u3","u4"};
        List<String> userslist= new ArrayList<>();

        for(int i=0;i<strs.length;i++)
        {
            userslist.add(strs[i]);
        }

        int exact_amount[] = {40,20,20,20};
        List<Integer> exactAmountList = new ArrayList<>();

        for(int i=0;i<exact_amount.length;i++)
        {
            exactAmountList.add(exact_amount[i]);
        }
        System.out.println(userslist);
        Map<String, Map<String, Integer>> map= Splitwise.percentage(mainUser, total_amount,totaluser,userslist,exactAmountList);
        System.out.println(map);
    }
}

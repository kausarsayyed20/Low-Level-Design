package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Splitwise {

    static Map<String,Map<String,Integer>> owes;
    static Map<String,Integer> users_money;
    public Splitwise(){
        users_money = new HashMap<>();
        owes=new HashMap<>();
        users_money.put("u1", 1000);
        users_money.put("u2", 1000);
        users_money.put("u3", 1000);
        users_money.put("u4", 1000);
    }

    public static Map<String, Map<String, Integer>> equals(String mainUser, int total_amount, int totaluser, List<String> users) {
       // users_money.put(mainUser, users_money.getOrDefault(mainUser,0)-total_amount);
        int equal_partition = total_amount /totaluser;
        for(int i=0;i<users.size();i++)
        {
//            if(owes.get(mainUser).containsKey(users.get(i)))
//            {
//                int amount = owes.get(mainUser).get(users.get(i));
//                owes.put(users.get(i),new HashMap<>(){{put(mainUser,Math.abs(amount-equal_partition));}});
//            }
            System.out.println("user: "+users.get(i));
            if(!users.get(i).equals(mainUser)){
                if(owes.containsKey(users.get(i)))
                {
                    int amount = owes.get(users.get(i)).get(mainUser);
                    owes.put(users.get(i),new HashMap<>(){{put(mainUser,amount+equal_partition);}});
                }
                else{
                    owes.put(users.get(i),new HashMap<>(){{put(mainUser,equal_partition);}});
                }
            }

        }
        System.out.println(users_money);
        return owes;
    }

    public static Map<String, Map<String, Integer>> exact(String mainUser, int total_amount, int totaluser, List<String> userslist, List<Integer> exactAmountList) {
        users_money.put(mainUser, users_money.getOrDefault(mainUser,0)-total_amount);
        int k=0;
        for(int i=0;i<userslist.size();i++)
        {

//            if(owes.get(mainUser).containsKey(userslist.get(i)))
//            {
//                int amount = owes.get(mainUser).get(userslist.get(i));
//                int exactAmt= exactAmountList.get(i);
//                owes.put(userslist.get(i),new HashMap<>(){{put(mainUser,Math.abs(amount-exactAmt));}});
//            }
                if(!userslist.get(i).equals(mainUser)){
                    if(owes.containsKey(userslist.get(i)))
                    {
                        int amount = owes.get(userslist.get(i)).get(mainUser);
                        int exactAmt= exactAmountList.get(k++);
                        owes.put(userslist.get(i),new HashMap<>(){{put(mainUser,amount+exactAmt);}});
                    }
                    else{
                        int exactAmt= exactAmountList.get(k++);
                        owes.put(userslist.get(i),new HashMap<>(){{put(mainUser,exactAmt);}});
                    }
                }
        }
        return owes;
    }

    public static Map<String, Map<String, Integer>> percentage(String mainUser, int total_amount, int totaluser, List<String> userslist, List<Integer> exactAmountList) {
        System.out.println(owes.get(mainUser));
        users_money.put(mainUser, users_money.getOrDefault(mainUser,0)-total_amount);
        int k=0;
        for(int i=0;i<userslist.size();i++)
        {

//            if(owes.get(mainUser).containsKey(userslist.get(i)))
//            {
//                int amount = owes.get(mainUser).get(userslist.get(i));
//                int exactAmt= exactAmountList.get(i);
//                owes.put(userslist.get(i),new HashMap<>(){{put(mainUser,Math.abs(amount-exactAmt));}});
//            }
            if(!userslist.get(i).equals(mainUser)){
                if(owes.containsKey(userslist.get(i)))
                {
                    int amount = owes.get(userslist.get(i)).get(mainUser);
                    //int exactAmt= ((exactAmountList.get(i)/total_amount) * 100);
                    int exactAmt = (exactAmountList.get(k++) % total_amount)*100;
                    owes.put(userslist.get(i),new HashMap<>(){{put(mainUser,amount+exactAmt);}});
                }
                else{
                    int exactAmt = (exactAmountList.get(k++) % total_amount)*100;
                    owes.put(userslist.get(i),new HashMap<>(){{put(mainUser,exactAmt);}});
                }
            }
        }
        return owes;
    }
}

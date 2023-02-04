package sch_norm;

import java.util.ArrayList;

public class Solutions {
    private ArrayList<Data> Datas=new ArrayList();
    public Solutions(ArrayList<Data> _data){
        Datas=_data;
    }
    public void NumbersOfDataLines(){
        System.out.println("3. feladat: "+Datas.size());
    }
    public void HungarianSucces(){
        System.out.println("4. feladat: Magyar nagydíj helyezései:");
        for(var item :Datas){
            if ((item.Grandprix.equals("Hungarian Grand Prix"))&& (item.Position>0)) {
                System.out.println("\t"+item.Date+" : "+item.Position+". hely");
            }
        }
    }
    public void Defeat(){
        ArrayList<String>Errors=new ArrayList<String>();
        for(var item :Datas){
            if (item.Position==0) {
                if (!Errors.contains(item.Status)) {
                    Errors.add(item.Status);
                }
            }
        }
        for(var item :Errors){
            int i=0;
            for(var item2 :Datas){
                if (item2.Status.equals(item)) {
                    i++;
                }
            }
            if (i>2) {
               System.out.println(item+" : "+i);
            }
        }
    }
}

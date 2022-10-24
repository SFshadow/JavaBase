package java2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    private  String no;

    public EmployeeData(String no) {
        this.no = no;
    }



    public static List<EmployeeData> getData(){
        List<EmployeeData> list=new ArrayList<>(100);
        for(int i=0;i<10;i++){
            list.add(new EmployeeData(String.valueOf(i)));
        }
        return list;
    }


}

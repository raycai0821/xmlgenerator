package entity;

/**
 * @author leifeng.cai
 * @description
 * @time: 2020/9/17 10:21
 **/

public class HeadsEntity {

    String headName;

    public String toRow(){
        return String.format(headName);
    }
}


package edu.buaa.park;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: software
 * Date: 12-12-2
 * Time: 下午3:48
 * To change this template use File | Settings | File Templates.
 */
public class MaxKongZhiLvLotChooser implements ParkingLotChooser {
    public  ParkPlace getAvailablePark(List<ParkPlace> parkPlaceList){
        double maxKongzhilv=0;
        double Kongzhilv=0;
        int maxsizeIndex = 0;
        for(int i=1;i< parkPlaceList.size();i++){
            Kongzhilv = parkPlaceList.get(i).getAvailableNum()/parkPlaceList.get(i).getCapacity();
            if( maxKongzhilv < Kongzhilv)
            {
                maxsizeIndex=i;
                maxKongzhilv = Kongzhilv;
            }
        }
        if(parkPlaceList.get(maxsizeIndex).getAvailableNum()==0)throw new ParkFullException("所有的停车场都已满");
        return   parkPlaceList.get(maxsizeIndex);

    }

}

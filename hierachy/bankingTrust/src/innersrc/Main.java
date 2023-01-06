package innersrc;

import innersrc.assets.landAssets;

public class Main {

    public static void main(String[] args){
        System.out.println("hey");
        landAssets mountRushmore = new landAssets();
        mountRushmore.setNameOfAsset("mountRushmore");
        mountRushmore.setDateAcquired("01-20-1880");
        mountRushmore.setLocationOfAsset("0.023994702,.094839");
        mountRushmore.setPriceOfAsset(1000000000);
        mountRushmore.setSizeOfLand(10250);
        System.out.println(mountRushmore.assetString());
    }
}

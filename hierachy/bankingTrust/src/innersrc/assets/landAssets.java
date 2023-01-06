package innersrc.assets;

public class landAssets extends assetsAbstr{

    public Integer sizeOfLand;

    //cannot rename the nameOfLandsAsset
    @Override
    public void setNameOfAsset(String assetName){
    }

    public Integer getSizeOfLand() {
        return sizeOfLand;
    }

    public void setSizeOfLand(Integer sizeOfLand) {
        this.sizeOfLand = sizeOfLand;
    }

    @Override
    public String assetString(){
        return "Name of Asset" + this.getNameOfAsset() + "Date Acquired" + this.getDateAcquired() +
                "Location" + this.getLocationOfAsset() + "Price" + this.getPriceOfAsset() + "Size of Land" + this.getSizeOfLand();
    }
}

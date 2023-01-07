package innersrc.assets;

public abstract class assetsAbstr{

    public String nameOfAsset;
    public String locationOfAsset;
    public Integer priceOfAsset;
    public String dateAcquired;

    public String getNameOfAsset() {
        return nameOfAsset;
    }

    public Integer getPriceOfAsset() {
        return priceOfAsset;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public String getLocationOfAsset() {
        return locationOfAsset;
    }

    public void setPriceOfAsset(Integer priceOfAsset) {
        this.priceOfAsset = priceOfAsset;
    }

    public void setLocationOfAsset(String locationOfAsset) {
        this.locationOfAsset = locationOfAsset;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public void setNameOfAsset(String nameOfAsset) {
        this.nameOfAsset = nameOfAsset;
    }

    public String assetString(){
        return "Name of Asset" + this.getNameOfAsset() + "Date Acquired" + this.getDateAcquired() +
                "Location" + this.getLocationOfAsset() + "Price" + this.getPriceOfAsset();
    }
}

package innersrc.companies;

import innersrc.assets.assetsAbstr;

import java.util.ArrayList;
import java.util.List;

public abstract class companyAbstr {
    public ArrayList<assetsAbstr> assets = new ArrayList<>();

    public String companyName;
    public Double taxRate;
    public String location;

    public Double getTaxRate() {
        return taxRate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<assetsAbstr> getAssets() {
        return assets;
    }

    public void setTaxRate(double rate){
        this.taxRate = rate;
    }

    public void setCompanyName(String company){
        this.companyName = company;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public boolean addAsset(assetsAbstr asset){
        if (this.assets.contains(asset)){
            return false;
        }
        else{
            this.assets.add(asset);
            return true;
        }
    }
    public boolean removeAsset(assetsAbstr asset){
        if (!this.assets.contains(asset)){
            return false;
        }
        else{
            this.assets.remove(asset);
            return true;
        }
    }



}


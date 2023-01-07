package innersrc.companies;

import java.util.ArrayList;

public class holdingCompany extends companyAbstr{
    public ArrayList<companyAbstr> subcompanies = new ArrayList<>();


    public ArrayList<companyAbstr> getSubcompanies() {
        return subcompanies;
    }

    public boolean addSubcompany(companyAbstr company){
        if (this.subcompanies == null){
            this.subcompanies.add(company);
            return true;
        }
        if (this.companyName.equals(company.getCompanyName())){
            return false;
        } else if (this.subcompanies.contains(company)){
            return false;
        } else {
            this.subcompanies.add(company);
        } return true;
    }

    public boolean subSubcompany(companyAbstr company){
        if (this.subcompanies.contains(company)){
            this.subcompanies.remove(company);
            return true;
        } else {
            return false;
        }
    }
}

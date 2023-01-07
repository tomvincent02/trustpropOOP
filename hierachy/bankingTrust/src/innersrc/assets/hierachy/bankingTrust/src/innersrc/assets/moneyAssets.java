package innersrc.assets;

public class moneyAssets extends assetsAbstr{
    public Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void add(Integer influx){
        this.amount = this.amount + influx;
    }

    public String subtract(Integer debt){
        if (this.amount - debt < 0){
            this.amount = 0;
            return "You owe " + (this.amount - debt);
        }
        else {
            this.amount = this.amount - debt;
            return "you have" + this.amount;
        }
    }
}

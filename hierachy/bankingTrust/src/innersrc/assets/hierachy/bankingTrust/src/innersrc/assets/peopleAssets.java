package innersrc.assets;

public class peopleAssets extends assetsAbstr{
    public boolean alive;

    public Integer debtsOwed;

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void incrementDebtsOwed(){
        this.debtsOwed ++;
    }

    public void decrementDebtsOwed(){
        this.debtsOwed --;
    }

    public Integer getDebtsOwed() {
        return debtsOwed;
    }
}

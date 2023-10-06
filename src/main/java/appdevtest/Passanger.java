package appdevtest;
import java.util.HashMap;

public class Passanger {
    private HashMap<Integer, String> info;

    public Passanger(HashMap<Integer, String> info) {
        this.info = info;
    }

    public HashMap<Integer, String> getInfo() {
        return info;
    }

    public void setInfo(HashMap<Integer, String> info) {
        this.info = info;
    }
}
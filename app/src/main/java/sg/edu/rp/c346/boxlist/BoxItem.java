package sg.edu.rp.c346.boxlist;

/**
 * Created by 16020089 on 23/7/2018.
 */

public class BoxItem {
    private boolean firstcolour;
    private boolean secoundcolour;
    private boolean thridcolour;

    public BoxItem(boolean firstcolour, boolean secoundcolour, boolean thridcolour) {
        this.firstcolour = firstcolour;
        this.secoundcolour = secoundcolour;
        this.thridcolour = thridcolour;
    }

    public boolean isFirstcolour() {
        return firstcolour;
    }

    public void setFirstcolour(boolean firstcolour) {
        this.firstcolour = firstcolour;
    }

    public boolean isSecoundcolour() {
        return secoundcolour;
    }

    public void setSecoundcolour(boolean secoundcolour) {
        this.secoundcolour = secoundcolour;
    }

    public boolean isThridcolour() {
        return thridcolour;
    }

    public void setThridcolour(boolean thridcolour) {
        this.thridcolour = thridcolour;
    }

    @Override
    public String toString() {
        return "BoxItem{" +
                "firstcolour=" + firstcolour +
                ", secoundcolour=" + secoundcolour +
                ", thridcolour=" + thridcolour +
                '}';
    }
}

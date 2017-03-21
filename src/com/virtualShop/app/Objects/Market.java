package com.virtualShop.app.Objects;

/**
 * Created by Zazonga on 21.03.2017.
 */
public class Market {

    private int powerfulNotebookPrice;
    private int lowerNotebookPrice;
    private int hightQualityTV;
    private int lowQualityTV;
    private int popularMP3;
    private int chineseMP3;
    private int hightDpiMonitor;
    private int lowDpiMonitor;

    public Market(int powerfulNotebookPrice, int lowerNotebookPrice, int hightQualityTV, int lowQualityTV, int popularMP3, int chineseMP3, int hightDpiMonitor, int lowDpiMonitor) {
        this.setPowerfulNotebookPrice(powerfulNotebookPrice);
        this.setLowerNotebookPrice(lowerNotebookPrice);
        this.setHightQualityTV(hightQualityTV);
        this.setLowQualityTV(lowQualityTV);
        this.setPopularMP3(popularMP3);
        this.setChineseMP3(chineseMP3);
        this.setHightDpiMonitor(hightDpiMonitor);
        this.setLowDpiMonitor(lowDpiMonitor);
    }

    public Market() {
    }

    public int getPowerfulNotebookPrice() {
        return powerfulNotebookPrice;
    }

    public void setPowerfulNotebookPrice(int powerfulNotebookPrice) {
        this.powerfulNotebookPrice = powerfulNotebookPrice;
    }

    public int getLowerNotebookPrice() {
        return lowerNotebookPrice;
    }

    public void setLowerNotebookPrice(int lowerNotebookPrice) {
        this.lowerNotebookPrice = lowerNotebookPrice;
    }

    public int getHightQualityTV() {
        return hightQualityTV;
    }

    public void setHightQualityTV(int hightQualityTV) {
        this.hightQualityTV = hightQualityTV;
    }

    public int getLowQualityTV() {
        return lowQualityTV;
    }

    public void setLowQualityTV(int lowQualityTV) {
        this.lowQualityTV = lowQualityTV;
    }

    public int getPopularMP3() {
        return popularMP3;
    }

    public void setPopularMP3(int popularMP3) {
        this.popularMP3 = popularMP3;
    }

    public int getChineseMP3() {
        return chineseMP3;
    }

    public void setChineseMP3(int chineseMP3) {
        this.chineseMP3 = chineseMP3;
    }

    public int getHightDpiMonitor() {
        return hightDpiMonitor;
    }

    public void setHightDpiMonitor(int hightDpiMonitor) {
        this.hightDpiMonitor = hightDpiMonitor;
    }

    public int getLowDpiMonitor() {
        return lowDpiMonitor;
    }

    public void setLowDpiMonitor(int lowDpiMonitor) {
        this.lowDpiMonitor = lowDpiMonitor;
    }


}

package com.example.assignment_4;

public class WeatherDetails {
    int Icon;
    String upperBox;
    String lowerBox;
    int Icon2;
    String upperBox2;
    String lowerBox2;

    public void setIcon(int Icon) {
        this.Icon = Icon;
    }

    public void setUpperBox(String upperBox) {
        this.upperBox = upperBox;
    }

    public void setLowerBox(String lowerBox) {
        this.lowerBox = lowerBox;
    }

    public int getIcon() {
        return Icon;
    }

    public String getUpperBox() {
        return upperBox;
    }

    public String getLowerBox() {
        return lowerBox;
    }

    public String getUpperBox2() {
        return upperBox2;
    }

    public void setUpperBox2(String upperBox2) {
        this.upperBox2 = upperBox2;
    }

    public String getLowerBox2() {
        return lowerBox2;
    }

    public void setLowerBox2(String lowerBox2) {
        this.lowerBox2 = lowerBox2;
    }

    public int getIcon2() {
        return Icon2;
    }

    public void setIcon2(int icon2) {
        Icon2 = icon2;
    }

    public WeatherDetails(int Icon, String upperBox, String lowerBox,int Icon2, String upperBox2, String lowerBox2) {
        this.Icon = Icon;
        this.upperBox = upperBox;
        this.lowerBox = lowerBox;
        this.Icon2=Icon2;
        this.upperBox2 = upperBox2;
        this.lowerBox2 = lowerBox2;
    }
}


package com.example.assignment_4;


public class Wind {

    private Double speed;
    private Integer degree;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Wind() {
    }

    /**
     * 
     * @param degree
     * @param speed
     */
    public Wind(Double speed, Integer degree) {
        super();
        this.speed = speed;
        this.degree = degree;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

}

package main.java.com.huawei.entity;

import java.util.Queue;

/**
 * @author 郭世明
 * @date 2019/3/16 18:25
 */
public class CarOnRoad {

    private String roadId;
    private Car car;
    private CarStatus carStatus;
    private String position;
    private int startTime;
    private Queue<String> path;

    public CarOnRoad(String roadId, Car car, CarStatus carStatus, String position, int startTime, Queue<String> path) {
        this.roadId = roadId;
        this.car = car;
        this.carStatus = carStatus;
        this.position = position;
        this.startTime = startTime;
        this.path = path;
    }

    public String getRoadId() {
        return roadId;
    }

    public void setRoadId(String roadId) {
        this.roadId = roadId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public CarStatus getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(CarStatus carStatus) {
        this.carStatus = carStatus;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public Queue<String> getPath() {
        return path;
    }

    public void setPath(Queue<String> path) {
        this.path = path;
    }
}
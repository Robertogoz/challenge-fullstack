package com.leadfinder.challenge.services;

public interface IRobotService {
    String handleCoords(String command);
    void move();
    void turnLeft();
    void turnRight();

    boolean validateCommands(String command);

    void setX(int x);

    void setY(int y);

    void setDirection(char direction);
}

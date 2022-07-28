package com.leadfinder.challenge.services;

import org.springframework.stereotype.Service;

@Service
public class RobotService implements IRobotService {
    private int x = 0;
    private int y = 0;
    private char direction = 'N';

    public String handleCoords(String command) {
        char[] commands = command.toCharArray();
        for(int i=0;i<commands.length;i++) {
            if(Character.compare(commands[i], 'M') == 0 || Character.compare(commands[i], 'm') == 0) {move();}
            else if(Character.compare(commands[i], 'L') == 0 || Character.compare(commands[i], 'l') == 0) {turnLeft();}
            else if(Character.compare(commands[i], 'R') == 0 || Character.compare(commands[i], 'r') == 0) {turnRight();}
        }
        if(x < 0 || x > 4) { throw new Error();}
        if(y < 0 || y > 4) { throw new Error();}

        return "("+ x + "," + y + "," + direction + ")" ;
    }

    public void move(){
        switch (this.direction) {
            case 'N':
                setY(this.y + 1);
                break;

            case 'W':
                setX(this.x - 1);
                break;

            case 'S':
                setY(this.y - 1);
                break;

            case 'E':
                setX(this.x + 1);
                break;
        }
    }

    public void turnLeft(){
        switch (this.direction) {
            case 'N':
                setDirection('W');
                break;

            case 'W':
                setDirection('S');
                break;

            case 'S':
                setDirection('E');
                break;

            case 'E':
                setDirection('N');
                break;
        }
    }

    public void turnRight(){
        char direction = this.direction;
        switch (direction) {
            case 'N':
                setDirection('E');
                break;

            case 'E':
                setDirection('S');
                break;

            case 'S':
                setDirection('W');
                break;

            case 'W':
                setDirection('N');
                break;
        }
    }

    public boolean validateCommands(String command) {
        boolean isValid = true;
        char[] commands = command.toCharArray();
        for(int i = 0; i< commands.length; i++) {
            if(Character.compare(commands[i], 'M') == 0 || Character.compare(commands[i], 'm') == 0) {}
            else if(Character.compare(commands[i], 'L') == 0 || Character.compare(commands[i], 'l') == 0) {}
            else if(Character.compare(commands[i], 'R') == 0 || Character.compare(commands[i], 'r') == 0) {}
            else{
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    public void setX(int x) {
        this.x = x;
    }


    public void setY(int y) {
        this.y = y;
    }


    public void setDirection(char direction) {
        this.direction = direction;
    }
}

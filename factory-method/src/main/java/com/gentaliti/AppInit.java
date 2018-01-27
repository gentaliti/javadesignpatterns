package com.gentaliti;

/**
 * @author Gent Aliti <aliti.genti@gmail.com>
 * */
public class AppInit {
    public static void main(String[] args) {
        GameObstacleFactory factory = new SimpleGameObstacleCreator();
        GameObstacle firstGameObstacle = factory.createGameObstacle(GameObstacleType.ASTEROID);
        GameObstacle secondGameObstacle = factory.createGameObstacle(GameObstacleType.COMET);
        firstGameObstacle.doSomething();
        secondGameObstacle.doSomething();
    }
}

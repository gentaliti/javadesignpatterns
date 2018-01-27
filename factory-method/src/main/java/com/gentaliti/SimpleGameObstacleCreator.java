package com.gentaliti;

/**
 * @author Gent Aliti <aliti.genti@gmail.com>
 * */
public class SimpleGameObstacleCreator implements GameObstacleFactory {
    @Override
    public GameObstacle createGameObstacle(GameObstacleType type) {
        if(type.equals(GameObstacleType.ASTEROID)){
            return new Asteroid();
        }
        else if(type.equals(GameObstacleType.COMET)){
            return new Comet();
        }
        else{
            throw new IllegalArgumentException("Not supported com.gentaliti.GameObstacle Type");
        }
    }
}

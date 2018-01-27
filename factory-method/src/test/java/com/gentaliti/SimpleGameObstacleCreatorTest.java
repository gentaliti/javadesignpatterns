package com.gentaliti;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/*
 * @author Gent Aliti <aliti.genti@gmail.com>
 */
public class SimpleGameObstacleCreatorTest {

    private GameObstacleFactory factory;

    @Before
    public void setup(){
        factory = new SimpleGameObstacleCreator();
    }

    @Test
    public void createGameObstacle() throws Exception {
        GameObstacle gameObstacle = factory.createGameObstacle(GameObstacleType.ASTEROID);
        assertNotNull(gameObstacle);
        assertNotSame(new Comet(), gameObstacle);
    }

    @Test
    public void createComet() throws Exception {
        GameObstacle gameObstacle = factory.createGameObstacle(GameObstacleType.COMET);
        assertNotNull(gameObstacle);
        assertNotSame(new Asteroid(), gameObstacle);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createGameObstacleException() throws Exception {
        GameObstacle gameObstacle = factory.createGameObstacle(GameObstacleType.UNDEFINED);
        assertNotNull(gameObstacle);
        assertNotSame(new Asteroid(), gameObstacle);
    }

}
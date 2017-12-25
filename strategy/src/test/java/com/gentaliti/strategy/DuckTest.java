package com.gentaliti.strategy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DuckTest {
    FlyStrategy noFly;
    FlyStrategy simpleFly;
    Duck duck;

    @Before
    public void setup(){
        simpleFly = mock(SimpleFly.class);
        duck = new Duck(simpleFly);
    }

    @Test
    public void testFly(){
        duck.fly();
        verify(simpleFly).fly();
    }

}

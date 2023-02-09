package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhLevelAnalyserTest {

    PhLevelAnalyser PhLevel;

    @Before
    public void setUp()  {
        PhLevel = new PhLevelAnalyser();
    }
    @After
    public void tearDown()  {
        PhLevel=null;
    }
    @Test
    public void getPhValueOfWaterForSeven() {
        String actualResult= PhLevel.getPhValueOfWater(7);
        assertEquals("pH value is fine",actualResult);
    }
    @Test
    public void getPhValueOfWaterForEight() {
        String actualResult = PhLevel.getPhValueOfWater(8);
        assertEquals("pH value is fine", actualResult);
    }
    @Test
    public void getPhValueOfWaterForTen() {
        String actualResult = PhLevel.getPhValueOfWater(10);
        assertEquals("pH value is high, partial water change required", actualResult);
    }
    @Test
    public void getPhValueOfWaterForFive() {
        String actualResult = PhLevel.getPhValueOfWater(5);
        assertEquals("pH value is low, partial water change required", actualResult);
    }


}
package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void calculateBonusIfAmount0 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals (actual,expected);
    }

    @Test
    public void calculateBonusIfAmount1 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateBonusIfAmount999 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateBonusIfAmount1001 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateBonusIfAmount1000 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateBonusIfAmount1990 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1990;
        int actual = service.remain(amount);
        int expected = 10;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void calculateBonusIfAmountSum0(){
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void calculateBonusIfAmountSum1(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void calculateBonusIfAmountSum999(){
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void calculateBonusIfAmountSum1001(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void calculateBonusIfAmountSum1000(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected,actual);
    }
}

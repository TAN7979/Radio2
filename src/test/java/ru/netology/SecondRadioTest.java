package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondRadioTest {
    @Test
    public void checkingTheCurrentSecondStation() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(20);
        int expected = 20;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSwitchingCurrentSecondStationUp() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(28);
        radio.next();

        int expected = 29;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchingCheckMaxSecondStation() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(29);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingCheckCurrentSecondStationBottom() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchingCheckMinSecondStation() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 29;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkingTheCurrentSecondVolume() {
        Radio radio = new Radio(30);
        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void switchingCheckCurrentVolumeUp(){
        Radio radio = new Radio(30);
        radio.setCurrentVolume(99);
        radio.increaseVolume();


        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void switchingCheckMaxCurrentVolume(){
        Radio radio = new Radio(30);
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void switchingCheckCurrentVolumeBottom(){
        Radio radio = new Radio(30);
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void switchingCheckMinCurrentVolume(){
        Radio radio = new Radio(30);
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
}


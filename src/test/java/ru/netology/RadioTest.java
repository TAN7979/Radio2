package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void checkingTheCurrentStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void switchingCheckCurrentStationUp(){
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual );

    }

    @Test
    public void switchingCheckMaxStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual );

    }
    @Test
    public void switchingCheckCurrentStationBottom() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void switchingCheckMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void checkingTheCurrentVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual );

    }
    @Test
    public void switchingCheckCurrentVolumeUp(){
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.increaseVolume();


        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual );

    }
    @Test
    public void switchingCheckMaxVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual );

    }
    @Test
    public void switchingCheckCurrentVolumeBottom(){
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual );

    }
    @Test
    public void switchingCheckMinVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual );

    }
}

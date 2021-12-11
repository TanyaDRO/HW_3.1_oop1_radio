package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldInitFieldToZeroValues() {
        Radio radio = new Radio();

        assertEquals(0, radio.getCurrentRadioStationNumber());
        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void shouldIncreaseStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);
        radio.increaseRadioStationNumber();

        assertEquals(1, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldDecreaseStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(1);
        radio.decreaseRadioStationNumber();

        assertEquals(0, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldRollOverRadioStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);
        radio.increaseRadioStationNumber();

        assertEquals(0, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldRollBackRadioStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);
        radio.decreaseRadioStationNumber();

        assertEquals(9, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void checkTopRadioStationsLimit() {
        Radio radio = new Radio();

        int stationNumber = radio.getCurrentRadioStationNumber();
        radio.setCurrentRadioStationNumber(10);

        assertEquals(stationNumber, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void CheckBottomRadioStationsLimit() {
        Radio radio = new Radio();

        int stationNumber = radio.getCurrentRadioStationNumber();
        radio.setCurrentRadioStationNumber(-1);

        assertEquals(stationNumber, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void checkTopVolumeLimit() {
        Radio radio = new Radio();

        int volume = radio.getCurrentVolume();
        radio.setCurrentVolume(11);

        assertEquals(volume, radio.getCurrentVolume());
    }

    @Test
    public void checkBottomVolumeLimit() {
        Radio radio = new Radio();

        int volume = radio.getCurrentVolume();
        radio.setCurrentVolume(-1);

        assertEquals(volume, radio.getCurrentVolume());
    }

}
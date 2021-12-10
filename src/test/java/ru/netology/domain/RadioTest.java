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
    public void shouldChangeRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(8);
        radio.increaseRadioStationNumber();
        assertEquals(9, radio.getCurrentRadioStationNumber());

        radio.increaseRadioStationNumber();
        assertEquals(0, radio.getCurrentRadioStationNumber());

        radio.decreaseRadioStationNumber();
        assertEquals(9, radio.getCurrentRadioStationNumber());

        radio.decreaseRadioStationNumber();
        assertEquals(8, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldChangeVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);
        radio.increaseVolume();
        assertEquals(8, radio.getCurrentVolume());

        radio.decreaseVolume();
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void shouldCheckRadioStationsTop() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);
        assertEquals(0, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldCheckRadioStationsBottom() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-1);
        assertEquals(0, radio.getCurrentRadioStationNumber());
    }


    @Test
    public void shouldCheckVolumeTop() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldCheckVolumeBottom() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
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
        assertEquals(9,radio.getCurrentRadioStationNumber());

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
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());

        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldCheckBoundariesRadioStations() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);
        assertEquals(0,radio.getCurrentRadioStationNumber());

        radio.setCurrentRadioStationNumber(-1);
        assertEquals(0, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldCheckBoundariesVolumes() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

        for (int i = 0; i < 10; i++) {
            radio.increaseVolume();
        }

        assertEquals(10, radio.getCurrentVolume());

        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
}
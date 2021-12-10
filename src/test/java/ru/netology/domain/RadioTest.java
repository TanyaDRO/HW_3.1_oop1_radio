package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldInitFieldToZeroValues() {
        assertEquals(0, radio.getCurrentRadioStationNumber());
        assertEquals(0, radio.getCurrentVolume());
        assertEquals(10, radio.getStationsQuantity());
    }

    @Test
    public void shouldUseParams() {
        Radio radio1 = new Radio(5);
        assertEquals(0, radio1.getCurrentRadioStationNumber());
        assertEquals(0, radio1.getCurrentVolume());
        assertEquals(5, radio1.getStationsQuantity());
    }

    @Test
    public void shouldChangeRadioStation() {
        radio.setCurrentRadioStationNumber(radio.getStationsQuantity() - 1);
        radio.increaseRadioStationNumber();
        assertEquals(0, radio.getCurrentRadioStationNumber());

        radio.increaseRadioStationNumber();
        assertEquals(1, radio.getCurrentRadioStationNumber());

        radio.decreaseRadioStationNumber();
        assertEquals(0, radio.getCurrentRadioStationNumber());

        radio.decreaseRadioStationNumber();
        assertEquals(radio.getStationsQuantity() - 1, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldChangeVolume() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());

        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldCheckRadioStationsTop() {
        int station = radio.getCurrentRadioStationNumber();
        radio.setCurrentRadioStationNumber(radio.getStationsQuantity());
        assertEquals(station, radio.getCurrentRadioStationNumber());
    }

    @Test
    public void shouldCheckRadioStationsBottom() {
        int station = radio.getCurrentRadioStationNumber();
        radio.setCurrentRadioStationNumber(-1);
        assertEquals(station, radio.getCurrentRadioStationNumber());
    }


    @Test
    public void shouldCheckVolumeTop() {
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.setCurrentVolume(radio.getMaxVolume() + 1);
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    public void shouldCheckVolumeBottom() {
        radio.setCurrentVolume(0);
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
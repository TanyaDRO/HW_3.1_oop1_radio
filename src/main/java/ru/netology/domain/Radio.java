package ru.netology.domain;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;

    public void increaseRadioStationNumber() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void decreaseRadioStationNumber() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = 9;
        }
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber > 9) {
            return;
        }
        if (newRadioStationNumber < 0) {
            return;
        }

        this.currentRadioStationNumber = newRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
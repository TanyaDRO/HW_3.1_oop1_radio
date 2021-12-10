package ru.netology.domain;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;
    private int stationsQuantity;
    private int maxVolume = 100;

    public Radio(int stationsQuantity) {
        currentRadioStationNumber = 0;
        currentVolume = 0;
        this.stationsQuantity = stationsQuantity;
    }

    public Radio() {
        currentRadioStationNumber = 0;
        currentVolume = 0;
        stationsQuantity = 10;
    }


    public void increaseRadioStationNumber() {
        if (currentRadioStationNumber < stationsQuantity - 1) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void decreaseRadioStationNumber() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = stationsQuantity - 1;
        }
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber > stationsQuantity - 1) {
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
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getStationsQuantity() {
        return stationsQuantity;
    }

    public int getMaxVolume() {
        return maxVolume;
    }
}
package ru.netology.javaqa;

public class Radio {
    private int currentNumber;
    private int currentVolume;
    private int quantityOfStations = 10;


    public Radio(int quantityOfStations) {
        if (quantityOfStations <= 0) {
            this.quantityOfStations = getQuantityOfStations();
        } else {
            this.quantityOfStations = quantityOfStations;
        }
    }

    public Radio() {
        this.quantityOfStations = getQuantityOfStations();
    }

    public int getQuantityOfStations() {
        return quantityOfStations;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < 0) {
            return;
        }
        if (newCurrentNumber > quantityOfStations - 1) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextNumber() {
        if (currentNumber == quantityOfStations - 1) {
            currentNumber = 0;
        } else {
            currentNumber = currentNumber + 1;
        }
    }

    public void prevNumber() {
        if (currentNumber == 0) {
            currentNumber = quantityOfStations - 1;
        } else {
            currentNumber = currentNumber - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
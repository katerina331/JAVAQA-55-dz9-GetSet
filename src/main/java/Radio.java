
public class Radio {
    int maxRadioStation = 10;
    int numberRadioStation;
    int maxVolumeRadio = 100;
    int volumeRadio;

    public Radio (int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public Radio () {
    }

    public int station() {
        return numberRadioStation;
    }
    public int maxStation() {
        return maxRadioStation;
    }

    public int volume() {
        return volumeRadio;
    }

    public void nextStation() {
        if (numberRadioStation == maxRadioStation-1) {
            numberRadioStation = 0;
            return;
        }
        numberRadioStation++;
    }

    public void prevStation() {
        if (numberRadioStation == 0) {
            numberRadioStation = maxRadioStation-1;
            return;
        }
        numberRadioStation--;
    }

    public void numStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        if (numberStation > maxRadioStation-1) {
            return;
        }
        numberRadioStation = numberStation;
    }

    public void upVolume() {
        if (volumeRadio < maxVolumeRadio) {
            volumeRadio++;
        }
    }

    public void downVolume() {
        if (volumeRadio > 0) {
            volumeRadio--;
        }
    }
}

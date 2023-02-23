public class Radio {
    int numberRadioStation;
    int volumeRadio;

    public int station() {
        return numberRadioStation;
    }

    public int volume() {
        return volumeRadio;
    }

    public void nextStation() {
        if (numberRadioStation == 9) {
            numberRadioStation = 0;
            return;
        }
        numberRadioStation++;
    }

    public void prevStation() {
        if (numberRadioStation == 0) {
            numberRadioStation = 9;
            return;
        }
        numberRadioStation--;
    }

    public void numStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        if (numberStation > 9) {
            return;
        }
        numberRadioStation = numberStation;
    }

    public void upVolume() {
        if (volumeRadio < 10) {
            volumeRadio++;
        }
    }

    public void downVolume() {
        if (volumeRadio > 0) {
            volumeRadio--;
        }
    }
}

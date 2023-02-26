
public class Radio {
    private int amountRadioStation = 10;
    private int numberRadioStation;
    protected int maxVolumeRadio = 100;
    private int volumeRadio;

    public Radio(int newAmountRadioStation) {
        amountRadioStation = newAmountRadioStation;
    }

    public Radio() {
    }

    public int getStation() {
        return numberRadioStation;
    }

    public int getAmountStation() {
        return amountRadioStation;
    }

    public int getVolume() {
        return volumeRadio;
    }

    public void nextStation() {
        if (numberRadioStation == amountRadioStation - 1) {
            numberRadioStation = 0;
            return;
        }
        numberRadioStation++;
    }

    public void prevStation() {
        if (numberRadioStation == 0) {
            numberRadioStation = amountRadioStation - 1;
            return;
        }
        numberRadioStation--;
    }

    public void setNumStation(int numberStation) {
        if (numberStation < 0) return;
        if (numberStation > amountRadioStation - 1) return;
        numberRadioStation = numberStation;
    }

    public void upVolume() {
        if (volumeRadio < maxVolumeRadio) volumeRadio++;
    }

    public void downVolume() {
        if (volumeRadio > 0) volumeRadio--;
    }
}

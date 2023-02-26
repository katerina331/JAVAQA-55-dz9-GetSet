import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void nextStationDefTest() {

        radio.setNumStation(5);

        int expected = 6;
        radio.nextStation();
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMaxDefTest() {

        radio.setNumStation(9);

        int expected = 0;
        radio.nextStation();
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationDefTest() {

        radio.setNumStation(5);

        int expected = 4;
        radio.prevStation();
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMinDefTest() {

        radio.setNumStation(0);

        int expected = 9;
        radio.prevStation();
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numStationDefTest() {

        radio.setNumStation(5);

        int expected = 5;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numStationBigDefTest() {

        radio.setNumStation(5);

        int expected = 5;
        radio.setNumStation(15);
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numStationMinusDefTest() {

        radio.setNumStation(5);

        int expected = 5;
        radio.setNumStation(-5);
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTest() {
        Radio radio = new Radio(7);

        radio.setNumStation(4);

        int expected = 5;
        radio.nextStation();
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMaxTest() {
        Radio radio = new Radio(12);

        radio.setNumStation(11);

        int expected = 0;
        radio.nextStation();
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTest() {
        Radio radio = new Radio(5);

        radio.setNumStation(3);

        int expected = 2;
        radio.prevStation();
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMinTest() {
        Radio radio = new Radio(13);

        radio.setNumStation(0);

        int expected = 12;
        radio.prevStation();
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numStationTest() {
        Radio radio = new Radio(20);

        radio.setNumStation(15);

        int expected = 15;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numStationBigTest() {
        Radio radio = new Radio(12);

        radio.setNumStation(5);

        int expected = 5;
        radio.setNumStation(15);
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numStationMinusTest() {
        Radio radio = new Radio(8);

        radio.setNumStation(5);

        int expected = 5;
        radio.setNumStation(-5);
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationDefTest() {
        Radio radio = new Radio(9);

        int expected = 9;
        int actual = radio.getAmountStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void upVolumeTest() {

        int expected = 1;
        radio.upVolume();
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeMaxTest() {

        int expected = 100;
        for (int i = 1; i < 102; i++) radio.upVolume();
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeMinTest() {

        int expected = 0;
        for (int i = 1; i < 5; i++) radio.upVolume();
        for (int i = 1; i < 7; i++) radio.downVolume();
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeTest() {

        int expected = 3;
        for (int i = 1; i < 5; i++) radio.upVolume();
        radio.downVolume();
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}


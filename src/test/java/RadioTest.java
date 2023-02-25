import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();
    @Test
    public void nextStationDefTest() {

        radio.numStation(5);

        int expected = 6;
        radio.nextStation();
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMaxDefTest() {

        radio.numStation(9);

        int expected = 0;
        radio.nextStation();
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationDefTest() {

        radio.numStation(5);

        int expected = 4;
        radio.prevStation();
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMinDefTest() {

        radio.numStation(0);

        int expected = 9;
        radio.prevStation();
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numStationDefTest() {

        radio.numStation(5);

        int expected = 5;
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numStationBigDefTest() {

        radio.numStation(5);

        int expected = 5;
        radio.numStation(15);
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numStationMinusDefTest() {

        radio.numStation(5);

        int expected = 5;
        radio.numStation(-5);
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStationTest() {
        Radio radio = new Radio(7);

        radio.numStation(4);

        int expected = 5;
        radio.nextStation();
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMaxTest() {
        Radio radio = new Radio(12);

        radio.numStation(11);

        int expected = 0;
        radio.nextStation();
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTest() {
        Radio radio = new Radio(5);

        radio.numStation(3);

        int expected = 2;
        radio.prevStation();
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMinTest() {
        Radio radio = new Radio(13);

        radio.numStation(0);

        int expected = 12;
        radio.prevStation();
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numStationTest() {
        Radio radio = new Radio(20);

        radio.numStation(15);

        int expected = 15;
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numStationBigTest() {
        Radio radio = new Radio(12);

        radio.numStation(5);

        int expected = 5;
        radio.numStation(15);
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numStationMinusTest() {
        Radio radio = new Radio(8);

        radio.numStation(5);

        int expected = 5;
        radio.numStation(-5);
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationDefTest() {
        Radio radio = new Radio(9);

        int expected = 9;
        int actual = radio.maxStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void upVolumeTest() {

        int expected = 1;
        radio.upVolume();
        int actual = radio.volume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeMaxTest() {

        int expected = 100;
        for (int i = 1; i < 102; i++) {
            radio.upVolume();
        }
        int actual = radio.volume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeMinTest() {

        int expected = 0;
        for (int i = 1; i < 5; i++) {
            radio.upVolume();
        }
        for (int i = 1; i < 7; i++) {
            radio.downVolume();
        }
        int actual = radio.volume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeTest() {

        int expected = 3;
        for (int i = 1; i < 5; i++) {
            radio.upVolume();
        }
        radio.downVolume();
        int actual = radio.volume();

        Assertions.assertEquals(expected, actual);
    }
}


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void nextStationTest() {
        Radio radio = new Radio();

        radio.numStation(5);

        int expected = 6;
        radio.nextStation();
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMaxTest() {
        Radio radio = new Radio();

        radio.numStation(9);

        int expected = 0;
        radio.nextStation();
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTest() {
        Radio radio = new Radio();

        radio.numStation(5);

        int expected = 4;
        radio.prevStation();
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMinTest() {
        Radio radio = new Radio();

        radio.numStation(0);

        int expected = 9;
        radio.prevStation();
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numStationTest() {
        Radio radio = new Radio();

        radio.numStation(5);

        int expected = 5;
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numStationBigTest() {
        Radio radio = new Radio();

        radio.numStation(5);

        int expected = 5;
        radio.numStation(15);
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numStationMinusTest() {
        Radio radio = new Radio();

        radio.numStation(5);

        int expected = 5;
        radio.numStation(-5);
        int actual = radio.station();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeTest() {
        Radio radio = new Radio();

        int expected = 1;
        radio.upVolume();
        int actual = radio.volume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeMaxTest() {
        Radio radio = new Radio();

        int expected = 10;
        for (int i = 1; i < 12; i++) {
            radio.upVolume();
        }
        int actual = radio.volume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeMinTest() {
        Radio radio = new Radio();

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
        Radio radio = new Radio();

        int expected = 3;
        for (int i = 1; i < 5; i++) {
            radio.upVolume();
        }
        radio.downVolume();
        int actual = radio.volume();

        Assertions.assertEquals(expected, actual);
    }
}



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Radio;

public class RadioTest {
    // Тест конструктора Radio
    @Test
    public void RadioConstructorQuantityAboveZero() {
        Radio radio = new Radio(20);

        int expected = 20;
        int actual = radio.getQuantityOfStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioConstructorQuantityIsZero() {
        Radio radio = new Radio(0);

        int expected = 10;
        int actual = radio.getQuantityOfStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioConstructorQuantityLessThanZero() {
        Radio radio = new Radio(-10);

        int expected = 10;
        int actual = radio.getQuantityOfStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioConstructorWithDefaultQuantity() {
        Radio radio = new Radio();

        int expected = 10;
        int actual = radio.getQuantityOfStations();

        Assertions.assertEquals(expected, actual);
    }

    // Тесты setCurrentNumber
    @Test
    public void shouldSetNewNumber() {
        Radio newNumber = new Radio();
        int numb = 5;
        newNumber.setCurrentNumber(numb);

//      expected = numb
        int actual = newNumber.getCurrentNumber();

        Assertions.assertEquals(numb, actual);
    }

    @Test
    public void shouldSetNumbZero() {
        Radio newNumber = new Radio();
        int numb = 0;
        newNumber.setCurrentNumber(numb);

//      expected = numb
        int actual = newNumber.getCurrentNumber();

        Assertions.assertEquals(numb, actual);
    }

    @Test
    public void shouldSetNumbMaxDefault() {
        Radio newNumber = new Radio();
        int numb = 9;
        newNumber.setCurrentNumber(numb);

//      expected = numb
        int actual = newNumber.getCurrentNumber();

        Assertions.assertEquals(numb, actual);
    }

    @Test
    public void shouldSetNumbMax() {
        Radio newNumber = new Radio(20);
        int numb = 19;
        newNumber.setCurrentNumber(numb);

//      expected = numb
        int actual = newNumber.getCurrentNumber();

        Assertions.assertEquals(numb, actual);
    }

    @Test
    public void shouldNotSetNumberLessThanZero() {
        Radio newNumber = new Radio();
        int numb = -1;
        newNumber.setCurrentNumber(numb);

        int expected = 0;
        int actual = newNumber.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberAboveMaxDefault() {
        Radio newNumber = new Radio();
        int numb = 10;
        newNumber.setCurrentNumber(numb);

        int expected = 0;
        int actual = newNumber.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberAboveMax() {
        Radio newNumber = new Radio(20);
        int numb = 20;
        newNumber.setCurrentNumber(numb);

        int expected = 0;
        int actual = newNumber.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    // Тесты setCurrentVolume
    @Test
    public void shouldSetNewVolume() {
        Radio newVolume = new Radio();
        int volume = 50;
        newVolume.setCurrentVolume(volume);

//      expected = volume
        int actual = newVolume.getCurrentVolume();

        Assertions.assertEquals(volume, actual);
    }

    @Test
    public void shouldSetVolumeZero() {
        Radio newVolume = new Radio();
        int volume = 0;
        newVolume.setCurrentVolume(volume);

//      expected = volume
        int actual = newVolume.getCurrentVolume();

        Assertions.assertEquals(volume, actual);
    }

    @Test
    public void shouldSetVolumeHundred() {
        Radio newVolume = new Radio();
        int volume = 100;
        newVolume.setCurrentVolume(volume);

//      expected = volume
        int actual = newVolume.getCurrentVolume();

        Assertions.assertEquals(volume, actual);
    }

    @Test
    public void shouldNotSetVolumeLessThanZero() {
        Radio newVolume = new Radio();
        int volume = -1;
        newVolume.setCurrentVolume(volume);

        int expected = 0;
        int actual = newVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveHundred() {
        Radio newVolume = new Radio();
        int volume = 101;
        newVolume.setCurrentVolume(volume);

        int expected = 0;
        int actual = newVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    // Тесты nextNumber
    @Test
    public void shouldChangeMaxDefaultToZero() {
        Radio nextNumber = new Radio();
        int numb = 9;
        nextNumber.setCurrentNumber(numb);

        nextNumber.nextNumber();

        int expected = 0;
        int actual = nextNumber.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeMaxToZero() {
        Radio nextNumber = new Radio(20);
        int numb = 19;
        nextNumber.setCurrentNumber(numb);

        nextNumber.nextNumber();

        int expected = 0;
        int actual = nextNumber.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNumberByOne() {
        Radio nextNumber = new Radio();
        int numb = 4;
        nextNumber.setCurrentNumber(numb);

        nextNumber.nextNumber();

        int expected = numb + 1;
        int actual = nextNumber.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIgnoreNextNumberIfQuantityIsOne() {
        Radio nextNumber = new Radio(1);
        int numb = 0;
        nextNumber.setCurrentNumber(numb);

        nextNumber.nextNumber();

        int expected = 0;
        int actual = nextNumber.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    // Тесты prevNumber
    @Test
    public void shouldChangeZeroToMaxDefault() {
        Radio prevNumber = new Radio();
        int numb = 0;
        prevNumber.setCurrentNumber(numb);

        prevNumber.prevNumber();

        int expected = 9;
        int actual = prevNumber.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeZeroToMax() {
        Radio prevNumber = new Radio(20);
        int numb = 0;
        prevNumber.setCurrentNumber(numb);

        prevNumber.prevNumber();

        int expected = 19;
        int actual = prevNumber.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNumberByOne() {
        Radio prevNumber = new Radio();
        int numb = 6;
        prevNumber.setCurrentNumber(numb);

        prevNumber.prevNumber();

        int expected = numb - 1;
        int actual = prevNumber.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIgnorePrevNumberIfQuantityIsOne() {
        Radio nextNumber = new Radio(1);
        int numb = 0;
        nextNumber.setCurrentNumber(numb);

        nextNumber.nextNumber();

        int expected = 0;
        int actual = nextNumber.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    // Тесты increaseVolume
    @Test
    public void shouldIncreaseVolumeByOne() {
        Radio nextVolume = new Radio();
        int volume = 60;
        nextVolume.setCurrentVolume(volume);

        nextVolume.increaseVolume();

        int expected = volume + 1;
        int actual = nextVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNothingToDoWithHundred() {
        Radio nextVolume = new Radio();
        int volume = 100;
        nextVolume.setCurrentVolume(volume);

        nextVolume.increaseVolume();

        // expected = volume
        int actual = nextVolume.getCurrentVolume();

        Assertions.assertEquals(volume, actual);
    }

    // Тесты decreaseVolume
    @Test
    public void shouldDecreaseVolumeByOne() {
        Radio prevVolume = new Radio();
        int volume = 30;
        prevVolume.setCurrentVolume(volume);

        prevVolume.decreaseVolume();

        int expected = volume - 1;
        int actual = prevVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNothingToDoWithZero() {
        Radio prevVolume = new Radio();
        int volume = 0;
        prevVolume.setCurrentVolume(volume);

        prevVolume.decreaseVolume();

        // expected = volume
        int actual = prevVolume.getCurrentVolume();

        Assertions.assertEquals(volume, actual);
    }
}

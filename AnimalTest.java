// AnimalTest.java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal dog;
    Animal cat;
    Animal fish;

    @BeforeEach
    void setup() {
        dog = new Animal("Buddy", "Dog", true);
        cat = new Animal("Whiskers", "Cat", true);
        fish = new Animal("Goldie", "Fish", false);
    }

    @Test
    void constructor_setsPropertiesCorrectly() {
        assertEquals("Buddy", dog.getName());
        assertEquals("Dog", dog.getSpecies());
        assertTrue(dog.canMakeSound());
    }

    @Test
    void makeSound_returnsCorrectSoundForDog() {
        assertEquals("Woof!", dog.makeSound());
    }

    @Test
    void makeSound_returnsCorrectSoundForCat() {
        assertEquals("Meow!", cat.makeSound());
    }

    @Test
    void makeSound_returnsSilentMessageForSilentAnimal() {
        assertEquals("Goldie is silent.", fish.makeSound());
    }

    @Test
    void makeSound_returnsDefaultForUnknownSpecies() {
        Animal bird = new Animal("Chirpy", "Bird", true);
        assertEquals("Some sound!", bird.makeSound());
    }
}

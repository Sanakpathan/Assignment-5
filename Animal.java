public class Animal {
    private String name;
    private String species;
    private boolean canMakeSound;

    public Animal(String name, String species, boolean canMakeSound) {
        this.name = name;
        this.species = species;
        this.canMakeSound = canMakeSound;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public boolean canMakeSound() {
        return canMakeSound;
    }

    public String makeSound() {
        if (!canMakeSound) {
            return name + " is silent.";
        }
        switch (species.toLowerCase()) {
            case "dog": return "Woof!";
            case "cat": return "Meow!";
            default: return "Some sound!";
        }
    }
}

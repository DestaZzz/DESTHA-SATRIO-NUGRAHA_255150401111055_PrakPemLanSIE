public class NonPlayableChar extends Character {
    public NonPlayableChar(Character ch) {
        this.name = ch.name;
    }

    @Override
    public void doWork() {
        System.out.println(this.name + " is just wandering around...");
    }
}
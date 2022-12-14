package exercises.arrayExercises.challenge.entities;

public class Renter {
    private String name;
    private String email;
    private final int room;

    public Renter(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoom() {
        return room;
    }

    public String toString() {
        return room + ": " + name + ", " + email;
    }
}

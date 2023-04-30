

public class Toy {
    int id;
    String name;
    int volume;
    int weight;

    public String info() {
        return "Toy.info : " +
                "id = " + this.getId() +
                " name = " + this.getName() +
                " volume = " + this.getVolume() +
                " weight " + this.getWeight();
    }

    public Toy() {
    }

    public Toy(int id, String name, int volume, int weight) {
        this.id = id;
        this.name = name;
        this.volume = volume;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

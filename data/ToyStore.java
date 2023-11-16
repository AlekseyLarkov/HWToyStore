package data;

import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private List<Toy> toys;
    private List<Toy> prizeToys;

    public ToyStore() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void setStudents(List<Toy> toys) {
        this.toys = toys;
    }
}

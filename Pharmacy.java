package DrugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy> {

    private String name;
    private List<Component> components;
    private int idx;

    public Pharmacy(String name) {
        this.name = name;
        this.components = new ArrayList<>();
        this.idx = 0;
    }

    public String getName() {
        return name;
    }

    public Pharmacy addComponent(Component item) {
        components.add(item);
        return this;
    }

    public int getInterPower() {
        int interPower = 0;
        for (Component c : components) {
            interPower += (int) (c.getPower() * c.getWeight());
        }
        return interPower;

    }

    public int getFullPower() {
        int fullPower = 0;
        for (Component comp : components) {
            fullPower += comp.getPower();
        }
        return fullPower;
    }

    public int getFullWeight() {
        int fullWeight = 0;
        for (Component comp : components) {
            fullWeight += (int) (comp.getWeight());
        }
        return fullWeight;
    }

    @Override
    public boolean hasNext() {
        return idx < components.size();
    }

    @Override
    public Component next() {
        return components.get(idx++);
    }

    @Override
    public int compareTo(Pharmacy o) {
        return Integer.compare(this.getInterPower(), o.getInterPower());
    }

    @Override
    public String toString() {
        return String.format("\nPharmacy: %s, interPower: %s, total power: %d, total weight: %d", this.getName(), this.getInterPower(), this.getFullPower(), this.getFullWeight());
    }
}

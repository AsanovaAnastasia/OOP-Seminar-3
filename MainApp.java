package DrugStore;

import DrugStore.Components.Penicillin;
import DrugStore.Components.Salt;
import DrugStore.Components.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainApp {
    public static void main(String[] args) {

        final Pharmacy p1 = new Pharmacy("P1");
        p1
                .addComponent((new Penicillin("Component1", 2.0, 10)))
                .addComponent(new Salt("Salt", 10.0, 50))
                .addComponent(new Water("Water", 5.0, 100));

        final Pharmacy p2 = new Pharmacy("P2");
        p2
                .addComponent((new Penicillin("Penicillin", 2.0, 10)))
                .addComponent(new Salt("Salt", 20.0, 70))
                .addComponent(new Water("Water", 5.0, 100));

        final Pharmacy p3 = new Pharmacy("P3");
        p3
                .addComponent((new Penicillin("Penicillin", 2.0, 10)))
                .addComponent(new Salt("Salt", 20.0, 70))
                .addComponent(new Water("Water", 5.0, 100));

        final ArrayList<Pharmacy> pharmacy = new ArrayList<>();
        pharmacy.add(p1);
        pharmacy.add(p2);
        pharmacy.add(p3);

//        Collections.sort(pharmacyIterables);

        Component c1 = new Penicillin("p", 25, 120);
        Component c2 = new Water("w", 25, 34);
        Component c3 = new Salt("s", 25, 1);

        final ArrayList<Component> components = new ArrayList<>();
        components.add(c1);
        components.add(c2);
        components.add(c3);
        components.add(c1);
        System.out.println(components);
        Collections.sort(components, Comparator.reverseOrder());
        System.out.println(components);
    }
}
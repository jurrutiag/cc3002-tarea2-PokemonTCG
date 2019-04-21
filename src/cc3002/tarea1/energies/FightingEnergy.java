package cc3002.tarea1.energies;

import cc3002.tarea1.Energy;
import cc3002.tarea1.EnergySet;

public class FightingEnergy extends Energy {

    @Override
    public void addTo(EnergySet energies) {
        energies.addFighting();
    }
}
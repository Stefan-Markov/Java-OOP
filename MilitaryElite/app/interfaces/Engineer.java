package MilitaryElite.app.interfaces;


import MilitaryElite.app.Repair;

import java.util.Collection;

public interface Engineer {
    void addRepair(Repair repair);


    Collection<Repair> getRepairs();
}

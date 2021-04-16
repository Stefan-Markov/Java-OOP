package MilitaryElite.app.interfaces;


import MilitaryElite.app.Mission;

import java.util.Collection;

public interface Commando {

    void addMission(Mission mission);

    Collection<Mission> getMissions();
}

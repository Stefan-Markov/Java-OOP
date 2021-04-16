package BarracksWarsTheCommandsStrikeBack.barracksWars.core.commands;

import BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Inject;
import BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Repository;
import BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Unit;
import BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.UnitFactory;

public class Add extends Command {
    @Inject
    private Repository repository;
    private UnitFactory factory;

    public Add(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        Unit unitToAdd = this.factory.createUnit(unitType);
        this.repository.addUnit(unitToAdd);

        return unitType + " added!";
    }
}

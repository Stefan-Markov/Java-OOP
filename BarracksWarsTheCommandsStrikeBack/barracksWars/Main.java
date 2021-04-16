package BarracksWarsTheCommandsStrikeBack.barracksWars;

import BarracksWarsTheCommandsStrikeBack.barracksWars.core.CommandInterpImpl;
import BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.CommandInterpreter;
import BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Repository;
import BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Runnable;
import BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.UnitFactory;
import BarracksWarsTheCommandsStrikeBack.barracksWars.core.Engine;
import BarracksWarsTheCommandsStrikeBack.barracksWars.core.factories.UnitFactoryImpl;
import BarracksWarsTheCommandsStrikeBack.barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        CommandInterpreter commandInterpret =
                new CommandInterpImpl(repository, unitFactory);

        Runnable engine = new Engine(commandInterpret);
        engine.run();
    }
}

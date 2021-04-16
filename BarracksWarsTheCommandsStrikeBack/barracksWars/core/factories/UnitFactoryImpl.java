package BarracksWarsTheCommandsStrikeBack.barracksWars.core.factories;

import BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.Unit;
import BarracksWarsTheCommandsStrikeBack.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "BarracksWarsTheCommandsStrikeBack.barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType){
        Unit unit = null;

        try {
            Class<?> clazz = Class.forName(UNITS_PACKAGE_NAME + unitType);
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            unit = (Unit) constructor.newInstance();
        } catch (ClassNotFoundException
                | NoSuchMethodException
                | InstantiationException
                | InvocationTargetException
                | IllegalAccessException e) {
            e.printStackTrace();
        }

        return unit;
    }
}

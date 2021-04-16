package barracksWars.core.factories;

import barracksWars.interfaces.Unit;
import barracksWars.interfaces.UnitFactory;
import barracksWars.units.AbstractUnit;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Constructor;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) {
        try {
            Class<?> unit = Class.forName(UNITS_PACKAGE_NAME + unitType);
            Constructor<?> declaredConstructor = unit.getDeclaredConstructor();
            Object object = declaredConstructor.newInstance();

            if (object instanceof AbstractUnit) {
                return (Unit) object;
            } else {
                throw new IllegalAccessException("Provided type is not a Unit");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw null;
    }
}

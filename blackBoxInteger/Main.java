package blackBoxInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException,
            IllegalAccessException, InvocationTargetException,
            InstantiationException, NoSuchMethodException, NoSuchFieldException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        Constructor<?>[] declaredConstructors = BlackBoxInt.class.getDeclaredConstructors();
        BlackBoxInt blackBoxInt = null;
        try {
            Constructor<?> declaredConstructor = BlackBoxInt.class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            blackBoxInt = (BlackBoxInt) declaredConstructor.newInstance();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();

        }

        Map<String, Method> methods = new HashMap<>();
        for (Method declaredMethod : blackBoxInt.getClass().getDeclaredMethods()) {
            methods.put(declaredMethod.getName(), declaredMethod);
        }

        while (!(line = reader.readLine()).equals("END")) {
            String[] tokens = line.split("_");

            Method method = methods.get(tokens[0]);

            method.setAccessible(true);

            method.invoke(blackBoxInt, Integer.parseInt(tokens[1]));
            Field field = blackBoxInt.getClass().getDeclaredFields()[1];

            field.setAccessible(true);
            System.out.println(field.getInt(blackBoxInt));
        }
    }
}

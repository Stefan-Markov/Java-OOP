package HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Method[] methods = Reflection.class.getDeclaredMethods();
//
//        Method[] getters = Arrays.stream(methods)
//                .filter(m -> m.getName().startsWith("get") &&
//                        m.getParameterCount() == 0)
//                .sorted(Comparator.comparing(Method::getName))
//                .toArray(Method[]::new);
//
//        Arrays.stream(getters).forEach(m ->
//                System.out.printf("%s will return class %s%n",
//                        m.getName(), m.getReturnType().getName()));
//


        Reflection reflection = new Reflection();

        Class<Reflection> clazz = Reflection.class;

        Field[] fields = Arrays.stream(clazz.getDeclaredFields())
                .sorted(Comparator.comparing(Field::getName))
                .toArray(Field[]::new);
        for (Field field : fields) {
            if(!Modifier.isPrivate(field.getModifiers())){
                System.out.println(field.getName()+" must be private!");
            }
        }


        Method[] methods = clazz.getDeclaredMethods();

        List<Method> getters = new ArrayList<>();

        List<Method> setters = new ArrayList<>();

        for (Method method : methods) {
            if (method.getName().startsWith("get")) {
                getters.add(method);
            } else if (method.getName().startsWith("set")) {
                setters.add(method);
            }
        }

        getters.sort(Comparator.comparing(Method::getName));
        setters.sort(Comparator.comparing(Method::getName));

        for (Method getter : getters) {
            if(!Modifier.isPublic(getter.getModifiers())){
                System.out.println(getter.getName() +" have to be public!");
            }
        }
        for (Method setter : setters) {
            if(!Modifier.isPrivate(setter.getModifiers())){
                System.out.println(setter.getName() +" have to be private!");
            }
        }
    }
}

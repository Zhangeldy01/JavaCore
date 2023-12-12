package homeWork1.sample;

import homeWork1.regular.Decorator;
import homeWork1.regular.OtherClass;

/**
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 *
 * javac -sourcepath ./java -d out java/homeWork1/sample/Main.java
 * java -classpath ./out HomeWork1.sample.Main
 * javadoc -encoding utf8 -d docs -sourcepath ./java -cp ./out -subpackages ru
 * FROM bellsoft/liberica-openjdk-alpine:11.0.16
 * COPY ./java ./src
 * RUN mkdir ./out
 * RUN javac -sourcepath ./src -d out src/ru/geekbrains/lesson1/sample/Main.java
 * CMD java -classpath ./out HomeWork1.sample.Main
 * docker build . -t myapp:v1
 * docker run --rm myapp:v1
 */
public class Main {
    /**
     * Точка входа в программу. С неё всегда всё начинается.
     *
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        int result = OtherClass.add(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(2, 2);
        System.out.println(Decorator.decorate(result));
    }
}

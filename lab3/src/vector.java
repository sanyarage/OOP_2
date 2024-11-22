import java.io.IOException;

/**
 * <b> Вектор </b>
 *
 *   Класс Vector реализует приложение, которое представляет вектор в двумерном пространстве и
 *   предоставляет методы для различных операций с векторами.
 *
 *   <b>Примечание:</b> Здесь может быть ваше примечание.
 *
 *   @author  Mikhail Nefedov
 *   @version 1.0
 *   @since 2023-09-15
 */

public class vector {

    double x1 = 0;
    double y1 = 0;

    double x2 = 0;
    double y2 = 0;

    /**
     * Конструктор с параметрами для создания вектора с заданными координатами.
     * @param x1 - Координата x начала вектора
     * @param y1 - Координата y начала вектора
     * @param x2 - Координата x конца вектора
     * @param y2 - Координата y конца вектора
     */

    public vector(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     *   Конструктор без параметров
     */
    public vector(){}

    /**
     * Геттер x1
     * @return - x1
     */

    public double getX1(){
        return x1;
    }

    /**
     * Сеттер x1
     * @param  x1- координата начала x
     */

    public void setX1(double x1) {
        this.x1 = x1;
    }

    /**
     *Геттер y1
     * @return y1
     */

    private double getY1(){
        return y1;
    }

    /**
     * Сеттер y1
     * @param y1 - координата начала y
     */

    private void setY1(double y1){
        this.y1 = y1;
    }

    /**
     * Геттер x2
     * @return x2
     */

    private double getX2(){
        return x2;
    }

    /**
     * Сеттер x2
     * @param x2 - координата конца x
     */

    private void setX2(double x2){
        this.x2 = x2;
    }

    /**
     * Геттер y1
     * @return y1
     */

    private double getY2(){
        return y1;
    }

    /**
     * Сеттер y2
     * @param y2 - координата конца y
     */

    private void setY2(double y2){
        this.y2 = y2;
    }

    /**
     * Метод для вычисления векторного произведения двух векторов.
     * @return - Значение векторного произведения.
     */

    public double vectorProduct() {
        return (x1 * y2 - y1 * x2);
    }

    /**
     * Метод для вычисления скалярного произведения
     * @return - Значение скалярного произведения.
     */

    public double scalarProduct() {
        return (x1 * x2 + y1 * y2);
    }

    /**
     * Метод для нахождения длины вектора
     * @return - Длина вектора.
     */

    public double length() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
    }

    /**
     * Метод для нахождения умножения вектора на скаляр.
     * @param scalar - Скаляр(число).
     * @return - Результат умножения вектора на скаляр.
     */

    public vector multiply(double scalar) {
        return new vector(x1 * scalar, y1 * scalar, x2 * scalar, y2 * scalar);
    }

    /**
     * Метод для сложения векторов
     * @param other - Вектора класса Vector.
     * @return - Сложение векторов
     */

    public vector add(vector other) {
        return new vector(x1 + other.x1, y1 + other.y1, x2 + other.x2, y2 + other.y2);
    }

    /**
     * Метод для вычитания векторов
     * @param other - Вектор класса Vector.
     * @return - Вычитание векторов
     */

    public vector subtract(vector other) {
        return new vector(x1 - other.x1, y1 - other.y1, x2 - other.x2, y2 - other.y2);
    }

    /**
     *Точка входа в программу
     * @param args Не используется.
     * @throws IOException При ошибке ввода.
     */

    public static void main(String[] args) throws IOException {

        vector vector1 = new vector(1, 2, 3, 4);

        vector vector2 = new vector();

        vector2.setX1(10);
        vector2.setY1(20);
        vector2.setX2(30);
        vector2.setY2(40);

        System.out.println("Векторное произведение: " + vector1.vectorProduct());
        System.out.println("Векторное произведение: " + vector2.vectorProduct());
        System.out.println("Скалярное произведение: " + vector1.scalarProduct());
        System.out.println("Скалярное произведение: " + vector2.scalarProduct());
        System.out.println("Длина вектора: " + vector1.length());
        System.out.println("Длина вектора: " + vector2.length());
        System.out.println("Умножение вектора на скаляр: " + vector1.multiply(6));
        System.out.println("Умножение вектора на скаляр: " + vector2.multiply(6));
        System.out.println("Сложение векторов: " + vector1.add(vector1));
        System.out.println("Сложение веткоров: " + vector2.add(vector1));
        System.out.println("Вычитание веткоров: " + vector1.subtract(vector1));
        System.out.println("Вычитание веткоров: " + vector2.subtract(vector1));
    }
}
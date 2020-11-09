public interface CarList {

    //здесь будем описывать, что должна иметь наша система
    // первое - должно быть получение эллемента по его индексу. Он должен возвращать объект типа Car, назовём метод get, и принимать он будет index
    Car get(int index);
    // следующий метод должен добавлять автомобили в систему, он не должен возвращать значений
    void add(Car car);
    // следующие два метода по удалению, один удаляет автомобиль из коллекции, другой удаляет эллемент по индексу

    boolean remove(Car car);
    boolean removeAt(int index);
    // следующий метод должен отображать колличество автомобилей в системе
    int size();
    // следующий метод удаляет все автомобили из коллекции
    void clear();
    void add(Car car, int index);
}

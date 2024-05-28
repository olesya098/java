// Интерфейс 380 вольт
interface Vol380 {
    void work();
}

// Интерфейс 220 вольт
interface Vol220 {
    void charge();
}

// Класс 380 вольт
class Naprag380 implements Vol380 {
    final public int VOLTAGE = 380;

    public void work() {
        System.out.println("Класс напряжения " + VOLTAGE + " вольт");
    }
}

// Класс 220 вольт
class Naprag220 implements Vol220 {
    final public int VOLTAGE = 220;

    public void charge() {
        System.out.println("Класс напряжения " + VOLTAGE + " вольт");
    }
}
// Класс-адаптер
    class Adapter implements Vol220 {
         Vol380 vol380;//объекты реализующие интерфейс
         Vol220 vol220;

        public Adapter() {
            this.vol380 = new Naprag380();//присвоение объектов полям
            this.vol220 = new Naprag220();
        }

        public void charge() {
            System.out.println(" Заряжает телефон на 220 вольт через 380 вольт");
        }
    }

// Пример использования
public class Main {
    public static void main(String[] args) {
        Vol380 Naprag380Device = new Naprag380();
        // Создание экземпляра класса Naprag380, реализующего интерфейс Vol380
        Naprag380Device.work();
        // Вызов метода work() у объекта Naprag380Device

        Vol220 Naprag220Device = new Naprag220();
        Naprag220Device.charge();

        Adapter adapter = new Adapter();
        // Создание экземпляра класса Adapter
        adapter.charge();
    }
}

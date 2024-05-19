import java.util.ArrayList;
import java.util.List;

abstract class Transport {
    String name;
    List <String> accessories = new ArrayList();

    public String toString(){
        return "Транспорт: " + name + "\n" + accessories;
    }
}

abstract class TransportFactory {
    public abstract Transport createTransport();

}

class Грузовик_Factory extends TransportFactory {
    public Transport createTransport(){
        return new Грузовик();
    }

}

class Суда_Factory extends TransportFactory {
    public Transport createTransport(){
        return new Суда();
    }

}
class Самолёт_Factory extends TransportFactory {
    public Transport createTransport(){
        return new Самолёт();
    }

}

class Грузовик extends Transport {
    public Грузовик(){
        name = "Грузовик";
        accessories.add("Перевозки по дороге");
        accessories.add("Безопасность");
        accessories.add("Доступность");
        accessories.add("Быстрота доставки");
        accessories.add("Контроль груза");

    }
}
class Суда extends Transport {
    public Суда(){
        name = "Суда";
        accessories.add("Перевозки по воде");
        accessories.add("Безопасность");
        accessories.add("Доступность");
        accessories.add("Быстрота доставки");
    }
}
class Самолёт extends Transport {
    public Самолёт(){
        name = "Самолёт";
        accessories.add("Перевозки по воздуху");
        accessories.add("Безопасность");
        accessories.add("Быстрота доставки");
    }
}

public class Example{
    public static void main(String[] args) {
        TransportFactory Грузовик1_Factory = new Грузовик_Factory();
        TransportFactory Самолёт1_Factory = new Самолёт_Factory();
        TransportFactory Суда1_Factory = new Суда_Factory();

        Transport Грузовик1 = Грузовик1_Factory.createTransport();
        Transport Самолёт1 = Самолёт1_Factory.createTransport();
        Transport Суда1 = Суда1_Factory.createTransport();
        System.out.println(Грузовик1);
        System.out.println(Самолёт1);
        System.out.println(Суда1);
    }}
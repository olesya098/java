enum Size {//перечисление Size
    XXS(32), XS(34), S(36), M(38), L(40);

    private int euroSize;//для хранения евро-размера

    Size(int euroSize) {//конструктор перечисления
        this.euroSize = euroSize;
    }

    public void getEuroSize() {//выводит на консоль значение euroSize
        System.out.println(euroSize);
    }

    public void getDescription() {//выводит на консоль описание размера
        if (this != XXS) {
            System.out.println("Взрослый размер");
        } else {
            System.out.println("Это детский размер");
        }
    }
}
interface Мужская_одежда {
    void Одеть_мужчину();
}

interface Женская_одежда {
    void Одеть_женщину();
}



abstract class Одежда {

    public Size size;
    public double cost;
    public String color;

    public Одежда(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}

class Футболка extends Одежда implements Мужская_одежда, Женская_одежда {
    public Футболка(Size size, double cost, String color) {
        super(size, cost, color);//вызывает конструктор суперкласса Одежда
    }

    @Override
    public void Одеть_мужчину() {//переопределение метода
        System.out.println("Мужская футболка: размер - " + size + ", цена - " + cost + "руб. , цвет - " + color);
    }

    @Override
    public void Одеть_женщину() {//переопределение метода
        System.out.println("Женская футболка: размер - " + size + ", цена - " + cost + "руб. , цвет - " + color);
    }
}

class Штаны extends Одежда implements Мужская_одежда, Женская_одежда {
    public Штаны(Size size, double cost, String color) {
        super(size, cost, color);//вызывает конструктор суперкласса Одежда
    }

    @Override
    public void Одеть_мужчину() {//переопределение метода
        System.out.println("Мужские штаны: размер - " + size + ", цена - " + cost + "руб. , цвет - " + color);
    }

    @Override
    public void Одеть_женщину() {//переопределение метода
        System.out.println("Женские штаны: размер - " + size + ", цена - " + cost + "руб. , цвет - " + color);
    }
}

class Юбка extends Одежда implements Женская_одежда {
    public Юбка(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void Одеть_женщину() {//переопределение метода
        System.out.println("Женская юбка :размер - " + size + ", цена - " + cost + "руб. , цвет - " + color);
    }
}

class Галстук extends Одежда implements Мужская_одежда {
    public Галстук(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void Одеть_мужчину() {//переопределение метода
        System.out.println("Мужской галстук: размер - " + size + ", цена - " + cost + "руб. , цвет - " + color);
    }
}

class Ателье {
    public void dressWoman(Одежда[] clothes) {
        System.out.println("Женская одежда:");
        for (Одежда clothing : clothes) {//перебор эл-тов
            if (clothing instanceof Женская_одежда) {//проверяется, является ли текущий элемент clothing также экземпляром интерфейса
                ((Женская_одежда) clothing).Одеть_женщину();//если да происходит приведение типа clothing к интерфейсу Женская_одежда
            }
        }
    }

    public void dressMan(Одежда[] clothes) {
        System.out.println("Мужская одежда:");
        for (Одежда clothing : clothes) {//перебор эл-тов
            if (clothing instanceof Мужская_одежда) {//проверяется, является ли текущий элемент clothing также экземпляром интерфейса
                ((Мужская_одежда) clothing).Одеть_мужчину();//если да происходит приведение типа clothing к интерфейсу Мужская_одежда
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Футболка t1 = new Футболка(Size.S, 26, "зеленый");
        Штаны t2 = new Штаны(Size.M, 12, "белый");
        Юбка t3 = new Юбка(Size.XXS,24, "красный");
        Галстук t4 = new Галстук(Size.S, 60, "желтый");
        Одежда[] clothes ={t1, t2, t3, t4};

        Ателье ta = new Ателье();
        ta.dressWoman(clothes);
        System.out.println();
        ta.dressMan(clothes);
        Size.XXS.getDescription();
        Size.L.getEuroSize();
    }
}
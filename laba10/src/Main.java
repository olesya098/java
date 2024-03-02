// Создаем класс Animal
class Animal {
    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Собака лает");
    }

    public void eat() {
        System.out.println("Хомяк ест " + food);
    }

    public void sleep() {
        System.out.println("Кошка спит");
    }
}

// Расширяем класс Animal для создания класса Dog
class Dog extends Animal {
    private String poroda;

    public Dog(String poroda, String food, String location) {
        super(food, location);//обращение к конструктору базового класса
        this.poroda = poroda;
    }



    public void makeNoise() {
        System.out.println(poroda + " лает");
    }

    
    public void eat() {
        System.out.println(poroda + " ест " + food);
    }
}

// создание класса Cat
class Cat extends Animal {
    private String name;

    public Cat(String name, String food, String location) {
        super(food, location);//обращение к конструктору базового класса
        this.name = name;
    }


    public void makeNoise() {
        System.out.println(name+"мяукает");
    }


    public void eat() {
        System.out.println(name +" ест " + food);
    }
}

//  создание класса Horse
class Horse extends Animal {
    private String color;

    public Horse(String color, String food, String location) {
        super(food, location);//обращение к конструктору базового класса
        this.color = color;
    }


    public void makeNoise() {
        System.out.println(color + " Лошадь бегает рысцой");
    }


    public void eat() {
        System.out.println(color + " Лошадь ест " + food);
    }
}

// Создаем класс Ветеринар
class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("Корм: " + animal.food);
        System.out.println("Местоположение: " + animal.location);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Пудель", "мясо", "дом");
        Cat cat = new Cat("Багира ", "рыбу", "квартира");
        Horse horse = new Horse("рыжая", "сено", "конюшня");

        dog.makeNoise();//обращение к методу makeNoise в классе dog
        dog.eat();//обращение к методу eat

        cat.makeNoise();//обращение к методу makeNoise в классе cat
        cat.eat();//обращение к методу eat

        horse.makeNoise();//обращение к методу makeNoise в классе horse
        horse.eat();//обращение к методу eat

        Veterinarian veterin = new Veterinarian();
        veterin.treatAnimal(dog);//выполняет вызов метода treatAnimal объекта veterin и передает в него объект dog
        veterin.treatAnimal(cat);
        veterin.treatAnimal(horse);
    }
}

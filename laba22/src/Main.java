import java.util.ArrayList;import java.util.List;
import java.util.Observer;

// Интерфейс Notifier, определяющий методы для управления издателей
interface Notifier {//для управления издателям
     void addObserver(Observer obs);
     void removeObserver(Observer obs);
     void notifyObserver();
}

// Класс, реализующий интерфейс
class Group implements Notifier {
private List<Observer> observers;
//список издателей
private String name;//название группы
 public Group(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
 }

public void addObserver(Observer obs) {
        observers.add(obs);    }

public void removeObserver(Observer obs) {
        observers.remove(obs);    }

public void notifyObserver() {
        for (Observer obs : observers) {
        obs.update(name);
        }
        }

public void postMessage(String message) {
        System.out.println("Новое сообщение в группе " + name + ": " + message);
        notifyObserver();
 }

        }

// Интерфейс Observer, определяющий метод для обновления издателей
interface Observer {
        void update(String groupName);
}

// Класс, реализующий интерфейс Observer
class User implements Observer {
private String name;
private final List<Group> subscribedGroups;//список подписанных групп
 public User(String name) {
        this.name = name;
        this.subscribedGroups = new ArrayList<>();
 }

public void subscribe(Group group) {
        subscribedGroups.add(group);
        group.addObserver(this);
 }

public void unsubscribe(Group group) {
        subscribedGroups.remove(group);
        group.removeObserver(this);
 }

public void update(String groupName) {
        System.out.println(name + " получил новое сообщение из группы " + groupName);    }
        }

class Main {
    public static void main(String[] args) {
        // Создаем группы

        Group group1 = new Group("Группа 1");
        Group group2 = new Group("Группа 2");
        Group group3 = new Group("Группа 3");
        Group group4 = new Group("Группа 4");        // Создаем пользователей
         User user1 = new User("Пользователь 1");
         User user2 = new User("Пользователь 2");
         // Подписываем пользователей на группы
        user1.subscribe(group1);
        user1.subscribe(group2);
        user1.subscribe(group3);
        user2.subscribe(group2);
        user2.subscribe(group3);
        user2.subscribe(group4);
        // Публикуем сообщения в группах
        group1.postMessage("Сообщение  от Группы 1!");
        group2.postMessage("Сообщение от Группы 2!");
        group3.postMessage("Сообщение от Группы 3!");
        group4.postMessage("Сообщение от Группы 4!");
    }
    }

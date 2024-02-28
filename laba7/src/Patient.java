// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Patient {
        String Name1;
        String Name2;
        String Name3;
        String address;
        int Number;
        String diagnosis;

        public Patient(String Name1, String Name2, String Name3, String address, int Number, String diagnosis) {
            this.Name1 = Name1;
            this.Name2 = Name2;
            this.Name3 = Name3;
            this.address = address;
            this.Number =Number;
            this.diagnosis = diagnosis;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Patient[] patients = new Patient[5];
            patients[0] = new Patient("Иванов", "Иван", "Иванович", "Moscow", 123456, "Гастрит");
            patients[1] = new Patient("Петрова", "Мария", "Сергеевна", "Saint Petersburg", 789012, "Ангина");
            patients[2] = new Patient("Сидоров", "Алексей", "Владимирович", "Novosibirsk", 345678, "Мигрень");
            patients[3] = new Patient("Смитт", "Джон", "Виллиам", "New York", 901234, "Цестит");
            patients[4] = new Patient("Готова", "Рита", "Александровна", "Madrid", 567890, "Гастрит");

            System.out.println("Введите диагноз: ");
            String inw = in.nextLine();

            System.out.println("Пациенты с диагнозом " + inw + ":");

            for (Patient patient : patients) {
                if (patient.diagnosis.equals(inw)) {
                    System.out.println("Фамилия: " + patient.Name1);
                    System.out.println("Имя: " + patient.Name2);
                    System.out.println("Отчество: " + patient.Name3);
                    System.out.println("Адрес: " + patient.address);
                    System.out.println("Номер медицинской карты: " + patient.Number);

                }
            }
        }
        }


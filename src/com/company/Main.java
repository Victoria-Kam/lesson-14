package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int year;
        int month;
        int day;

        System.out.print("Введи год:");
        year = scanner.nextInt();
        System.out.print("Введи месяц:");
        month = scanner.nextInt();
        System.out.print("Введи день:");
        day = scanner.nextInt();

        LocalDate current = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formatDate = current.format(formatter);
        System.out.println("День недели: " + current.getDayOfWeek() + " - " + formatDate);

        LocalDate today = LocalDate.now();
        LocalDate nextTuesday = today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        DateTimeFormatter formatterForTuesday = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        String formatTuesday = nextTuesday.format(formatter);

        System.out.println("Следующий " + nextTuesday.getDayOfWeek() + " будет: " + formatTuesday);


        AditionalTask aditionalTask = new AditionalTask();

        System.out.println("Введи цифру 1 или 2: ");
        int value = scanner.nextInt();
        if(value == 1) {
            System.out.println("Введи строку для реверса: ");
            StringBuilder str = new StringBuilder(scanner.next());
            aditionalTask.task(str, value);
        }else if(value == 2){
            System.out.println("Введи число для подсчета факториала: ");
            Integer myValue = scanner.nextInt();
            aditionalTask.task(myValue, value);
        }


    }
}

package com.gmail.ahmedded.practise.stream;

import java.util.*;
import java.util.stream.*;

public class notes {
    public static void main(String[] args) {

        // Исходные данные — список имён
        List<String> names = Arrays.asList(
                "Даня", "Иван", "Олег", "Анна", "Алексей", "Ольга", "Оля", "Оля"
        );

        // 1) Создаём стрим из списка
        Stream<String> stream1 = names.stream(); // Источник данных (List → Stream)
        System.out.println("\n список: " + stream1);

        // 2) Фильтрация: оставляем имена длиннее 4 букв
        Stream<String> stream2 = stream1.filter(name -> name.length() > 4);
        System.out.println("\n список: " + stream2);
        // filter(Predicate) — отбираем только те элементы, что подходят по условию

        // 3) Преобразование: переводим в верхний регистр
        Stream<String> stream3 = stream2.map(String::toUpperCase);
        System.out.println("\n список: " + stream3);
        // map(Function) — меняем каждый элемент на новый (тут: строка → строка в UPPERCASE)

        // 4) Убираем дубликаты
        Stream<String> stream4 = stream3.distinct();
        System.out.println("\n список: " + stream4);
        // distinct() — удаляет повторяющиеся элементы

        // 5) Сортировка
        Stream<String> stream5 = stream4.sorted();
        System.out.println("\n список: " + stream5);
        // sorted() — сортирует элементы (по умолчанию естественный порядок)

        // 6) Подсмотрим данные (для отладки)
        Stream<String> stream6 = stream5.peek(n -> System.out.println("Элемент после сортировки: " + n));
        System.out.println("\n список: " + stream6);
        // peek(Consumer) — выполняет действие с элементом, но не меняет его

        // 7) Берём только первые 3
        Stream<String> stream7 = stream6.limit(3);
        System.out.println("\n список: " + stream7);
        // limit(n) — оставляем только n первых элементов

        // 8) Терминальная операция: собираем в список
        List<String> result = stream7.collect(Collectors.toList());
        // collect(...) — финальная операция: собираем результат обратно в коллекцию

        System.out.println("\nИтоговый список: " + result);

        // -----------------------------
        // Дополнительно покажем другие терминальные операции
        // -----------------------------

        // Подсчёт уникальных имён
        long count = names.stream().distinct().count();
        // count() — считает количество элементов
        System.out.println("Количество уникальных имён: " + count);

        // Проверка условия
        boolean hasAnna = names.stream().anyMatch(n -> n.equals("Анна"));
        // anyMatch(Predicate) — true, если хотя бы один элемент подходит
        System.out.println("Есть ли 'Анна'? " + hasAnna);

        // Свёртка в строку
        String joined = names.stream().reduce((a, b) -> a + ", " + b).orElse("Нет имён");
        // reduce(BinaryOperator) — «сворачивает» поток в одно значение
        System.out.println("Все имена одной строкой: " + joined);

        // Группировка по длине имени
        Map<Integer, List<String>> grouped = names.stream().collect(Collectors.groupingBy(String::length));
        // groupingBy(Function) — создаёт Map<ключ, список элементов>
        System.out.println("Группировка по длине: " + grouped);
    }
}


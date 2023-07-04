package com.hillel.zhuravytskii.homeworks.homework18;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("1", "Book", 330, true, LocalDateTime.of(2021, 12, 1, 12, 3)));
        products.add(new Product("2", "Book", 200, false, LocalDateTime.of(2022, 3, 15, 5, 10)));
        products.add(new Product("3", "Toy", 102, true, LocalDateTime.of(2020, 5, 20, 17, 0)));
        products.add(new Product("4", "Book", 340, true, LocalDateTime.of(2023, 2, 10, 15, 20)));
        products.add(new Product("5", "Book", 90, true, LocalDateTime.of(2023, 6, 5, 12, 10)));


        List<Product> booksOver250 = Product.getAllBooksWithPriceGreaterThan250(products);
        System.out.println("1. Книги з ціною більше 250:");
        booksOver250.forEach(System.out::println);
        System.out.println();


        List<Product> discountedBooks = Product.getDiscountedBooks(products);
        System.out.println("2. Знижені ціни на книги:");
        discountedBooks.forEach(System.out::println);
        System.out.println();


        try {
            Product cheapestBook = Product.getCheapestBook(products);
            System.out.println("3. Найдешевша книга:");
            System.out.println(cheapestBook);
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        List<Product> lastThreeAdded = Product.getLastThreeAddedProducts(products);
        System.out.println("4. Останні додані продукти:");
        lastThreeAdded.forEach(System.out::println);
        System.out.println();


        double totalBookPrice = Product.calculateTotalPriceOfBooks(products);
        System.out.println("5. Загальна вартість книг, доданих у поточному році та з ціною не більше 75:");
        System.out.println(totalBookPrice);
        System.out.println();


        Map<String, List<Product>> groupedProducts = Product.groupProductsByType(products);
        System.out.println("6. Групування об'єктів за типом продукту:");
        groupedProducts.forEach((type, productList) -> {
            System.out.println(type + ":");
            productList.forEach(System.out::println);
            System.out.println();
        });
    }}

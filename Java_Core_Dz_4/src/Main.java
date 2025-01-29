import Shop.Customer;
import Shop.Order;
import Shop.Product;
import Shop.Shop;

import java.util.List;
import java.util.Objects;

import static Shop.Shop.customers;
import static Shop.Shop.products;

enum Holiday {
    noHoliday,
    newYear,
    internationalWomensDay,
    defendersDay
}

public class Main {
    public static void main(String[] args) {
        Shop.customers.add(new Customer("Лобанов Кирилл Анатольевич", 38, "8-926-123-05-05", "муж"));
        Shop.customers.add(new Customer("Жуков Василий Петрович", 54, "8-916-789-16-06", "муж"));
        Shop.customers.add(new Customer("Шматко Анжела Олеговна", 19, "8-119-585-01-01", "жен"));
        Shop.products.add(new Product("Туфли", 13000));
        Shop.products.add(new Product("Кукла", 2599));
        Shop.products.add(new Product("Конструктор", 4750));
        Shop.products.add(new Product("Мяч", 999));
        Shop.products.add(new Product("Карандаши", 120));
        Shop.products.add(new Product("Вода без газа", 80));
        Shop.orders.add(new Order(customers.get(0), products.get(2), 4));
        Shop.orders.add(new Order(customers.get(2), products.get(1), 10));
        Shop.orders.add(new Order(customers.get(1), products.get(0), 3));
        Shop.orders.add(new Order(customers.get(0), products.get(3), 6));
        Shop.orders.add(new Order(customers.get(1), products.get(5), 7));
        Shop.orders.add(new Order(customers.get(2), products.get(4), 2));

        Shop.orders.removeIf(Objects::isNull);
        System.out.println("Итоговое количество заказов = " + Shop.orders.size());



        Holiday currentHoliday = getCurrentHoliday();


        congratulateCustomers(Shop.customers, currentHoliday);
    }

    private static void congratulateCustomers(List<Customer> customers, Holiday holiday) {
        for (Customer customer : customers) {
            if (holiday == Holiday.newYear) {
                System.out.println("С Новым Годом, " + customer.getSurnameFirstNamePatronymic() + "!");
            } else if (holiday == Holiday.internationalWomensDay && !customer.isMale()) {
                System.out.println("С 8 Марта, " + customer.getSurnameFirstNamePatronymic() + "!");
            } else if (holiday == Holiday.defendersDay && customer.isMale()) {
                System.out.println("С 23 Февраля, " + customer.getSurnameFirstNamePatronymic() + "!");
            } else if (holiday == Holiday.noHoliday) {
                System.out.println("Сегодня не праздничный день");
                break;
            }
        }
    }

    private static Holiday getCurrentHoliday() {

        return Holiday.defendersDay;
    }
}
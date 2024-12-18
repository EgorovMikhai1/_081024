package com.app._19_12_2024;

public class E6 {
    /**
     *
     *
     * 1. Создайте абстрактный базовый класс "User" с полями:
     *    - userId (уникальный идентификатор пользователя, тип int)
     *    - username (имя пользователя, тип String)
     *    - email (электронная почта, тип String)
     *
     *    Добавьте:
     *    - Конструктор с параметрами для всех полей
     *    - Геттеры и сеттеры для всех полей
     *    - Абстрактный метод getUserRole(), который возвращает роль пользователя (тип String)
     *    - Метод toString для вывода информации о пользователе
     *
     * 2. Создайте класс "Admin", который наследуется от "User", и добавьте:
     *    - privileges (список привилегий, тип List<String>)
     *
     *    Добавьте:
     *    - Конструктор с параметрами для всех полей, включая поля базового класса
     *    - Геттеры и сеттеры для списка привилегий
     *    - Реализацию метода getUserRole(), который возвращает "Admin"
     *    - Метод addPrivilege(String privilege), который добавляет новую привилегию
     *    - Метод toString, который дополнительно выводит список привилегий
     *
     * 3. Создайте класс "Customer", который наследуется от "User", и добавьте:
     *    - orders (список заказов, тип List<Order>)
     *
     *    Добавьте:
     *    - Конструктор с параметрами для всех полей, включая поля базового класса
     *    - Геттеры и сеттеры для списка заказов
     *    - Реализацию метода getUserRole(), который возвращает "Customer"
     *    - Метод addOrder(Order order), который добавляет новый заказ в список
     *    - Метод toString, который дополнительно выводит количество заказов
     *
     * 4. Создайте класс "Order" с полями:
     *    - orderId (уникальный идентификатор заказа, тип int)
     *    - productList (список продуктов, тип List<Product>)
     *    - totalAmount (общая сумма заказа, тип double)
     *
     *    Добавьте:
     *    - Конструктор с параметрами для всех полей
     *    - Геттеры и сеттеры для всех полей
     *    - Метод calculateTotalAmount(), который пересчитывает общую сумму заказа на основе продуктов
     *    - Метод toString для вывода информации о заказе
     *
     * 5. Создайте класс "Product" с полями:
     *    - productId (уникальный идентификатор продукта, тип int)
     *    - name (название продукта, тип String)
     *    - price (цена продукта, тип double)
     *
     *    Добавьте:
     *    - Конструктор с параметрами для всех полей
     *    - Геттеры и сеттеры для всех полей
     *    - Метод toString для вывода информации о продукте
     *
     * 6. Создайте класс "ECommerceSystem" с полями:
     *    - users (список пользователей, тип List<User>)
     *    - orders (список заказов, тип List<Order>)
     *
     *    Добавьте:
     *    - Конструктор с параметрами для всех полей
     *    - Метод addUser(User user), который добавляет нового пользователя в систему
     *    - Метод addOrder(Order order), который добавляет новый заказ в систему
     *    - Метод getAllAdmins(), который возвращает список всех пользователей с ролью "Admin"
     *    - Метод getAllCustomersWithOrders(), который возвращает список всех клиентов, у которых есть заказы
     *    - Метод calculateTotalRevenue(), который вычисляет общую сумму всех заказов в системе
     *    - Метод toString, который выводит общее количество пользователей и заказов
     *
     * 7. В основном классе создайте:
     *    - Несколько объектов "Admin" и "Customer"
     *    - Несколько объектов "Order" и "Product"
     *    - Объект "ECommerceSystem", добавьте в него пользователей и заказы
     *    - Проверьте работу всех методов, включая наследование, пересчёты, фильтрацию и отображение данных
     *    - Выведите в консоль общую информацию о системе
     */
}

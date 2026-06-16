/*
package com.example;

import com.example.entity.Address;
import com.example.entity.User;
import com.example.config.DatabaseConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.service.UserService;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class); //контейнер бинов
        UserService userService = context.getBean(UserService.class);//получение бина из UserService

        System.out.println("Создание изначальных пользователей");

        Address address1 = new Address("Colorado", "Voronino", 4);
        User user1 = new User("John", "Cena", 49, address1);
        userService.saveUser(user1);

        Address address2 = new Address("Moscow", "Veseluha", 4);
        User user2 = new User("Nastya", "Ribka", 40, address2);
        userService.saveUser(user2);

        Address address3 = new Address("KaerMorhen", "Vedmakov", 69);
        User user3 = new User("Geralt", "Rivian", 78, address3);
        userService.saveUser(user3);

        Address address4 = new Address("SanJose", "Pramaya", 15);
        User user4 = new User("Aizek", "Klark", 34, address4);
        userService.saveUser(user4);

        User user5 = new User("Gorge", "Washington", 76);
        userService.saveUser(user5);
        User user6 = new User("Ray", "Misterio", 23);
        userService.saveUser(user6);

        userService.userListOut();

        System.out.println("Удаление пользователя с id: 5");
        userService.deleteUser(5);
        userService.userListOut();
        System.out.println("Обновление пользователя с id: 3");
        userService.updateUser(3, "Krokodil", "Gena", 36);
        userService.userListOut();
        userService.userWithAddressListOut();
        System.out.println("Удаление пользователя с адресом c id 3");
        userService.deleteUser(3);
        userService.userWithAddressListOut();
        userService.findUsersByHouse(4);
        System.out.println("Удаление всех пользователей");
        userService.deleteAllUsers();
        System.out.println("close main");


        context.close();
    }
}
*/

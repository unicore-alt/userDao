package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main
{
    public static void main(String[] args)
    {
        UserService service = new UserServiceImpl();

        service.createUsersTable();

        service.saveUser("Иван", "Иванов", (byte) 25);
        service.saveUser("Петр", "Петров", (byte) 30);
        service.saveUser("Михаил", "Михайлов", (byte) 23);
        service.saveUser("Семен", "Семенов", (byte) 49);

        service.getAllUsers().forEach(System.out::println);

        service.cleanUsersTable();
        service.dropUsersTable();
    }
}

/*
* File: TodoList.java
* Author: Balázs Réka
* Copyright: 2024, Balázs Réka
* Group: Szoft II/1
* Date: 2024-01-12
* Github: https://github.com/BalazsR2022/Paclient.git
* Licenc: GNU GPL
*/


import hu.szit.Convert;
import java.util.ArrayList;


public class TodoList {
    public TodoList() {
        TodoService todoService = new TodoService();
        String get = todoService.getGet();

        ArrayList<TodoGet> getList = Convert.toListObject(get, TodoGet.class);
        for (TodoGet todoGet : getList) {
            System.out.println("User ID: " + todoGet.getUserId());
            System.out.println("ID: " + todoGet.getId());
            System.out.println("Title: " + todoGet.getTitle());
            System.out.println("Body: " + todoGet.getBody());
        }
    }
}




   






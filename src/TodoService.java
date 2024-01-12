/*
* File: TodoService.java
* Author: Balázs Réka
* Copyright: 2024, Balázs Réka
* Group: Szoft II/1
* Date: 2024-01-12
* Github: https://github.com/BalazsR2022/Paclient.git
* Licenc: GNU GPL
*/

import hu.szit.Client;

public class TodoService {
    private String url;
    private Client client;

    public TodoService() {
        this.url = "https://jsonplaceholder.typicode.com/todos"; 
        this.client = new Client();
    }

    public String getGetString() {
        return client.get(url);
    }

    public String getGet() {
        return getGetString();
    }
}

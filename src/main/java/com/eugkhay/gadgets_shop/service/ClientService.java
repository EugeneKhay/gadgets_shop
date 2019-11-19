package com.eugkhay.gadgets_shop.service;

import com.eugkhay.gadgets_shop.model.Client;
import com.eugkhay.gadgets_shop.model.Order;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ClientService extends UserDetailsService {

    List<Client> getAllClients();
    Client getClientById(String id);
    Client createClient(Client client);
    Client updateClient(Client clientFromDB, Client client);
    void deleteClient(Client client);
    Client getClientByEmail(String email);
}

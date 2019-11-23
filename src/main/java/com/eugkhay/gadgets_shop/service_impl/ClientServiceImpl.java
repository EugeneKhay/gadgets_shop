package com.eugkhay.gadgets_shop.service_impl;

import com.eugkhay.gadgets_shop.model.Client;
import com.eugkhay.gadgets_shop.repository.ClientRepo;
import com.eugkhay.gadgets_shop.service.ClientService;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepo clientRepo;

    public ClientServiceImpl(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepo.findAll();
    }

//    @Override
//    public Client getClientById(String id) {
//        return clientRepo.fi
//    }

    @Override
    public Client createClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public Client updateClient(Client clientFromDB, Client client) {
        BeanUtils.copyProperties(client, clientFromDB, "_id");
        return clientRepo.save(clientFromDB);
    }

    @Override
    public void deleteClient(Client client) {
        clientRepo.delete(client);
    }

    @Override
    public Client getClientByEmail(String email) {
        return clientRepo.findByEmail(email);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return getClientByEmail(s);
    }
}

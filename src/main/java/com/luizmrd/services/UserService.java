package com.luizmrd.services;

import com.luizmrd.entities.User;
import com.luizmrd.repositories.UserRepository;
import com.luizmrd.resources.exeptions.DataBaseException;
import com.luizmrd.services.exeptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj){
       return repository.save(obj);
    }

    public void delete(Long id){
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException(id);
        }

        repository.deleteById(id);
    }


    public User update(Long id, User obj){
        User entity = repository.getReferenceById(id);
        updateData(entity,obj);
        return repository.save(entity);

    }

    private void updateData(User entity, User obj) {
        entity.setEmail(obj.getEmail());
        entity.setName(obj.getName());
        entity.setPhone(obj.getPhone());
    }
}

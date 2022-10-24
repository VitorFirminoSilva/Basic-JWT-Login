package com.login.auth.serivces;

import com.login.auth.entities.User;
import com.login.auth.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public List<User> findAll(){
        return userRepository.findAll();
    }
    
    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }
    
    public Optional<User> findByUsername(String username){
        return userRepository.findByUsername(username);
    }
    
    public boolean existsByUsername(String username){
        return userRepository.existsByUsername(username);
    }

    @Transactional
    public User save(User user){
        return userRepository.save(user);
    }
    
    @Transactional
    public void delete(User user){
        userRepository.delete(user);
    }
    
}

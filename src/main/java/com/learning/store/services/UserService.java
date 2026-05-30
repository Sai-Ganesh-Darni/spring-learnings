package com.learning.store.services;

import com.learning.store.entities.User;
import com.learning.store.repositories.ProfileRepository;
import com.learning.store.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;
    private final EntityManager entityManager;
    private final ProfileRepository profileRepository;

    public void showEntityStates(){
        var user = User.builder()
                .name("Sai Ganesh")
                .email("saiganeshtemp2@gmail.com")
                .password("password")
                .build();

        if(entityManager.contains(user)){
            System.out.println("Persistent");
        }else{
            System.out.println("Transient / Detached");
        }

        this.userRepository.save(user);

        if(entityManager.contains(user)){
            System.out.println("Persistent");
        }else{
            System.out.println("Transient / Detached");
        }
    }

    public void showRelatedEntities(){
//        var user = userRepository.findById(2L);
//        System.out.println(user);
        var profile = profileRepository.findById(3L);
    }
}

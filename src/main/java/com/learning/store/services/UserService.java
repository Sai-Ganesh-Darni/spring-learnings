package com.learning.store.services;

import com.learning.store.entities.Address;
import com.learning.store.entities.User;
import com.learning.store.repositories.AddressRepository;
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
    private final AddressRepository addressRepository;

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

    public void getAddress(){
        var address = addressRepository.findById(1L);
        System.out.println(address);
    }

    public void persistRelated(){
        var user = User.builder()
                .name("Anju")
                .email("anju@gmail.com")
                .password("pwd@123")
                .build();

        var address = Address.builder()
                        .zip("zip")
                                .state("state")
                                        .street("street")
                                                .city("city")
                                                        .build();

        user.addAddress(address);
        userRepository.save(user);

    }


    @Transactional
    public void deleteRelated(){
//        userRepository.deleteById(3L);
        var user = userRepository.findById(12L).orElseThrow();
        var address = user.getAddresses().getFirst();
        user.removeAddress(address);
        userRepository.save(user);

    }
}

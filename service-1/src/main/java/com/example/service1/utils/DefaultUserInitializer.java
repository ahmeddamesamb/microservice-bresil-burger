package com.example.service1.utils;

import com.example.service1.model.ERole;
import com.example.service1.model.User;
import com.example.service1.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DefaultUserInitializer implements CommandLineRunner {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public DefaultUserInitializer(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        // Vérifier si l'utilisateur existe déjà
        if (!userRepository.existsByEmail("pdg@ugb.edu.sn")) {
            // L'utilisateur n'existe pas, créer un nouvel utilisateur
            User defaultUser = new User();
            defaultUser.setNom("SAMB");
            defaultUser.setPrenom("Ahmed Dame");
            defaultUser.setEmail("pdg@restau-bresil-burger.sn");
            defaultUser.setPassword(passwordEncoder.encode("12345"));
            defaultUser.setERole(ERole.ADMIN);

            userRepository.save(defaultUser);
            System.out.println("L'utilisateur a été créé avec succès !");
        } else {
            // L'utilisateur existe déjà
            System.out.println("L'utilisateur existe déjà, pas besoin de le créer à nouveau.");
        }
    }

}

package ru.datavendor.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.datavendor.jwt.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
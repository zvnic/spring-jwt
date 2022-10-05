package ru.datavendor.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.datavendor.jwt.model.AppRole;

public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findByName(String name);
}
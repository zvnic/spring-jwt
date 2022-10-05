package ru.datavendor.jwt.service;

import ru.datavendor.jwt.model.AppUser;
import ru.datavendor.jwt.model.AppRole;

import java.util.List;

public interface AppUserService {

    AppUser saveUser(AppUser appUser);
    AppRole saveRole(AppRole appRole);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();
}

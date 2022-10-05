package ru.datavendor.jwt.service;

import ru.datavendor.jwt.model.AppRole;
import ru.datavendor.jwt.model.AppUser;

import java.util.List;

public class AppUserServiceImpl implements AppUserService {
    @Override
    public AppUser saveUser(AppUser appUser) {
        return null;
    }

    @Override
    public AppRole saveRole(AppRole appRole) {
        return null;
    }

    @Override
    public void addRoleToUser(String username, String roleName) {

    }

    @Override
    public AppUser getUser(String username) {
        return null;
    }

    @Override
    public List<AppUser> getUsers() {
        return null;
    }
}

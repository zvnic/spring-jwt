package ru.datavendor.jwt.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.datavendor.jwt.model.AppRole;
import ru.datavendor.jwt.model.AppUser;
import ru.datavendor.jwt.repository.AppRoleRepository;
import ru.datavendor.jwt.repository.AppUserRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class AppUserServiceImpl implements AppUserService {

    private final AppUserRepository userRepository;
    private final AppRoleRepository roleRepository;

    @Override
    public AppUser saveUser(AppUser appUser) {
        return userRepository.save(appUser);
    }

    @Override
    public AppRole saveRole(AppRole appRole) {
        return roleRepository.save(appRole);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        AppUser user = userRepository.findByUsername(username);
        AppRole role = roleRepository.findByName(roleName);
        // Метод добавляет роль к пользователю и сохраняет в БД,
        // т.к. указана аннотация @Transactional
        user.getAppRoles().add(role);
    }

    @Override
    public AppUser getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }
}

package se.lexicon.erik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import se.lexicon.erik.data.AppUserDao;
import se.lexicon.erik.model.AppUser;

import java.util.Scanner;

@Component
public class CreateNewAppUserImpl implements NewAppUserService{

    private AppUserDao appUserDao;
    private Scanner scanner;

    @Autowired
    public CreateNewAppUserImpl(AppUserDao appUserDao, Scanner scanner) {
        this.appUserDao = appUserDao;
        this.scanner = scanner;
    }

    @Override
    public AppUser createNewAppUser(int id, String name, int shoeSize) {
        if(id == 0 || name == null){
            throw new IllegalArgumentException("Invalid arguments when creating new AppUser");
        }
        AppUser user = new AppUser(id,name,shoeSize);
        return appUserDao.persist(user);
    }

    @Override
    public AppUser createNewAppUser() {
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter shoe size:");
        int shoeSize = Integer.parseInt(scanner.nextLine());
        return createNewAppUser(id, name, shoeSize);
    }


}

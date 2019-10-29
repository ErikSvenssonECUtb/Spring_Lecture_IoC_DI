package se.lexicon.erik.data;

import org.springframework.stereotype.Component;
import se.lexicon.erik.model.AppUser;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Component
public class AppUserRepository implements AppUserDao {

    private Set<AppUser> appUsers = new HashSet<>();

    @Override
    public Optional<AppUser> findById(int appUserId){
        AppUser theUser = null;
        for(AppUser user : appUsers){
            if(user.getUserId() == appUserId){
                theUser = user;
                break;
            }
        }
        return theUser != null ? Optional.of(theUser) : Optional.empty();
    }

    @Override
    public AppUser persist(AppUser appUser){
        appUsers.add(appUser);
        return appUser;
    }

    @Override
    public boolean delete(AppUser user){
        return appUsers.remove(user);
    }

}

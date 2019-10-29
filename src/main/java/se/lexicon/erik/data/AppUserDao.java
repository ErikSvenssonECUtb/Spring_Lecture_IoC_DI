package se.lexicon.erik.data;

import se.lexicon.erik.model.AppUser;

import java.util.Optional;

public interface AppUserDao {
    Optional<AppUser> findById(int appUserId);

    AppUser persist(AppUser appUser);

    boolean delete(AppUser user);
}

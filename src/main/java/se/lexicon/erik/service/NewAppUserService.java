package se.lexicon.erik.service;

import se.lexicon.erik.model.AppUser;

import java.util.Scanner;

public interface NewAppUserService {
    AppUser createNewAppUser(int id, String name, int shoeSize);
    AppUser createNewAppUser();
}

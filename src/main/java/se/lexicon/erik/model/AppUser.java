package se.lexicon.erik.model;

import java.util.Objects;

public class AppUser {
    private int userId;
    private String name;
    private int shoeSize;

    public AppUser(int userId, String name, int shoeSize) {
        this.userId = userId;
        this.name = name;
        this.shoeSize = shoeSize;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return userId == appUser.userId &&
                shoeSize == appUser.shoeSize &&
                Objects.equals(name, appUser.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name, shoeSize);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AppUser{");
        sb.append("userId=").append(userId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", shoeSize=").append(shoeSize);
        sb.append('}');
        return sb.toString();
    }
}

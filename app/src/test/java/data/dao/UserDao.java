package data.dao;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import data.User;

@Dao
public interface UserDao {
    @Insert
    void insert(User user);

    @Query("SELECT * FROM user WHERE login = :login AND password = :password")
    User getUser(String login, String password);
}
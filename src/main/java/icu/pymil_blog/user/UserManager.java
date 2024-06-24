package icu.pymil_blog.user;

import java.util.ArrayList;

public class UserManager {
    private final ArrayList<User> users = new ArrayList<>();

    /**
     * 添加一个用户
     * @param user User 需要添加的用户
     * @return boolean
     */
    public boolean addUser(User user) {
        return this.users.add(user);
    }

    /**
     * @param user User 需要删除的用户
     * @return boolean
     */
    public boolean removeUser(User user) {
        return this.users.remove(user);
    }

    /**
     * 通过UserId对用户的UserType进行更换。
     * @param userId int
     * @param toUserType User.UserType
     * @return boolean
     */
    public boolean setUserType(int userId, User.UserType toUserType) {
        for (User user : users) {
            if (user.getUserId() != userId) continue;
            if (user.getUserType() == toUserType) return true;
            user.setUserType(toUserType);
        }
        return true;
    }

    /**
     * @return ArrayList<User>
     */
    public ArrayList<User> getUsers() {
        return users;
    }
}

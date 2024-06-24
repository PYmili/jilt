package icu.pymil_blog.user;

public class User {
    public enum UserType {
        ordinary,       // 普通用户
        administration  // 管理用户
    }
    private String userName;
    private UserType userType;
    private int userId;
    private String userPassword;

    public User() {
        this(UserType.ordinary.toString(), UserType.ordinary, null);
    }
    public User(String userName, UserType userType, String userPassword) {
        this.userName = userName;
        this.userType = userType;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public UserType getUserType() {
        return userType;
    }
    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}

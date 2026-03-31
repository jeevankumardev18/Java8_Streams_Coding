package com.jk.pro;

import java.util.Arrays;
import java.util.List;

class User1
{
    private String userName;
    private String status;
    private int loginCount;

    public User1(String userName, String status, int loginCount) {
        this.userName = userName;
        this.status = status;
        this.loginCount = loginCount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }

    @Override
    public String toString() {
        return userName + " (" + status + "): " + loginCount;
    }
}

public class LazyDeveloper22
{
    public static void main(String[] args)
    {
        List<User1> users = Arrays.asList(
                new User1("Amit", "Active", 50),
                new User1("Ankit", "Active", 30),
                new User1("Akash", "Inactive", 100),
                new User1("Suresh", "Active", 40),
                new User1("Abhi", "Active", 20)
        );

       int loginCounts=users
               .stream()
               .filter(u->"Active".equals(u.getStatus()))
               .filter(u->u.getUserName().startsWith("A"))
               .mapToInt(User1::getLoginCount)
               .sum();

        System.out.println(loginCounts);
    }
}

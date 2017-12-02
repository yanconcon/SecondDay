package pers.congcong.secondDay.pojos;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
public class User implements Serializable {

    private String loginName;
    private String passWord;
    private String userName;

    public User() {
        super();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

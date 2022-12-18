package kr.kmu.ims.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "LOGIN_USERS", schema = "C##IMS", catalog = "")
public class LoginUser {
    private int loginUserId;
    private String userName;
    private String password;
    private Boolean isAdmin;
    private Boolean isActive;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "LOGIN_USER_ID", nullable = false, precision = 0)
    public int getLoginUserId() {
        return loginUserId;
    }

    public void setLoginUserId(int loginUserId) {
        this.loginUserId = loginUserId;
    }

    @Basic
    @Column(name = "USER_NAME", nullable = true, length = 50)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = true, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "IS_ADMIN", nullable = true, precision = 0)
    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    @Basic
    @Column(name = "IS_ACTIVE", nullable = true, precision = 0)
    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginUser that = (LoginUser) o;
        return loginUserId == that.loginUserId && Objects.equals(userName, that.userName) && Objects.equals(password, that.password) && Objects.equals(isAdmin, that.isAdmin) && Objects.equals(isActive, that.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginUserId, userName, password, isAdmin, isActive);
    }
}

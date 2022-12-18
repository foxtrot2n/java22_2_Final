package kr.kmu.ims.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "LOGIN_USER_ROLES", schema = "C##IMS", catalog = "")
public class LoginUserRole {
    private int loginUserRoleId;
    private int loginUserId;
    private int loginRoleId;
    private boolean isActive;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "LOGIN_USER_ROLE_ID", nullable = false, precision = 0)
    public int getLoginUserRoleId() {
        return loginUserRoleId;
    }

    public void setLoginUserRoleId(int loginUserRoleId) {
        this.loginUserRoleId = loginUserRoleId;
    }

    @Basic
    @Column(name = "LOGIN_USER_ID", nullable = false, precision = 0)
    public int getLoginUserId() {
        return loginUserId;
    }

    public void setLoginUserId(int loginUserId) {
        this.loginUserId = loginUserId;
    }

    @Basic
    @Column(name = "LOGIN_ROLE_ID", nullable = false, precision = 0)
    public int getLoginRoleId() {
        return loginRoleId;
    }

    public void setLoginRoleId(int loginRoleId) {
        this.loginRoleId = loginRoleId;
    }

    @Basic
    @Column(name = "IS_ACTIVE", nullable = false, precision = 0)
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginUserRole that = (LoginUserRole) o;
        return loginUserRoleId == that.loginUserRoleId && loginUserId == that.loginUserId && loginRoleId == that.loginRoleId && isActive == that.isActive;
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginUserRoleId, loginUserId, loginRoleId, isActive);
    }
}

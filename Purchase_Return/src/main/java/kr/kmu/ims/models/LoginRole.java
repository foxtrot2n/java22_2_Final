package kr.kmu.ims.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "LOGIN_ROLES", schema = "C##IMS", catalog = "")
public class LoginRole {
    private int loginRoleId;
    private String roleName;
    private Boolean isActive;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "LOGIN_ROLE_ID", nullable = false, precision = 0)
    public int getLoginRoleId() {
        return loginRoleId;
    }

    public void setLoginRoleId(int loginRoleId) {
        this.loginRoleId = loginRoleId;
    }

    @Basic
    @Column(name = "ROLE_NAME", nullable = true, length = 50)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
        LoginRole that = (LoginRole) o;
        return loginRoleId == that.loginRoleId && Objects.equals(roleName, that.roleName) && Objects.equals(isActive, that.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginRoleId, roleName, isActive);
    }
}

package kr.kmu.ims.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "LOOKUP_TYPES", schema = "C##IMS", catalog = "")
public class LookupType {
    private int lookupTypeId;
    private String typeName;
    private boolean isActive;
    private boolean isSystem;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "LOOKUP_TYPE_ID", nullable = false, precision = 0)
    public int getLookupTypeId() {
        return lookupTypeId;
    }

    public void setLookupTypeId(int lookupTypeId) {
        this.lookupTypeId = lookupTypeId;
    }

    @Basic
    @Column(name = "TYPE_NAME", nullable = false, length = 50)
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Basic
    @Column(name = "IS_ACTIVE", nullable = false, precision = 0)
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Basic
    @Column(name = "IS_SYSTEM", nullable = false, precision = 0)
    public boolean isSystem() {
        return isSystem;
    }

    public void setSystem(boolean system) {
        isSystem = system;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LookupType that = (LookupType) o;
        return lookupTypeId == that.lookupTypeId && isActive == that.isActive && isSystem == that.isSystem && Objects.equals(typeName, that.typeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lookupTypeId, typeName, isActive, isSystem);
    }
}

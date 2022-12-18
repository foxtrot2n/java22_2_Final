package kr.kmu.ims.models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "LOOKUP_ITEMS", schema = "C##IMS", catalog = "")
public class LookupItem {
    private int lookupItemId;
    private String name;
    private String value;
    private Integer sortOrder;
    private int lookupTypeId;
    private boolean isActive;
    private int createdBy;
    private Date createdOn;
    private Integer lastUpdatedBy;
    private Date lastUpdatedOn;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "LOOKUP_ITEM_ID", nullable = false, precision = 0)
    public int getLookupItemId() {
        return lookupItemId;
    }

    public void setLookupItemId(int lookupItemId) {
        this.lookupItemId = lookupItemId;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "VALUE", nullable = true, length = 50)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "SORT_ORDER", nullable = true, precision = 0)
    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Basic
    @Column(name = "LOOKUP_TYPE_ID", nullable = false, precision = 0)
    public int getLookupTypeId() {
        return lookupTypeId;
    }

    public void setLookupTypeId(int lookupTypeId) {
        this.lookupTypeId = lookupTypeId;
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
    @Column(name = "CREATED_BY", nullable = false, precision = 0)
    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "CREATED_ON", nullable = false)
    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Basic
    @Column(name = "LAST_UPDATED_BY", nullable = true, precision = 0)
    public Integer getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Integer lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Basic
    @Column(name = "LAST_UPDATED_ON", nullable = true)
    public Date getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Date lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LookupItem that = (LookupItem) o;
        return lookupItemId == that.lookupItemId && lookupTypeId == that.lookupTypeId && isActive == that.isActive && createdBy == that.createdBy && Objects.equals(name, that.name) && Objects.equals(value, that.value) && Objects.equals(sortOrder, that.sortOrder) && Objects.equals(createdOn, that.createdOn) && Objects.equals(lastUpdatedBy, that.lastUpdatedBy) && Objects.equals(lastUpdatedOn, that.lastUpdatedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lookupItemId, name, value, sortOrder, lookupTypeId, isActive, createdBy, createdOn, lastUpdatedBy, lastUpdatedOn);
    }
}

package kr.kmu.ims.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Store {
    private int storeId;
    private String storeName;
    private String storeLocation;
    private Boolean isActive;
    private Integer createdBy;
    private Timestamp createdOn;
    private Integer lastUpdatedBy;
    private Timestamp lastUpdatedOn;
    private String status;
    private Timestamp statusDate;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "STORE_ID", nullable = false, precision = 0)
    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    @Basic
    @Column(name = "STORE_NAME", nullable = false, length = 50)
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Basic
    @Column(name = "STORE_LOCATION", nullable = true, length = 50)
    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    @Basic
    @Column(name = "IS_ACTIVE", nullable = true, precision = 0)
    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Basic
    @Column(name = "CREATED_BY", nullable = true, precision = 0)
    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "CREATED_ON", nullable = true)
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
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
    public Timestamp getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, length = 50)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "STATUS_DATE", nullable = true)
    public Timestamp getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Timestamp statusDate) {
        this.statusDate = statusDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return storeId == store.storeId && Objects.equals(storeName, store.storeName) && Objects.equals(storeLocation, store.storeLocation) && Objects.equals(isActive, store.isActive) && Objects.equals(createdBy, store.createdBy) && Objects.equals(createdOn, store.createdOn) && Objects.equals(lastUpdatedBy, store.lastUpdatedBy) && Objects.equals(lastUpdatedOn, store.lastUpdatedOn) && Objects.equals(status, store.status) && Objects.equals(statusDate, store.statusDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeId, storeName, storeLocation, isActive, createdBy, createdOn, lastUpdatedBy, lastUpdatedOn, status, statusDate);
    }
}

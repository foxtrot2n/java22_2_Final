package kr.kmu.ims.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Category {
    private int categoryId;
    private String categoryName;
    private int createdBy;
    private Timestamp createdOn;
    private Integer lastUpdatedBy;
    private Timestamp lastUpdatedOn;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CATEGORY_ID", nullable = false, precision = 0)
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "CATEGORY_NAME", nullable = false, length = 50)
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category that = (Category) o;
        return categoryId == that.categoryId && createdBy == that.createdBy && Objects.equals(categoryName, that.categoryName) && Objects.equals(createdOn, that.createdOn) && Objects.equals(lastUpdatedBy, that.lastUpdatedBy) && Objects.equals(lastUpdatedOn, that.lastUpdatedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, categoryName, createdBy, createdOn, lastUpdatedBy, lastUpdatedOn);
    }
}

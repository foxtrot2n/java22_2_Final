package kr.kmu.ims.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Brand {
    private int brandId;
    private String brandName;
    private Integer sortOrder;
    private Boolean isActive;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BRAND_ID", nullable = false, precision = 0)
    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "BRAND_NAME", nullable = false, length = 100)
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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
        Brand brands = (Brand) o;
        return brandId == brands.brandId && Objects.equals(brandName, brands.brandName) && Objects.equals(sortOrder, brands.sortOrder) && Objects.equals(isActive, brands.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandId, brandName, sortOrder, isActive);
    }
}

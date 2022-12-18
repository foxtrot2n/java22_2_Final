package kr.kmu.ims.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ITEM_LOCATIONS", schema = "C##IMS", catalog = "")
public class ItemLocation {
    private int itemLocationId;
    private int itemId;
    private int storeId;
    private String location;
    private Object stockQty;
    private Boolean allowIssue;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ITEM_LOCATION_ID", nullable = false, precision = 0)
    public int getItemLocationId() {
        return itemLocationId;
    }

    public void setItemLocationId(int itemLocationId) {
        this.itemLocationId = itemLocationId;
    }

    @Basic
    @Column(name = "ITEM_ID", nullable = false, precision = 0)
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "STORE_ID", nullable = false, precision = 0)
    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    @Basic
    @Column(name = "LOCATION", nullable = true, length = 50)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "STOCK_QTY", nullable = true)
    public Object getStockQty() {
        return stockQty;
    }

    public void setStockQty(Object stockQty) {
        this.stockQty = stockQty;
    }

    @Basic
    @Column(name = "ALLOW_ISSUE", nullable = true, precision = 0)
    public Boolean getAllowIssue() {
        return allowIssue;
    }

    public void setAllowIssue(Boolean allowIssue) {
        this.allowIssue = allowIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemLocation that = (ItemLocation) o;
        return itemLocationId == that.itemLocationId && itemId == that.itemId && storeId == that.storeId && Objects.equals(location, that.location) && Objects.equals(stockQty, that.stockQty) && Objects.equals(allowIssue, that.allowIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemLocationId, itemId, storeId, location, stockQty, allowIssue);
    }
}

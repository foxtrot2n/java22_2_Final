package kr.kmu.ims.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Item {
    private int itemId;
    private String itemCode;
    private String itemName;
    private String purchaseDescription;
    private String isPrintBarcode;
    private Integer departmentId;
    private Integer categoryId;
    private Integer brandId;
    private String itemTypeId;
    private String itemClassId;
    private String itemLocation;
    private Integer storeId;
    private String article;
    private Object stockQty;
    private String isTrackInventory;
    private String uom;
    private Object lowStockQty;
    private Object minOrderQty;
    private Object maxOrderQty;
    private Object leadTimeDays;
    private Integer supplierId;
    private String itemOrigin;
    private Object openingBalance;
    private String isActive;
    private Integer createdBy;
    private Timestamp createdOn;
    private Integer lastUpdatedBy;
    private Timestamp lastUpdatedOn;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ITEM_ID", nullable = false, precision = 0)
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "ITEM_CODE", nullable = false, length = 50)
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Basic
    @Column(name = "ITEM_NAME", nullable = false, length = 100)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "PURCHASE_DESCRIPTION", nullable = true, length = 100)
    public String getPurchaseDescription() {
        return purchaseDescription;
    }

    public void setPurchaseDescription(String purchaseDescription) {
        this.purchaseDescription = purchaseDescription;
    }

    @Basic
    @Column(name = "IS_PRINT_BARCODE", nullable = true, length = 1)
    public String getIsPrintBarcode() {
        return isPrintBarcode;
    }

    public void setIsPrintBarcode(String isPrintBarcode) {
        this.isPrintBarcode = isPrintBarcode;
    }

    @Basic
    @Column(name = "DEPARTMENT_ID", nullable = true, precision = 0)
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "CATEGORY_ID", nullable = true, precision = 0)
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "BRAND_ID", nullable = true, precision = 0)
    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "ITEM_TYPE_ID", nullable = true, length = 50)
    public String getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(String itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    @Basic
    @Column(name = "ITEM_CLASS_ID", nullable = true, length = 50)
    public String getItemClassId() {
        return itemClassId;
    }

    public void setItemClassId(String itemClassId) {
        this.itemClassId = itemClassId;
    }

    @Basic
    @Column(name = "ITEM_LOCATION", nullable = true, length = 50)
    public String getItemLocation() {
        return itemLocation;
    }

    public void setItemLocation(String itemLocation) {
        this.itemLocation = itemLocation;
    }

    @Basic
    @Column(name = "STORE_ID", nullable = true, precision = 0)
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @Basic
    @Column(name = "ARTICLE", nullable = true, length = 50)
    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    @Basic
    @Column(name = "STOCK_QTY", nullable = false)
    public Object getStockQty() {
        return stockQty;
    }

    public void setStockQty(Object stockQty) {
        this.stockQty = stockQty;
    }

    @Basic
    @Column(name = "IS_TRACK_INVENTORY", nullable = true, length = 1)
    public String getIsTrackInventory() {
        return isTrackInventory;
    }

    public void setIsTrackInventory(String isTrackInventory) {
        this.isTrackInventory = isTrackInventory;
    }

    @Basic
    @Column(name = "UOM", nullable = true, length = 50)
    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    @Basic
    @Column(name = "LOW_STOCK_QTY", nullable = true)
    public Object getLowStockQty() {
        return lowStockQty;
    }

    public void setLowStockQty(Object lowStockQty) {
        this.lowStockQty = lowStockQty;
    }

    @Basic
    @Column(name = "MIN_ORDER_QTY", nullable = true)
    public Object getMinOrderQty() {
        return minOrderQty;
    }

    public void setMinOrderQty(Object minOrderQty) {
        this.minOrderQty = minOrderQty;
    }

    @Basic
    @Column(name = "MAX_ORDER_QTY", nullable = true)
    public Object getMaxOrderQty() {
        return maxOrderQty;
    }

    public void setMaxOrderQty(Object maxOrderQty) {
        this.maxOrderQty = maxOrderQty;
    }

    @Basic
    @Column(name = "LEAD_TIME_DAYS", nullable = true)
    public Object getLeadTimeDays() {
        return leadTimeDays;
    }

    public void setLeadTimeDays(Object leadTimeDays) {
        this.leadTimeDays = leadTimeDays;
    }

    @Basic
    @Column(name = "SUPPLIER_ID", nullable = true, precision = 0)
    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    @Basic
    @Column(name = "ITEM_ORIGIN", nullable = true, length = 50)
    public String getItemOrigin() {
        return itemOrigin;
    }

    public void setItemOrigin(String itemOrigin) {
        this.itemOrigin = itemOrigin;
    }

    @Basic
    @Column(name = "OPENING_BALANCE", nullable = true)
    public Object getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(Object openingBalance) {
        this.openingBalance = openingBalance;
    }

    @Basic
    @Column(name = "IS_ACTIVE", nullable = true, length = 1)
    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return itemId == item.itemId && Objects.equals(itemCode, item.itemCode) && Objects.equals(itemName, item.itemName) && Objects.equals(purchaseDescription, item.purchaseDescription) && Objects.equals(isPrintBarcode, item.isPrintBarcode) && Objects.equals(departmentId, item.departmentId) && Objects.equals(categoryId, item.categoryId) && Objects.equals(brandId, item.brandId) && Objects.equals(itemTypeId, item.itemTypeId) && Objects.equals(itemClassId, item.itemClassId) && Objects.equals(itemLocation, item.itemLocation) && Objects.equals(storeId, item.storeId) && Objects.equals(article, item.article) && Objects.equals(stockQty, item.stockQty) && Objects.equals(isTrackInventory, item.isTrackInventory) && Objects.equals(uom, item.uom) && Objects.equals(lowStockQty, item.lowStockQty) && Objects.equals(minOrderQty, item.minOrderQty) && Objects.equals(maxOrderQty, item.maxOrderQty) && Objects.equals(leadTimeDays, item.leadTimeDays) && Objects.equals(supplierId, item.supplierId) && Objects.equals(itemOrigin, item.itemOrigin) && Objects.equals(openingBalance, item.openingBalance) && Objects.equals(isActive, item.isActive) && Objects.equals(createdBy, item.createdBy) && Objects.equals(createdOn, item.createdOn) && Objects.equals(lastUpdatedBy, item.lastUpdatedBy) && Objects.equals(lastUpdatedOn, item.lastUpdatedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, itemCode, itemName, purchaseDescription, isPrintBarcode, departmentId, categoryId, brandId, itemTypeId, itemClassId, itemLocation, storeId, article, stockQty, isTrackInventory, uom, lowStockQty, minOrderQty, maxOrderQty, leadTimeDays, supplierId, itemOrigin, openingBalance, isActive, createdBy, createdOn, lastUpdatedBy, lastUpdatedOn);
    }
}

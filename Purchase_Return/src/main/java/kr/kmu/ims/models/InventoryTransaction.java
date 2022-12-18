package kr.kmu.ims.models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "INVENTORY_TRANSACTIONS", schema = "C##IMS", catalog = "")
public class InventoryTransaction {
    private int transId;
    private String transType;
    private Integer supplierId;
    private Integer employeeId;
    private int itemId;
    private Integer userId;
    private Integer storeId;
    private Date transDate;
    private String transDescription;
    private Integer documentId;
    private Date documentDate;
    private Object transQty;
    private Object prevStockQty;
    private Object newStockQty;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TRANS_ID", nullable = false, precision = 0)
    public int getTransId() {
        return transId;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    @Basic
    @Column(name = "TRANS_TYPE", nullable = false, length = 50)
    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
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
    @Column(name = "EMPLOYEE_ID", nullable = true, precision = 0)
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
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
    @Column(name = "USER_ID", nullable = true, precision = 0)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
    @Column(name = "TRANS_DATE", nullable = false)
    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    @Basic
    @Column(name = "TRANS_DESCRIPTION", nullable = true, length = 1000)
    public String getTransDescription() {
        return transDescription;
    }

    public void setTransDescription(String transDescription) {
        this.transDescription = transDescription;
    }

    @Basic
    @Column(name = "DOCUMENT_ID", nullable = true, precision = 0)
    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    @Basic
    @Column(name = "DOCUMENT_DATE", nullable = true)
    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    @Basic
    @Column(name = "TRANS_QTY", nullable = false)
    public Object getTransQty() {
        return transQty;
    }

    public void setTransQty(Object transQty) {
        this.transQty = transQty;
    }

    @Basic
    @Column(name = "PREV_STOCK_QTY", nullable = true)
    public Object getPrevStockQty() {
        return prevStockQty;
    }

    public void setPrevStockQty(Object prevStockQty) {
        this.prevStockQty = prevStockQty;
    }

    @Basic
    @Column(name = "NEW_STOCK_QTY", nullable = true)
    public Object getNewStockQty() {
        return newStockQty;
    }

    public void setNewStockQty(Object newStockQty) {
        this.newStockQty = newStockQty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InventoryTransaction that = (InventoryTransaction) o;
        return transId == that.transId && itemId == that.itemId && Objects.equals(transType, that.transType) && Objects.equals(supplierId, that.supplierId) && Objects.equals(employeeId, that.employeeId) && Objects.equals(userId, that.userId) && Objects.equals(storeId, that.storeId) && Objects.equals(transDate, that.transDate) && Objects.equals(transDescription, that.transDescription) && Objects.equals(documentId, that.documentId) && Objects.equals(documentDate, that.documentDate) && Objects.equals(transQty, that.transQty) && Objects.equals(prevStockQty, that.prevStockQty) && Objects.equals(newStockQty, that.newStockQty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transId, transType, supplierId, employeeId, itemId, userId, storeId, transDate, transDescription, documentId, documentDate, transQty, prevStockQty, newStockQty);
    }
}

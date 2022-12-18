package kr.kmu.ims.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "PURCHASE_ORDER_DETAILS", schema = "C##IMS", catalog = "")
public class PurchaseOrderDetail {
    private int purchaseOrderDetailId;
    private int purchaseOrderId;
    private Integer polineNumber;
    private Integer itemId;
    private String itemCode;
    private String itemDescription;
    private String manufacturerPartNo;
    private String uom;
    private Object orderQty;
    private Timestamp dueDate;
    private Object receivedQty;
    private Object unitPrice;
    private Object netAmount;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PURCHASE_ORDER_DETAIL_ID", nullable = false, precision = 0)
    public int getPurchaseOrderDetailId() {
        return purchaseOrderDetailId;
    }

    public void setPurchaseOrderDetailId(int purchaseOrderDetailId) {
        this.purchaseOrderDetailId = purchaseOrderDetailId;
    }

    @Basic
    @Column(name = "PURCHASE_ORDER_ID", nullable = false, precision = 0)
    public int getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(int purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    @Basic
    @Column(name = "POLINE_NUMBER", nullable = true, precision = 0)
    public Integer getPolineNumber() {
        return polineNumber;
    }

    public void setPolineNumber(Integer polineNumber) {
        this.polineNumber = polineNumber;
    }

    @Basic
    @Column(name = "ITEM_ID", nullable = true, precision = 0)
    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "ITEM_CODE", nullable = true, length = 50)
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Basic
    @Column(name = "ITEM_DESCRIPTION", nullable = true, length = 255)
    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    @Basic
    @Column(name = "MANUFACTURER_PART_NO", nullable = true, length = 50)
    public String getManufacturerPartNo() {
        return manufacturerPartNo;
    }

    public void setManufacturerPartNo(String manufacturerPartNo) {
        this.manufacturerPartNo = manufacturerPartNo;
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
    @Column(name = "ORDER_QTY", nullable = true)
    public Object getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(Object orderQty) {
        this.orderQty = orderQty;
    }

    @Basic
    @Column(name = "DUE_DATE", nullable = true)
    public Timestamp getDueDate() {
        return dueDate;
    }

    public void setDueDate(Timestamp dueDate) {
        this.dueDate = dueDate;
    }

    @Basic
    @Column(name = "RECEIVED_QTY", nullable = true)
    public Object getReceivedQty() {
        return receivedQty;
    }

    public void setReceivedQty(Object receivedQty) {
        this.receivedQty = receivedQty;
    }

    @Basic
    @Column(name = "UNIT_PRICE", nullable = true)
    public Object getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Object unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "NET_AMOUNT", nullable = true)
    public Object getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Object netAmount) {
        this.netAmount = netAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseOrderDetail that = (PurchaseOrderDetail) o;
        return purchaseOrderDetailId == that.purchaseOrderDetailId && purchaseOrderId == that.purchaseOrderId && Objects.equals(polineNumber, that.polineNumber) && Objects.equals(itemId, that.itemId) && Objects.equals(itemCode, that.itemCode) && Objects.equals(itemDescription, that.itemDescription) && Objects.equals(manufacturerPartNo, that.manufacturerPartNo) && Objects.equals(uom, that.uom) && Objects.equals(orderQty, that.orderQty) && Objects.equals(dueDate, that.dueDate) && Objects.equals(receivedQty, that.receivedQty) && Objects.equals(unitPrice, that.unitPrice) && Objects.equals(netAmount, that.netAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchaseOrderDetailId, purchaseOrderId, polineNumber, itemId, itemCode, itemDescription, manufacturerPartNo, uom, orderQty, dueDate, receivedQty, unitPrice, netAmount);
    }
}

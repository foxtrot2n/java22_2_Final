package kr.kmu.ims.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PURCHASE_RETURN_DETAILS", schema = "C##IMS", catalog = "")
public class PurchaseReturnDetail {
    private int purchaseReturnDetailId;
    private int purchaseReturnId;
    private Integer polineNumber;
    private int itemId;
    private String manufacturerPartNo;
    private String uom;
    private Object orderQty;
    private Object unitPrice;
    private Object netAmount;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PURCHASE_RETURN_DETAIL_ID", nullable = false, precision = 0)
    public int getPurchaseReturnDetailId() {
        return purchaseReturnDetailId;
    }

    public void setPurchaseReturnDetailId(int purchaseReturnDetailId) {
        this.purchaseReturnDetailId = purchaseReturnDetailId;
    }

    @Basic
    @Column(name = "PURCHASE_RETURN_ID", nullable = false, precision = 0)
    public int getPurchaseReturnId() {
        return purchaseReturnId;
    }

    public void setPurchaseReturnId(int purchaseReturnId) {
        this.purchaseReturnId = purchaseReturnId;
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
    @Column(name = "ITEM_ID", nullable = false, precision = 0)
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
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
    @Column(name = "ORDER_QTY", nullable = false)
    public Object getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(Object orderQty) {
        this.orderQty = orderQty;
    }

    @Basic
    @Column(name = "UNIT_PRICE", nullable = false)
    public Object getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Object unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "NET_AMOUNT", nullable = false)
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
        PurchaseReturnDetail that = (PurchaseReturnDetail) o;
        return purchaseReturnDetailId == that.purchaseReturnDetailId && purchaseReturnId == that.purchaseReturnId && itemId == that.itemId && Objects.equals(polineNumber, that.polineNumber) && Objects.equals(manufacturerPartNo, that.manufacturerPartNo) && Objects.equals(uom, that.uom) && Objects.equals(orderQty, that.orderQty) && Objects.equals(unitPrice, that.unitPrice) && Objects.equals(netAmount, that.netAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchaseReturnDetailId, purchaseReturnId, polineNumber, itemId, manufacturerPartNo, uom, orderQty, unitPrice, netAmount);
    }
}

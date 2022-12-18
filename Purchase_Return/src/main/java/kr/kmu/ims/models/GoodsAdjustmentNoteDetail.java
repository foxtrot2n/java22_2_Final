package kr.kmu.ims.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "GOODS_ADJUSTMENT_NOTE_DETAILS", schema = "C##IMS", catalog = "")
public class GoodsAdjustmentNoteDetail {
    private int goodsAdjustmentNoteDetailId;
    private int goodsAdjustmentNoteId;
    private int itemId;
    private String itemCode;
    private String itemDescription;
    private Object stockQty;
    private String uom;
    private Object adjustmentQty;
    private String location;
    private String adjustmentReason;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "GOODS_ADJUSTMENT_NOTE_DETAIL_ID", nullable = false, precision = 0)
    public int getGoodsAdjustmentNoteDetailId() {
        return goodsAdjustmentNoteDetailId;
    }

    public void setGoodsAdjustmentNoteDetailId(int goodsAdjustmentNoteDetailId) {
        this.goodsAdjustmentNoteDetailId = goodsAdjustmentNoteDetailId;
    }

    @Basic
    @Column(name = "GOODS_ADJUSTMENT_NOTE_ID", nullable = false, precision = 0)
    public int getGoodsAdjustmentNoteId() {
        return goodsAdjustmentNoteId;
    }

    public void setGoodsAdjustmentNoteId(int goodsAdjustmentNoteId) {
        this.goodsAdjustmentNoteId = goodsAdjustmentNoteId;
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
    @Column(name = "ITEM_CODE", nullable = false, length = 50)
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Basic
    @Column(name = "ITEM_DESCRIPTION", nullable = false, length = 255)
    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
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
    @Column(name = "UOM", nullable = true, length = 50)
    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    @Basic
    @Column(name = "ADJUSTMENT_QTY", nullable = false)
    public Object getAdjustmentQty() {
        return adjustmentQty;
    }

    public void setAdjustmentQty(Object adjustmentQty) {
        this.adjustmentQty = adjustmentQty;
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
    @Column(name = "ADJUSTMENT_REASON", nullable = true, length = 50)
    public String getAdjustmentReason() {
        return adjustmentReason;
    }

    public void setAdjustmentReason(String adjustmentReason) {
        this.adjustmentReason = adjustmentReason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodsAdjustmentNoteDetail that = (GoodsAdjustmentNoteDetail) o;
        return goodsAdjustmentNoteDetailId == that.goodsAdjustmentNoteDetailId && goodsAdjustmentNoteId == that.goodsAdjustmentNoteId && itemId == that.itemId && Objects.equals(itemCode, that.itemCode) && Objects.equals(itemDescription, that.itemDescription) && Objects.equals(stockQty, that.stockQty) && Objects.equals(uom, that.uom) && Objects.equals(adjustmentQty, that.adjustmentQty) && Objects.equals(location, that.location) && Objects.equals(adjustmentReason, that.adjustmentReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsAdjustmentNoteDetailId, goodsAdjustmentNoteId, itemId, itemCode, itemDescription, stockQty, uom, adjustmentQty, location, adjustmentReason);
    }
}

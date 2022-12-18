package kr.kmu.ims.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "GOODS_TRANSFER_NOTE_DETAILS", schema = "C##IMS", catalog = "")
public class GoodsTransferNoteDetail {
    private int goodsTransferNoteDetailId;
    private int goodsTransferNoteId;
    private int itemId;
    private String uom;
    private Object transQty;
    private String location;
    private String reason;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "GOODS_TRANSFER_NOTE_DETAIL_ID", nullable = false, precision = 0)
    public int getGoodsTransferNoteDetailId() {
        return goodsTransferNoteDetailId;
    }

    public void setGoodsTransferNoteDetailId(int goodsTransferNoteDetailId) {
        this.goodsTransferNoteDetailId = goodsTransferNoteDetailId;
    }

    @Basic
    @Column(name = "GOODS_TRANSFER_NOTE_ID", nullable = false, precision = 0)
    public int getGoodsTransferNoteId() {
        return goodsTransferNoteId;
    }

    public void setGoodsTransferNoteId(int goodsTransferNoteId) {
        this.goodsTransferNoteId = goodsTransferNoteId;
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
    @Column(name = "UOM", nullable = true, length = 50)
    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
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
    @Column(name = "LOCATION", nullable = true, length = 50)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "REASON", nullable = true, length = 100)
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodsTransferNoteDetail that = (GoodsTransferNoteDetail) o;
        return goodsTransferNoteDetailId == that.goodsTransferNoteDetailId && goodsTransferNoteId == that.goodsTransferNoteId && itemId == that.itemId && Objects.equals(uom, that.uom) && Objects.equals(transQty, that.transQty) && Objects.equals(location, that.location) && Objects.equals(reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsTransferNoteDetailId, goodsTransferNoteId, itemId, uom, transQty, location, reason);
    }
}

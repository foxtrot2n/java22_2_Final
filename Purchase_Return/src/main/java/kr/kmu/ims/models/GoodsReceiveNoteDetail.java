package kr.kmu.ims.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "GOODS_RECEIVE_NOTE_DETAILS", schema = "C##IMS", catalog = "")
public class GoodsReceiveNoteDetail {
    private int goodsReceiveNoteDetailId;
    private int goodsReceiveNoteId;
    private Integer itemId;
    private Object receivedQty;
    private Object returnedQty;
    private String location;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "GOODS_RECEIVE_NOTE_DETAIL_ID", nullable = false, precision = 0)
    public int getGoodsReceiveNoteDetailId() {
        return goodsReceiveNoteDetailId;
    }

    public void setGoodsReceiveNoteDetailId(int goodsReceiveNoteDetailId) {
        this.goodsReceiveNoteDetailId = goodsReceiveNoteDetailId;
    }

    @Basic
    @Column(name = "GOODS_RECEIVE_NOTE_ID", nullable = false, precision = 0)
    public int getGoodsReceiveNoteId() {
        return goodsReceiveNoteId;
    }

    public void setGoodsReceiveNoteId(int goodsReceiveNoteId) {
        this.goodsReceiveNoteId = goodsReceiveNoteId;
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
    @Column(name = "RECEIVED_QTY", nullable = false)
    public Object getReceivedQty() {
        return receivedQty;
    }

    public void setReceivedQty(Object receivedQty) {
        this.receivedQty = receivedQty;
    }

    @Basic
    @Column(name = "RETURNED_QTY", nullable = false)
    public Object getReturnedQty() {
        return returnedQty;
    }

    public void setReturnedQty(Object returnedQty) {
        this.returnedQty = returnedQty;
    }

    @Basic
    @Column(name = "LOCATION", nullable = true, length = 255)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodsReceiveNoteDetail that = (GoodsReceiveNoteDetail) o;
        return goodsReceiveNoteDetailId == that.goodsReceiveNoteDetailId && goodsReceiveNoteId == that.goodsReceiveNoteId && Objects.equals(itemId, that.itemId) && Objects.equals(receivedQty, that.receivedQty) && Objects.equals(returnedQty, that.returnedQty) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsReceiveNoteDetailId, goodsReceiveNoteId, itemId, receivedQty, returnedQty, location);
    }
}

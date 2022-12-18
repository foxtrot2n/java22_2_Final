package kr.kmu.ims.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "GOODS_ISSUE_NOTE_DETAILS", schema = "C##IMS", catalog = "")
public class GoodsIssueNoteDetail {
    private int goodsIssueNoteDetailId;
    private int goodsIssueNoteId;
    private int itemId;
    private String location;
    private String uom;
    private Object issueQty;
    private String remarks;
    private Object returnQty;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "GOODS_ISSUE_NOTE_DETAIL_ID", nullable = false, precision = 0)
    public int getGoodsIssueNoteDetailId() {
        return goodsIssueNoteDetailId;
    }

    public void setGoodsIssueNoteDetailId(int goodsIssueNoteDetailId) {
        this.goodsIssueNoteDetailId = goodsIssueNoteDetailId;
    }

    @Basic
    @Column(name = "GOODS_ISSUE_NOTE_ID", nullable = false, precision = 0)
    public int getGoodsIssueNoteId() {
        return goodsIssueNoteId;
    }

    public void setGoodsIssueNoteId(int goodsIssueNoteId) {
        this.goodsIssueNoteId = goodsIssueNoteId;
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
    @Column(name = "LOCATION", nullable = true, length = 255)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "UOM", nullable = true, length = 255)
    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    @Basic
    @Column(name = "ISSUE_QTY", nullable = false)
    public Object getIssueQty() {
        return issueQty;
    }

    public void setIssueQty(Object issueQty) {
        this.issueQty = issueQty;
    }

    @Basic
    @Column(name = "REMARKS", nullable = true, length = 2000)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "RETURN_QTY", nullable = false)
    public Object getReturnQty() {
        return returnQty;
    }

    public void setReturnQty(Object returnQty) {
        this.returnQty = returnQty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodsIssueNoteDetail that = (GoodsIssueNoteDetail) o;
        return goodsIssueNoteDetailId == that.goodsIssueNoteDetailId && goodsIssueNoteId == that.goodsIssueNoteId && itemId == that.itemId && Objects.equals(location, that.location) && Objects.equals(uom, that.uom) && Objects.equals(issueQty, that.issueQty) && Objects.equals(remarks, that.remarks) && Objects.equals(returnQty, that.returnQty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsIssueNoteDetailId, goodsIssueNoteId, itemId, location, uom, issueQty, remarks, returnQty);
    }
}

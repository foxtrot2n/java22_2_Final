package kr.kmu.ims.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "GOODS_ISSUE_NOTE_DETAILS_VIEW", schema = "C##IMS", catalog = "")
public class GoodsIssueNoteDetailView {
    private int goodsIssueNoteDetailId;
    private int goodsIssueNoteId;
    private int itemId;
    private String location;
    private String uom;
    private Object issueQty;
    private String remarks;
    private Object returnQty;
    private String itemCode;
    private String itemName;

    @Basic
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodsIssueNoteDetailView that = (GoodsIssueNoteDetailView) o;
        return goodsIssueNoteDetailId == that.goodsIssueNoteDetailId && goodsIssueNoteId == that.goodsIssueNoteId && itemId == that.itemId && Objects.equals(location, that.location) && Objects.equals(uom, that.uom) && Objects.equals(issueQty, that.issueQty) && Objects.equals(remarks, that.remarks) && Objects.equals(returnQty, that.returnQty) && Objects.equals(itemCode, that.itemCode) && Objects.equals(itemName, that.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsIssueNoteDetailId, goodsIssueNoteId, itemId, location, uom, issueQty, remarks, returnQty, itemCode, itemName);
    }
}

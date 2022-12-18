package kr.kmu.ims.models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "GOODS_RECEIVE_NOTES", schema = "C##IMS", catalog = "")
public class GoodsReceiveNote {
    private int goodsReceiveNoteId;
    private String documentNo;
    private Integer supplierId;
    private String transType;
    private Date receiveDate;
    private String remarks;
    private Integer storeId;
    private Integer createdBy;
    private Date createdOn;
    private Integer lastUpdatedBy;
    private Date lastUpdatedOn;
    private String status;
    private Date statusDate;
    private Boolean isFinalized;
    private Integer finalizedBy;
    private Date finalizedOn;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "GOODS_RECEIVE_NOTE_ID", nullable = false, precision = 0)
    public int getGoodsReceiveNoteId() {
        return goodsReceiveNoteId;
    }

    public void setGoodsReceiveNoteId(int goodsReceiveNoteId) {
        this.goodsReceiveNoteId = goodsReceiveNoteId;
    }

    @Basic
    @Column(name = "DOCUMENT_NO", nullable = true, length = 50)
    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
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
    @Column(name = "TRANS_TYPE", nullable = true, length = 50)
    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    @Basic
    @Column(name = "RECEIVE_DATE", nullable = true)
    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    @Basic
    @Column(name = "REMARKS", nullable = true, length = 1000)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
    @Column(name = "CREATED_BY", nullable = true, precision = 0)
    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "CREATED_ON", nullable = true)
    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
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
    public Date getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Date lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, length = 50)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "STATUS_DATE", nullable = true)
    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    @Basic
    @Column(name = "IS_FINALIZED", nullable = true, precision = 0)
    public Boolean getFinalized() {
        return isFinalized;
    }

    public void setFinalized(Boolean finalized) {
        isFinalized = finalized;
    }

    @Basic
    @Column(name = "FINALIZED_BY", nullable = true, precision = 0)
    public Integer getFinalizedBy() {
        return finalizedBy;
    }

    public void setFinalizedBy(Integer finalizedBy) {
        this.finalizedBy = finalizedBy;
    }

    @Basic
    @Column(name = "FINALIZED_ON", nullable = true)
    public Date getFinalizedOn() {
        return finalizedOn;
    }

    public void setFinalizedOn(Date finalizedOn) {
        this.finalizedOn = finalizedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodsReceiveNote that = (GoodsReceiveNote) o;
        return goodsReceiveNoteId == that.goodsReceiveNoteId && Objects.equals(documentNo, that.documentNo) && Objects.equals(supplierId, that.supplierId) && Objects.equals(transType, that.transType) && Objects.equals(receiveDate, that.receiveDate) && Objects.equals(remarks, that.remarks) && Objects.equals(storeId, that.storeId) && Objects.equals(createdBy, that.createdBy) && Objects.equals(createdOn, that.createdOn) && Objects.equals(lastUpdatedBy, that.lastUpdatedBy) && Objects.equals(lastUpdatedOn, that.lastUpdatedOn) && Objects.equals(status, that.status) && Objects.equals(statusDate, that.statusDate) && Objects.equals(isFinalized, that.isFinalized) && Objects.equals(finalizedBy, that.finalizedBy) && Objects.equals(finalizedOn, that.finalizedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsReceiveNoteId, documentNo, supplierId, transType, receiveDate, remarks, storeId, createdBy, createdOn, lastUpdatedBy, lastUpdatedOn, status, statusDate, isFinalized, finalizedBy, finalizedOn);
    }
}

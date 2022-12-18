package kr.kmu.ims.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "GOODS_TRANSFER_NOTES", schema = "C##IMS", catalog = "")
public class GoodsTransferNote {
    private int goodsTransferNoteId;
    private String documentNo;
    private String transType;
    private String transferMode;
    private Integer fromStoreId;
    private Integer toStoreId;
    private String reason;
    private String remarks;
    private Integer createdBy;
    private Timestamp createdOn;
    private Integer lastUpdatedBy;
    private Timestamp lastUpdatedOn;
    private String status;
    private Timestamp statusDate;
    private Boolean isFinalized;
    private Integer finalizedBy;
    private Timestamp finalizedOn;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "GOODS_TRANSFER_NOTE_ID", nullable = false, precision = 0)
    public int getGoodsTransferNoteId() {
        return goodsTransferNoteId;
    }

    public void setGoodsTransferNoteId(int goodsTransferNoteId) {
        this.goodsTransferNoteId = goodsTransferNoteId;
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
    @Column(name = "TRANS_TYPE", nullable = true, length = 50)
    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    @Basic
    @Column(name = "TRANSFER_MODE", nullable = true, length = 50)
    public String getTransferMode() {
        return transferMode;
    }

    public void setTransferMode(String transferMode) {
        this.transferMode = transferMode;
    }

    @Basic
    @Column(name = "FROM_STORE_ID", nullable = true, precision = 0)
    public Integer getFromStoreId() {
        return fromStoreId;
    }

    public void setFromStoreId(Integer fromStoreId) {
        this.fromStoreId = fromStoreId;
    }

    @Basic
    @Column(name = "TO_STORE_ID", nullable = true, precision = 0)
    public Integer getToStoreId() {
        return toStoreId;
    }

    public void setToStoreId(Integer toStoreId) {
        this.toStoreId = toStoreId;
    }

    @Basic
    @Column(name = "REASON", nullable = true, length = 100)
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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
    public Timestamp getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Timestamp statusDate) {
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
    public Timestamp getFinalizedOn() {
        return finalizedOn;
    }

    public void setFinalizedOn(Timestamp finalizedOn) {
        this.finalizedOn = finalizedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodsTransferNote that = (GoodsTransferNote) o;
        return goodsTransferNoteId == that.goodsTransferNoteId && Objects.equals(documentNo, that.documentNo) && Objects.equals(transType, that.transType) && Objects.equals(transferMode, that.transferMode) && Objects.equals(fromStoreId, that.fromStoreId) && Objects.equals(toStoreId, that.toStoreId) && Objects.equals(reason, that.reason) && Objects.equals(remarks, that.remarks) && Objects.equals(createdBy, that.createdBy) && Objects.equals(createdOn, that.createdOn) && Objects.equals(lastUpdatedBy, that.lastUpdatedBy) && Objects.equals(lastUpdatedOn, that.lastUpdatedOn) && Objects.equals(status, that.status) && Objects.equals(statusDate, that.statusDate) && Objects.equals(isFinalized, that.isFinalized) && Objects.equals(finalizedBy, that.finalizedBy) && Objects.equals(finalizedOn, that.finalizedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsTransferNoteId, documentNo, transType, transferMode, fromStoreId, toStoreId, reason, remarks, createdBy, createdOn, lastUpdatedBy, lastUpdatedOn, status, statusDate, isFinalized, finalizedBy, finalizedOn);
    }
}

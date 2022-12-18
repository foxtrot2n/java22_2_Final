package kr.kmu.ims.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "PURCHASE_ORDERS", schema = "C##IMS", catalog = "")
public class PurchaseOrder {
    private int purchaseOrderId;
    private String documentNo;
    private Integer supplierid;
    private Timestamp orderDate;
    private String supplierCode;
    private String supplierName;
    private String contactName;
    private String contactTitle;
    private String shipToContactName;
    private String shipToContactTitle;
    private String shipToStreetAddress;
    private String shipToCity;
    private String shipToStateProvince;
    private String shipToZipPostalCode;
    private String shipToCountry;
    private String shipToPhone;
    private String shipToEmailAddress;
    private String billToContactName;
    private String billToContactTitle;
    private String billToStreetAddress;
    private String billToCity;
    private String billToStateProvince;
    private String billToZipPostalCode;
    private String billToCountry;
    private String billToPhone;
    private String billToEmailAddress;
    private Timestamp requiredDate;
    private Timestamp promiseDate;
    private Timestamp paymentDueDate;
    private String remarks;
    private String paymentTerms;
    private String shipMethod;
    private Object netAmount;
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
    @Column(name = "PURCHASE_ORDER_ID", nullable = false, precision = 0)
    public int getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(int purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
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
    @Column(name = "SUPPLIERID", nullable = true, precision = 0)
    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    @Basic
    @Column(name = "ORDER_DATE", nullable = true)
    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "SUPPLIER_CODE", nullable = true, length = 50)
    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    @Basic
    @Column(name = "SUPPLIER_NAME", nullable = true, length = 255)
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Basic
    @Column(name = "CONTACT_NAME", nullable = true, length = 50)
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    @Basic
    @Column(name = "CONTACT_TITLE", nullable = true, length = 50)
    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    @Basic
    @Column(name = "SHIP_TO_CONTACT_NAME", nullable = true, length = 50)
    public String getShipToContactName() {
        return shipToContactName;
    }

    public void setShipToContactName(String shipToContactName) {
        this.shipToContactName = shipToContactName;
    }

    @Basic
    @Column(name = "SHIP_TO_CONTACT_TITLE", nullable = true, length = 50)
    public String getShipToContactTitle() {
        return shipToContactTitle;
    }

    public void setShipToContactTitle(String shipToContactTitle) {
        this.shipToContactTitle = shipToContactTitle;
    }

    @Basic
    @Column(name = "SHIP_TO_STREET_ADDRESS", nullable = true, length = 255)
    public String getShipToStreetAddress() {
        return shipToStreetAddress;
    }

    public void setShipToStreetAddress(String shipToStreetAddress) {
        this.shipToStreetAddress = shipToStreetAddress;
    }

    @Basic
    @Column(name = "SHIP_TO_CITY", nullable = true, length = 50)
    public String getShipToCity() {
        return shipToCity;
    }

    public void setShipToCity(String shipToCity) {
        this.shipToCity = shipToCity;
    }

    @Basic
    @Column(name = "SHIP_TO_STATE_PROVINCE", nullable = true, length = 50)
    public String getShipToStateProvince() {
        return shipToStateProvince;
    }

    public void setShipToStateProvince(String shipToStateProvince) {
        this.shipToStateProvince = shipToStateProvince;
    }

    @Basic
    @Column(name = "SHIP_TO_ZIP_POSTAL_CODE", nullable = true, length = 50)
    public String getShipToZipPostalCode() {
        return shipToZipPostalCode;
    }

    public void setShipToZipPostalCode(String shipToZipPostalCode) {
        this.shipToZipPostalCode = shipToZipPostalCode;
    }

    @Basic
    @Column(name = "SHIP_TO_COUNTRY", nullable = true, length = 50)
    public String getShipToCountry() {
        return shipToCountry;
    }

    public void setShipToCountry(String shipToCountry) {
        this.shipToCountry = shipToCountry;
    }

    @Basic
    @Column(name = "SHIP_TO_PHONE", nullable = true, length = 50)
    public String getShipToPhone() {
        return shipToPhone;
    }

    public void setShipToPhone(String shipToPhone) {
        this.shipToPhone = shipToPhone;
    }

    @Basic
    @Column(name = "SHIP_TO_EMAIL_ADDRESS", nullable = true, length = 255)
    public String getShipToEmailAddress() {
        return shipToEmailAddress;
    }

    public void setShipToEmailAddress(String shipToEmailAddress) {
        this.shipToEmailAddress = shipToEmailAddress;
    }

    @Basic
    @Column(name = "BILL_TO_CONTACT_NAME", nullable = true, length = 50)
    public String getBillToContactName() {
        return billToContactName;
    }

    public void setBillToContactName(String billToContactName) {
        this.billToContactName = billToContactName;
    }

    @Basic
    @Column(name = "BILL_TO_CONTACT_TITLE", nullable = true, length = 50)
    public String getBillToContactTitle() {
        return billToContactTitle;
    }

    public void setBillToContactTitle(String billToContactTitle) {
        this.billToContactTitle = billToContactTitle;
    }

    @Basic
    @Column(name = "BILL_TO_STREET_ADDRESS", nullable = true, length = 255)
    public String getBillToStreetAddress() {
        return billToStreetAddress;
    }

    public void setBillToStreetAddress(String billToStreetAddress) {
        this.billToStreetAddress = billToStreetAddress;
    }

    @Basic
    @Column(name = "BILL_TO_CITY", nullable = true, length = 50)
    public String getBillToCity() {
        return billToCity;
    }

    public void setBillToCity(String billToCity) {
        this.billToCity = billToCity;
    }

    @Basic
    @Column(name = "BILL_TO_STATE_PROVINCE", nullable = true, length = 50)
    public String getBillToStateProvince() {
        return billToStateProvince;
    }

    public void setBillToStateProvince(String billToStateProvince) {
        this.billToStateProvince = billToStateProvince;
    }

    @Basic
    @Column(name = "BILL_TO_ZIP_POSTAL_CODE", nullable = true, length = 50)
    public String getBillToZipPostalCode() {
        return billToZipPostalCode;
    }

    public void setBillToZipPostalCode(String billToZipPostalCode) {
        this.billToZipPostalCode = billToZipPostalCode;
    }

    @Basic
    @Column(name = "BILL_TO_COUNTRY", nullable = true, length = 50)
    public String getBillToCountry() {
        return billToCountry;
    }

    public void setBillToCountry(String billToCountry) {
        this.billToCountry = billToCountry;
    }

    @Basic
    @Column(name = "BILL_TO_PHONE", nullable = true, length = 50)
    public String getBillToPhone() {
        return billToPhone;
    }

    public void setBillToPhone(String billToPhone) {
        this.billToPhone = billToPhone;
    }

    @Basic
    @Column(name = "BILL_TO_EMAIL_ADDRESS", nullable = true, length = 255)
    public String getBillToEmailAddress() {
        return billToEmailAddress;
    }

    public void setBillToEmailAddress(String billToEmailAddress) {
        this.billToEmailAddress = billToEmailAddress;
    }

    @Basic
    @Column(name = "REQUIRED_DATE", nullable = true)
    public Timestamp getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Timestamp requiredDate) {
        this.requiredDate = requiredDate;
    }

    @Basic
    @Column(name = "PROMISE_DATE", nullable = true)
    public Timestamp getPromiseDate() {
        return promiseDate;
    }

    public void setPromiseDate(Timestamp promiseDate) {
        this.promiseDate = promiseDate;
    }

    @Basic
    @Column(name = "PAYMENT_DUE_DATE", nullable = true)
    public Timestamp getPaymentDueDate() {
        return paymentDueDate;
    }

    public void setPaymentDueDate(Timestamp paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
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
    @Column(name = "PAYMENT_TERMS", nullable = true, length = 255)
    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    @Basic
    @Column(name = "SHIP_METHOD", nullable = true, length = 50)
    public String getShipMethod() {
        return shipMethod;
    }

    public void setShipMethod(String shipMethod) {
        this.shipMethod = shipMethod;
    }

    @Basic
    @Column(name = "NET_AMOUNT", nullable = true)
    public Object getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Object netAmount) {
        this.netAmount = netAmount;
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
        PurchaseOrder that = (PurchaseOrder) o;
        return purchaseOrderId == that.purchaseOrderId && Objects.equals(documentNo, that.documentNo) && Objects.equals(supplierid, that.supplierid) && Objects.equals(orderDate, that.orderDate) && Objects.equals(supplierCode, that.supplierCode) && Objects.equals(supplierName, that.supplierName) && Objects.equals(contactName, that.contactName) && Objects.equals(contactTitle, that.contactTitle) && Objects.equals(shipToContactName, that.shipToContactName) && Objects.equals(shipToContactTitle, that.shipToContactTitle) && Objects.equals(shipToStreetAddress, that.shipToStreetAddress) && Objects.equals(shipToCity, that.shipToCity) && Objects.equals(shipToStateProvince, that.shipToStateProvince) && Objects.equals(shipToZipPostalCode, that.shipToZipPostalCode) && Objects.equals(shipToCountry, that.shipToCountry) && Objects.equals(shipToPhone, that.shipToPhone) && Objects.equals(shipToEmailAddress, that.shipToEmailAddress) && Objects.equals(billToContactName, that.billToContactName) && Objects.equals(billToContactTitle, that.billToContactTitle) && Objects.equals(billToStreetAddress, that.billToStreetAddress) && Objects.equals(billToCity, that.billToCity) && Objects.equals(billToStateProvince, that.billToStateProvince) && Objects.equals(billToZipPostalCode, that.billToZipPostalCode) && Objects.equals(billToCountry, that.billToCountry) && Objects.equals(billToPhone, that.billToPhone) && Objects.equals(billToEmailAddress, that.billToEmailAddress) && Objects.equals(requiredDate, that.requiredDate) && Objects.equals(promiseDate, that.promiseDate) && Objects.equals(paymentDueDate, that.paymentDueDate) && Objects.equals(remarks, that.remarks) && Objects.equals(paymentTerms, that.paymentTerms) && Objects.equals(shipMethod, that.shipMethod) && Objects.equals(netAmount, that.netAmount) && Objects.equals(createdBy, that.createdBy) && Objects.equals(createdOn, that.createdOn) && Objects.equals(lastUpdatedBy, that.lastUpdatedBy) && Objects.equals(lastUpdatedOn, that.lastUpdatedOn) && Objects.equals(status, that.status) && Objects.equals(statusDate, that.statusDate) && Objects.equals(isFinalized, that.isFinalized) && Objects.equals(finalizedBy, that.finalizedBy) && Objects.equals(finalizedOn, that.finalizedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchaseOrderId, documentNo, supplierid, orderDate, supplierCode, supplierName, contactName, contactTitle, shipToContactName, shipToContactTitle, shipToStreetAddress, shipToCity, shipToStateProvince, shipToZipPostalCode, shipToCountry, shipToPhone, shipToEmailAddress, billToContactName, billToContactTitle, billToStreetAddress, billToCity, billToStateProvince, billToZipPostalCode, billToCountry, billToPhone, billToEmailAddress, requiredDate, promiseDate, paymentDueDate, remarks, paymentTerms, shipMethod, netAmount, createdBy, createdOn, lastUpdatedBy, lastUpdatedOn, status, statusDate, isFinalized, finalizedBy, finalizedOn);
    }
}

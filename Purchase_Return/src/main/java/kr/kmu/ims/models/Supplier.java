package kr.kmu.ims.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Supplier {
    private int supplierId;
    private String supplierCode;
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String streetAddress;
    private String city;
    private String stateProvince;
    private String zipPostalCode;
    private String country;
    private String phone;
    private String emailAddress;
    private String websiteUrl;
    private String ntn;
    private String salesTaxNo;
    private String lastPurchaseBillNbr;
    private Object lastPurchaseBillAmount;
    private Date lastPurchaseDate;
    private Object balanceAmount;
    private Object creditLimit;
    private Timestamp supplierSince;
    private BigInteger isActive;
    private Integer createdBy;
    private Timestamp createdOn;
    private Integer lastUpdatedBy;
    private Timestamp lastUpdatedOn;
    private String status;
    private Timestamp statusDate;

    @Basic
    @Column(name = "SUPPLIER_ID", nullable = false, precision = 0)
    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
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
    @Column(name = "COMPANY_NAME", nullable = false, length = 50)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
    @Column(name = "STREET_ADDRESS", nullable = true, length = 255)
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    @Basic
    @Column(name = "CITY", nullable = true, length = 50)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "STATE_PROVINCE", nullable = true, length = 50)
    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    @Basic
    @Column(name = "ZIP_POSTAL_CODE", nullable = true, length = 50)
    public String getZipPostalCode() {
        return zipPostalCode;
    }

    public void setZipPostalCode(String zipPostalCode) {
        this.zipPostalCode = zipPostalCode;
    }

    @Basic
    @Column(name = "COUNTRY", nullable = true, length = 50)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "PHONE", nullable = true, length = 50)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "EMAIL_ADDRESS", nullable = true, length = 255)
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Basic
    @Column(name = "WEBSITE_URL", nullable = true, length = 255)
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    @Basic
    @Column(name = "NTN", nullable = true, length = 50)
    public String getNtn() {
        return ntn;
    }

    public void setNtn(String ntn) {
        this.ntn = ntn;
    }

    @Basic
    @Column(name = "SALES_TAX_NO", nullable = true, length = 50)
    public String getSalesTaxNo() {
        return salesTaxNo;
    }

    public void setSalesTaxNo(String salesTaxNo) {
        this.salesTaxNo = salesTaxNo;
    }

    @Basic
    @Column(name = "LAST_PURCHASE_BILL_NBR", nullable = true, length = 50)
    public String getLastPurchaseBillNbr() {
        return lastPurchaseBillNbr;
    }

    public void setLastPurchaseBillNbr(String lastPurchaseBillNbr) {
        this.lastPurchaseBillNbr = lastPurchaseBillNbr;
    }

    @Basic
    @Column(name = "LAST_PURCHASE_BILL_AMOUNT", nullable = false)
    public Object getLastPurchaseBillAmount() {
        return lastPurchaseBillAmount;
    }

    public void setLastPurchaseBillAmount(Object lastPurchaseBillAmount) {
        this.lastPurchaseBillAmount = lastPurchaseBillAmount;
    }

    @Basic
    @Column(name = "LAST_PURCHASE_DATE", nullable = true)
    public Date getLastPurchaseDate() {
        return lastPurchaseDate;
    }

    public void setLastPurchaseDate(Date lastPurchaseDate) {
        this.lastPurchaseDate = lastPurchaseDate;
    }

    @Basic
    @Column(name = "BALANCE_AMOUNT", nullable = false)
    public Object getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(Object balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    @Basic
    @Column(name = "CREDIT_LIMIT", nullable = false)
    public Object getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Object creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Basic
    @Column(name = "SUPPLIER_SINCE", nullable = true)
    public Timestamp getSupplierSince() {
        return supplierSince;
    }

    public void setSupplierSince(Timestamp supplierSince) {
        this.supplierSince = supplierSince;
    }

    @Basic
    @Column(name = "IS_ACTIVE", nullable = true, precision = 0)
    public BigInteger getIsActive() {
        return isActive;
    }

    public void setIsActive(BigInteger isActive) {
        this.isActive = isActive;
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
    @Column(name = "STATUS", nullable = false, length = 50)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "STATUS_DATE", nullable = false)
    public Timestamp getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Timestamp statusDate) {
        this.statusDate = statusDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return supplierId == supplier.supplierId && Objects.equals(supplierCode, supplier.supplierCode) && Objects.equals(companyName, supplier.companyName) && Objects.equals(contactName, supplier.contactName) && Objects.equals(contactTitle, supplier.contactTitle) && Objects.equals(streetAddress, supplier.streetAddress) && Objects.equals(city, supplier.city) && Objects.equals(stateProvince, supplier.stateProvince) && Objects.equals(zipPostalCode, supplier.zipPostalCode) && Objects.equals(country, supplier.country) && Objects.equals(phone, supplier.phone) && Objects.equals(emailAddress, supplier.emailAddress) && Objects.equals(websiteUrl, supplier.websiteUrl) && Objects.equals(ntn, supplier.ntn) && Objects.equals(salesTaxNo, supplier.salesTaxNo) && Objects.equals(lastPurchaseBillNbr, supplier.lastPurchaseBillNbr) && Objects.equals(lastPurchaseBillAmount, supplier.lastPurchaseBillAmount) && Objects.equals(lastPurchaseDate, supplier.lastPurchaseDate) && Objects.equals(balanceAmount, supplier.balanceAmount) && Objects.equals(creditLimit, supplier.creditLimit) && Objects.equals(supplierSince, supplier.supplierSince) && Objects.equals(isActive, supplier.isActive) && Objects.equals(createdBy, supplier.createdBy) && Objects.equals(createdOn, supplier.createdOn) && Objects.equals(lastUpdatedBy, supplier.lastUpdatedBy) && Objects.equals(lastUpdatedOn, supplier.lastUpdatedOn) && Objects.equals(status, supplier.status) && Objects.equals(statusDate, supplier.statusDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierId, supplierCode, companyName, contactName, contactTitle, streetAddress, city, stateProvince, zipPostalCode, country, phone, emailAddress, websiteUrl, ntn, salesTaxNo, lastPurchaseBillNbr, lastPurchaseBillAmount, lastPurchaseDate, balanceAmount, creditLimit, supplierSince, isActive, createdBy, createdOn, lastUpdatedBy, lastUpdatedOn, status, statusDate);
    }
}

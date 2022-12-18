package kr.kmu.ims.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "WORK_CENTERS", schema = "C##IMS", catalog = "")
public class WorkCenter {
    private int workCenterId;
    private String workCenterName;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "WORK_CENTER_ID", nullable = false, precision = 0)
    public int getWorkCenterId() {
        return workCenterId;
    }

    public void setWorkCenterId(int workCenterId) {
        this.workCenterId = workCenterId;
    }

    @Basic
    @Column(name = "WORK_CENTER_NAME", nullable = true, length = 50)
    public String getWorkCenterName() {
        return workCenterName;
    }

    public void setWorkCenterName(String workCenterName) {
        this.workCenterName = workCenterName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkCenter that = (WorkCenter) o;
        return workCenterId == that.workCenterId && Objects.equals(workCenterName, that.workCenterName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workCenterId, workCenterName);
    }
}

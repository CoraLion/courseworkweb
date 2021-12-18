package ua.mk.cora.laba134.enities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "staff", schema = "horsealtair", catalog = "")
public class StaffEntity {
    private int staffid;
    private String name;
    private Long salary;
    private Collection<WorkersEntity> workersByStaffid;

    @Id
    @Column(name = "STAFFID")
    public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SALARY")
    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }


    @OneToMany(mappedBy = "staffByStaffStaffid")
    public Collection<WorkersEntity> getWorkersByStaffid() {
        return workersByStaffid;
    }

    public void setWorkersByStaffid(Collection<WorkersEntity> workersByStaffid) {
        this.workersByStaffid = workersByStaffid;
    }
}

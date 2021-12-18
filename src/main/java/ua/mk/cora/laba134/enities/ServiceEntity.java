package ua.mk.cora.laba134.enities;

import jakarta.persistence.*;

@Entity
@Table(name = "service")
public class ServiceEntity {
    private int serviceid;
    private String name;
    private Integer userUsid;
    private Integer workerWorkid;
    private UsersEntity usersByUserUsid;
    private WorkersEntity workersByWorkerWorkid;

    @Id
    @Column(name = "SERVICEID")
    public int getServiceid() {
        return serviceid;
    }

    public void setServiceid(int serviceid) {
        this.serviceid = serviceid;
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
    @Column(name = "USER_USID")
    public Integer getUserUsid() {
        return userUsid;
    }

    public void setUserUsid(Integer userUsid) {
        this.userUsid = userUsid;
    }

    @Basic
    @Column(name = "WORKER_WORKID")
    public Integer getWorkerWorkid() {
        return workerWorkid;
    }

    public void setWorkerWorkid(Integer workerWorkid) {
        this.workerWorkid = workerWorkid;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "USER_USID", referencedColumnName = "USID")
    public UsersEntity getUsersByUserUsid() {
        return usersByUserUsid;
    }

    public void setUsersByUserUsid(UsersEntity usersByUserUsid) {
        this.usersByUserUsid = usersByUserUsid;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "WORKER_WORKID", referencedColumnName = "WORKID")
    public WorkersEntity getWorkersByWorkerWorkid() {
        return workersByWorkerWorkid;
    }

    public void setWorkersByWorkerWorkid(WorkersEntity workersByWorkerWorkid) {
        this.workersByWorkerWorkid = workersByWorkerWorkid;
    }
}

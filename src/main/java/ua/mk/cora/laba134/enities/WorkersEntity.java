package ua.mk.cora.laba134.enities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "workers")
@NamedQueries({@NamedQuery(name = "Workers.FindSch", query = "select w.threename, sc.day, sc.time from WorkersEntity w join ServiceEntity s on w.workid = s.workerWorkid inner join UsersEntity us on s.userUsid=us.usid inner join ScheduleEntity sc on sc.userUsid=us.usid"),
        @NamedQuery(name = "Workers.findOneTrain", query = "select w from WorkersEntity w inner join fetch w.staffByStaffStaffid st where st.name like '%Dressage%'"),
        @NamedQuery(name = "Workers.findTwoTrain", query = "select w from WorkersEntity w inner join fetch w.staffByStaffStaffid st where st.name like '%Jumping%'"),
        @NamedQuery(name = "Workers.findThreeTrain", query = "select w from WorkersEntity w inner join fetch w.staffByStaffStaffid st where st.name like '%profi%'"),
        @NamedQuery(name = "Workers.findFourTrain", query = "select w from WorkersEntity w inner join fetch w.staffByStaffStaffid st where st.name like '%newbies%'"),
        @NamedQuery(name = "Workers.findAll", query = "select w from WorkersEntity w")})
public class WorkersEntity {
    private int workid;
    private Date birthday;
    private String firstname;
    private Long phone;
    private String secondname;
    private String sex;
    private String threename;
    private Integer staffStaffid;
    private List<ServiceEntity> servicesByWorkid;
    private StaffEntity staffByStaffStaffid;

    @Id
    @Column(name = "WORKID")
    public int getWorkid() {
        return workid;
    }

    public void setWorkid(int workid) {
        this.workid = workid;
    }

    @Basic
    @Column(name = "BIRTHDAY")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "PHONE")
    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "SECONDNAME")
    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    @Basic
    @Column(name = "SEX")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "THREENAME")
    public String getThreename() {
        return threename;
    }

    public void setThreename(String threename) {
        this.threename = threename;
    }

    @Basic
    @Column(name = "STAFF_STAFFID")
    public Integer getStaffStaffid() {
        return staffStaffid;
    }

    public void setStaffStaffid(Integer staffStaffid) {
        this.staffStaffid = staffStaffid;
    }

    @OneToMany(mappedBy = "workersByWorkerWorkid")
    public List<ServiceEntity> getServicesByWorkid() {
        return servicesByWorkid;
    }

    public void setServicesByWorkid(List<ServiceEntity> servicesByWorkid) {
        this.servicesByWorkid = servicesByWorkid;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "STAFF_STAFFID", referencedColumnName = "STAFFID")
    public StaffEntity getStaffByStaffStaffid() {
        return staffByStaffStaffid;
    }

    public void setStaffByStaffStaffid(StaffEntity staffByStaffStaffid) {
        this.staffByStaffStaffid = staffByStaffStaffid;
    }
}

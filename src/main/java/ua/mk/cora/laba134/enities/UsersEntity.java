package ua.mk.cora.laba134.enities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "users")
@NamedQueries(@NamedQuery(name = "Users.FindAll", query = "select u from UsersEntity u order by u.raiting desc"))
public class UsersEntity {
    private int usid;
    private Date birthday;
    private String firstname;
    private Long phone;
    private Double raiting;
    private String secondname;
    private String sex;
    private String threename;
    private Integer horseHorseid;
    private List<ScheduleEntity> schedulesByUsid;
    private List<ServiceEntity> servicesByUsid;
    private HorseEntity horseByHorseHorseid;

    @Id
    @Column(name = "USID")
    public int getUsid() {
        return usid;
    }

    public void setUsid(int usid) {
        this.usid = usid;
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
    @Column(name = "RAITING")
    public Double getRaiting() {
        return raiting;
    }

    public void setRaiting(Double raiting) {
        this.raiting = raiting;
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
    @Column(name = "HORSE_HORSEID")
    public Integer getHorseHorseid() {
        return horseHorseid;
    }

    public void setHorseHorseid(Integer horseHorseid) {
        this.horseHorseid = horseHorseid;
    }


    @OneToMany(mappedBy = "usersByUserUsid")
    public List<ScheduleEntity> getSchedulesByUsid() {
        return schedulesByUsid;
    }

    public void setSchedulesByUsid(List<ScheduleEntity> schedulesByUsid) {
        this.schedulesByUsid = schedulesByUsid;
    }

    @OneToMany(mappedBy = "usersByUserUsid")
    public List<ServiceEntity> getServicesByUsid() {
        return servicesByUsid;
    }

    public void setServicesByUsid(List<ServiceEntity> servicesByUsid) {
        this.servicesByUsid = servicesByUsid;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "HORSE_HORSEID", referencedColumnName = "HORSEID")
    public HorseEntity getHorseByHorseHorseid() {
        return horseByHorseHorseid;
    }

    public void setHorseByHorseHorseid(HorseEntity horseByHorseHorseid) {
        this.horseByHorseHorseid = horseByHorseHorseid;
    }
}

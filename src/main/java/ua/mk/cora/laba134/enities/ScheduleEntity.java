package ua.mk.cora.laba134.enities;

import jakarta.persistence.*;

@Entity
@Table(name = "schedule")
public class ScheduleEntity {
    private int scheduleid;
    private String time;
    private Integer typesTypesid;
    private Integer userUsid;
    private String day;
    private TypescheduleEntity typescheduleByTypesTypesid;
    private UsersEntity usersByUserUsid;

    @Id
    @Column(name = "SCHEDULEID")
    public int getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(int scheduleid) {
        this.scheduleid = scheduleid;
    }

    @Basic
    @Column(name = "TIME")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Basic
    @Column(name = "TYPES_TYPESID")
    public Integer getTypesTypesid() {
        return typesTypesid;
    }

    public void setTypesTypesid(Integer typesTypesid) {
        this.typesTypesid = typesTypesid;
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
    @Column(name = "Day")
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }


    @ManyToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "TYPES_TYPESID", referencedColumnName = "TYPESID")
    public TypescheduleEntity getTypescheduleByTypesTypesid() {
        return typescheduleByTypesTypesid;
    }

    public void setTypescheduleByTypesTypesid(TypescheduleEntity typescheduleByTypesTypesid) {
        this.typescheduleByTypesTypesid = typescheduleByTypesTypesid;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "USER_USID", referencedColumnName = "USID")
    public UsersEntity getUsersByUserUsid() {
        return usersByUserUsid;
    }

    public void setUsersByUserUsid(UsersEntity usersByUserUsid) {
        this.usersByUserUsid = usersByUserUsid;
    }
}

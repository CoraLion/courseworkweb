package ua.mk.cora.laba134.enities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "typeschedule", schema = "horsealtair", catalog = "")
public class TypescheduleEntity {
    private int typesid;
    private String name;
    private Collection<ScheduleEntity> schedulesByTypesid;

    @Id
    @Column(name = "TYPESID")
    public int getTypesid() {
        return typesid;
    }

    public void setTypesid(int typesid) {
        this.typesid = typesid;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @OneToMany(mappedBy = "typescheduleByTypesTypesid")
    public Collection<ScheduleEntity> getSchedulesByTypesid() {
        return schedulesByTypesid;
    }

    public void setSchedulesByTypesid(Collection<ScheduleEntity> schedulesByTypesid) {
        this.schedulesByTypesid = schedulesByTypesid;
    }
}

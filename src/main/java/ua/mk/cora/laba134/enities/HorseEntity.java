package ua.mk.cora.laba134.enities;

import jakarta.persistence.*;

@Entity
@Table(name = "horse")
@NamedQueries({@NamedQuery(name = "Horse.FindAll", query = "select h from HorseEntity h"),
        @NamedQuery(name = "Horse.FindClass", query = "select h from HorseEntity h where not (h.classh =:notrank)"),
        @NamedQuery(name = "Horse.FindBreed", query = "select h from HorseEntity h where not (h.breed =:notbreed)"),
        @NamedQuery(name = "Horse.FindByName", query = "select h from HorseEntity h where h.name =:name"),
        @NamedQuery(name = "Horse.FindTop", query = "select h.img, h.name, h.classh, u.firstname, u.threename from HorseEntity h inner join UsersEntity u on u.horseHorseid=h.horseid order by u.raiting desc")})
public class HorseEntity {
    private int horseid;
    private Integer age;
    private String breed;
    private String classh;
    private String name;
    private String sex;
    private String img;

    @Id
    @Column(name = "HORSEID")
    public int getHorseid() {
        return horseid;
    }

    public void setHorseid(int horseid) {
        this.horseid = horseid;
    }

    @Basic
    @Column(name = "AGE")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "BREED")
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Basic
    @Column(name = "CLASSH")
    public String getClassh() {
        return classh;
    }

    public void setClassh(String classh) {
        this.classh = classh;
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
    @Column(name = "SEX")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "img")
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}

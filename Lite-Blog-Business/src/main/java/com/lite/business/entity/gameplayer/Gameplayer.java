package com.lite.business.entity.gameplayer;



/**
 * <p>
 * 
 * </p>
 *
 * @author stranger
 * @since 2022-09-07
 */
public class Gameplayer {

    private Integer id;

    private String name;

    private String gender;

    private Integer level;

    private Integer ptype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
    public Integer getPtype() {
        return ptype;
    }

    public void setPtype(Integer ptype) {
        this.ptype = ptype;
    }

    @Override
    public String toString() {
        return "Gameplayer{" +
            "id=" + id +
            ", name=" + name +
            ", gender=" + gender +
            ", level=" + level +
            ", ptype=" + ptype +
        "}";
    }
}

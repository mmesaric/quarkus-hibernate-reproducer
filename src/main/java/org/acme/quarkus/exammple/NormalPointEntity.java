package org.acme.quarkus.exammple;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "NORMAL_POINT")
public class NormalPointEntity extends PointEntity {

    @Column(name = "PLACE")
    private String place;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}

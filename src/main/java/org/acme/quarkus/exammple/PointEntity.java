package org.acme.quarkus.exammple;

import javax.persistence.*;

@Entity
@Table(name = "POINT")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "POINT_TYPE")
public abstract class PointEntity extends DataIdentity {
    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
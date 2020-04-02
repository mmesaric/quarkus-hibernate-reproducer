package org.acme.quarkus.exammple;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@IdClass(IdVersionPK.class)
public abstract class DataIdentity {
    @Id
    @Column(name = "ID")
    private String id;

    @Id
    @Column(name = "VERSION")
    private Long version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
package org.acme.quarkus.exammple;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class IdVersionPK implements Serializable {
    @Column(name = "ID")
    @Id
    private String id;
    
    @Column(name = "VERSION")
    @Id
    private Long version;

    public IdVersionPK() {
    }

    public IdVersionPK(String id, Long version) {
        this.id = id;
        this.version = version;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdVersionPK that = (IdVersionPK) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version);
    }

    //default constructor, getters, setters, equals, hashcode
}
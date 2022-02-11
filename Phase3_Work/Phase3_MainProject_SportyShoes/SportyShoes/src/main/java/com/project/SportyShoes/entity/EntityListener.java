package com.project.SportyShoes.entity;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import java.util.Date;

public class EntityListener {
    @PrePersist
    public void prePersist(BaseEntity entity) {
        Date now = new Date();
        entity.setCreateDate(now);
    }

    @PreUpdate
    public void preUpdate(BaseEntity entity) {
        Date now = new Date();
        entity.setLastUpdateDate(now);
    }
}

package com.hiczp.bilibili.api.live.socket.event;

import com.hiczp.bilibili.api.live.socket.entity.TVStartEntity;

public class TVStartPackageEvent extends ReceiveDataPackageEvent<TVStartEntity> {
    public TVStartPackageEvent(Object source, TVStartEntity entity) {
        super(source, entity);
    }
}

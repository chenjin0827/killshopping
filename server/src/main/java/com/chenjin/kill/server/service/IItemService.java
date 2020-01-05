package com.chenjin.kill.server.service;

import com.chenjin.kill.model.entity.ItemKill;

import java.util.List;

public interface IItemService {

    List<ItemKill> getKillItems() throws Exception;

    ItemKill getKillDetail(Integer id) throws Exception;
}

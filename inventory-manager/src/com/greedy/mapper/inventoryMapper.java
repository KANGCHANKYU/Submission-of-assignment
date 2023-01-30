package com.greedy.mapper;

import com.greedy.DTO.inventoryDTO;

import java.util.List;
import java.util.Map;

public interface inventoryMapper
{
    List<inventoryDTO> selectAll();

    List<inventoryDTO> selectSerach(Map<String, Object> parameter);

    int insertInven(inventoryDTO insert);

    int updateInven(inventoryDTO inven);

    int deleteInven(int parameter);
}

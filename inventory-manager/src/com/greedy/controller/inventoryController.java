package com.greedy.controller;

import com.greedy.DTO.inventoryDTO;
import com.greedy.mapper.inventoryMapper;
import com.greedy.service.inventoryService;
import com.greedy.view.inventoryResultView;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;


public class inventoryController
{
    inventoryMapper mapper;
    inventoryResultView rview = new inventoryResultView();
    inventoryService service = new inventoryService();

    public void SelectAllInventory()
    {
        List<inventoryDTO> inventory = service.selectAll();
        if(inventory != null && !inventory.isEmpty())
            rview.disPlay(inventory);
        else
            rview.disPlayReusult("selectAll");

    }

    public void SelectSearchInventory(Map<String, Object> parameter)
    {
        List<inventoryDTO> inventory = service.selectSearch(parameter);

        if(inventory != null && !inventory.isEmpty())
            rview.disPlay(inventory);
        else
            rview.disPlayReusult("selectSerach");
    }

    public void insertList(Map<String,String> parameter)
    {
        inventoryDTO inven = new inventoryDTO();
        inven.setProductName(parameter.get("name"));
        inven.setProductCost(Integer.parseInt(parameter.get("cost")));
        inven.setProductPrice(Integer.parseInt(parameter.get("price")));
        inven.setUsedProduct(parameter.get("used"));
        inven.setLocalCode(Integer.parseInt(parameter.get("code")));

        if(service.insertList(inven))
            rview.disPlay(inven);
        else
            rview.disPlayReusult("insert");
    }


    public void updateList(inventoryDTO parameter)
    {

        if(service.updateList(parameter))
            rview.disPlay(parameter);
        else
            rview.disPlayReusult("update");
    }

    public void deleteList(int parameter)
    {
        if(service.deleteList(parameter))
            rview.disPlay();
        else
            rview.disPlayReusult("delete");
    }
}

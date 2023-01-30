package com.greedy.service;

import com.greedy.DTO.inventoryDTO;
import com.greedy.mapper.inventoryMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.greedy.common.Template.getSqlSession;

public class inventoryService
{
    private inventoryMapper mapper;

    public List<inventoryDTO> selectAll()
    {
        SqlSession sqlSession = getSqlSession();
        mapper =sqlSession.getMapper(inventoryMapper.class);
        List<inventoryDTO> invenList = mapper.selectAll();

        sqlSession.close();

        return invenList;
    }

    public List<inventoryDTO> selectSearch(Map<String, Object> parameter)
    {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(inventoryMapper.class);
        List<inventoryDTO> inventory = mapper.selectSerach(parameter);
        sqlSession.close();
        return inventory;
    }

    public boolean insertList(inventoryDTO insert)
    {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(inventoryMapper.class);

        int result = mapper.insertInven(insert);

        if(result > 0)
            sqlSession.commit();
        else
            sqlSession.rollback();

        sqlSession.close();

        return result > 0 ? true : false;
    }


    public boolean updateList(inventoryDTO inven)
    {
        SqlSession sqlSession =getSqlSession();
        mapper = sqlSession.getMapper(inventoryMapper.class);

        int result = mapper.updateInven(inven);

        if(result > 0 )
            sqlSession.commit();
        else
            sqlSession.rollback();
        sqlSession.close();
        return result > 0 ? true : false;
    }

    public boolean deleteList(int parameter)
    {
        SqlSession sqlSession =getSqlSession();
        mapper = sqlSession.getMapper(inventoryMapper.class);

        int result = mapper.deleteInven(parameter);

        if(result > 0 )
            sqlSession.commit();
        else
            sqlSession.rollback();
        sqlSession.close();

        return result > 0 ? true : false;
    }
}

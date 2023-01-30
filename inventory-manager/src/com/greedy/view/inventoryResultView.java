package com.greedy.view;

import com.greedy.DTO.inventoryDTO;

import java.util.List;

public class inventoryResultView
{
    public void disPlayReusult(String code)
    {
        switch (code)
        {
            case "selectAll":
                System.out.println("selectAll 오류");
                break;
            case  "selectSerach" :
                System.out.println("selectSerch 오류");
                break;
            case "insert":
                System.out.println("insert 오류");
                break;
            case "update":
                System.out.println("update 오류");
                break;
            case "delete":
                System.out.println("delete 오류");
                break;
            default:
                System.out.println("알수없는 에러 발생!! 나도 몰?루");
                break;
        }
    }

    public void disPlay(List<inventoryDTO> list)
    {
        for(inventoryDTO dto : list)
            System.out.println(dto);
    }

    public void disPlay(inventoryDTO dto)
    {
        System.out.println(dto);
    }

    public void disPlay()
    {
        System.out.println("정보 변경이 성공했습니다.");
    }


}

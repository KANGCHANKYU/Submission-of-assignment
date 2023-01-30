package com.greedy.view;

import com.greedy.DTO.inventoryDTO;
import com.greedy.controller.inventoryController;
import com.greedy.service.inventoryService;

import java.util.*;

public class inventoryview
{
    private static Scanner sc = new Scanner(System.in);
    private static inventoryController cotroller = new inventoryController();
    public void displayerView()
    {
        inventoryController controller = new inventoryController();
        do
        {
            System.out.println("==== 재고 관리프로그램 =====");
            System.out.println("1.조회");
            System.out.println("2.목록 추가");
            System.out.println("3.목록 수정 및 물건 수정");
            System.out.println("4.목록 삭제");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();
            sc.nextLine();
            switch (no)
            {
                case 1:subView();
                    break;
                case 2: controller.insertList(inputNewInven());
                    break;
                case 3:controller.updateList(inputUpdate());
                    break;
                case 4:controller.deleteList(inputdelet());
                    break;
                default:
                    System.out.println("잘못입력하셧습니다");
                    break;
            }

        }while (true);
    }
    public void subView()
    {

        do
        {
            System.out.println("==== 조회 메뉴 ====");
            System.out.println("1. 전체 조회");
            System.out.println("2.상품 코드 or 지역 코드로 찾기");
            System.out.println("9.이전 메뉴로 돌아가기");
            System.out.print("매뉴 입력 : ");
            int no = sc.nextInt();

            switch (no)
            {
                case 1: cotroller.SelectAllInventory();
                    break;
                case 2: cotroller.SelectSearchInventory(inputSearch());
                    break;
                case 9: return;
                default:
                    System.out.println("잘못 입력하셧습니다 ㅎ3ㅎ");
                    break;
            }
        }while (true);

    }

    private Map<String ,Object> inputSearch()
    {
        sc.nextLine();
        System.out.print("code(상품코드) or local(지역코드) or bath(상품코드와 지역코드) :");
        String key = sc.nextLine();
        Map<String,Object> map = new HashMap<>();
        if("code".equals(key))
        {
            System.out.print("상품 코드 입력 : ");
            int codeValue = sc.nextInt();
            map.put("codeValue",codeValue);
        }
        else if("local".equals(key))
        {
            System.out.print("지역 코드(1. 서울 , 2.경기 , 3.부산) 입력 : ");
            int localValue = sc.nextInt();
            map.put("localValue",localValue);
        }
        else if("bath".equals(key))
        {
            System.out.print("상품 코드 입력 : ");
            int codeValue = sc.nextInt();
            System.out.print("지역 코드(1. 서울 , 2.경기 , 3.부산) 입력 : ");
            int localValue = sc.nextInt();
            map.put("codeValue",codeValue);
            map.put("localValue",localValue);
        }

       return map;
    }


    private Map<String, String > inputNewInven()
    {
        System.out.println("==== 삼풍 추가 ====");
        System.out.print("추가할 상품명 입력 : ");
        String name = sc.nextLine();
        System.out.print("상품의 원가 입력 : ");
        String cost = sc.nextLine();
        System.out.print("판매할 가격 입력 : ");
        String price = sc.nextLine();
        System.out.print("중고제품 확인 (Y : N) : ");
        String used = sc.nextLine().toUpperCase();
        System.out.print("지역 코드 입력(서울 1 , 경기 2, 부산 3) :");
        String code = sc.nextLine();

        Map<String, String >map = new HashMap<>();
        map.put("name",name);
        map.put("cost",cost);
        map.put("price",price);
        map.put("used",used);
        map.put("code",code);

        return map;
    }

    private inventoryDTO inputUpdate()
    {
        System.out.print("변경할 상품의 코드 입력 : ");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.print("변경할 이름을 입력 : ");
        String name = sc.nextLine();
        System.out.print("변경할 원가 입력 : ");
        int cost = sc.nextInt();
        System.out.print("변경할 판매가 입력 : ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.print("중고 제품(y : n) : ");
        String used = sc.nextLine().toUpperCase();
        System.out.print("변경할 지역 코드 입력(1.서울 , 2.경기 , 3.부산) : ");
        int local = sc.nextInt();
        return new inventoryDTO(code,name,cost,price,used,local );
    }


    private int inputdelet()
    {
        System.out.print("삭제할 상품코드 입력 : ");
        int deletecode = sc.nextInt();
        return deletecode;
    }

























}

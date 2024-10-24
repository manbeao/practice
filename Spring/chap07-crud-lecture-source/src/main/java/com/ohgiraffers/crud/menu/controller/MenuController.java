package com.ohgiraffers.crud.menu.controller;


import com.ohgiraffers.crud.menu.model.dto.CategoryDTO;
import com.ohgiraffers.crud.menu.model.dto.MenuDTO;
import com.ohgiraffers.crud.menu.model.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService){
        this.menuService=menuService;
    }

    @GetMapping("/list")
    public String findMenuList(Model model){

        List<MenuDTO> menuList= menuService.findAllMenu();

        for (MenuDTO menu : menuList){
            System.out.println("menu = " + menu);
        }

        model.addAttribute("menuList",menuList);

        return "menu/list";
    }

    @GetMapping("/regist")
    public void registPage(){}


    @GetMapping(value = "category",produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<CategoryDTO> findCategoryList(){

        menuService.findAllCategory().forEach(System.out::println);
        return menuService.findAllCategory();

    }

    @PostMapping("/regist")
    public String registMenu(MenuDTO newMenu, RedirectAttributes rttr){

        menuService.registNewMenu(newMenu);

        rttr.addFlashAttribute("successMessage","신규 메뉴 등록에 성공했습니다");

        return "redirect:/menu/list";
    }

    @GetMapping("/modify")
    public void modifyPage(){}

    @PostMapping("/modify")
    public String modifyMenu(MenuDTO menuModify,RedirectAttributes rtrr){

        menuService.modifyMenu(menuModify);

        rtrr.addFlashAttribute("successMessage","메뉴 정보 수정에 성공했습니다");

        return "redirect:/menu/list";
    }

    @GetMapping("/delete")
    public void deletePage(){}

    @PostMapping("/delete")
    public String deleteMenu(MenuDTO menus, RedirectAttributes rttr){

        menuService.deleteMenu(menus);

        rttr.addFlashAttribute("successMessage","메뉴 등록 삭제에 성공했습니다");

        return "redirect:/menu/list";
    }

}

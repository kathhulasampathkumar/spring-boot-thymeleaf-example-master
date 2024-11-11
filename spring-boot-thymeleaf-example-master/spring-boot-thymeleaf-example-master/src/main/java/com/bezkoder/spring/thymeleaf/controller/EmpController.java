package com.bezkoder.spring.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bezkoder.spring.thymeleaf.entity.EmpEntity;
import com.bezkoder.spring.thymeleaf.repository.EmpRepository;

@Controller
public class EmpController {
    @Autowired
    private EmpRepository EmpRepo;
    @GetMapping("/emp")
    public String showEmpPage() {
        return "emp";
    }
    @GetMapping("/emplist")
    public String getEmpList(Model model, @Param("name") String name) {
        try{
            List<EmpEntity> empEntities= new ArrayList<EmpEntity>();
            if(name == null){
                EmpRepo.findAll();
            }else{
                EmpRepo.findAll();
                model.addAttribute("emplist", EmpRepo.findAll());
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            model.addAttribute("message", e.getMessage());
        }
        return "emplist";    
        
    }
    
}

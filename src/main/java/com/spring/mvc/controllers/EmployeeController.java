package com.spring.mvc.controllers;

import com.spring.mvc.entities.Employee;
import com.spring.mvc.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public String employees(Model model) {
        model.addAttribute("employees", employeeService.getAll());
        return "employee-list";
    }

    @GetMapping("/{id}")
    public String employeeInfo(@PathVariable("id") int id, Model model) {
        model.addAttribute("employee", employeeService.getById(id));
        return "employee-info";
    }

    @GetMapping("/new")
    public String newEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee-new";
    }

    @GetMapping("/update/{id}")
    public String updateEmployee(@PathVariable("id") int id, Model model) {
        model.addAttribute("employee", employeeService.getById(id));
        return "employee-new";
    }

    @PostMapping
    public String createEmployee(@Valid @ModelAttribute Employee employee, BindingResult result) {
        if (result.hasErrors()) {
            return "employee-new";
        } else {
            employeeService.saveOrUpdate(employee);
            return "redirect:/";
        }
    }

    @PostMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        employeeService.delete(id);
        return "redirect:/";
    }
}

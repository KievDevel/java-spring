package my.app.controller;

import my.app.entities.Administrators;
import my.app.entities.Salary;
import my.app.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/salary")
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllSalary(Model model) {

        model.addAttribute("salarys", salaryService.getAll());

        return "salary/index";
    }

    @RequestMapping(value = "/{id}/delete")
    public String deleteSalary(@PathVariable(value = "id") long id) {

        salaryService.delete(id);

        return "redirect:/salary";
    }

    @RequestMapping(value = "/{id}/update",method = RequestMethod.GET)
    public String updateSalaryGet(@PathVariable(value = "id") long id,Model model) {

        model.addAttribute("salary",salaryService.getById(id));

        return "salary/update";
    }

    @RequestMapping(value = "/{id}/update",method = RequestMethod.POST)
    public String updateSalaryPost(@ModelAttribute("salary") Salary salary) {

        salaryService.saveOrUpdate(salary);

        return "redirect:/salary";
    }

    @RequestMapping(value = "/{id}")
    public String showSalary(@PathVariable("id") Long id, Model model) {
        model.addAttribute("salary", salaryService.getById(id));

        return "salary/show";
    }

    @RequestMapping(value = "/add")
    public String addASalaryGet(Model model) {
        model.addAttribute("salary",new Salary());
        return "salary/create";
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addASalaryPost(@ModelAttribute("salary") Salary salary) {
        salaryService.saveOrUpdate(salary);
        return "redirect:/salary";
    }
}

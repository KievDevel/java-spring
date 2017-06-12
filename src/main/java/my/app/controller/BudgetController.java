package my.app.controller;


import my.app.entities.Budget;

import my.app.entities.Supply;
import my.app.service.BudgetService;
import my.app.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/budget")
public class BudgetController {

    @Autowired
    private BudgetService budgetService;


    @RequestMapping(method = RequestMethod.GET)
    public String getAllBudget(Model model) {

        model.addAttribute("budgets", budgetService.getAll());

        return "budget/index";
    }

    @RequestMapping(value = "/{id}/delete")
    public String deleteBudget(@PathVariable(value = "id") long id) {

        budgetService.delete(id);

        return "redirect:/budget";
    }

    @RequestMapping(value = "/{id}/update",method = RequestMethod.GET)
    public String updateBudgetGet(@PathVariable(value = "id") long id,Model model) {

        model.addAttribute("budget",budgetService.getById(id));

        return "budget/update";
    }

    @RequestMapping(value = "/{id}/update",method = RequestMethod.POST)
    public String updateBudgetPost(@ModelAttribute("budget") Budget budget) {

        budgetService.saveOrUpdate(budget);

        return "redirect:/budget";
    }

    @RequestMapping(value = "/{id}")
    public String showBudget(@PathVariable("id") Long id, Model model) {
        model.addAttribute("budget", budgetService.getById(id));

        return "budget/show";
    }

    @RequestMapping(value = "/add")
    public String addABudgetGet(Model model) {
        model.addAttribute("budget",new Budget());
        return "budget/create";
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addABudgetPost(@ModelAttribute("budget") Budget budget) {
        budgetService.saveOrUpdate(budget);
        return "redirect:/budget";
    }
}

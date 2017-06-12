package my.app.controller;

import my.app.entities.Salary;
import my.app.entities.Supply;
import my.app.service.SalaryService;
import my.app.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/supply")
public class SupplyController {

    @Autowired
    private SupplyService supplyService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllSupply(Model model) {

        model.addAttribute("supplys", supplyService.getAll());

        return "supply/index";
    }

    @RequestMapping(value = "/{id}/delete")
    public String deleteSupply(@PathVariable(value = "id") long id) {

        supplyService.delete(id);

        return "redirect:/supply";
    }

    @RequestMapping(value = "/{id}/update",method = RequestMethod.GET)
    public String updateSupplyGet(@PathVariable(value = "id") long id,Model model) {

        model.addAttribute("supply",supplyService.getById(id));

        return "supply/update";
    }

    @RequestMapping(value = "/{id}/update",method = RequestMethod.POST)
    public String updateSupplyPost(@ModelAttribute("supply") Supply supply) {

        supplyService.saveOrUpdate(supply);

        return "redirect:/supply";
    }

    @RequestMapping(value = "/{id}")
    public String showSupply(@PathVariable("id") Long id, Model model) {
        model.addAttribute("supply", supplyService.getById(id));

        return "supply/show";
    }

    @RequestMapping(value = "/add")
    public String addASupplyGet(Model model) {
        model.addAttribute("supply",new Supply());
        return "supply/create";
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addASupplyPost(@ModelAttribute("supply") Supply supply) {
        supplyService.saveOrUpdate(supply);
        return "redirect:/supply";
    }
}

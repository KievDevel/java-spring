package my.app.controller;


import my.app.entities.Administrators;
import my.app.entities.KnowledgeBase;
import my.app.service.AdministratorsService;
import my.app.service.KnowledgeBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/administrators")
public class AdministratorsController {

    @Autowired
    private AdministratorsService administratorsService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllAdministrators(Model model) {

        model.addAttribute("administrators", administratorsService.getAll());

        return "administrators/index";
    }

    @RequestMapping(value = "/{id}/delete")
    public String deleteAdministrators(@PathVariable(value = "id") long id) {

        administratorsService.delete(id);

        return "redirect:/administrators";
    }

    @RequestMapping(value = "/{id}/update",method = RequestMethod.GET)
    public String updateAdministratorsGet(@PathVariable(value = "id") long id,Model model) {

        model.addAttribute("administrators",administratorsService.getById(id));

        return "administrators/update";
    }

    @RequestMapping(value = "/{id}/update",method = RequestMethod.POST)
    public String updateAdministratorsPost(@ModelAttribute("administrators") Administrators administrators) {

        administratorsService.saveOrUpdate(administrators);

        return "redirect:/administrators";
    }

    @RequestMapping(value = "/{id}")
    public String showAdministrators(@PathVariable("id") Long id, Model model) {
        model.addAttribute("administrators", administratorsService.getById(id));

        return "administrators/show";
    }

    @RequestMapping(value = "/add")
    public String addAdministratorsGet(Model model) {
        model.addAttribute("administrators",new Administrators());
        return "administrators/create";
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addAdministratorsPost(@ModelAttribute("administrators") Administrators administrators) {
        administratorsService.saveOrUpdate(administrators);
        return "redirect:/administrators";
    }
}

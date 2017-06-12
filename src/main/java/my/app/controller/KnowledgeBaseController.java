package my.app.controller;


import my.app.entities.KnowledgeBase;
import my.app.service.KnowledgeBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/knowledgebase")
public class KnowledgeBaseController {

    @Autowired
    private KnowledgeBaseService knowledgeBaseService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllKnowledgeBase(Model model) {

        model.addAttribute("knowledgebases", knowledgeBaseService.getAll());

        return "knowledgebase/index";
    }

    @RequestMapping(value = "/{id}/delete")
    public String deleteKnowledgeBase(@PathVariable(value = "id") long id) {

        knowledgeBaseService.delete(id);

        return "redirect:/knowledgebase";
    }

    @RequestMapping(value = "/{id}/update",method = RequestMethod.GET)
    public String updateKnowledgeBaseGet(@PathVariable(value = "id") long id,Model model) {

        model.addAttribute("knowledgebase",knowledgeBaseService.getById(id));

        return "knowledgebase/update";
    }

    @RequestMapping(value = "/{id}/update",method = RequestMethod.POST)
    public String updateKnowledgeBasePost(@ModelAttribute("knowledgebase") KnowledgeBase knowledgeBase) {

        knowledgeBaseService.saveOrUpdate(knowledgeBase);

        return "redirect:/knowledgebase";
    }

    @RequestMapping(value = "/{id}")
    public String showKnowledgeBase(@PathVariable("id") Long id, Model model) {
        model.addAttribute("knowledgebase", knowledgeBaseService.getById(id));

        return "knowledgebase/show";
    }

    @RequestMapping(value = "/add")
    public String addKnowledgeBaseGet(Model model) {
        model.addAttribute("knowledgebase",new KnowledgeBase());
        return "knowledgebase/create";
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addKnowledgeBasePost(@ModelAttribute("knowledgebase") KnowledgeBase knowledgeBase) {
        knowledgeBaseService.saveOrUpdate(knowledgeBase);
        return "redirect:/knowledgebase";
    }


}

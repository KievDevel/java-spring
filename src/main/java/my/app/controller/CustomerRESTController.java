package my.app.controller;

import com.google.gson.Gson;
import my.app.entities.Customer;
import my.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/customers")
public class CustomerRESTController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String getAll(Model model) {

        Gson gson = new Gson();

        return gson.toJson(customerService.getAll());
    }

    @RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
    public String show(Model model, @PathVariable("id") Long id) {

        Gson gson = new Gson();

        return gson.toJson(customerService.getById(id));
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String delete(@RequestParam(value = "id") long id) {

        customerService.delete(id);

        return "{\"deleted\": \"yes\"}";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute Customer customer, Model model) {
        customerService.saveOrUpdate(customer);

        Gson gson = new Gson();

        return gson.toJson(customer);
    }
}
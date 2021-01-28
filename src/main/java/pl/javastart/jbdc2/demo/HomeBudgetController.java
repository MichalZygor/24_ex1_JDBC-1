package pl.javastart.jbdc2.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeBudgetController {
    private static final RecipeDao DAO = new RecipeDao();

    public HomeBudgetController() {
    }

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("dane_z_sql", read());
        return "home";
    }


    private static String read() {
        return DAO.findByTitle("Jajecznica").toString();

    }
}

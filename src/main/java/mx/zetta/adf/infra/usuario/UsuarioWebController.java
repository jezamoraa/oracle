package mx.zetta.adf.infra.usuario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/usuario/")
public class UsuarioWebController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("message", "Hello World from Spring 4 MVC");
        return UsuarioConstants.PATH + "usuario";
    }

    @RequestMapping(value = "/again", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("message", "Hello World Again, from Spring 4 MVC");
        return UsuarioConstants.PATH + "usuario";
    }

}
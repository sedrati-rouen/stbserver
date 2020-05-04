package fr.univ.rouen.stbserver.controllers;

import fr.univ.rouen.stbserver.model.STB;
import org.springframework.web.bind.annotation.*;

@RestController
public class STBController {
    @GetMapping("/resume")
    public String getListSTBinXML() {
        return "Envoi de la liste des STB";
    }
    @GetMapping("/id")
    public String getSTBinXML(
            @RequestParam(value = "name") String texte) {
        return ("Détail de la STB demandée : " + texte);
    }
    @GetMapping("/test")
    public String getSTBinXML2(
            @RequestParam(value = "nb") String nb, @RequestParam(value = "texte") String text) {
        return ("Détail de la STB demandée : " + nb + " "+ text);
    }
    @RequestMapping(value = "/testpost", method = RequestMethod.POST,
            consumes = "application/xml")
    public String postTest(@RequestBody String stb) {
        return ("<result><response>Message reçu : </response>"
        + stb + "</response>");
    }
    @RequestMapping(value = "/xml")
    public @ResponseBody STB getXML() {
        STB stb = new STB("Test STB", 1, "2020/03/23", "Test JAXB");
        return stb;
    }


}


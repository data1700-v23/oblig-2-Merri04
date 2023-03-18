package oslomet.weboblig2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class javaKontroller {
    //for å registrere
    public final List<Billett> billettReg = new ArrayList<>();

    //for å lagre
    @PostMapping("/lagre")
    public void lagre(Billett i) {
        billettReg.add(i);
    }

    @GetMapping("/hent")
    public List<Billett> visKjop() {
        return billettReg;
    }

    @GetMapping("/slett")
    public void slett() {
        billettReg.clear(); }
}

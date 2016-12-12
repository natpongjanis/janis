package com.sut.se;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/nameees")
@Controller
@RooWebScaffold(path = "nameees", formBackingObject = Nameee.class)
public class NameeeController {
}

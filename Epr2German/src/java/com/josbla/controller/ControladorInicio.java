/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josbla.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author Dell Mounstruo
 */
@Controller
public class ControladorInicio {

    @RequestMapping("inicio.php")
    public ModelAndView inicio() {
        ModelAndView miMav = new ModelAndView();
        miMav.setViewName("inicio");
        return miMav;
    }
   
}

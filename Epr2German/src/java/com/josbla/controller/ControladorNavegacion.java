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
public class ControladorNavegacion {
    
    @RequestMapping("video2.php")
    public ModelAndView video2() {
        ModelAndView miMav = new ModelAndView();
        miMav.setViewName("video2");
        return miMav;
    } 
    
    @RequestMapping("video3.php")
    public ModelAndView video3() {
        ModelAndView miMav = new ModelAndView();
        miMav.setViewName("video3");
        return miMav;
    } 
    
    @RequestMapping("video4.php")
    public ModelAndView video4() {
        ModelAndView miMav = new ModelAndView();
        miMav.setViewName("video4");
        return miMav;
    } 
    
    @RequestMapping("video5.php")
    public ModelAndView video5() {
        ModelAndView miMav = new ModelAndView();
        miMav.setViewName("video5");
        return miMav;
    } 
    
    @RequestMapping("video6.php")
    public ModelAndView video6() {
        ModelAndView miMav = new ModelAndView();
        miMav.setViewName("video6");
        return miMav;
    } 
    
    @RequestMapping("video7.php")
    public ModelAndView video7() {
        ModelAndView miMav = new ModelAndView();
        miMav.setViewName("video7");
        return miMav;
    } 
    
    @RequestMapping("video8.php")
    public ModelAndView video8() {
        ModelAndView miMav = new ModelAndView();
        miMav.setViewName("video8");
        return miMav;
    } 
    
    @RequestMapping("video9.php")
    public ModelAndView video9() {
        ModelAndView miMav = new ModelAndView();
        miMav.setViewName("video9");
        return miMav;
    } 
}

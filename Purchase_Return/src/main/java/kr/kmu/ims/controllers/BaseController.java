package kr.kmu.ims.controllers;

public class BaseController {
    public RootLayoutController rootLayoutController;
    BaseController(){

    }
    BaseController(RootLayoutController rootLayoutController){
        this.rootLayoutController=rootLayoutController;
        System.out.println(rootLayoutController);
    }
}

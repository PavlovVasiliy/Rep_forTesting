package com.factoryMethod;

import com.factoryMethod.buttons.Dialog;
import com.factoryMethod.buttons.HtmlDialog;
import com.factoryMethod.buttons.WindowDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure(){
        if (System.getProperty("os.name").equals("Windows 1011")){
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic(){
        dialog.renderWindow();
    }
}

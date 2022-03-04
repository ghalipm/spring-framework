package com.cydeo.spring06springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CydeoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CydeoApplication.class, args);
    }

}

/**
 * I had a similar problem, I hid the main menu from "View > Appearance > Main Menu" and couldn't restore it. I managed to restore it by following these steps:
 *
 * Open settings with Ctrl + Alt + S
 * In Keymap, select "Main Menu > View > Appearance > Main Menu"
 * Right click > Assign a shortcut. Entered the shortcut, then OK
 * Typing the keyboard shortcut now restored the main menu.
 */
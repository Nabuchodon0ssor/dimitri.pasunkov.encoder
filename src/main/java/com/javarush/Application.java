package com.javarush;

public class Application {
    public static void main(String[] args) {
        if(args.length == 2||args.length==3) {
            String command = args[0];
            String filePath = args[1];
            CaesarCipher.KEY = Integer.parseInt(args[2]);

            System.out.println(command);
            System.out.println(filePath);
            System.out.println(CaesarCipher.KEY);
        } else {
            Console console = new Console();
            console.welcomeMenu();
        }
    }
}

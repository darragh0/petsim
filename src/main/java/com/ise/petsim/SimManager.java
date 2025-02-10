package com.ise.petsim;


import static com.ise.petsim.util.IO.println;


public final class SimManager {

    // @formatter:off
    private static final String WELCOME_MSG = """

██████╗░███████╗████████╗    ░██████╗██╗███╗░░░███╗██╗░░░██╗██╗░░░░░░█████╗░████████╗░█████╗░██████╗░
██╔══██╗██╔════╝╚══██╔══╝    ██╔════╝██║████╗░████║██║░░░██║██║░░░░░██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗
██████╔╝█████╗░░░░░██║░░░    ╚█████╗░██║██╔████╔██║██║░░░██║██║░░░░░███████║░░░██║░░░██║░░██║██████╔╝
██╔═══╝░██╔══╝░░░░░██║░░░    ░╚═══██╗██║██║╚██╔╝██║██║░░░██║██║░░░░░██╔══██║░░░██║░░░██║░░██║██╔══██╗
██║░░░░░███████╗░░░██║░░░    ██████╔╝██║██║░╚═╝░██║╚██████╔╝███████╗██║░░██║░░░██║░░░╚█████╔╝██║░░██║
╚═╝░░░░░╚══════╝░░░╚═╝░░░    ╚═════╝░╚═╝╚═╝░░░░░╚═╝░╚═════╝░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝

""";
    // @formatter:on

    private SimManager() {
        throw new UnsupportedOperationException("This class cannot be instantiated");
    }

    public static void welcome() {
        println(WELCOME_MSG);
    }

    public static void run() {
        Menu menu = new MainMenu();
        println("<B><g>[Simulator started]</g></B>\n");
        welcome();
        menu.print();
        menu.getUserChoice().run();
    }

    public static void exit() {
        int exitCode = 0;
        println("Exiting simulator...");
        println("\n<B><r>[Simulator finished w/ exit code %d]</r></B>", exitCode);
        System.exit(exitCode);
    }

}

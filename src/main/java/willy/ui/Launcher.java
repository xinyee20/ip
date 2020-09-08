package willy.ui;

import javafx.application.Application;

/**
 * A launcher class to workaround classpath issues to launch JavaFX.
 */
public class Launcher {

    public Launcher() {}
    
    public static void main(String[] args) {
        Application.launch(Willy.class, args);
    }
}

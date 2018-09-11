package clases;

import clases.repoBoostrap;
import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

@SuppressWarnings("all")
public class Runnable extends Application {
  public Runnable(final repoBoostrap boostrap) {
    throw new Error("Unresolved compilation problems:"
      + "\nno viable alternative at input \'(\'"
      + "\nextraneous input \'boostrap\' expecting \')\'"
      + "\nThe field bootstrap is not visible"
      + "\nConstructor call must be the first expression in a constructor"
      + "\nCannot refer to an instance field bootstrap while explicitly invoking a constructor");
  }
  
  public static void main(final String[] args) {
    repoBoostrap _repoBoostrap = new repoBoostrap();
    new Runnable(_repoBoostrap).start();
  }
  
  protected Window<?> createMainWindow() {
    return null;
  }
}

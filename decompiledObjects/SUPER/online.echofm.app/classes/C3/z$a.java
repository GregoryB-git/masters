package C3;

import java.util.concurrent.Executor;

public enum z$a
  implements Executor
{
  static
  {
    a locala = new a("INSTANCE", 0);
    o = locala;
    p = new a[] { locala };
  }
  
  public void execute(Runnable paramRunnable)
  {
    paramRunnable.run();
  }
}

/* Location:
 * Qualified Name:     C3.z.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
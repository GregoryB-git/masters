package z3;

import h5.f;

public final class j$a
  extends Thread
{
  public j$a(f paramf)
  {
    super("ExoPlayer:SimpleDecoder");
  }
  
  public final void run()
  {
    j localj = a;
    localj.getClass();
    try
    {
      boolean bool;
      do
      {
        bool = localj.g();
      } while (bool);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new IllegalStateException(localInterruptedException);
    }
  }
}

/* Location:
 * Qualified Name:     z3.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package eb;

public final class h1$b
  implements Runnable
{
  public final Runnable a;
  public boolean b;
  public boolean c;
  
  public h1$b(Runnable paramRunnable)
  {
    a = paramRunnable;
  }
  
  public final void run()
  {
    if (!b)
    {
      c = true;
      a.run();
    }
  }
}

/* Location:
 * Qualified Name:     eb.h1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
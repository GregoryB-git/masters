package okhttp3.internal;

public abstract class NamedRunnable
  implements Runnable
{
  public final String a;
  
  public NamedRunnable(String paramString, Object... paramVarArgs)
  {
    a = Util.l(paramString, paramVarArgs);
  }
  
  public abstract void k();
  
  public final void run()
  {
    String str = Thread.currentThread().getName();
    Thread.currentThread().setName(a);
    try
    {
      k();
      return;
    }
    finally
    {
      Thread.currentThread().setName(str);
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.NamedRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
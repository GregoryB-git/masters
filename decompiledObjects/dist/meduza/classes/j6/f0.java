package j6;

import java.util.concurrent.Callable;

public final class f0
  extends g0
{
  public final Callable e;
  
  public final String a()
  {
    try
    {
      String str = (String)e.call();
      return str;
    }
    catch (Exception localException)
    {
      throw new RuntimeException(localException);
    }
  }
}

/* Location:
 * Qualified Name:     j6.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
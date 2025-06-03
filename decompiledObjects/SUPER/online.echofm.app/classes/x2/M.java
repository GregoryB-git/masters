package x2;

import java.util.concurrent.Callable;

public final class M
  extends O
{
  public final Callable f;
  
  public final String a()
  {
    try
    {
      String str = (String)f.call();
      return str;
    }
    catch (Exception localException)
    {
      throw new RuntimeException(localException);
    }
  }
}

/* Location:
 * Qualified Name:     x2.M
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
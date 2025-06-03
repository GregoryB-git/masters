package hb;

import java.io.IOException;

public abstract class a$e
  implements Runnable
{
  public a$e(a parama) {}
  
  public abstract void a();
  
  public final void run()
  {
    try
    {
      if (a.q != null)
      {
        a();
      }
      else
      {
        IOException localIOException = new java/io/IOException;
        localIOException.<init>("Unable to perform write due to unavailable sink.");
        throw localIOException;
      }
    }
    catch (Exception localException)
    {
      a.d.a(localException);
    }
  }
}

/* Location:
 * Qualified Name:     hb.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
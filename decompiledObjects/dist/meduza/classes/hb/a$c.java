package hb;

import java.io.IOException;
import java.net.Socket;
import xc.f;
import xc.w;

public final class a$c
  implements Runnable
{
  public a$c(a parama) {}
  
  public final void run()
  {
    try
    {
      Object localObject = a;
      w localw1 = q;
      if (localw1 != null)
      {
        localObject = b;
        long l = b;
        if (l > 0L) {
          localw1.g0((f)localObject, l);
        }
      }
    }
    catch (IOException localIOException1)
    {
      a.d.a(localIOException1);
    }
    a.b.getClass();
    try
    {
      w localw2 = a.q;
      if (localw2 != null) {
        localw2.close();
      }
    }
    catch (IOException localIOException2)
    {
      a.d.a(localIOException2);
    }
    try
    {
      Socket localSocket = a.r;
      if (localSocket != null) {
        localSocket.close();
      }
    }
    catch (IOException localIOException3)
    {
      a.d.a(localIOException3);
    }
  }
}

/* Location:
 * Qualified Name:     hb.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
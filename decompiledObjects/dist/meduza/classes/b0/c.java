package b0;

import android.os.Handler;
import p2.m0;
import x.e.a;

public final class c
{
  public final m0 a;
  public final Handler b;
  
  public c(e.a parama, Handler paramHandler)
  {
    a = parama;
    b = paramHandler;
  }
  
  public final void a(l.a parama)
  {
    int i = b;
    int j;
    if (i == 0) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      parama = a;
      m0 localm0 = a;
      b.post(new a(localm0, parama));
    }
    else
    {
      parama = a;
      b.post(new b(parama, i));
    }
  }
}

/* Location:
 * Qualified Name:     b0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
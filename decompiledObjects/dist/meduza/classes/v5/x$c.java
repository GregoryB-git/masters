package v5;

import t5.d0.d;

public final class x$c
  implements d0.d
{
  public final void a()
  {
    Object localObject2;
    synchronized (x.a)
    {
      localObject2 = x.b;
      for (;;)
      {
        try
        {
          if (x.c) {
            return;
          }
          l = x.a();
        }
        finally
        {
          long l;
          Object localObject4;
          continue;
        }
        try
        {
          x.d = l;
          x.c = true;
          return;
        }
        finally {}
      }
      throw ((Throwable)localObject4);
    }
  }
  
  public final void b() {}
}

/* Location:
 * Qualified Name:     v5.x.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package x9;

import java.util.concurrent.TimeUnit;
import u9.k;

public final class e
{
  public static final long d = TimeUnit.HOURS.toMillis(24L);
  public static final long e = TimeUnit.MINUTES.toMillis(30L);
  public final k a = k.a();
  public long b;
  public int c;
  
  public final void a(int paramInt)
  {
    int i = 0;
    int j;
    if (((paramInt < 200) || (paramInt >= 300)) && (paramInt != 401) && (paramInt != 404)) {
      j = 0;
    } else {
      j = 1;
    }
    if (j != 0) {}
    label197:
    try
    {
      try
      {
        c = 0;
        return;
      }
      finally
      {
        localObject1 = finally;
        throw ((Throwable)localObject1);
      }
      c += 1;
      if (paramInt != 429)
      {
        j = i;
        if (paramInt >= 500)
        {
          j = i;
          if (paramInt >= 600) {}
        }
      }
      else
      {
        j = 1;
      }
      if (j == 0) {}
      long l;
      for (;;)
      {
        try
        {
          l = d;
        }
        finally
        {
          break label197;
        }
        double d1 = Math.pow(2.0D, c);
        a.getClass();
        d1 = Math.min(d1 + (Math.random() * 1000.0D), e);
        l = d1;
      }
      a.a.getClass();
      b = (System.currentTimeMillis() + l);
      return;
    }
    finally {}
    throw ((Throwable)localObject2);
  }
}

/* Location:
 * Qualified Name:     x9.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
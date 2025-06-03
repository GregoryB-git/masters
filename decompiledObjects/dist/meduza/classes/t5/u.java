package t5;

import java.io.FileNotFoundException;
import v3.a1;

public final class u
  implements c0
{
  public final c0.b a(c0.a parama, c0.c paramc)
  {
    paramc = a;
    if ((paramc instanceof z))
    {
      i = d;
      if ((i == 403) || (i == 404) || (i == 410) || (i == 416) || (i == 500) || (i == 503)) {}
    }
    else
    {
      i = 0;
      break label75;
    }
    int i = 1;
    label75:
    if (i == 0) {
      return null;
    }
    if (parama.a(1)) {
      return new c0.b(1, 300000L);
    }
    if (parama.a(2)) {
      return new c0.b(2, 60000L);
    }
    return null;
  }
  
  public final int b(int paramInt)
  {
    if (paramInt == 7) {
      paramInt = 6;
    } else {
      paramInt = 3;
    }
    return paramInt;
  }
  
  public final long c(c0.c paramc)
  {
    Object localObject = a;
    if ((!(localObject instanceof a1)) && (!(localObject instanceof FileNotFoundException)) && (!(localObject instanceof w)) && (!(localObject instanceof d0.g)))
    {
      int i = l.b;
      while (localObject != null)
      {
        if (((localObject instanceof l)) && (a == 2008))
        {
          i = 1;
          break label76;
        }
        localObject = ((Throwable)localObject).getCause();
      }
      i = 0;
      label76:
      if (i == 0)
      {
        l = Math.min((b - 1) * 1000, 5000);
        break label110;
      }
    }
    long l = -9223372036854775807L;
    label110:
    return l;
  }
}

/* Location:
 * Qualified Name:     t5.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
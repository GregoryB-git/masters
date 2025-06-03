package N0;

import U0.a;
import java.util.List;

public final class c
{
  public final long a;
  public final List b;
  
  public c(long paramLong, List paramList)
  {
    a = paramLong;
    b = paramList;
  }
  
  public a a(long paramLong)
  {
    if (b.size() < 2) {
      return null;
    }
    int i = b.size() - 1;
    long l1 = paramLong;
    long l2 = -1L;
    paramLong = l2;
    long l3 = paramLong;
    long l4 = l3;
    boolean bool = false;
    long l5 = l3;
    long l6 = paramLong;
    paramLong = l1;
    while (i >= 0)
    {
      a locala = (a)b.get(i);
      bool = "video/mp4".equals(a) | bool;
      if (i == 0) {
        l3 = paramLong - d;
      }
      for (paramLong = 0L;; paramLong = l1)
      {
        break;
        l1 = paramLong - c;
        l3 = paramLong;
      }
      if ((bool) && (paramLong != l3))
      {
        l4 = l3 - paramLong;
        l5 = paramLong;
        bool = false;
      }
      if (i == 0)
      {
        l2 = paramLong;
        l6 = l3;
      }
      i--;
    }
    if ((l5 != -1L) && (l4 != -1L) && (l2 != -1L) && (l6 != -1L)) {
      return new a(l2, l6, a, l5, l4);
    }
    return null;
  }
  
  public static final class a
  {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    
    public a(String paramString1, String paramString2, long paramLong1, long paramLong2)
    {
      a = paramString1;
      b = paramString2;
      c = paramLong1;
      d = paramLong2;
    }
  }
}

/* Location:
 * Qualified Name:     N0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
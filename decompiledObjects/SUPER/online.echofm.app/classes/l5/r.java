package l5;

import java.util.Objects;

public class r
{
  public final String a;
  public final String b;
  public final long c;
  public final p d;
  
  public r(String paramString1, String paramString2, long paramLong, p paramp)
  {
    a = paramString1;
    b = paramString2;
    c = paramLong;
    d = paramp;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof r;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (r)paramObject;
      bool3 = bool2;
      if (a.equals(a))
      {
        bool3 = bool2;
        if (b.equals(b))
        {
          bool3 = bool2;
          if (c == c)
          {
            bool3 = bool2;
            if (Objects.equals(d, d)) {
              bool3 = true;
            }
          }
        }
      }
    }
    return bool3;
  }
}

/* Location:
 * Qualified Name:     l5.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
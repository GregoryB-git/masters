package ta;

import java.util.Objects;

public final class f
{
  public final String a;
  public final String b;
  public final long c;
  public final e d;
  
  public f(String paramString1, String paramString2, long paramLong, e parame)
  {
    a = paramString1;
    b = paramString2;
    c = paramLong;
    d = parame;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof f;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (f)paramObject;
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
 * Qualified Name:     ta.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package o0;

import android.net.Uri;
import g0.G;

public final class i
{
  public final long a;
  public final long b;
  public final String c;
  public int d;
  
  public i(String paramString, long paramLong1, long paramLong2)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    c = str;
    a = paramLong1;
    b = paramLong2;
  }
  
  public i a(i parami, String paramString)
  {
    String str = c(paramString);
    if ((parami != null) && (str.equals(parami.c(paramString))))
    {
      long l1 = b;
      long l2 = -1L;
      long l3;
      if (l1 != -1L)
      {
        l3 = a;
        if (l3 + l1 == a)
        {
          l4 = b;
          if (l4 != -1L) {
            l2 = l1 + l4;
          }
          return new i(str, l3, l2);
        }
      }
      long l4 = b;
      if (l4 != -1L)
      {
        l3 = a;
        if (l3 + l4 == a)
        {
          if (l1 != -1L) {
            l2 = l4 + l1;
          }
          return new i(str, l3, l2);
        }
      }
    }
    return null;
  }
  
  public Uri b(String paramString)
  {
    return G.f(paramString, c);
  }
  
  public String c(String paramString)
  {
    return G.e(paramString, c);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (i.class == paramObject.getClass()))
    {
      paramObject = (i)paramObject;
      if ((a != a) || (b != b) || (!c.equals(c))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    if (d == 0) {
      d = (((527 + (int)a) * 31 + (int)b) * 31 + c.hashCode());
    }
    return d;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("RangedUri(referenceUri=");
    localStringBuilder.append(c);
    localStringBuilder.append(", start=");
    localStringBuilder.append(a);
    localStringBuilder.append(", length=");
    localStringBuilder.append(b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     o0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
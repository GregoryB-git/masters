package d5;

import f;
import v5.d0;

public final class i
{
  public final long a;
  public final long b;
  public final String c;
  public int d;
  
  public i(long paramLong1, long paramLong2, String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    c = str;
    a = paramLong1;
    b = paramLong2;
  }
  
  public final i a(i parami, String paramString)
  {
    String str = d0.c(paramString, c);
    if ((parami != null) && (str.equals(d0.c(paramString, c))))
    {
      long l1 = b;
      boolean bool = l1 < -1L;
      long l2;
      if (bool)
      {
        l2 = a;
        if (l2 + l1 == a)
        {
          l3 = b;
          if (l3 == -1L) {
            l1 = -1L;
          } else {
            l1 += l3;
          }
          return new i(l2, l1, str);
        }
      }
      long l3 = b;
      if (l3 != -1L)
      {
        l2 = a;
        if (l2 + l3 == a)
        {
          if (!bool) {
            l1 = -1L;
          } else {
            l1 = l3 + l1;
          }
          return new i(l2, l1, str);
        }
      }
    }
    return null;
  }
  
  public final boolean equals(Object paramObject)
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
  
  public final int hashCode()
  {
    if (d == 0)
    {
      int i = (int)a;
      int j = (int)b;
      d = (c.hashCode() + ((527 + i) * 31 + j) * 31);
    }
    return d;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("RangedUri(referenceUri=");
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
 * Qualified Name:     d5.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package f2;

import b.z;
import dc.a;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lc.k;
import rb.g;

public final class i
  implements Comparable<i>
{
  public static final i f;
  public final int a;
  public final int b;
  public final int c;
  public final String d;
  public final g e;
  
  static
  {
    new i(0, 0, 0, "");
    f = new i(0, 1, 0, "");
    new i(1, 0, 0, "");
  }
  
  public i(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramString;
    e = z.n(new b(this));
  }
  
  public final int compareTo(Object paramObject)
  {
    paramObject = (i)paramObject;
    ec.i.e(paramObject, "other");
    Object localObject = e.getValue();
    ec.i.d(localObject, "<get-bigInteger>(...)");
    localObject = (BigInteger)localObject;
    paramObject = e.getValue();
    ec.i.d(paramObject, "<get-bigInteger>(...)");
    return ((BigInteger)localObject).compareTo((BigInteger)paramObject);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof i;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    int i = a;
    paramObject = (i)paramObject;
    bool1 = bool2;
    if (i == a)
    {
      bool1 = bool2;
      if (b == b)
      {
        bool1 = bool2;
        if (c == c) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    return ((527 + a) * 31 + b) * 31 + c;
  }
  
  public final String toString()
  {
    Object localObject;
    if ((k.t0(d) ^ true))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append('-');
      ((StringBuilder)localObject).append(d);
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append('.');
    localStringBuilder.append(b);
    localStringBuilder.append('.');
    return a0.j.m(localStringBuilder, c, (String)localObject);
  }
  
  public static final class a
  {
    public static i a(String paramString)
    {
      if ((paramString != null) && (!k.t0(paramString)))
      {
        paramString = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(paramString);
        if (!paramString.matches()) {
          return null;
        }
        String str = paramString.group(1);
        if (str != null)
        {
          int i = Integer.parseInt(str);
          str = paramString.group(2);
          if (str != null)
          {
            int j = Integer.parseInt(str);
            str = paramString.group(3);
            if (str != null)
            {
              int k = Integer.parseInt(str);
              if (paramString.group(4) != null) {
                paramString = paramString.group(4);
              } else {
                paramString = "";
              }
              ec.i.d(paramString, "description");
              return new i(i, j, k, paramString);
            }
          }
        }
      }
      return null;
    }
  }
  
  public static final class b
    extends ec.j
    implements a<BigInteger>
  {
    public b(i parami)
    {
      super();
    }
    
    public final Object invoke()
    {
      return BigInteger.valueOf(a.a).shiftLeft(32).or(BigInteger.valueOf(a.b)).shiftLeft(32).or(BigInteger.valueOf(a.c));
    }
  }
}

/* Location:
 * Qualified Name:     f2.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
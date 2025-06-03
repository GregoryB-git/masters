package ma;

public final class f1
  implements q0
{
  public final s0 a;
  public final String b;
  public final Object[] c;
  public final int d;
  
  public f1(w paramw, String paramString, Object[] paramArrayOfObject)
  {
    a = paramw;
    b = paramString;
    c = paramArrayOfObject;
    int i = paramString.charAt(0);
    if (i >= 55296)
    {
      i &= 0x1FFF;
      int j = 1;
      int k = 13;
      int m;
      for (;;)
      {
        m = paramString.charAt(j);
        if (m < 55296) {
          break;
        }
        i |= (m & 0x1FFF) << k;
        k += 13;
        j++;
      }
      i |= m << k;
    }
    d = i;
  }
  
  public final boolean a()
  {
    boolean bool;
    if ((d & 0x2) == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final s0 b()
  {
    return a;
  }
  
  public final int c()
  {
    int i = d;
    if ((i & 0x1) != 0) {
      return 1;
    }
    if ((i & 0x4) == 4) {
      return 3;
    }
    return 2;
  }
  
  public final Object[] d()
  {
    return c;
  }
  
  public final String e()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     ma.f1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
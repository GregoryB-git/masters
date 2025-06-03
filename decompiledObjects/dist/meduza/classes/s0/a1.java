package s0;

public final class a1
  implements m0
{
  public final o0 a;
  public final String b;
  public final Object[] c;
  public final int d;
  
  public a1(v paramv, String paramString, Object[] paramArrayOfObject)
  {
    a = paramv;
    b = paramString;
    c = paramArrayOfObject;
    int i = paramString.charAt(0);
    if (i >= 55296)
    {
      int j = i & 0x1FFF;
      int k = 1;
      i = 13;
      int m;
      for (;;)
      {
        m = paramString.charAt(k);
        if (m < 55296) {
          break;
        }
        j |= (m & 0x1FFF) << i;
        i += 13;
        k++;
      }
      i = j | m << i;
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
  
  public final o0 b()
  {
    return a;
  }
  
  public final int c()
  {
    int i = d;
    int j = 1;
    if ((i & 0x1) != 1) {
      j = 2;
    }
    return j;
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
 * Qualified Name:     s0.a1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
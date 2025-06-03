package com.google.android.gms.internal.measurement;

public final class W4
  implements G4
{
  public final I4 a;
  public final String b;
  public final Object[] c;
  public final int d;
  
  public W4(I4 paramI4, String paramString, Object[] paramArrayOfObject)
  {
    a = paramI4;
    b = paramString;
    c = paramArrayOfObject;
    int i = paramString.charAt(0);
    if (i < 55296)
    {
      d = i;
      return;
    }
    int j = i & 0x1FFF;
    int k = 13;
    int m;
    for (i = 1;; i++)
    {
      m = paramString.charAt(i);
      if (m < 55296) {
        break;
      }
      j |= (m & 0x1FFF) << k;
      k += 13;
    }
    d = (j | m << k);
  }
  
  public final I4 a()
  {
    return a;
  }
  
  public final V4 b()
  {
    int i = d;
    if ((i & 0x1) != 0) {
      return V4.o;
    }
    if ((i & 0x4) == 4) {
      return V4.q;
    }
    return V4.p;
  }
  
  public final boolean c()
  {
    return (d & 0x2) == 2;
  }
  
  public final String d()
  {
    return b;
  }
  
  public final Object[] e()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.W4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
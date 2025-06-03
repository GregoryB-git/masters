package com.google.crypto.tink.shaded.protobuf;

public final class c0
  implements M
{
  public final O a;
  public final String b;
  public final Object[] c;
  public final int d;
  
  public c0(O paramO, String paramString, Object[] paramArrayOfObject)
  {
    a = paramO;
    b = paramString;
    c = paramArrayOfObject;
    int i = paramString.charAt(0);
    if (i < 55296) {}
    for (;;)
    {
      d = i;
      break;
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
      i = j | m << k;
    }
  }
  
  public boolean a()
  {
    boolean bool;
    if ((d & 0x2) == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Z b()
  {
    Z localZ;
    if ((d & 0x1) == 1) {
      localZ = Z.o;
    } else {
      localZ = Z.p;
    }
    return localZ;
  }
  
  public O c()
  {
    return a;
  }
  
  public Object[] d()
  {
    return c;
  }
  
  public String e()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
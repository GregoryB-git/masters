package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.a;
import java.util.Collections;
import java.util.Map;

public class p
{
  public static boolean b = true;
  public static volatile p c;
  public static final p d = new p(true);
  public final Map a = Collections.emptyMap();
  
  public p(boolean paramBoolean) {}
  
  public static p b()
  {
    p localp1 = c;
    p localp2 = localp1;
    p localp3;
    if (localp1 == null)
    {
      try
      {
        localp1 = c;
        localp2 = localp1;
        if (localp1 != null) {
          break label48;
        }
        if (b) {
          localp2 = o.a();
        }
      }
      finally
      {
        break label54;
      }
      localp3 = d;
      c = localp3;
      label48:
      return localp3;
      label54:
      throw localp3;
    }
    return localp3;
  }
  
  public x.c a(O paramO, int paramInt)
  {
    a.a(a.get(new a(paramO, paramInt)));
    return null;
  }
  
  public static final class a
  {
    public final Object a;
    public final int b;
    
    public a(Object paramObject, int paramInt)
    {
      a = paramObject;
      b = paramInt;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof a;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (a)paramObject;
      bool1 = bool2;
      if (a == a)
      {
        bool1 = bool2;
        if (b == b) {
          bool1 = true;
        }
      }
      return bool1;
    }
    
    public int hashCode()
    {
      return System.identityHashCode(a) * 65535 + b;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
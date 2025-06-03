package m0;

import X2.t;
import X2.w;
import X2.y;
import X2.y.a;
import d0.b;
import g0.M;
import g0.a;
import java.util.Iterator;
import java.util.Set;

public final class e$e
{
  public static final e d;
  public final int a;
  public final int b;
  public final y c;
  
  static
  {
    e locale;
    if (M.a >= 33) {
      locale = new e(2, a(10));
    } else {
      locale = new e(2, 10);
    }
    d = locale;
  }
  
  public e$e(int paramInt1, int paramInt2)
  {
    a = paramInt1;
    b = paramInt2;
    c = null;
  }
  
  public e$e(int paramInt, Set paramSet)
  {
    a = paramInt;
    paramSet = y.T(paramSet);
    c = paramSet;
    paramSet = paramSet.q();
    for (paramInt = 0; paramSet.hasNext(); paramInt = Math.max(paramInt, Integer.bitCount(((Integer)paramSet.next()).intValue()))) {}
    b = paramInt;
  }
  
  public static y a(int paramInt)
  {
    y.a locala = new y.a();
    for (int i = 1; i <= paramInt; i++) {
      locala.h(Integer.valueOf(M.M(i)));
    }
    return locala.l();
  }
  
  public int b(int paramInt, b paramb)
  {
    if (c != null) {
      return b;
    }
    if (M.a >= 29) {
      return e.c.b(a, paramInt, paramb);
    }
    return ((Integer)a.e((Integer)e.e.getOrDefault(Integer.valueOf(a), Integer.valueOf(0)))).intValue();
  }
  
  public boolean c(int paramInt)
  {
    y localy = c;
    boolean bool = false;
    if (localy == null)
    {
      if (paramInt <= b) {
        bool = true;
      }
      return bool;
    }
    paramInt = M.M(paramInt);
    if (paramInt == 0) {
      return false;
    }
    return c.contains(Integer.valueOf(paramInt));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof e)) {
      return false;
    }
    paramObject = (e)paramObject;
    if ((a != a) || (b != b) || (!M.c(c, c))) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    int i = a;
    int j = b;
    y localy = c;
    int k;
    if (localy == null) {
      k = 0;
    } else {
      k = localy.hashCode();
    }
    return (i * 31 + j) * 31 + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AudioProfile[format=");
    localStringBuilder.append(a);
    localStringBuilder.append(", maxChannelCount=");
    localStringBuilder.append(b);
    localStringBuilder.append(", channelMasks=");
    localStringBuilder.append(c);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     m0.e.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package x0;

import X2.E;
import X2.v;
import d0.J;
import g0.M;
import g0.o;
import java.util.AbstractCollection;
import java.util.List;

public final class Z
{
  public static final Z d = new Z(new J[0]);
  public static final String e = M.w0(0);
  public final int a;
  public final v b;
  public int c;
  
  public Z(J... paramVarArgs)
  {
    b = v.V(paramVarArgs);
    a = paramVarArgs.length;
    f();
  }
  
  public J b(int paramInt)
  {
    return (J)b.get(paramInt);
  }
  
  public v c()
  {
    return v.U(E.k(b, new Y()));
  }
  
  public int d(J paramJ)
  {
    int i = b.indexOf(paramJ);
    if (i < 0) {
      i = -1;
    }
    return i;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (Z.class == paramObject.getClass()))
    {
      paramObject = (Z)paramObject;
      if ((a != a) || (!b.equals(b))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final void f()
  {
    int j;
    for (int i = 0; i < b.size(); i = j)
    {
      j = i + 1;
      for (int k = j; k < b.size(); k++) {
        if (((J)b.get(i)).equals(b.get(k))) {
          o.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
        }
      }
    }
  }
  
  public int hashCode()
  {
    if (c == 0) {
      c = b.hashCode();
    }
    return c;
  }
}

/* Location:
 * Qualified Name:     x0.Z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
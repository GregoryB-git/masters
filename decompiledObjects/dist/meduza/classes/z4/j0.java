package z4;

import e0.e;
import o7.l0;
import o7.t;
import v3.g;
import v5.e0;
import v5.m;

public final class j0
  implements g
{
  public static final j0 d = new j0(new i0[0]);
  public static final String e = e0.E(0);
  public final int a;
  public final l0 b;
  public int c;
  
  static
  {
    new e(14);
  }
  
  public j0(i0... paramVarArgs)
  {
    b = t.q(paramVarArgs);
    a = paramVarArgs.length;
    int j;
    for (int i = 0; i < b.d; i = j)
    {
      j = i + 1;
      for (int k = j;; k++)
      {
        paramVarArgs = b;
        if (k >= d) {
          break;
        }
        if (((i0)paramVarArgs.get(i)).equals(b.get(k))) {
          m.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
        }
      }
    }
  }
  
  public final i0 a(int paramInt)
  {
    return (i0)b.get(paramInt);
  }
  
  public final int b(i0 parami0)
  {
    int i = b.indexOf(parami0);
    if (i < 0) {
      i = -1;
    }
    return i;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (j0.class == paramObject.getClass()))
    {
      paramObject = (j0)paramObject;
      if ((a != a) || (!b.equals(b))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (c == 0) {
      c = b.hashCode();
    }
    return c;
  }
}

/* Location:
 * Qualified Name:     z4.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
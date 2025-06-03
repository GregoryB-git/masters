package v3;

import android.net.Uri;
import e0.d;
import v5.e0;

public final class o0$h
  implements g
{
  public static final h c = new h(new a());
  public static final String d = e0.E(0);
  public static final String e = e0.E(1);
  public static final String f = e0.E(2);
  public static final d o = new d(6);
  public final Uri a;
  public final String b;
  
  public o0$h(a parama)
  {
    a = a;
    b = b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof h)) {
      return false;
    }
    paramObject = (h)paramObject;
    if ((!e0.a(a, a)) || (!e0.a(b, b))) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = ((Uri)localObject).hashCode();
    }
    localObject = b;
    if (localObject != null) {
      i = ((String)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public static final class a
  {
    public Uri a;
    public String b;
  }
}

/* Location:
 * Qualified Name:     v3.o0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
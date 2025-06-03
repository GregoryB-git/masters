package d0;

import android.net.Uri;
import android.os.Bundle;
import g0.M;

public final class u$i
{
  public static final i d = new a().d();
  public static final String e = M.w0(0);
  public static final String f = M.w0(1);
  public static final String g = M.w0(2);
  public final Uri a;
  public final String b;
  public final Bundle c;
  
  public u$i(a parama)
  {
    a = a.a(parama);
    b = a.b(parama);
    c = a.c(parama);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof i)) {
      return false;
    }
    paramObject = (i)paramObject;
    if ((M.c(a, a)) && (M.c(b, b)))
    {
      int i;
      if (c == null) {
        i = 1;
      } else {
        i = 0;
      }
      int j;
      if (c == null) {
        j = 1;
      } else {
        j = 0;
      }
      if (i == j) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
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
    int k;
    if (localObject == null) {
      k = 0;
    } else {
      k = ((String)localObject).hashCode();
    }
    if (c != null) {
      i = 1;
    }
    return (j * 31 + k) * 31 + i;
  }
  
  public static final class a
  {
    public Uri a;
    public String b;
    public Bundle c;
    
    public u.i d()
    {
      return new u.i(this, null);
    }
  }
}

/* Location:
 * Qualified Name:     d0.u.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
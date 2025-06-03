package v3;

import android.net.Uri;
import java.util.AbstractCollection;
import java.util.List;
import o7.t;
import o7.t.a;
import v5.e0;
import y4.c;

public class o0$f
{
  public final Uri a;
  public final String b;
  public final o0.d c;
  public final List<c> d;
  public final String e;
  public final t<o0.j> f;
  public final Object g;
  
  public o0$f() {}
  
  public o0$f(Uri paramUri, String paramString1, o0.d paramd, List paramList, String paramString2, t paramt, Object paramObject)
  {
    a = paramUri;
    b = paramString1;
    c = paramd;
    d = paramList;
    e = paramString2;
    f = paramt;
    paramUri = t.b;
    paramUri = new t.a();
    for (int i = 0; i < paramt.size(); i++)
    {
      paramString1 = (o0.j)paramt.get(i);
      paramString1.getClass();
      paramUri.c(new o0.i(new o0.j.a(paramString1)));
    }
    paramUri.e();
    g = paramObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof f)) {
      return false;
    }
    paramObject = (f)paramObject;
    if ((!a.equals(a)) || (!e0.a(b, b)) || (!e0.a(c, c)) || (!e0.a(null, null)) || (!d.equals(d)) || (!e0.a(e, e)) || (!f.equals(f)) || (!e0.a(g, g))) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    Object localObject = b;
    int j = 0;
    int k;
    if (localObject == null) {
      k = 0;
    } else {
      k = ((String)localObject).hashCode();
    }
    localObject = c;
    int m;
    if (localObject == null) {
      m = 0;
    } else {
      m = ((o0.d)localObject).hashCode();
    }
    int n = d.hashCode();
    localObject = e;
    int i1;
    if (localObject == null) {
      i1 = 0;
    } else {
      i1 = ((String)localObject).hashCode();
    }
    int i2 = f.hashCode();
    localObject = g;
    if (localObject != null) {
      j = localObject.hashCode();
    }
    return (i2 + ((n + (((i * 31 + k) * 31 + m) * 31 + 0) * 31) * 31 + i1) * 31) * 31 + j;
  }
}

/* Location:
 * Qualified Name:     v3.o0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
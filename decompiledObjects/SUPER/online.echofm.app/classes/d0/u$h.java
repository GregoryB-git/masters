package d0;

import X2.v;
import X2.v.a;
import android.net.Uri;
import g0.M;
import java.util.AbstractCollection;
import java.util.List;

public final class u$h
{
  public static final String j = M.w0(0);
  public static final String k = M.w0(1);
  public static final String l = M.w0(2);
  public static final String m = M.w0(3);
  public static final String n = M.w0(4);
  public static final String o = M.w0(5);
  public static final String p = M.w0(6);
  public static final String q = M.w0(7);
  public final Uri a;
  public final String b;
  public final u.f c;
  public final List d;
  public final String e;
  public final v f;
  public final List g;
  public final Object h;
  public final long i;
  
  public u$h(Uri paramUri, String paramString1, u.f paramf, u.b paramb, List paramList, String paramString2, v paramv, Object paramObject, long paramLong)
  {
    a = paramUri;
    b = z.t(paramString1);
    c = paramf;
    d = paramList;
    e = paramString2;
    f = paramv;
    paramUri = v.M();
    for (int i1 = 0; i1 < paramv.size(); i1++) {
      paramUri.h(u.k.a.a(((u.k)paramv.get(i1)).a()));
    }
    g = paramUri.k();
    h = paramObject;
    i = paramLong;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof h)) {
      return false;
    }
    paramObject = (h)paramObject;
    if ((!a.equals(a)) || (!M.c(b, b)) || (!M.c(c, c)) || (!M.c(null, null)) || (!d.equals(d)) || (!M.c(e, e)) || (!f.equals(f)) || (!M.c(h, h)) || (!M.c(Long.valueOf(i), Long.valueOf(i)))) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    int i1 = a.hashCode();
    Object localObject = b;
    int i2 = 0;
    int i3;
    if (localObject == null) {
      i3 = 0;
    } else {
      i3 = ((String)localObject).hashCode();
    }
    localObject = c;
    int i4;
    if (localObject == null) {
      i4 = 0;
    } else {
      i4 = ((u.f)localObject).hashCode();
    }
    int i5 = d.hashCode();
    localObject = e;
    int i6;
    if (localObject == null) {
      i6 = 0;
    } else {
      i6 = ((String)localObject).hashCode();
    }
    int i7 = f.hashCode();
    localObject = h;
    if (localObject != null) {
      i2 = localObject.hashCode();
    }
    return (int)(((((((i1 * 31 + i3) * 31 + i4) * 961 + i5) * 31 + i6) * 31 + i7) * 31 + i2) * 31L + i);
  }
}

/* Location:
 * Qualified Name:     d0.u.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
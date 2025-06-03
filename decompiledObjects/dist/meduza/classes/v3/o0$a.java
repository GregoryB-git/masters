package v3;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import o7.l0;
import o7.t;
import x6.b;
import y4.c;

public final class o0$a
{
  public String a;
  public Uri b;
  public String c;
  public o0.b.a d = new o0.b.a();
  public o0.d.a e = new o0.d.a();
  public List<c> f = Collections.emptyList();
  public String g;
  public t<o0.j> h = l0.e;
  public Object i;
  public p0 j;
  public o0.e.a k = new o0.e.a();
  public o0.h l = o0.h.c;
  
  public final o0 a()
  {
    Object localObject1 = e;
    boolean bool;
    if ((b != null) && (a == null)) {
      bool = false;
    } else {
      bool = true;
    }
    b.H(bool);
    Object localObject2 = b;
    localObject1 = null;
    if (localObject2 != null)
    {
      str = c;
      localObject3 = e;
      if (a != null) {
        localObject1 = new o0.d((o0.d.a)localObject3);
      }
      localObject1 = new o0.g((Uri)localObject2, str, (o0.d)localObject1, f, g, h, i);
    }
    else
    {
      localObject1 = null;
    }
    String str = a;
    if (str == null) {
      str = "";
    }
    localObject2 = d;
    localObject2.getClass();
    Object localObject3 = new o0.c((o0.b.a)localObject2);
    localObject2 = k;
    localObject2.getClass();
    o0.e locale = new o0.e(a, b, c, d, e);
    localObject2 = j;
    if (localObject2 == null) {
      localObject2 = p0.Q;
    }
    return new o0(str, (o0.c)localObject3, (o0.g)localObject1, locale, (p0)localObject2, l);
  }
}

/* Location:
 * Qualified Name:     v3.o0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
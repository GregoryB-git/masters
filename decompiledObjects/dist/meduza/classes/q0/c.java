package q0;

import android.content.Context;
import b.z;
import dc.l;
import java.util.List;
import jc.h;
import nc.d0;
import o0.e;
import o0.q;

public final class c
  implements fc.a<Context, o0.i<r0.d>>
{
  public final String a;
  public final p0.a<r0.d> b;
  public final l<Context, List<o0.d<r0.d>>> c;
  public final d0 d;
  public final Object e;
  public volatile r0.b f;
  
  public c(String paramString, p0.a<r0.d> parama, l<? super Context, ? extends List<? extends o0.d<r0.d>>> paraml, d0 paramd0)
  {
    a = paramString;
    b = parama;
    c = paraml;
    d = paramd0;
    e = new Object();
  }
  
  public final r0.b a(Object paramObject, h paramh)
  {
    Object localObject1 = (Context)paramObject;
    ec.i.e(localObject1, "thisRef");
    ec.i.e(paramh, "property");
    paramh = f;
    paramObject = paramh;
    if (paramh == null) {
      synchronized (e)
      {
        if (f == null)
        {
          paramObject = ((Context)localObject1).getApplicationContext();
          paramh = b;
          localObject1 = c;
          ec.i.d(paramObject, "applicationContext");
          List localList = (List)((l)localObject1).invoke(paramObject);
          localObject1 = d;
          b localb = new q0/b;
          localb.<init>((Context)paramObject, this);
          ec.i.e(localList, "migrations");
          ec.i.e(localObject1, "scope");
          r0.c localc = new r0/c;
          localc.<init>(localb);
          paramObject = paramh;
          if (paramh == null)
          {
            paramObject = new b/z;
            ((z)paramObject).<init>();
          }
          paramh = new o0/e;
          paramh.<init>(localList, null);
          localList = va.a.f(paramh);
          paramh = new o0/q;
          paramh.<init>(localc, localList, (o0.b)paramObject, (d0)localObject1);
          paramObject = new r0/b;
          ((r0.b)paramObject).<init>(paramh);
          f = ((r0.b)paramObject);
        }
        paramObject = f;
        ec.i.b(paramObject);
      }
    }
    return (r0.b)paramObject;
  }
}

/* Location:
 * Qualified Name:     q0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
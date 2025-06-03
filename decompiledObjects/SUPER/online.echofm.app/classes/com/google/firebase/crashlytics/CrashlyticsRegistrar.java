package com.google.firebase.crashlytics;

import B3.c;
import B3.c.b;
import B3.r;
import D3.f;
import D3.g;
import O4.h;
import R4.l;
import S4.b.a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import s4.i;

public class CrashlyticsRegistrar
  implements ComponentRegistrar
{
  static
  {
    S4.a.a.a(b.a.o);
  }
  
  public final g b(B3.e parame)
  {
    s3.e locale = (s3.e)parame.a(s3.e.class);
    r4.a locala1 = parame.i(E3.a.class);
    r4.a locala2 = parame.i(w3.a.class);
    return g.e(locale, (i)parame.a(i.class), (l)parame.a(l.class), locala1, locala2);
  }
  
  public List getComponents()
  {
    return Arrays.asList(new c[] { c.e(g.class).h("fire-cls").b(r.k(s3.e.class)).b(r.k(i.class)).b(r.k(l.class)).b(r.a(E3.a.class)).b(r.a(w3.a.class)).f(new f(this)).e().d(), h.b("fire-cls", "18.5.1") });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.crashlytics.CrashlyticsRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
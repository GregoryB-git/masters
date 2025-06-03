package com.google.firebase.perf;

import B3.F;
import B3.c.b;
import B3.r;
import D4.a.b;
import O4.h;
import P4.x;
import R4.l;
import S4.b.a;
import androidx.annotation.Keep;
import c2.g;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import s3.n;
import s4.i;

@Keep
public class FirebasePerfRegistrar
  implements ComponentRegistrar
{
  private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
  private static final String LIBRARY_NAME = "fire-perf";
  
  static
  {
    S4.a.a.a(b.a.p);
  }
  
  private static A4.e providesFirebasePerformance(B3.e parame)
  {
    parame.a(A4.b.class);
    return D4.a.b().b(new E4.a((s3.e)parame.a(s3.e.class), (i)parame.a(i.class), parame.g(x.class), parame.g(g.class))).a().a();
  }
  
  @Keep
  public List<B3.c> getComponents()
  {
    F localF = F.a(y3.d.class, Executor.class);
    return Arrays.asList(new B3.c[] { B3.c.e(A4.e.class).h("fire-perf").b(r.k(s3.e.class)).b(r.m(x.class)).b(r.k(i.class)).b(r.m(g.class)).b(r.k(A4.b.class)).f(new A4.c()).d(), B3.c.e(A4.b.class).h("fire-perf-early").b(r.k(s3.e.class)).b(r.k(l.class)).b(r.i(n.class)).b(r.j(localF)).e().f(new A4.d(localF)).d(), h.b("fire-perf", "20.5.0") });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.perf.FirebasePerfRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
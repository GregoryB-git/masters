package D3;

import H3.A;
import H3.C;
import H3.s;
import H3.y;
import R4.l;
import V2.j;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class g
{
  public final s a;
  
  public g(s params)
  {
    a = params;
  }
  
  public static g d()
  {
    g localg = (g)s3.e.o().k(g.class);
    if (localg != null) {
      return localg;
    }
    throw new NullPointerException("FirebaseCrashlytics component is not present.");
  }
  
  public static g e(final s3.e parame, s4.i parami, final l paraml, r4.a parama1, r4.a parama2)
  {
    Context localContext = parame.m();
    Object localObject1 = localContext.getPackageName();
    Object localObject2 = E3.f.f();
    Object localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append("Initializing Firebase Crashlytics ");
    ((StringBuilder)localObject3).append(s.l());
    ((StringBuilder)localObject3).append(" for ");
    ((StringBuilder)localObject3).append((String)localObject1);
    ((E3.f)localObject2).g(((StringBuilder)localObject3).toString());
    localObject3 = new M3.g(localContext);
    localObject2 = new y(parame);
    parami = new C(localContext, (String)localObject1, parami, (y)localObject2);
    parama1 = new E3.d(parama1);
    localObject1 = new d(parama2);
    Object localObject4 = A.c("Crashlytics Exception Handler");
    parama2 = new H3.m((y)localObject2, (M3.g)localObject3);
    paraml.e(parama2);
    paraml = new s(parame, parami, parama1, (y)localObject2, ((d)localObject1).e(), ((d)localObject1).d(), (M3.g)localObject3, (ExecutorService)localObject4, parama2);
    parame = parame.r().c();
    parama1 = H3.i.n(localContext);
    parama2 = H3.i.k(localContext);
    localObject1 = E3.f.f();
    localObject4 = new StringBuilder();
    ((StringBuilder)localObject4).append("Mapping file ID is: ");
    ((StringBuilder)localObject4).append(parama1);
    ((E3.f)localObject1).b(((StringBuilder)localObject4).toString());
    localObject1 = parama2.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject4 = (H3.f)((Iterator)localObject1).next();
      E3.f.f().b(String.format("Build id for %s on %s: %s", new Object[] { ((H3.f)localObject4).c(), ((H3.f)localObject4).a(), ((H3.f)localObject4).b() }));
    }
    localObject1 = new E3.e(localContext);
    try
    {
      parama1 = H3.a.a(localContext, parami, parame, parama1, parama2, (E3.e)localObject1);
      localObject1 = E3.f.f();
      parama2 = new StringBuilder();
      parama2.append("Installer package name is: ");
      parama2.append(d);
      ((E3.f)localObject1).i(parama2.toString());
      parama2 = A.c("com.google.firebase.crashlytics.startup");
      parame = O3.f.l(localContext, parame, parami, new L3.b(), f, g, (M3.g)localObject3, (y)localObject2);
      parame.p(parama2).g(parama2, new a());
      V2.m.c(parama2, new b(paraml.s(parama1, parame), paraml, parame));
      return new g(paraml);
    }
    catch (PackageManager.NameNotFoundException parame)
    {
      E3.f.f().e("Error retrieving app package info.", parame);
    }
    return null;
  }
  
  public j a()
  {
    return a.e();
  }
  
  public void b()
  {
    a.f();
  }
  
  public boolean c()
  {
    return a.g();
  }
  
  public void f(String paramString)
  {
    a.n(paramString);
  }
  
  public void g(Throwable paramThrowable)
  {
    if (paramThrowable == null)
    {
      E3.f.f().k("A null value was passed to recordException. Ignoring.");
      return;
    }
    a.o(paramThrowable);
  }
  
  public void h()
  {
    a.t();
  }
  
  public void i(Boolean paramBoolean)
  {
    a.u(paramBoolean);
  }
  
  public void j(boolean paramBoolean)
  {
    a.u(Boolean.valueOf(paramBoolean));
  }
  
  public void k(String paramString1, String paramString2)
  {
    a.v(paramString1, paramString2);
  }
  
  public void l(String paramString)
  {
    a.x(paramString);
  }
  
  public class a
    implements V2.b
  {
    public Object a(j paramj)
    {
      if (!paramj.n()) {
        E3.f.f().e("Error fetching settings.", paramj.i());
      }
      return null;
    }
  }
  
  public class b
    implements Callable
  {
    public b(s params, O3.f paramf) {}
    
    public Void a()
    {
      if (o) {
        paraml.j(parame);
      }
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     D3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
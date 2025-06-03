package g9;

import com.google.firebase.firestore.g;
import d9.f0;
import d9.i0;
import e9.a;
import eb.e1;
import i9.k1;
import i9.n;
import i9.q.b;
import i9.u;
import i9.w;
import m9.c0;
import m9.d;
import m9.h0;
import m9.h0.a;
import m9.j;
import r3.a0;
import x6.b;

public class b0
  extends f
{
  public b0(g paramg)
  {
    super(paramg);
  }
  
  public final k a()
  {
    return new k(i());
  }
  
  public k1 b(f.a parama)
  {
    return null;
  }
  
  public i9.e c(f.a parama)
  {
    return null;
  }
  
  public final n d(f.a parama)
  {
    a locala = c;
    b.a0(locala, "persistence not initialized yet", new Object[0]);
    return new n(locala, new i9.d0(), d);
  }
  
  public a e(f.a parama)
  {
    parama = a.e;
    boolean bool;
    if ((parama != null) && ((parama instanceof f0))) {
      bool = a instanceof i0;
    } else {
      bool = false;
    }
    if (bool)
    {
      parama = b.b;
      b.a0(parama, "remoteSerializer not initialized yet", new Object[0]);
      i9.i locali = new i9.i(parama);
      parama = new q.b(a.a());
      w localw = new w();
      i = new u(localw, parama, locali);
      return localw;
    }
    parama = new w();
    i = new a0(parama);
    return parama;
  }
  
  public final h0 f(f.a parama)
  {
    j9.f localf = c.a;
    a locala = new a();
    n localn = h();
    j localj = b.d;
    b.a0(localj, "datastore not initialized yet", new Object[0]);
    parama = b;
    d locald = b.e;
    b.a0(locald, "connectivityMonitor not initialized yet", new Object[0]);
    return new h0(localf, locala, localn, localj, parama, locald);
  }
  
  public final j0 g(f.a parama)
  {
    n localn = h();
    h0 localh0 = f;
    b.a0(localh0, "remoteStore not initialized yet", new Object[0]);
    return new j0(localn, localh0, d, 100);
  }
  
  public final class a
    implements h0.a
  {
    public a() {}
    
    public final void a(k9.h paramh)
    {
      i().a(paramh);
    }
    
    public final void b(d0 paramd0)
    {
      i().b(paramd0);
    }
    
    public final void c(m9.d0 paramd0)
    {
      i().c(paramd0);
    }
    
    public final t8.e<j9.i> d(int paramInt)
    {
      return i().d(paramInt);
    }
    
    public final void e(int paramInt, e1 parame1)
    {
      i().e(paramInt, parame1);
    }
    
    public final void f(int paramInt, e1 parame1)
    {
      i().f(paramInt, parame1);
    }
  }
}

/* Location:
 * Qualified Name:     g9.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
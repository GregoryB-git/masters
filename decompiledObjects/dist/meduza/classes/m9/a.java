package m9;

import com.google.android.gms.tasks.Task;
import eb.e;
import eb.e1;
import eb.e1.a;
import eb.t0;
import eb.x;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import ma.w;
import n9.g;
import p2.m0;
import x6.b;

public abstract class a<ReqT, RespT, CallbackT extends j0>
{
  public static final long n;
  public static final long o;
  public static final long p;
  public static final long q;
  public static final long r;
  public n9.a.a a;
  public n9.a.a b;
  public final v c;
  public final t0<ReqT, RespT> d;
  public final a<ReqT, RespT, CallbackT>.b e;
  public final n9.a f;
  public final n9.a.c g;
  public final n9.a.c h;
  public i0 i = i0.a;
  public long j = 0L;
  public s k;
  public final g l;
  public final CallbackT m;
  
  static
  {
    TimeUnit localTimeUnit1 = TimeUnit.SECONDS;
    n = localTimeUnit1.toMillis(1L);
    TimeUnit localTimeUnit2 = TimeUnit.MINUTES;
    o = localTimeUnit2.toMillis(1L);
    p = localTimeUnit2.toMillis(1L);
    q = localTimeUnit1.toMillis(10L);
    r = localTimeUnit1.toMillis(10L);
  }
  
  public a(v paramv, t0 paramt0, n9.a parama, n9.a.c paramc1, n9.a.c paramc2, j0 paramj0)
  {
    c = paramv;
    d = paramt0;
    f = parama;
    g = paramc2;
    h = localc;
    m = paramj0;
    e = new b();
    l = new g(parama, paramc1, n, o);
  }
  
  public final void a(i0 parami0, e1 parame1)
  {
    b.Z("Only started streams should be closed.", d(), new Object[0]);
    i0 locali0 = i0.e;
    boolean bool;
    if ((parami0 != locali0) && (!parame1.e())) {
      bool = false;
    } else {
      bool = true;
    }
    b.Z("Can't provide an error when not in an error state.", bool, new Object[0]);
    f.d();
    Object localObject = j.d;
    localObject = a;
    localObject = c;
    if ((localObject instanceof SSLHandshakeException)) {
      ((Throwable)localObject).getMessage().contains("no ciphers available");
    }
    localObject = b;
    if (localObject != null)
    {
      ((n9.a.a)localObject).a();
      b = null;
    }
    localObject = a;
    if (localObject != null)
    {
      ((n9.a.a)localObject).a();
      a = null;
    }
    g localg = l;
    localObject = h;
    if (localObject != null)
    {
      ((n9.a.a)localObject).a();
      h = null;
    }
    j += 1L;
    localObject = a;
    if (localObject == e1.a.c)
    {
      l.f = 0L;
    }
    else if (localObject == e1.a.s)
    {
      m0.y(1, getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", new Object[] { Integer.valueOf(System.identityHashCode(this)) });
      localObject = l;
      f = e;
    }
    else if ((localObject == e1.a.A) && (i != i0.d))
    {
      localObject = c;
      b.t();
      c.t();
    }
    else if (localObject == e1.a.y)
    {
      localObject = c;
      if (((localObject instanceof UnknownHostException)) || ((localObject instanceof ConnectException))) {
        l.e = r;
      }
    }
    if (parami0 != locali0)
    {
      m0.y(1, getClass().getSimpleName(), "(%x) Performing stream teardown", new Object[] { Integer.valueOf(System.identityHashCode(this)) });
      h();
    }
    if (k != null)
    {
      if (parame1.e())
      {
        m0.y(1, getClass().getSimpleName(), "(%x) Closing stream client-side", new Object[] { Integer.valueOf(System.identityHashCode(this)) });
        k.b();
      }
      k = null;
    }
    i = parami0;
    m.c(parame1);
  }
  
  public final void b()
  {
    b.Z("Can only inhibit backoff after in a stopped state", d() ^ true, new Object[0]);
    f.d();
    i = i0.a;
    l.f = 0L;
  }
  
  public final boolean c()
  {
    f.d();
    i0 locali0 = i;
    boolean bool;
    if ((locali0 != i0.c) && (locali0 != i0.d)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean d()
  {
    f.d();
    i0 locali0 = i;
    boolean bool;
    if ((locali0 != i0.b) && (locali0 != i0.f) && (!c())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public abstract void e(RespT paramRespT);
  
  public abstract void f(RespT paramRespT);
  
  public void g()
  {
    f.d();
    Object localObject1 = k;
    boolean bool1 = true;
    boolean bool2;
    if (localObject1 == null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b.Z("Last call still set", bool2, new Object[0]);
    if (b == null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b.Z("Idle timer still set", bool2, new Object[0]);
    localObject1 = i;
    Object localObject2 = i0.e;
    if (localObject1 == localObject2)
    {
      if (localObject1 == localObject2) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      b.Z("Should only perform backoff in an error state", bool2, new Object[0]);
      i = i0.f;
      l.a(new u.a(this, 13));
      return;
    }
    if (localObject1 == i0.a) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b.Z("Already started", bool2, new Object[0]);
    localObject1 = new c(new a(j));
    v localv = c;
    Object localObject3 = d;
    localv.getClass();
    localObject2 = new e[1];
    localObject2[0] = null;
    localObject3 = d.a((t0)localObject3);
    ((Task)localObject3).addOnCompleteListener(a.a, new p(localv, (c)localObject1, (e[])localObject2));
    k = new s(localv, (e[])localObject2, (Task)localObject3);
    i = i0.b;
  }
  
  public void h() {}
  
  public final void i(w paramw)
  {
    f.d();
    m0.y(1, getClass().getSimpleName(), "(%x) Stream sending: %s", new Object[] { Integer.valueOf(System.identityHashCode(this)), paramw });
    n9.a.a locala = b;
    if (locala != null)
    {
      locala.a();
      b = null;
    }
    k.d(paramw);
  }
  
  public final class a
  {
    public final long a;
    
    public a(long paramLong)
    {
      a = paramLong;
    }
    
    public final void a(Runnable paramRunnable)
    {
      f.d();
      a locala = a.this;
      if (j == a) {
        paramRunnable.run();
      } else {
        m0.y(1, locala.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
      }
    }
  }
  
  public final class b
    implements Runnable
  {
    public b() {}
    
    public final void run()
    {
      a locala = a.this;
      if (locala.c()) {
        locala.a(i0.a, e1.e);
      }
    }
  }
  
  public final class c
    implements a0<RespT>
  {
    public final a<ReqT, RespT, CallbackT>.a a;
    public int b = 0;
    
    public c()
    {
      a.a locala;
      a = locala;
    }
  }
}

/* Location:
 * Qualified Name:     m9.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
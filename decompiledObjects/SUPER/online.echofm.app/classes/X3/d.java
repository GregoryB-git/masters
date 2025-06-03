package X3;

import V3.b;
import V3.k;
import Y3.m;
import a4.a;
import android.util.Log;
import d4.g;
import d4.n;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public class d
  implements e
{
  public boolean a = false;
  
  public void a()
  {
    q();
  }
  
  public void b(long paramLong)
  {
    q();
  }
  
  public void c(k paramk, b paramb, long paramLong)
  {
    q();
  }
  
  public List d()
  {
    return Collections.emptyList();
  }
  
  public void e(k paramk, n paramn, long paramLong)
  {
    q();
  }
  
  public void f(k paramk, b paramb)
  {
    q();
  }
  
  public Object g(Callable paramCallable)
  {
    m.g(a ^ true, "runInTransaction called when an existing transaction is already in progress.");
    a = true;
    try
    {
      paramCallable = paramCallable.call();
      a = false;
      return paramCallable;
    }
    finally
    {
      try
      {
        Log.e("NoopPersistenceManager", "Caught Throwable.", paramCallable);
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        localRuntimeException.<init>(paramCallable);
        throw localRuntimeException;
      }
      finally
      {
        a = false;
      }
    }
  }
  
  public void h(k paramk, b paramb)
  {
    q();
  }
  
  public void i(a4.i parami)
  {
    q();
  }
  
  public void j(a4.i parami, n paramn)
  {
    q();
  }
  
  public a k(a4.i parami)
  {
    return new a(d4.i.f(g.W(), parami.c()), false, false);
  }
  
  public void l(a4.i parami, Set paramSet1, Set paramSet2)
  {
    q();
  }
  
  public void m(a4.i parami)
  {
    q();
  }
  
  public void n(k paramk, n paramn)
  {
    q();
  }
  
  public void o(a4.i parami, Set paramSet)
  {
    q();
  }
  
  public void p(a4.i parami)
  {
    q();
  }
  
  public final void q()
  {
    m.g(a, "Transaction expected to already be in progress.");
  }
}

/* Location:
 * Qualified Name:     X3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
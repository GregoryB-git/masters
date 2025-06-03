package p1;

import b1.t;
import ec.i;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import l.l;
import u.a;
import x2.v;

public final class n<T>
  extends t<T>
{
  public final j a;
  public final l b;
  public final boolean c;
  public final Callable<T> d;
  public final m e;
  public final AtomicBoolean f;
  public final AtomicBoolean g;
  public final AtomicBoolean h;
  public final b.m i;
  public final a j;
  
  public n(j paramj, l paraml, v paramv, String[] paramArrayOfString)
  {
    a = paramj;
    b = paraml;
    c = true;
    d = paramv;
    e = new m(paramArrayOfString, this);
    f = new AtomicBoolean(true);
    g = new AtomicBoolean(false);
    h = new AtomicBoolean(false);
    i = new b.m(this, 6);
    j = new a(this, 5);
  }
  
  public final void onActive()
  {
    super.onActive();
    Object localObject = b;
    localObject.getClass();
    ((Set)c).add(this);
    if (c)
    {
      localObject = a.c;
      if (localObject == null)
      {
        i.i("internalTransactionExecutor");
        throw null;
      }
    }
    else
    {
      localObject = a.b;
      if (localObject == null) {
        break label80;
      }
    }
    ((Executor)localObject).execute(i);
    return;
    label80:
    i.i("internalQueryExecutor");
    throw null;
  }
  
  public final void onInactive()
  {
    super.onInactive();
    l locall = b;
    locall.getClass();
    ((Set)c).remove(this);
  }
}

/* Location:
 * Qualified Name:     p1.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
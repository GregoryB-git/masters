package b1;

public final class t$c
  extends t<T>.d
  implements m
{
  public final o e;
  
  public t$c(o paramo, x<? super T> paramx)
  {
    super(paramo, localx);
    e = paramx;
  }
  
  public final void a(o paramo, k.a parama)
  {
    paramo = e.getLifecycle().b();
    if (paramo == k.b.a)
    {
      f.removeObserver(a);
      return;
    }
    parama = null;
    while (parama != paramo)
    {
      b(e());
      k.b localb = e.getLifecycle().b();
      parama = paramo;
      paramo = localb;
    }
  }
  
  public final void c()
  {
    e.getLifecycle().c(this);
  }
  
  public final boolean d(o paramo)
  {
    boolean bool;
    if (e == paramo) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean e()
  {
    return e.getLifecycle().b().f(k.b.d);
  }
}

/* Location:
 * Qualified Name:     b1.t.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
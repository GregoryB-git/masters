package V3;

import Y3.m;
import a4.d;
import a4.e.a;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class h
{
  public AtomicBoolean a = new AtomicBoolean(false);
  public i b;
  public boolean c = false;
  
  public abstract h a(a4.i parami);
  
  public abstract d b(a4.c paramc, a4.i parami);
  
  public abstract void c(Q3.c paramc);
  
  public abstract void d(d paramd);
  
  public abstract a4.i e();
  
  public abstract boolean f(h paramh);
  
  public boolean g()
  {
    return c;
  }
  
  public boolean h()
  {
    return a.get();
  }
  
  public abstract boolean i(e.a parama);
  
  public void j(boolean paramBoolean)
  {
    c = paramBoolean;
  }
  
  public void k(i parami)
  {
    boolean bool1 = h();
    boolean bool2 = true;
    m.f(bool1 ^ true);
    if (b != null) {
      bool2 = false;
    }
    m.f(bool2);
    b = parami;
  }
  
  public void l()
  {
    if (a.compareAndSet(false, true))
    {
      i locali = b;
      if (locali != null)
      {
        locali.a(this);
        b = null;
      }
    }
  }
}

/* Location:
 * Qualified Name:     V3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
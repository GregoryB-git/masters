package androidx.lifecycle;

class LiveData$LifecycleBoundObserver
  extends LiveData.c
  implements f
{
  public final h s;
  
  public void a(h paramh, d.b paramb)
  {
    paramh = s.g().b();
    if (paramh == d.c.o)
    {
      t.i(o);
      return;
    }
    paramb = null;
    while (paramb != paramh)
    {
      b(d());
      d.c localc = s.g().b();
      paramb = paramh;
      paramh = localc;
    }
  }
  
  public void c()
  {
    s.g().c(this);
  }
  
  public boolean d()
  {
    return s.g().b().c(d.c.r);
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LiveData.LifecycleBoundObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
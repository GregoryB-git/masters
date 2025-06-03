package androidx.datastore.preferences.protobuf;

public abstract class w$a
  extends a.a
{
  public final w o;
  public w p;
  public boolean q;
  
  public w$a(w paramw)
  {
    o = paramw;
    p = ((w)paramw.q(w.d.r));
    q = false;
  }
  
  public final w s()
  {
    w localw = t();
    if (localw.x()) {
      return localw;
    }
    throw a.a.p(localw);
  }
  
  public w t()
  {
    if (q) {
      return p;
    }
    p.z();
    q = true;
    return p;
  }
  
  public a u()
  {
    a locala = w().B();
    locala.y(t());
    return locala;
  }
  
  public void v()
  {
    if (q)
    {
      w localw = (w)p.q(w.d.r);
      z(localw, p);
      p = localw;
      q = false;
    }
  }
  
  public w w()
  {
    return o;
  }
  
  public a x(w paramw)
  {
    return y(paramw);
  }
  
  public a y(w paramw)
  {
    v();
    z(p, paramw);
    return this;
  }
  
  public final void z(w paramw1, w paramw2)
  {
    a0.a().d(paramw1).a(paramw1, paramw2);
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.w.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package R2;

public abstract class f1
  extends G1
{
  public boolean b;
  
  public f1(N2 paramN2)
  {
    super(paramN2);
    a.n();
  }
  
  public abstract boolean A();
  
  public final void v()
  {
    if (z()) {
      return;
    }
    throw new IllegalStateException("Not initialized");
  }
  
  public final void w()
  {
    if (!b)
    {
      if (!A())
      {
        a.R();
        b = true;
      }
      return;
    }
    throw new IllegalStateException("Can't initialize twice");
  }
  
  public final void x()
  {
    if (!b)
    {
      y();
      a.R();
      b = true;
      return;
    }
    throw new IllegalStateException("Can't initialize twice");
  }
  
  public void y() {}
  
  public final boolean z()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     R2.f1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
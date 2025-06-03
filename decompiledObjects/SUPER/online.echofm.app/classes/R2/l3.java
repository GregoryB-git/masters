package R2;

public abstract class l3
  extends m3
{
  public boolean b;
  
  public l3(N2 paramN2)
  {
    super(paramN2);
    a.n();
  }
  
  public final void o()
  {
    if (r()) {
      return;
    }
    throw new IllegalStateException("Not initialized");
  }
  
  public final void p()
  {
    if (!b)
    {
      if (!s())
      {
        a.R();
        b = true;
      }
      return;
    }
    throw new IllegalStateException("Can't initialize twice");
  }
  
  public final void q()
  {
    if (!b)
    {
      t();
      a.R();
      b = true;
      return;
    }
    throw new IllegalStateException("Can't initialize twice");
  }
  
  public final boolean r()
  {
    return b;
  }
  
  public abstract boolean s();
  
  public void t() {}
}

/* Location:
 * Qualified Name:     R2.l3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
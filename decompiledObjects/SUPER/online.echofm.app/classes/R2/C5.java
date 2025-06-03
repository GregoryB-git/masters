package R2;

public abstract class C5
  extends z5
{
  public boolean c;
  
  public C5(D5 paramD5)
  {
    super(paramD5);
    b.r0();
  }
  
  public final void u()
  {
    if (w()) {
      return;
    }
    throw new IllegalStateException("Not initialized");
  }
  
  public final void v()
  {
    if (!c)
    {
      x();
      b.q0();
      c = true;
      return;
    }
    throw new IllegalStateException("Can't initialize twice");
  }
  
  public final boolean w()
  {
    return c;
  }
  
  public abstract boolean x();
}

/* Location:
 * Qualified Name:     R2.C5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
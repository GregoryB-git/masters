package e7;

public abstract class h6
  extends z5
{
  public boolean d;
  
  public h6(i6 parami6)
  {
    super(parami6);
    parami6 = c;
    z += 1;
  }
  
  public final void p()
  {
    if (d) {
      return;
    }
    throw new IllegalStateException("Not initialized");
  }
  
  public final void q()
  {
    if (!d)
    {
      r();
      i6 locali6 = c;
      A += 1;
      d = true;
      return;
    }
    throw new IllegalStateException("Can't initialize twice");
  }
  
  public abstract boolean r();
}

/* Location:
 * Qualified Name:     e7.h6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
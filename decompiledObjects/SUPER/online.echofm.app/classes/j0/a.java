package j0;

public abstract class a
{
  public int o;
  
  public final void l(int paramInt)
  {
    o = (paramInt | o);
  }
  
  public void m()
  {
    o = 0;
  }
  
  public final boolean n(int paramInt)
  {
    boolean bool;
    if ((o & paramInt) == paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean o()
  {
    return n(268435456);
  }
  
  public final boolean p()
  {
    return n(4);
  }
  
  public final boolean r()
  {
    return n(134217728);
  }
  
  public final boolean s()
  {
    return n(1);
  }
  
  public final boolean u()
  {
    return n(536870912);
  }
  
  public final void w(int paramInt)
  {
    o = paramInt;
  }
}

/* Location:
 * Qualified Name:     j0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
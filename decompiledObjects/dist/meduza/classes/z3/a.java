package z3;

public abstract class a
{
  public int a;
  
  public final void l(int paramInt)
  {
    a = (paramInt | a);
  }
  
  public final boolean m(int paramInt)
  {
    boolean bool;
    if ((a & paramInt) == paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean n()
  {
    return m(Integer.MIN_VALUE);
  }
}

/* Location:
 * Qualified Name:     z3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
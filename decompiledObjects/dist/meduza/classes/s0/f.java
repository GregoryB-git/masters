package s0;

public final class f
  extends g.a
{
  public int a = 0;
  public final int b;
  
  public f(g paramg)
  {
    b = paramg.size();
  }
  
  public final boolean hasNext()
  {
    boolean bool;
    if (a < b) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     s0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
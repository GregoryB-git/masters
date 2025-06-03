package B3;

public class q$c
{
  public final F a;
  public final boolean b;
  
  public q$c(F paramF, boolean paramBoolean)
  {
    a = paramF;
    b = paramBoolean;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof c;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (c)paramObject;
      bool3 = bool2;
      if (a.equals(a))
      {
        bool3 = bool2;
        if (b == b) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public int hashCode()
  {
    return (a.hashCode() ^ 0xF4243) * 1000003 ^ Boolean.valueOf(b).hashCode();
  }
}

/* Location:
 * Qualified Name:     B3.q.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
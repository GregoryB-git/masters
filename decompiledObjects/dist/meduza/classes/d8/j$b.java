package d8;

public final class j$b
{
  public final t<?> a;
  public final boolean b;
  
  public j$b() {}
  
  public j$b(t paramt, boolean paramBoolean)
  {
    a = paramt;
    b = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof b;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (b)paramObject;
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
  
  public final int hashCode()
  {
    return (a.hashCode() ^ 0xF4243) * 1000003 ^ Boolean.valueOf(b).hashCode();
  }
}

/* Location:
 * Qualified Name:     d8.j.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
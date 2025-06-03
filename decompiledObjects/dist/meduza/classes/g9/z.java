package g9;

import j9.i;

public final class z
{
  public final a a;
  public final i b;
  
  public z(a parama, i parami)
  {
    a = parama;
    b = parami;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof z;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (z)paramObject;
    bool1 = bool2;
    if (a.equals(a))
    {
      bool1 = bool2;
      if (b.equals(b)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    return b.hashCode() + (i + 2077) * 31;
  }
  
  public static enum a
  {
    static
    {
      a locala1 = new a("ADDED", 0);
      a = locala1;
      a locala2 = new a("REMOVED", 1);
      b = locala2;
      c = new a[] { locala1, locala2 };
    }
    
    public a() {}
  }
}

/* Location:
 * Qualified Name:     g9.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
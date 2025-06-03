package eb;

import x6.b;

public final class o
{
  public final n a;
  public final e1 b;
  
  public o(n paramn, e1 parame1)
  {
    a = paramn;
    b.y(parame1, "status is null");
    b = parame1;
  }
  
  public static o a(n paramn)
  {
    boolean bool;
    if (paramn != n.c) {
      bool = true;
    } else {
      bool = false;
    }
    b.s("state is TRANSIENT_ERROR. Use forError() instead", bool);
    return new o(paramn, e1.e);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof o;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (o)paramObject;
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
    return a.hashCode() ^ b.hashCode();
  }
  
  public final String toString()
  {
    if (b.e()) {
      return a.toString();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append("(");
    localStringBuilder.append(b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     eb.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
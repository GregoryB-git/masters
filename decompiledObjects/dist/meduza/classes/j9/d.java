package j9;

import f;
import q0.g;

public final class d
  extends k.c
{
  public final l a;
  public final int b;
  
  public d(l paraml, int paramInt)
  {
    if (paraml != null)
    {
      a = paraml;
      if (paramInt != 0)
      {
        b = paramInt;
        return;
      }
      throw new NullPointerException("Null kind");
    }
    throw new NullPointerException("Null fieldPath");
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof k.c))
    {
      paramObject = (k.c)paramObject;
      if ((!a.equals(((k.c)paramObject).f())) || (!g.b(b, ((k.c)paramObject).g()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final l f()
  {
    return a;
  }
  
  public final int g()
  {
    return b;
  }
  
  public final int hashCode()
  {
    return (a.hashCode() ^ 0xF4243) * 1000003 ^ g.c(b);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Segment{fieldPath=");
    localStringBuilder.append(a);
    localStringBuilder.append(", kind=");
    localStringBuilder.append(f.r(b));
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     j9.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
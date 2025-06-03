package m8;

import f;
import g;

public final class x
  extends f0.e.d.e.b
{
  public final String a;
  public final String b;
  
  public x(String paramString1, String paramString2)
  {
    a = paramString1;
    b = paramString2;
  }
  
  public final String a()
  {
    return a;
  }
  
  public final String b()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.e.d.e.b))
    {
      paramObject = (f0.e.d.e.b)paramObject;
      if ((!a.equals(((f0.e.d.e.b)paramObject).a())) || (!b.equals(((f0.e.d.e.b)paramObject).b()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (a.hashCode() ^ 0xF4243) * 1000003 ^ b.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("RolloutVariant{rolloutId=");
    localStringBuilder.append(a);
    localStringBuilder.append(", variantId=");
    return g.f(localStringBuilder, b, "}");
  }
}

/* Location:
 * Qualified Name:     m8.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
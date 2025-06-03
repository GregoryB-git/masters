package c4;

import f;
import g;

public final class t$a
{
  public final u a;
  public final u b;
  
  public t$a() {}
  
  public t$a(u paramu1, u paramu2)
  {
    a = paramu1;
    b = paramu2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (a.class == paramObject.getClass()))
    {
      paramObject = (a)paramObject;
      if ((!a.equals(a)) || (!b.equals(b))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    return b.hashCode() + i * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("[");
    localStringBuilder.append(a);
    Object localObject;
    if (a.equals(b))
    {
      localObject = "";
    }
    else
    {
      localObject = f.l(", ");
      ((StringBuilder)localObject).append(b);
      localObject = ((StringBuilder)localObject).toString();
    }
    return g.f(localStringBuilder, (String)localObject, "]");
  }
}

/* Location:
 * Qualified Name:     c4.t.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
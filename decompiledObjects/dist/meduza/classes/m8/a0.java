package m8;

import f;
import g;

public final class a0
  extends f0.e.f
{
  public final String a;
  
  public a0(String paramString)
  {
    a = paramString;
  }
  
  public final String a()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.e.f))
    {
      paramObject = (f0.e.f)paramObject;
      return a.equals(((f0.e.f)paramObject).a());
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode() ^ 0xF4243;
  }
  
  public final String toString()
  {
    return g.f(f.l("User{identifier="), a, "}");
  }
}

/* Location:
 * Qualified Name:     m8.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
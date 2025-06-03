package m8;

import f;
import g;

public final class v
  extends f0.e.d.d
{
  public final String a;
  
  public v(String paramString)
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
    if ((paramObject instanceof f0.e.d.d))
    {
      paramObject = (f0.e.d.d)paramObject;
      return a.equals(((f0.e.d.d)paramObject).a());
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode() ^ 0xF4243;
  }
  
  public final String toString()
  {
    return g.f(f.l("Log{content="), a, "}");
  }
}

/* Location:
 * Qualified Name:     m8.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
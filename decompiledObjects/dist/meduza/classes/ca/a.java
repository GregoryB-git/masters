package ca;

import f;
import g;

public final class a
  extends d
{
  public final String a;
  public final String b;
  
  public a(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      a = paramString1;
      if (paramString2 != null)
      {
        b = paramString2;
        return;
      }
      throw new NullPointerException("Null version");
    }
    throw new NullPointerException("Null libraryName");
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
    if ((paramObject instanceof d))
    {
      paramObject = (d)paramObject;
      if ((!a.equals(((d)paramObject).a())) || (!b.equals(((d)paramObject).b()))) {
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
    StringBuilder localStringBuilder = f.l("LibraryVersion{libraryName=");
    localStringBuilder.append(a);
    localStringBuilder.append(", version=");
    return g.f(localStringBuilder, b, "}");
  }
}

/* Location:
 * Qualified Name:     ca.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package m8;

import f;
import g;

public final class d
  extends f0.a.a
{
  public final String a;
  public final String b;
  public final String c;
  
  public d(String paramString1, String paramString2, String paramString3)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
  }
  
  public final String a()
  {
    return a;
  }
  
  public final String b()
  {
    return c;
  }
  
  public final String c()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.a.a))
    {
      paramObject = (f0.a.a)paramObject;
      if ((!a.equals(((f0.a.a)paramObject).a())) || (!b.equals(((f0.a.a)paramObject).c())) || (!c.equals(((f0.a.a)paramObject).b()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return ((a.hashCode() ^ 0xF4243) * 1000003 ^ b.hashCode()) * 1000003 ^ c.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("BuildIdMappingForArch{arch=");
    localStringBuilder.append(a);
    localStringBuilder.append(", libraryName=");
    localStringBuilder.append(b);
    localStringBuilder.append(", buildId=");
    return g.f(localStringBuilder, c, "}");
  }
}

/* Location:
 * Qualified Name:     m8.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
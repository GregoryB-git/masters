package j8;

import f;
import g;

public final class c
  extends b0.a
{
  public final String a;
  public final String b;
  public final String c;
  
  public c(String paramString1, String paramString2, String paramString3)
  {
    if (paramString1 != null)
    {
      a = paramString1;
      b = paramString2;
      c = paramString3;
      return;
    }
    throw new NullPointerException("Null crashlyticsInstallId");
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
    if ((paramObject instanceof b0.a))
    {
      Object localObject = (b0.a)paramObject;
      if (a.equals(((b0.a)localObject).a()))
      {
        paramObject = b;
        if (paramObject == null ? ((b0.a)localObject).c() == null : ((String)paramObject).equals(((b0.a)localObject).c()))
        {
          paramObject = c;
          localObject = ((b0.a)localObject).b();
          if (paramObject == null ? localObject == null : ((String)paramObject).equals(localObject)) {
            break label99;
          }
        }
      }
      bool = false;
      label99:
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    String str = b;
    int j = 0;
    int k;
    if (str == null) {
      k = 0;
    } else {
      k = str.hashCode();
    }
    str = c;
    if (str != null) {
      j = str.hashCode();
    }
    return ((i ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ j;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("InstallIds{crashlyticsInstallId=");
    localStringBuilder.append(a);
    localStringBuilder.append(", firebaseInstallationId=");
    localStringBuilder.append(b);
    localStringBuilder.append(", firebaseAuthenticationToken=");
    return g.f(localStringBuilder, c, "}");
  }
}

/* Location:
 * Qualified Name:     j8.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
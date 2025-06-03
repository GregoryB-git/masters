package m8;

import f;
import g;

public final class i
  extends f0.e.a
{
  public final String a;
  public final String b;
  public final String c;
  public final f0.e.a.a d;
  public final String e;
  public final String f;
  public final String g;
  
  public i(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = null;
    e = paramString4;
    f = paramString5;
    g = paramString6;
  }
  
  public final String a()
  {
    return f;
  }
  
  public final String b()
  {
    return g;
  }
  
  public final String c()
  {
    return c;
  }
  
  public final String d()
  {
    return a;
  }
  
  public final String e()
  {
    return e;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.e.a))
    {
      paramObject = (f0.e.a)paramObject;
      if ((a.equals(((f0.e.a)paramObject).d())) && (b.equals(((f0.e.a)paramObject).g())))
      {
        Object localObject = c;
        if (localObject == null ? ((f0.e.a)paramObject).c() == null : ((String)localObject).equals(((f0.e.a)paramObject).c()))
        {
          localObject = d;
          if (localObject == null ? ((f0.e.a)paramObject).f() == null : localObject.equals(((f0.e.a)paramObject).f()))
          {
            localObject = e;
            if (localObject == null ? ((f0.e.a)paramObject).e() == null : ((String)localObject).equals(((f0.e.a)paramObject).e()))
            {
              localObject = f;
              if (localObject == null ? ((f0.e.a)paramObject).a() == null : ((String)localObject).equals(((f0.e.a)paramObject).a()))
              {
                localObject = g;
                paramObject = ((f0.e.a)paramObject).b();
                if (localObject == null ? paramObject == null : ((String)localObject).equals(paramObject)) {
                  break label203;
                }
              }
            }
          }
        }
      }
      bool = false;
      label203:
      return bool;
    }
    return false;
  }
  
  public final f0.e.a.a f()
  {
    return d;
  }
  
  public final String g()
  {
    return b;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b.hashCode();
    Object localObject = c;
    int k = 0;
    int m;
    if (localObject == null) {
      m = 0;
    } else {
      m = ((String)localObject).hashCode();
    }
    localObject = d;
    int n;
    if (localObject == null) {
      n = 0;
    } else {
      n = localObject.hashCode();
    }
    localObject = e;
    int i1;
    if (localObject == null) {
      i1 = 0;
    } else {
      i1 = ((String)localObject).hashCode();
    }
    localObject = f;
    int i2;
    if (localObject == null) {
      i2 = 0;
    } else {
      i2 = ((String)localObject).hashCode();
    }
    localObject = g;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    }
    return ((((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ k;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Application{identifier=");
    localStringBuilder.append(a);
    localStringBuilder.append(", version=");
    localStringBuilder.append(b);
    localStringBuilder.append(", displayVersion=");
    localStringBuilder.append(c);
    localStringBuilder.append(", organization=");
    localStringBuilder.append(d);
    localStringBuilder.append(", installationUuid=");
    localStringBuilder.append(e);
    localStringBuilder.append(", developmentPlatform=");
    localStringBuilder.append(f);
    localStringBuilder.append(", developmentPlatformVersion=");
    return g.f(localStringBuilder, g, "}");
  }
}

/* Location:
 * Qualified Name:     m8.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
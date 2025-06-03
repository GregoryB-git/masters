package m8;

import a0.j;
import f;

public final class b
  extends f0
{
  public final String b;
  public final String c;
  public final int d;
  public final String e;
  public final String f;
  public final String g;
  public final String h;
  public final String i;
  public final String j;
  public final f0.e k;
  public final f0.d l;
  public final f0.a m;
  
  public b(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, f0.e parame, f0.d paramd, f0.a parama)
  {
    b = paramString1;
    c = paramString2;
    d = paramInt;
    e = paramString3;
    f = paramString4;
    g = paramString5;
    h = paramString6;
    i = paramString7;
    j = paramString8;
    k = parame;
    l = paramd;
    m = parama;
  }
  
  public final f0.a a()
  {
    return m;
  }
  
  public final String b()
  {
    return h;
  }
  
  public final String c()
  {
    return i;
  }
  
  public final String d()
  {
    return j;
  }
  
  public final String e()
  {
    return g;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0))
    {
      paramObject = (f0)paramObject;
      if ((b.equals(((f0)paramObject).k())) && (c.equals(((f0)paramObject).g())) && (d == ((f0)paramObject).j()) && (e.equals(((f0)paramObject).h())))
      {
        Object localObject = f;
        if (localObject == null ? ((f0)paramObject).f() == null : ((String)localObject).equals(((f0)paramObject).f()))
        {
          localObject = g;
          if (localObject == null ? ((f0)paramObject).e() == null : ((String)localObject).equals(((f0)paramObject).e()))
          {
            localObject = h;
            if ((localObject == null ? ((f0)paramObject).b() == null : ((String)localObject).equals(((f0)paramObject).b())) && (i.equals(((f0)paramObject).c())) && (j.equals(((f0)paramObject).d())))
            {
              localObject = k;
              if (localObject == null ? ((f0)paramObject).l() == null : localObject.equals(((f0)paramObject).l()))
              {
                localObject = l;
                if (localObject == null ? ((f0)paramObject).i() == null : localObject.equals(((f0)paramObject).i()))
                {
                  localObject = m;
                  paramObject = ((f0)paramObject).a();
                  if (localObject == null ? paramObject == null : localObject.equals(paramObject)) {
                    break label286;
                  }
                }
              }
            }
          }
        }
      }
      bool = false;
      label286:
      return bool;
    }
    return false;
  }
  
  public final String f()
  {
    return f;
  }
  
  public final String g()
  {
    return c;
  }
  
  public final String h()
  {
    return e;
  }
  
  public final int hashCode()
  {
    int n = b.hashCode();
    int i1 = c.hashCode();
    int i2 = d;
    int i3 = e.hashCode();
    Object localObject = f;
    int i4 = 0;
    int i5;
    if (localObject == null) {
      i5 = 0;
    } else {
      i5 = ((String)localObject).hashCode();
    }
    localObject = g;
    int i6;
    if (localObject == null) {
      i6 = 0;
    } else {
      i6 = ((String)localObject).hashCode();
    }
    localObject = h;
    int i7;
    if (localObject == null) {
      i7 = 0;
    } else {
      i7 = ((String)localObject).hashCode();
    }
    int i8 = i.hashCode();
    int i9 = j.hashCode();
    localObject = k;
    int i10;
    if (localObject == null) {
      i10 = 0;
    } else {
      i10 = localObject.hashCode();
    }
    localObject = l;
    int i11;
    if (localObject == null) {
      i11 = 0;
    } else {
      i11 = localObject.hashCode();
    }
    localObject = m;
    if (localObject != null) {
      i4 = localObject.hashCode();
    }
    return (((((((((((n ^ 0xF4243) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ i3) * 1000003 ^ i5) * 1000003 ^ i6) * 1000003 ^ i7) * 1000003 ^ i8) * 1000003 ^ i9) * 1000003 ^ i10) * 1000003 ^ i11) * 1000003 ^ i4;
  }
  
  public final f0.d i()
  {
    return l;
  }
  
  public final int j()
  {
    return d;
  }
  
  public final String k()
  {
    return b;
  }
  
  public final f0.e l()
  {
    return k;
  }
  
  public final a m()
  {
    return new a(this);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("CrashlyticsReport{sdkVersion=");
    localStringBuilder.append(b);
    localStringBuilder.append(", gmpAppId=");
    localStringBuilder.append(c);
    localStringBuilder.append(", platform=");
    localStringBuilder.append(d);
    localStringBuilder.append(", installationUuid=");
    localStringBuilder.append(e);
    localStringBuilder.append(", firebaseInstallationId=");
    localStringBuilder.append(f);
    localStringBuilder.append(", firebaseAuthenticationToken=");
    localStringBuilder.append(g);
    localStringBuilder.append(", appQualitySessionId=");
    localStringBuilder.append(h);
    localStringBuilder.append(", buildVersion=");
    localStringBuilder.append(i);
    localStringBuilder.append(", displayVersion=");
    localStringBuilder.append(j);
    localStringBuilder.append(", session=");
    localStringBuilder.append(k);
    localStringBuilder.append(", ndkPayload=");
    localStringBuilder.append(l);
    localStringBuilder.append(", appExitInfo=");
    localStringBuilder.append(m);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class a
    extends f0.b
  {
    public String a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public f0.e j;
    public f0.d k;
    public f0.a l;
    public byte m;
    
    public a() {}
    
    public a(f0 paramf0)
    {
      a = paramf0.k();
      b = paramf0.g();
      c = paramf0.j();
      d = paramf0.h();
      e = paramf0.f();
      f = paramf0.e();
      g = paramf0.b();
      h = paramf0.c();
      i = paramf0.d();
      j = paramf0.l();
      k = paramf0.i();
      l = paramf0.a();
      m = ((byte)1);
    }
    
    public final b a()
    {
      if ((m == 1) && (a != null) && (b != null) && (d != null) && (h != null) && (i != null)) {
        return new b(a, b, c, d, e, f, g, h, i, j, k, l);
      }
      StringBuilder localStringBuilder = new StringBuilder();
      if (a == null) {
        localStringBuilder.append(" sdkVersion");
      }
      if (b == null) {
        localStringBuilder.append(" gmpAppId");
      }
      if ((0x1 & m) == 0) {
        localStringBuilder.append(" platform");
      }
      if (d == null) {
        localStringBuilder.append(" installationUuid");
      }
      if (h == null) {
        localStringBuilder.append(" buildVersion");
      }
      if (i == null) {
        localStringBuilder.append(" displayVersion");
      }
      throw new IllegalStateException(j.l("Missing required properties:", localStringBuilder));
    }
  }
}

/* Location:
 * Qualified Name:     m8.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
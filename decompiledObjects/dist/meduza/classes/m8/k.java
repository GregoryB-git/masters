package m8;

import a0.j;
import f;
import g;

public final class k
  extends f0.e.c
{
  public final int a;
  public final String b;
  public final int c;
  public final long d;
  public final long e;
  public final boolean f;
  public final int g;
  public final String h;
  public final String i;
  
  public k(int paramInt1, String paramString1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, int paramInt3, String paramString2, String paramString3)
  {
    a = paramInt1;
    b = paramString1;
    c = paramInt2;
    d = paramLong1;
    e = paramLong2;
    f = paramBoolean;
    g = paramInt3;
    h = paramString2;
    i = paramString3;
  }
  
  public final int a()
  {
    return a;
  }
  
  public final int b()
  {
    return c;
  }
  
  public final long c()
  {
    return e;
  }
  
  public final String d()
  {
    return h;
  }
  
  public final String e()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.e.c))
    {
      paramObject = (f0.e.c)paramObject;
      if ((a != ((f0.e.c)paramObject).a()) || (!b.equals(((f0.e.c)paramObject).e())) || (c != ((f0.e.c)paramObject).b()) || (d != ((f0.e.c)paramObject).g()) || (e != ((f0.e.c)paramObject).c()) || (f != ((f0.e.c)paramObject).i()) || (g != ((f0.e.c)paramObject).h()) || (!h.equals(((f0.e.c)paramObject).d())) || (!i.equals(((f0.e.c)paramObject).f()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final String f()
  {
    return i;
  }
  
  public final long g()
  {
    return d;
  }
  
  public final int h()
  {
    return g;
  }
  
  public final int hashCode()
  {
    int j = a;
    int k = b.hashCode();
    int m = c;
    long l = d;
    int n = (int)(l ^ l >>> 32);
    l = e;
    int i1 = (int)(l ^ l >>> 32);
    int i2;
    if (f) {
      i2 = 1231;
    } else {
      i2 = 1237;
    }
    return ((((((((j ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ g) * 1000003 ^ h.hashCode()) * 1000003 ^ i.hashCode();
  }
  
  public final boolean i()
  {
    return f;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Device{arch=");
    localStringBuilder.append(a);
    localStringBuilder.append(", model=");
    localStringBuilder.append(b);
    localStringBuilder.append(", cores=");
    localStringBuilder.append(c);
    localStringBuilder.append(", ram=");
    localStringBuilder.append(d);
    localStringBuilder.append(", diskSpace=");
    localStringBuilder.append(e);
    localStringBuilder.append(", simulator=");
    localStringBuilder.append(f);
    localStringBuilder.append(", state=");
    localStringBuilder.append(g);
    localStringBuilder.append(", manufacturer=");
    localStringBuilder.append(h);
    localStringBuilder.append(", modelClass=");
    return g.f(localStringBuilder, i, "}");
  }
  
  public static final class a
    extends f0.e.c.a
  {
    public int a;
    public String b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public int g;
    public String h;
    public String i;
    public byte j;
    
    public final k a()
    {
      if (j == 63)
      {
        String str1 = b;
        if (str1 != null)
        {
          String str2 = h;
          if (str2 != null)
          {
            localObject = i;
            if (localObject != null) {
              return new k(a, str1, c, d, e, f, g, str2, (String)localObject);
            }
          }
        }
      }
      Object localObject = new StringBuilder();
      if ((j & 0x1) == 0) {
        ((StringBuilder)localObject).append(" arch");
      }
      if (b == null) {
        ((StringBuilder)localObject).append(" model");
      }
      if ((j & 0x2) == 0) {
        ((StringBuilder)localObject).append(" cores");
      }
      if ((j & 0x4) == 0) {
        ((StringBuilder)localObject).append(" ram");
      }
      if ((j & 0x8) == 0) {
        ((StringBuilder)localObject).append(" diskSpace");
      }
      if ((j & 0x10) == 0) {
        ((StringBuilder)localObject).append(" simulator");
      }
      if ((j & 0x20) == 0) {
        ((StringBuilder)localObject).append(" state");
      }
      if (h == null) {
        ((StringBuilder)localObject).append(" manufacturer");
      }
      if (i == null) {
        ((StringBuilder)localObject).append(" modelClass");
      }
      throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
    }
  }
}

/* Location:
 * Qualified Name:     m8.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
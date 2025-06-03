package m8;

import f;
import g;

public final class d0
  extends g0.b
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
  
  public d0(int paramInt1, String paramString1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, int paramInt3, String paramString2, String paramString3)
  {
    a = paramInt1;
    if (paramString1 != null)
    {
      b = paramString1;
      c = paramInt2;
      d = paramLong1;
      e = paramLong2;
      f = paramBoolean;
      g = paramInt3;
      if (paramString2 != null)
      {
        h = paramString2;
        if (paramString3 != null)
        {
          i = paramString3;
          return;
        }
        throw new NullPointerException("Null modelClass");
      }
      throw new NullPointerException("Null manufacturer");
    }
    throw new NullPointerException("Null model");
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
  
  public final boolean d()
  {
    return f;
  }
  
  public final String e()
  {
    return h;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof g0.b))
    {
      paramObject = (g0.b)paramObject;
      if ((a != ((g0.b)paramObject).a()) || (!b.equals(((g0.b)paramObject).f())) || (c != ((g0.b)paramObject).b()) || (d != ((g0.b)paramObject).i()) || (e != ((g0.b)paramObject).c()) || (f != ((g0.b)paramObject).d()) || (g != ((g0.b)paramObject).h()) || (!h.equals(((g0.b)paramObject).e())) || (!i.equals(((g0.b)paramObject).g()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final String f()
  {
    return b;
  }
  
  public final String g()
  {
    return i;
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
  
  public final long i()
  {
    return d;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("DeviceData{arch=");
    localStringBuilder.append(a);
    localStringBuilder.append(", model=");
    localStringBuilder.append(b);
    localStringBuilder.append(", availableProcessors=");
    localStringBuilder.append(c);
    localStringBuilder.append(", totalRam=");
    localStringBuilder.append(d);
    localStringBuilder.append(", diskSpace=");
    localStringBuilder.append(e);
    localStringBuilder.append(", isEmulator=");
    localStringBuilder.append(f);
    localStringBuilder.append(", state=");
    localStringBuilder.append(g);
    localStringBuilder.append(", manufacturer=");
    localStringBuilder.append(h);
    localStringBuilder.append(", modelClass=");
    return g.f(localStringBuilder, i, "}");
  }
}

/* Location:
 * Qualified Name:     m8.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
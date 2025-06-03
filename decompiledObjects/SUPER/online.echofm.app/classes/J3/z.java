package J3;

public final class z
  extends D.b
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
  
  public z(int paramInt1, String paramString1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, int paramInt3, String paramString2, String paramString3)
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
  
  public int a()
  {
    return a;
  }
  
  public int b()
  {
    return c;
  }
  
  public long d()
  {
    return e;
  }
  
  public boolean e()
  {
    return f;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof D.b))
    {
      paramObject = (D.b)paramObject;
      if ((a != ((D.b)paramObject).a()) || (!b.equals(((D.b)paramObject).g())) || (c != ((D.b)paramObject).b()) || (d != ((D.b)paramObject).j()) || (e != ((D.b)paramObject).d()) || (f != ((D.b)paramObject).e()) || (g != ((D.b)paramObject).i()) || (!h.equals(((D.b)paramObject).f())) || (!i.equals(((D.b)paramObject).h()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public String f()
  {
    return h;
  }
  
  public String g()
  {
    return b;
  }
  
  public String h()
  {
    return i;
  }
  
  public int hashCode()
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
  
  public int i()
  {
    return g;
  }
  
  public long j()
  {
    return d;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DeviceData{arch=");
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
    localStringBuilder.append(i);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     J3.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
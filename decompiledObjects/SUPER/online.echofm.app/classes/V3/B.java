package V3;

import d4.n;

public final class B
{
  public final long a;
  public final k b;
  public final n c;
  public final b d;
  public final boolean e;
  
  public B(long paramLong, k paramk, b paramb)
  {
    a = paramLong;
    b = paramk;
    c = null;
    d = paramb;
    e = true;
  }
  
  public B(long paramLong, k paramk, n paramn, boolean paramBoolean)
  {
    a = paramLong;
    b = paramk;
    c = paramn;
    d = null;
    e = paramBoolean;
  }
  
  public b a()
  {
    b localb = d;
    if (localb != null) {
      return localb;
    }
    throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
  }
  
  public n b()
  {
    n localn = c;
    if (localn != null) {
      return localn;
    }
    throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
  }
  
  public k c()
  {
    return b;
  }
  
  public long d()
  {
    return a;
  }
  
  public boolean e()
  {
    boolean bool;
    if (c != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (B.class == paramObject.getClass()))
    {
      paramObject = (B)paramObject;
      if (a != a) {
        return false;
      }
      if (!b.equals(b)) {
        return false;
      }
      if (e != e) {
        return false;
      }
      Object localObject = c;
      if (localObject != null ? !localObject.equals(c) : c != null) {
        return false;
      }
      localObject = d;
      paramObject = d;
      return localObject != null ? ((b)localObject).equals(paramObject) : paramObject == null;
    }
    return false;
  }
  
  public boolean f()
  {
    return e;
  }
  
  public int hashCode()
  {
    int i = Long.valueOf(a).hashCode();
    int j = Boolean.valueOf(e).hashCode();
    int k = b.hashCode();
    Object localObject = c;
    int m = 0;
    int n;
    if (localObject != null) {
      n = localObject.hashCode();
    } else {
      n = 0;
    }
    localObject = d;
    if (localObject != null) {
      m = ((b)localObject).hashCode();
    }
    return (((i * 31 + j) * 31 + k) * 31 + n) * 31 + m;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("UserWriteRecord{id=");
    localStringBuilder.append(a);
    localStringBuilder.append(" path=");
    localStringBuilder.append(b);
    localStringBuilder.append(" visible=");
    localStringBuilder.append(e);
    localStringBuilder.append(" overwrite=");
    localStringBuilder.append(c);
    localStringBuilder.append(" merge=");
    localStringBuilder.append(d);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     V3.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
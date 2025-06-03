package X3;

import a4.i;

public final class h
{
  public final long a;
  public final i b;
  public final long c;
  public final boolean d;
  public final boolean e;
  
  public h(long paramLong1, i parami, long paramLong2, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramLong1;
    if ((parami.g()) && (!parami.f())) {
      throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
    }
    b = parami;
    c = paramLong2;
    d = paramBoolean1;
    e = paramBoolean2;
  }
  
  public h a(boolean paramBoolean)
  {
    return new h(a, b, c, d, paramBoolean);
  }
  
  public h b()
  {
    return new h(a, b, c, true, e);
  }
  
  public h c(long paramLong)
  {
    return new h(a, b, paramLong, d, e);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject != null) && (paramObject.getClass() == h.class))
    {
      paramObject = (h)paramObject;
      if ((a != a) || (!b.equals(b)) || (c != c) || (d != d) || (e != e)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (((Long.valueOf(a).hashCode() * 31 + b.hashCode()) * 31 + Long.valueOf(c).hashCode()) * 31 + Boolean.valueOf(d).hashCode()) * 31 + Boolean.valueOf(e).hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("TrackedQuery{id=");
    localStringBuilder.append(a);
    localStringBuilder.append(", querySpec=");
    localStringBuilder.append(b);
    localStringBuilder.append(", lastUse=");
    localStringBuilder.append(c);
    localStringBuilder.append(", complete=");
    localStringBuilder.append(d);
    localStringBuilder.append(", active=");
    localStringBuilder.append(e);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     X3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
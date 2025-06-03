package x0;

public final class x$b
{
  public final Object a;
  public final int b;
  public final int c;
  public final long d;
  public final int e;
  
  public x$b(Object paramObject)
  {
    this(paramObject, -1L);
  }
  
  public x$b(Object paramObject, int paramInt1, int paramInt2, long paramLong)
  {
    this(paramObject, paramInt1, paramInt2, paramLong, -1);
  }
  
  public x$b(Object paramObject, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    a = paramObject;
    b = paramInt1;
    c = paramInt2;
    d = paramLong;
    e = paramInt3;
  }
  
  public x$b(Object paramObject, long paramLong)
  {
    this(paramObject, -1, -1, paramLong, -1);
  }
  
  public x$b(Object paramObject, long paramLong, int paramInt)
  {
    this(paramObject, -1, -1, paramLong, paramInt);
  }
  
  public b a(Object paramObject)
  {
    if (a.equals(paramObject)) {
      paramObject = this;
    } else {
      paramObject = new b(paramObject, b, c, d, e);
    }
    return (b)paramObject;
  }
  
  public boolean b()
  {
    boolean bool;
    if (b != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    if ((!a.equals(a)) || (b != b) || (c != c) || (d != d) || (e != e)) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return ((((527 + a.hashCode()) * 31 + b) * 31 + c) * 31 + (int)d) * 31 + e;
  }
}

/* Location:
 * Qualified Name:     x0.x.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
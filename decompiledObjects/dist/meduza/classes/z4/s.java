package z4;

public class s
{
  public final Object a;
  public final int b;
  public final int c;
  public final long d;
  public final int e;
  
  public s(Object paramObject, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    a = paramObject;
    b = paramInt1;
    c = paramInt2;
    d = paramLong;
    e = paramInt3;
  }
  
  public s(Object paramObject, long paramLong)
  {
    this(paramObject, -1, -1, paramLong, -1);
  }
  
  public s(s params)
  {
    a = a;
    b = b;
    c = c;
    d = d;
    e = e;
  }
  
  public final boolean a()
  {
    boolean bool;
    if (b != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof s)) {
      return false;
    }
    paramObject = (s)paramObject;
    if ((!a.equals(a)) || (b != b) || (c != c) || (d != d) || (e != e)) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return ((((a.hashCode() + 527) * 31 + b) * 31 + c) * 31 + (int)d) * 31 + e;
  }
}

/* Location:
 * Qualified Name:     z4.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
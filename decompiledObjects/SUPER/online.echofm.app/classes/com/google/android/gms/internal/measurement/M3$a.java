package com.google.android.gms.internal.measurement;

public final class M3$a
{
  public final Object a;
  public final int b;
  
  public M3$a(Object paramObject, int paramInt)
  {
    a = paramObject;
    b = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    return (a == a) && (b == b);
  }
  
  public final int hashCode()
  {
    return System.identityHashCode(a) * 65535 + b;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.M3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.crypto.tink.shaded.protobuf;

public final class p$a
{
  public final Object a;
  public final int b;
  
  public p$a(Object paramObject, int paramInt)
  {
    a = paramObject;
    b = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof a;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (a)paramObject;
    bool1 = bool2;
    if (a == a)
    {
      bool1 = bool2;
      if (b == b) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return System.identityHashCode(a) * 65535 + b;
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.p.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.measurement;

import java.io.IOException;

public abstract class Y3$b
  extends k3
{
  public final Y3 o;
  public Y3 p;
  
  public Y3$b(Y3 paramY3)
  {
    o = paramY3;
    if (!paramY3.F())
    {
      p = paramY3.y();
      return;
    }
    throw new IllegalArgumentException("Default instance must be immutable.");
  }
  
  public static void n(Object paramObject1, Object paramObject2)
  {
    U4.a().c(paramObject1).d(paramObject1, paramObject2);
  }
  
  public final b l(Y3 paramY3)
  {
    if (o.equals(paramY3)) {
      return this;
    }
    if (!p.F()) {
      t();
    }
    n(p, paramY3);
    return this;
  }
  
  public Y3 o()
  {
    if (!p.F()) {
      return p;
    }
    p.C();
    return p;
  }
  
  public final void s()
  {
    if (!p.F()) {
      t();
    }
  }
  
  public void t()
  {
    Y3 localY3 = o.y();
    n(localY3, p);
    p = localY3;
  }
  
  public final b u(byte[] paramArrayOfByte, int paramInt1, int paramInt2, M3 paramM3)
  {
    if (!p.F()) {
      t();
    }
    try
    {
      try
      {
        Z4 localZ4 = U4.a().c(p);
        Y3 localY3 = p;
        p3 localp3 = new com/google/android/gms/internal/measurement/p3;
        localp3.<init>(paramM3);
        localZ4.g(localY3, paramArrayOfByte, 0, paramInt2, localp3);
        return this;
      }
      catch (IOException paramArrayOfByte) {}catch (k4 paramArrayOfByte) {}
      throw new RuntimeException("Reading from byte array should not throw IOException.", paramArrayOfByte);
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      throw k4.f();
    }
    throw paramArrayOfByte;
  }
  
  public final Y3 v()
  {
    Y3 localY3 = (Y3)i();
    if (localY3.E()) {
      return localY3;
    }
    throw new t5(localY3);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.Y3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
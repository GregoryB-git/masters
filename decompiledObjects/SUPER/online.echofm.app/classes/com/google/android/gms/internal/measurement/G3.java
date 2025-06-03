package com.google.android.gms.internal.measurement;

public abstract class G3
{
  public static volatile int d = 100;
  public int a = d;
  public int b = Integer.MAX_VALUE;
  public boolean c = false;
  
  public static long b(long paramLong)
  {
    return -(paramLong & 1L) ^ paramLong >>> 1;
  }
  
  public static G3 c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    paramArrayOfByte = new F3(paramArrayOfByte, 0, paramInt2, false, null);
    try
    {
      paramArrayOfByte.a(paramInt2);
      return paramArrayOfByte;
    }
    catch (k4 paramArrayOfByte)
    {
      throw new IllegalArgumentException(paramArrayOfByte);
    }
  }
  
  public static int e(int paramInt)
  {
    return -(paramInt & 0x1) ^ paramInt >>> 1;
  }
  
  public abstract int a(int paramInt);
  
  public abstract int d();
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.G3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.internal.measurement;

public final class u3
  extends A3
{
  public final int t;
  public final int u;
  
  public u3(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    q3.g(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    t = paramInt1;
    u = paramInt2;
  }
  
  public final byte M(int paramInt)
  {
    return s[(t + paramInt)];
  }
  
  public final int S()
  {
    return u;
  }
  
  public final int Y()
  {
    return t;
  }
  
  public final byte a(int paramInt)
  {
    int i = S();
    if ((i - (paramInt + 1) | paramInt) < 0)
    {
      if (paramInt < 0)
      {
        localStringBuilder = new StringBuilder("Index < 0: ");
        localStringBuilder.append(paramInt);
        throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = new StringBuilder("Index > length: ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(", ");
      localStringBuilder.append(i);
      throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
    }
    return s[(t + paramInt)];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.u3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
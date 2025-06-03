package ma;

public abstract class k$a
  extends k
{
  public final byte[] e;
  public final int f;
  public int g;
  
  public k$a(int paramInt)
  {
    if (paramInt >= 0)
    {
      byte[] arrayOfByte = new byte[Math.max(paramInt, 20)];
      e = arrayOfByte;
      f = arrayOfByte.length;
      return;
    }
    throw new IllegalArgumentException("bufferSize must be >= 0");
  }
  
  public final void p0(int paramInt)
  {
    byte[] arrayOfByte = e;
    int i = g;
    int j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(paramInt & 0xFF));
    i = j + 1;
    arrayOfByte[j] = ((byte)(byte)(paramInt >> 8 & 0xFF));
    j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(paramInt >> 16 & 0xFF));
    g = (j + 1);
    arrayOfByte[j] = ((byte)(byte)(paramInt >> 24 & 0xFF));
  }
  
  public final void q0(long paramLong)
  {
    byte[] arrayOfByte = e;
    int i = g;
    int j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(int)(paramLong & 0xFF));
    i = j + 1;
    arrayOfByte[j] = ((byte)(byte)(int)(paramLong >> 8 & 0xFF));
    j = i + 1;
    arrayOfByte[i] = ((byte)(byte)(int)(paramLong >> 16 & 0xFF));
    i = j + 1;
    arrayOfByte[j] = ((byte)(byte)(int)(0xFF & paramLong >> 24));
    j = i + 1;
    arrayOfByte[i] = ((byte)(byte)((int)(paramLong >> 32) & 0xFF));
    i = j + 1;
    arrayOfByte[j] = ((byte)(byte)((int)(paramLong >> 40) & 0xFF));
    j = i + 1;
    arrayOfByte[i] = ((byte)(byte)((int)(paramLong >> 48) & 0xFF));
    g = (j + 1);
    arrayOfByte[j] = ((byte)(byte)((int)(paramLong >> 56) & 0xFF));
  }
  
  public final void r0(int paramInt1, int paramInt2)
  {
    s0(paramInt1 << 3 | paramInt2);
  }
  
  public final void s0(int paramInt)
  {
    int i = paramInt;
    byte[] arrayOfByte;
    if (k.d) {
      for (;;)
      {
        if ((paramInt & 0xFFFFFF80) == 0)
        {
          arrayOfByte = e;
          i = g;
          g = (i + 1);
          t1.s(arrayOfByte, i, (byte)paramInt);
          return;
        }
        arrayOfByte = e;
        i = g;
        g = (i + 1);
        t1.s(arrayOfByte, i, (byte)(paramInt & 0x7F | 0x80));
        paramInt >>>= 7;
      }
    }
    for (;;)
    {
      if ((i & 0xFFFFFF80) == 0)
      {
        arrayOfByte = e;
        paramInt = g;
        g = (paramInt + 1);
        arrayOfByte[paramInt] = ((byte)(byte)i);
        return;
      }
      arrayOfByte = e;
      paramInt = g;
      g = (paramInt + 1);
      arrayOfByte[paramInt] = ((byte)(byte)(i & 0x7F | 0x80));
      i >>>= 7;
    }
  }
  
  public final void t0(long paramLong)
  {
    long l = paramLong;
    byte[] arrayOfByte;
    int i;
    if (k.d) {
      for (;;)
      {
        if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
        {
          arrayOfByte = e;
          i = g;
          g = (i + 1);
          t1.s(arrayOfByte, i, (byte)(int)paramLong);
          return;
        }
        arrayOfByte = e;
        i = g;
        g = (i + 1);
        t1.s(arrayOfByte, i, (byte)((int)paramLong & 0x7F | 0x80));
        paramLong >>>= 7;
      }
    }
    for (;;)
    {
      if ((l & 0xFFFFFFFFFFFFFF80) == 0L)
      {
        arrayOfByte = e;
        i = g;
        g = (i + 1);
        arrayOfByte[i] = ((byte)(byte)(int)l);
        return;
      }
      arrayOfByte = e;
      i = g;
      g = (i + 1);
      arrayOfByte[i] = ((byte)(byte)((int)l & 0x7F | 0x80));
      l >>>= 7;
    }
  }
}

/* Location:
 * Qualified Name:     ma.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
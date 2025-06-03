package androidx.datastore.preferences.protobuf;

public abstract class j$b
  extends j
{
  public final byte[] e;
  public final int f;
  public int g;
  public int h;
  
  public j$b(int paramInt)
  {
    super(null);
    if (paramInt >= 0)
    {
      byte[] arrayOfByte = new byte[Math.max(paramInt, 20)];
      e = arrayOfByte;
      f = arrayOfByte.length;
      return;
    }
    throw new IllegalArgumentException("bufferSize must be >= 0");
  }
  
  public final void S0(byte paramByte)
  {
    byte[] arrayOfByte = e;
    int i = g;
    g = (i + 1);
    arrayOfByte[i] = ((byte)paramByte);
    h += 1;
  }
  
  public final void T0(int paramInt)
  {
    byte[] arrayOfByte = e;
    int i = g;
    arrayOfByte[i] = ((byte)(byte)(paramInt & 0xFF));
    arrayOfByte[(i + 1)] = ((byte)(byte)(paramInt >> 8 & 0xFF));
    arrayOfByte[(i + 2)] = ((byte)(byte)(paramInt >> 16 & 0xFF));
    g = (i + 4);
    arrayOfByte[(i + 3)] = ((byte)(byte)(paramInt >> 24 & 0xFF));
    h += 4;
  }
  
  public final void U0(long paramLong)
  {
    byte[] arrayOfByte = e;
    int i = g;
    arrayOfByte[i] = ((byte)(byte)(int)(paramLong & 0xFF));
    arrayOfByte[(i + 1)] = ((byte)(byte)(int)(paramLong >> 8 & 0xFF));
    arrayOfByte[(i + 2)] = ((byte)(byte)(int)(paramLong >> 16 & 0xFF));
    arrayOfByte[(i + 3)] = ((byte)(byte)(int)(0xFF & paramLong >> 24));
    arrayOfByte[(i + 4)] = ((byte)(byte)((int)(paramLong >> 32) & 0xFF));
    arrayOfByte[(i + 5)] = ((byte)(byte)((int)(paramLong >> 40) & 0xFF));
    arrayOfByte[(i + 6)] = ((byte)(byte)((int)(paramLong >> 48) & 0xFF));
    g = (i + 8);
    arrayOfByte[(i + 7)] = ((byte)(byte)((int)(paramLong >> 56) & 0xFF));
    h += 8;
  }
  
  public final void V0(int paramInt)
  {
    if (paramInt >= 0) {
      X0(paramInt);
    } else {
      Y0(paramInt);
    }
  }
  
  public final void W0(int paramInt1, int paramInt2)
  {
    X0(r0.c(paramInt1, paramInt2));
  }
  
  public final void X0(int paramInt)
  {
    int i = paramInt;
    byte[] arrayOfByte;
    if (j.b())
    {
      long l = g;
      for (;;)
      {
        if ((paramInt & 0xFFFFFF80) == 0)
        {
          arrayOfByte = e;
          i = g;
          g = (i + 1);
          p0.H(arrayOfByte, i, (byte)paramInt);
          paramInt = (int)(g - l);
          h += paramInt;
          return;
        }
        arrayOfByte = e;
        i = g;
        g = (i + 1);
        p0.H(arrayOfByte, i, (byte)(paramInt & 0x7F | 0x80));
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
        h += 1;
        return;
      }
      arrayOfByte = e;
      paramInt = g;
      g = (paramInt + 1);
      arrayOfByte[paramInt] = ((byte)(byte)(i & 0x7F | 0x80));
      h += 1;
      i >>>= 7;
    }
  }
  
  public final void Y0(long paramLong)
  {
    long l = paramLong;
    byte[] arrayOfByte;
    int i;
    if (j.b())
    {
      l = g;
      for (;;)
      {
        if ((paramLong & 0xFFFFFFFFFFFFFF80) == 0L)
        {
          arrayOfByte = e;
          i = g;
          g = (i + 1);
          p0.H(arrayOfByte, i, (byte)(int)paramLong);
          i = (int)(g - l);
          h += i;
          return;
        }
        arrayOfByte = e;
        i = g;
        g = (i + 1);
        p0.H(arrayOfByte, i, (byte)((int)paramLong & 0x7F | 0x80));
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
        h += 1;
        return;
      }
      arrayOfByte = e;
      i = g;
      g = (i + 1);
      arrayOfByte[i] = ((byte)(byte)((int)l & 0x7F | 0x80));
      h += 1;
      l >>>= 7;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.j.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
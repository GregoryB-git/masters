package c4;

import x6.b;

public final class x
{
  public int a;
  public int b;
  public int c;
  public final Object d;
  
  public final boolean a(int paramInt)
  {
    boolean bool = true;
    if ((1 << paramInt & a) == 0) {
      bool = false;
    }
    return bool;
  }
  
  public final boolean b()
  {
    boolean bool;
    if (((((byte[])d)[b] & 0xFF) >> c & 0x1) == 1) {
      bool = true;
    } else {
      bool = false;
    }
    e(1);
    return bool;
  }
  
  public final int c(int paramInt)
  {
    int i = b;
    int j = Math.min(paramInt, 8 - c);
    byte[] arrayOfByte = (byte[])d;
    int k = i + 1;
    i = (arrayOfByte[i] & 0xFF) >> c & 255 >> 8 - j;
    while (j < paramInt)
    {
      i |= (((byte[])d)[k] & 0xFF) << j;
      j += 8;
      k++;
    }
    e(paramInt);
    return i & -1 >>> 32 - paramInt;
  }
  
  public final void d(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = (int[])d;
    if (paramInt1 >= arrayOfInt.length) {
      return;
    }
    int i = 1 << paramInt1;
    a |= i;
    b &= i;
    c = (i & c);
    arrayOfInt[paramInt1] = paramInt2;
  }
  
  public final void e(int paramInt)
  {
    int i = paramInt / 8;
    int j = b + i;
    b = j;
    paramInt = paramInt - i * 8 + c;
    c = paramInt;
    boolean bool1 = true;
    if (paramInt > 7)
    {
      b = (j + 1);
      c = (paramInt - 8);
    }
    paramInt = b;
    if (paramInt >= 0)
    {
      j = a;
      bool2 = bool1;
      if (paramInt < j) {
        break label103;
      }
      if ((paramInt == j) && (c == 0))
      {
        bool2 = bool1;
        break label103;
      }
    }
    boolean bool2 = false;
    label103:
    b.H(bool2);
  }
}

/* Location:
 * Qualified Name:     c4.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
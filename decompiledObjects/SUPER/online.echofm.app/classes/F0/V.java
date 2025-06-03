package F0;

import g0.a;

public final class V
{
  public final byte[] a;
  public final int b;
  public int c;
  public int d;
  
  public V(byte[] paramArrayOfByte)
  {
    a = paramArrayOfByte;
    b = paramArrayOfByte.length;
  }
  
  public final void a()
  {
    int i = c;
    if (i >= 0)
    {
      int j = b;
      if ((i < j) || ((i == j) && (d == 0)))
      {
        bool = true;
        break label38;
      }
    }
    boolean bool = false;
    label38:
    a.f(bool);
  }
  
  public int b()
  {
    return c * 8 + d;
  }
  
  public boolean c()
  {
    boolean bool;
    if (((a[c] & 0xFF) >> d & 0x1) == 1) {
      bool = true;
    } else {
      bool = false;
    }
    e(1);
    return bool;
  }
  
  public int d(int paramInt)
  {
    int i = c;
    int j = Math.min(paramInt, 8 - d);
    byte[] arrayOfByte = a;
    int k = i + 1;
    i = (arrayOfByte[i] & 0xFF) >> d & 255 >> 8 - j;
    while (j < paramInt)
    {
      i |= (a[k] & 0xFF) << j;
      j += 8;
      k++;
    }
    e(paramInt);
    return i & -1 >>> 32 - paramInt;
  }
  
  public void e(int paramInt)
  {
    int i = paramInt / 8;
    int j = c + i;
    c = j;
    paramInt = d + (paramInt - i * 8);
    d = paramInt;
    if (paramInt > 7)
    {
      c = (j + 1);
      d = (paramInt - 8);
    }
    a();
  }
}

/* Location:
 * Qualified Name:     F0.V
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
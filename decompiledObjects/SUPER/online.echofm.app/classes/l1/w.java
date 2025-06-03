package l1;

import g0.a;
import java.util.Arrays;

public final class w
{
  public final int a;
  public boolean b;
  public boolean c;
  public byte[] d;
  public int e;
  
  public w(int paramInt1, int paramInt2)
  {
    a = paramInt1;
    byte[] arrayOfByte = new byte[paramInt2 + 3];
    d = arrayOfByte;
    arrayOfByte[2] = ((byte)1);
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!b) {
      return;
    }
    paramInt2 -= paramInt1;
    byte[] arrayOfByte = d;
    int i = arrayOfByte.length;
    int j = e;
    if (i < j + paramInt2) {
      d = Arrays.copyOf(arrayOfByte, (j + paramInt2) * 2);
    }
    System.arraycopy(paramArrayOfByte, paramInt1, d, e, paramInt2);
    e += paramInt2;
  }
  
  public boolean b(int paramInt)
  {
    if (!b) {
      return false;
    }
    e -= paramInt;
    b = false;
    c = true;
    return true;
  }
  
  public boolean c()
  {
    return c;
  }
  
  public void d()
  {
    b = false;
    c = false;
  }
  
  public void e(int paramInt)
  {
    boolean bool1 = b;
    boolean bool2 = true;
    a.f(bool1 ^ true);
    if (paramInt != a) {
      bool2 = false;
    }
    b = bool2;
    if (bool2)
    {
      e = 3;
      c = false;
    }
  }
}

/* Location:
 * Qualified Name:     l1.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
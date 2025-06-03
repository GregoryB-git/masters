package m4;

import java.util.Arrays;
import x6.b;

public final class r
{
  public final int a;
  public boolean b;
  public boolean c;
  public byte[] d;
  public int e;
  
  public r(int paramInt)
  {
    a = paramInt;
    byte[] arrayOfByte = new byte[''];
    d = arrayOfByte;
    arrayOfByte[2] = ((byte)1);
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!b) {
      return;
    }
    int i = paramInt2 - paramInt1;
    byte[] arrayOfByte = d;
    int j = arrayOfByte.length;
    paramInt2 = e;
    if (j < paramInt2 + i) {
      d = Arrays.copyOf(arrayOfByte, (paramInt2 + i) * 2);
    }
    System.arraycopy(paramArrayOfByte, paramInt1, d, e, i);
    e += i;
  }
  
  public final boolean b(int paramInt)
  {
    if (!b) {
      return false;
    }
    e -= paramInt;
    b = false;
    c = true;
    return true;
  }
  
  public final void c()
  {
    b = false;
    c = false;
  }
  
  public final void d(int paramInt)
  {
    boolean bool1 = b;
    boolean bool2 = true;
    b.H(bool1 ^ true);
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
 * Qualified Name:     m4.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
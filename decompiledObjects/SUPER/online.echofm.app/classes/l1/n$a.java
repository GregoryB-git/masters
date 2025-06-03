package l1;

import java.util.Arrays;

public final class n$a
{
  public static final byte[] e = { 0, 0, 1 };
  public boolean a;
  public int b;
  public int c;
  public byte[] d;
  
  public n$a(int paramInt)
  {
    d = new byte[paramInt];
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!a) {
      return;
    }
    paramInt2 -= paramInt1;
    byte[] arrayOfByte = d;
    int i = arrayOfByte.length;
    int j = b;
    if (i < j + paramInt2) {
      d = Arrays.copyOf(arrayOfByte, (j + paramInt2) * 2);
    }
    System.arraycopy(paramArrayOfByte, paramInt1, d, b, paramInt2);
    b += paramInt2;
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if (a)
    {
      paramInt2 = b - paramInt2;
      b = paramInt2;
      if ((c == 0) && (paramInt1 == 181))
      {
        c = paramInt2;
      }
      else
      {
        a = false;
        return true;
      }
    }
    else if (paramInt1 == 179)
    {
      a = true;
    }
    byte[] arrayOfByte = e;
    a(arrayOfByte, 0, arrayOfByte.length);
    return false;
  }
  
  public void c()
  {
    a = false;
    b = 0;
    c = 0;
  }
}

/* Location:
 * Qualified Name:     l1.n.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
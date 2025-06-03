package m4;

import java.util.Arrays;

public final class l$a
{
  public static final byte[] f = { 0, 0, 1 };
  public boolean a;
  public int b;
  public int c;
  public int d;
  public byte[] e = new byte[''];
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!a) {
      return;
    }
    int i = paramInt2 - paramInt1;
    byte[] arrayOfByte = e;
    int j = arrayOfByte.length;
    paramInt2 = c;
    if (j < paramInt2 + i) {
      e = Arrays.copyOf(arrayOfByte, (paramInt2 + i) * 2);
    }
    System.arraycopy(paramArrayOfByte, paramInt1, e, c, i);
    c += i;
  }
}

/* Location:
 * Qualified Name:     m4.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
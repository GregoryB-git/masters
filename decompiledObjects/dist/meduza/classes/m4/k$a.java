package m4;

import java.util.Arrays;

public final class k$a
{
  public static final byte[] e = { 0, 0, 1 };
  public boolean a;
  public int b;
  public int c;
  public byte[] d = new byte[''];
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!a) {
      return;
    }
    int i = paramInt2 - paramInt1;
    byte[] arrayOfByte = d;
    paramInt2 = arrayOfByte.length;
    int j = b;
    if (paramInt2 < j + i) {
      d = Arrays.copyOf(arrayOfByte, (j + i) * 2);
    }
    System.arraycopy(paramArrayOfByte, paramInt1, d, b, i);
    b += i;
  }
}

/* Location:
 * Qualified Name:     m4.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
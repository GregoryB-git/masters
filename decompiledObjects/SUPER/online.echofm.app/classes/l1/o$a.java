package l1;

import g0.o;
import java.util.Arrays;

public final class o$a
{
  public static final byte[] f = { 0, 0, 1 };
  public boolean a;
  public int b;
  public int c;
  public int d;
  public byte[] e;
  
  public o$a(int paramInt)
  {
    e = new byte[paramInt];
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!a) {
      return;
    }
    paramInt2 -= paramInt1;
    byte[] arrayOfByte = e;
    int i = arrayOfByte.length;
    int j = c;
    if (i < j + paramInt2) {
      e = Arrays.copyOf(arrayOfByte, (j + paramInt2) * 2);
    }
    System.arraycopy(paramArrayOfByte, paramInt1, e, c, paramInt2);
    c += paramInt2;
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    int i = b;
    if (i != 0)
    {
      int j = 2;
      if (i != 1) {
        if (i != 2)
        {
          j = 4;
          if (i != 3)
          {
            if (i == 4)
            {
              if ((paramInt1 != 179) && (paramInt1 != 181)) {
                break label164;
              }
              c -= paramInt2;
              a = false;
              return true;
            }
            throw new IllegalStateException();
          }
          if ((paramInt1 & 0xF0) == 32) {}
        }
      }
      for (;;)
      {
        o.h("H263Reader", "Unexpected start code value");
        c();
        break;
        d = c;
        paramInt2 = j;
        do
        {
          b = paramInt2;
          break label164;
          if (paramInt1 > 31) {
            break;
          }
          b = 3;
          break label164;
          paramInt2 = j;
        } while (paramInt1 == 181);
      }
    }
    else if (paramInt1 == 176)
    {
      b = 1;
      a = true;
    }
    label164:
    byte[] arrayOfByte = f;
    a(arrayOfByte, 0, arrayOfByte.length);
    return false;
  }
  
  public void c()
  {
    a = false;
    c = 0;
    b = 0;
  }
}

/* Location:
 * Qualified Name:     l1.o.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
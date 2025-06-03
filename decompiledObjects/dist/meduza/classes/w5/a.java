package w5;

import b.a0;
import java.util.ArrayList;
import java.util.List;
import v3.a1;
import v5.q;
import v5.q.c;
import v5.u;

public final class a
{
  public final List<byte[]> a;
  public final int b;
  public final int c;
  public final int d;
  public final float e;
  public final String f;
  
  public a(ArrayList paramArrayList, int paramInt1, int paramInt2, int paramInt3, float paramFloat, String paramString)
  {
    a = paramArrayList;
    b = paramInt1;
    c = paramInt2;
    d = paramInt3;
    e = paramFloat;
    f = paramString;
  }
  
  public static a a(u paramu)
  {
    try
    {
      paramu.H(4);
      int i = (paramu.v() & 0x3) + 1;
      if (i != 3)
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int j = paramu.v() & 0x1F;
        int m;
        byte[] arrayOfByte1;
        byte[] arrayOfByte2;
        byte[] arrayOfByte3;
        for (int k = 0; k < j; k++)
        {
          m = paramu.A();
          n = b;
          paramu.H(m);
          arrayOfByte1 = a;
          arrayOfByte2 = a0.f0;
          arrayOfByte3 = new byte[m + 4];
          System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 0, 4);
          System.arraycopy(arrayOfByte1, n, arrayOfByte3, 4, m);
          localArrayList.add(arrayOfByte3);
        }
        int n = paramu.v();
        for (k = 0; k < n; k++)
        {
          int i1 = paramu.A();
          m = b;
          paramu.H(i1);
          arrayOfByte2 = a;
          arrayOfByte1 = a0.f0;
          arrayOfByte3 = new byte[i1 + 4];
          System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, 4);
          System.arraycopy(arrayOfByte2, m, arrayOfByte3, 4, i1);
          localArrayList.add(arrayOfByte3);
        }
        float f1;
        if (j > 0)
        {
          paramu = (byte[])localArrayList.get(0);
          paramu = q.d((byte[])localArrayList.get(0), i, paramu.length);
          k = e;
          j = f;
          f1 = g;
          paramu = a0.l(a, b, c);
        }
        else
        {
          f1 = 1.0F;
          paramu = null;
          k = -1;
          j = k;
        }
        return new a(localArrayList, i, k, j, f1, paramu);
      }
      paramu = new java/lang/IllegalStateException;
      paramu.<init>();
      throw paramu;
    }
    catch (ArrayIndexOutOfBoundsException paramu)
    {
      throw a1.a("Error parsing AVC config", paramu);
    }
  }
}

/* Location:
 * Qualified Name:     w5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
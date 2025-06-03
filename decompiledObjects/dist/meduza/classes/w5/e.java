package w5;

import b.a0;
import java.util.Collections;
import java.util.List;
import v3.a1;
import v5.q;
import v5.q.a;
import v5.u;

public final class e
{
  public final List<byte[]> a;
  public final int b;
  public final float c;
  public final int d;
  public final int e;
  public final int f;
  public final String g;
  
  public e(List paramList, int paramInt1, float paramFloat, String paramString, int paramInt2, int paramInt3, int paramInt4)
  {
    a = paramList;
    b = paramInt1;
    c = paramFloat;
    g = paramString;
    d = paramInt2;
    e = paramInt3;
    f = paramInt4;
  }
  
  public static e a(u paramu)
  {
    try
    {
      paramu.H(21);
      int i = paramu.v();
      int j = paramu.v();
      int k = b;
      int m = 0;
      int n = m;
      int i1;
      while (m < j)
      {
        paramu.H(1);
        i1 = paramu.A();
        for (i2 = 0; i2 < i1; i2++)
        {
          i3 = paramu.A();
          n += i3 + 4;
          paramu.H(i3);
        }
        m++;
      }
      paramu.G(k);
      byte[] arrayOfByte = new byte[n];
      float f1 = 1.0F;
      Object localObject = null;
      int i3 = -1;
      m = i3;
      int i4 = m;
      int i2 = 0;
      int i5 = i2;
      int i6 = m;
      for (m = i2; m < j; m++)
      {
        k = paramu.v() & 0x3F;
        i2 = paramu.A();
        for (i1 = 0; i1 < i2; i1++)
        {
          int i7 = paramu.A();
          System.arraycopy(q.a, 0, arrayOfByte, i5, 4);
          i5 += 4;
          System.arraycopy(a, b, arrayOfByte, i5, i7);
          if ((k == 33) && (i1 == 0))
          {
            localObject = q.c(arrayOfByte, i5, i5 + i7);
            i3 = j;
            i6 = k;
            i4 = l;
            f1 = i;
            int i8 = a;
            boolean bool = b;
            int i9 = c;
            int i10 = d;
            localObject = a0.m(i8, bool, i9, i10, e, f);
          }
          i5 += i7;
          paramu.H(i7);
        }
      }
      if (n == 0) {
        paramu = Collections.emptyList();
      } else {
        paramu = Collections.singletonList(arrayOfByte);
      }
      paramu = new e(paramu, (i & 0x3) + 1, f1, (String)localObject, i3, i6, i4);
      return paramu;
    }
    catch (ArrayIndexOutOfBoundsException paramu)
    {
      throw a1.a("Error parsing HEVC config", paramu);
    }
  }
}

/* Location:
 * Qualified Name:     w5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
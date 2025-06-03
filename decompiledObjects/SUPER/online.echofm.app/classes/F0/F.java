package F0;

import d0.A;
import g0.z;
import h0.d.a;
import java.util.Collections;
import java.util.List;

public final class F
{
  public final List a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final int g;
  public final int h;
  public final int i;
  public final float j;
  public final int k;
  public final String l;
  
  public F(List paramList, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, float paramFloat, int paramInt9, String paramString)
  {
    a = paramList;
    b = paramInt1;
    c = paramInt2;
    d = paramInt3;
    e = paramInt4;
    f = paramInt5;
    g = paramInt6;
    h = paramInt7;
    i = paramInt8;
    j = paramFloat;
    k = paramInt9;
    l = paramString;
  }
  
  public static F a(z paramz)
  {
    try
    {
      paramz.U(21);
      m = paramz.G();
      n = paramz.G();
      i1 = paramz.f();
      i2 = 0;
      i3 = i2;
    }
    catch (ArrayIndexOutOfBoundsException paramz)
    {
      for (;;)
      {
        int m;
        int n;
        int i3;
        break;
        i2++;
        continue;
        paramz.T(i1);
        byte[] arrayOfByte1 = new byte[i3];
        int i7 = -1;
        int i2 = i7;
        int i5 = i2;
        int i1 = i5;
        int i4 = i1;
        int i6 = i4;
        int i8 = i6;
        int i9 = i8;
        float f1 = 1.0F;
        Object localObject = null;
        int i10 = 0;
        int i11 = i10;
        int i12 = i6;
        int i13 = i2;
        i2 = i10;
        i6 = n;
        while (i2 < i6)
        {
          int i14 = paramz.G() & 0x3F;
          int i15 = paramz.M();
          int i16 = 0;
          n = i8;
          i8 = i4;
          i10 = i1;
          int i17 = i5;
          i4 = i16;
          i5 = i15;
          i1 = i14;
          while (i4 < i5)
          {
            i14 = paramz.M();
            byte[] arrayOfByte2 = h0.d.a;
            System.arraycopy(arrayOfByte2, 0, arrayOfByte1, i11, arrayOfByte2.length);
            i11 += arrayOfByte2.length;
            System.arraycopy(paramz.e(), paramz.f(), arrayOfByte1, i11, i14);
            if ((i1 == 33) && (i4 == 0))
            {
              localObject = h0.d.h(arrayOfByte1, i11, i11 + i14);
              i7 = k;
              i13 = l;
              i17 = f + 8;
              i10 = g + 8;
              i8 = o;
              i12 = p;
              n = q;
              f1 = m;
              i9 = n;
              localObject = g0.d.c(a, b, c, d, h, i);
            }
            i11 += i14;
            paramz.U(i14);
            i4++;
          }
          i2++;
          i5 = i17;
          i1 = i10;
          i4 = i8;
          i8 = n;
        }
        if (i3 == 0) {}
        for (paramz = Collections.emptyList();; paramz = Collections.singletonList(arrayOfByte1)) {
          break;
        }
        paramz = new F(paramz, (m & 0x3) + 1, i7, i13, i5, i1, i4, i12, i8, f1, i9, (String)localObject);
        return paramz;
      }
      throw A.a("Error parsing HEVC config", paramz);
    }
    if (i2 < n)
    {
      paramz.U(1);
      i4 = paramz.M();
      for (i5 = 0; i5 < i4; i5++)
      {
        i6 = paramz.M();
        i3 += i6 + 4;
        paramz.U(i6);
      }
    }
  }
}

/* Location:
 * Qualified Name:     F0.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
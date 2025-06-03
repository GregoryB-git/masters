package k5;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import h5.f;
import h5.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import v5.e0;
import v5.u;

public final class a
  extends f
{
  public final u m = new u();
  public final u n = new u();
  public final a o = new a();
  public Inflater p;
  
  public final g h(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    m.E(paramArrayOfByte, paramInt);
    Object localObject = m;
    int i = c;
    int j = b;
    paramInt = 255;
    if ((i - j > 0) && ((a[j] & 0xFF) == 120))
    {
      if (p == null) {
        p = new Inflater();
      }
      if (e0.D((u)localObject, n, p))
      {
        paramArrayOfByte = n;
        ((u)localObject).E(a, c);
      }
    }
    paramArrayOfByte = o;
    j = 0;
    d = 0;
    e = 0;
    f = 0;
    g = 0;
    h = 0;
    i = 0;
    a.D(0);
    c = false;
    ArrayList localArrayList = new ArrayList();
    for (;;)
    {
      paramArrayOfByte = m;
      int k = c;
      if (k - b < 3) {
        break;
      }
      a locala = o;
      i = paramArrayOfByte.v();
      int i1 = paramArrayOfByte.A();
      int i2 = b + i1;
      if (i2 > k)
      {
        paramArrayOfByte.G(k);
        paramArrayOfByte = null;
      }
      else
      {
        if (i != 128)
        {
          switch (i)
          {
          }
          for (;;)
          {
            break;
            locala.getClass();
            if (i1 >= 19)
            {
              d = paramArrayOfByte.A();
              e = paramArrayOfByte.A();
              paramArrayOfByte.H(11);
              f = paramArrayOfByte.A();
              g = paramArrayOfByte.A();
              continue;
              locala.getClass();
              if (i1 >= 4)
              {
                paramArrayOfByte.H(3);
                if ((0x80 & paramArrayOfByte.v()) != 0) {
                  i = 1;
                } else {
                  i = j;
                }
                i1 -= 4;
                j = i1;
                if (i != 0)
                {
                  if (i1 >= 7)
                  {
                    j = paramArrayOfByte.x();
                    if (j >= 4)
                    {
                      h = paramArrayOfByte.A();
                      i = paramArrayOfByte.A();
                      a.D(j - 4);
                      j = i1 - 7;
                    }
                  }
                }
                else
                {
                  localObject = a;
                  i = b;
                  i1 = c;
                  if ((i < i1) && (j > 0))
                  {
                    j = Math.min(j, i1 - i);
                    paramArrayOfByte.d(a.a, i, j);
                    a.G(i + j);
                    continue;
                    locala.getClass();
                    if (i1 % 5 == 2)
                    {
                      paramArrayOfByte.H(2);
                      Arrays.fill(b, j);
                      i = i1 / 5;
                      while (j < i)
                      {
                        i1 = paramArrayOfByte.v();
                        int i3 = paramArrayOfByte.v();
                        int i4 = paramArrayOfByte.v();
                        k = paramArrayOfByte.v();
                        paramInt = paramArrayOfByte.v();
                        double d1 = i3;
                        double d2 = i4 - 128;
                        i4 = (int)(1.402D * d2 + d1);
                        double d3 = k - 128;
                        k = (int)(d1 - 0.34414D * d3 - d2 * 0.71414D);
                        i3 = (int)(d3 * 1.772D + d1);
                        localObject = b;
                        i4 = e0.i(i4, 0, 255);
                        localObject[i1] = (e0.i(k, 0, 255) << 8 | i4 << 16 | paramInt << 24 | e0.i(i3, 0, 255));
                        paramInt = 255;
                        j++;
                      }
                      c = true;
                    }
                  }
                }
              }
            }
          }
          locala = null;
          localObject = paramArrayOfByte;
          paramArrayOfByte = locala;
        }
        else
        {
          localObject = paramArrayOfByte;
          j = paramInt;
          if ((d != 0) && (e != 0) && (h != 0) && (i != 0))
          {
            paramArrayOfByte = a;
            paramInt = c;
            if ((paramInt != 0) && (b == paramInt) && (c))
            {
              paramArrayOfByte.G(0);
              k = h * i;
              paramArrayOfByte = new int[k];
              paramInt = 0;
              if (paramInt < k)
              {
                i1 = a.v();
                if (i1 != 0)
                {
                  i = paramInt + 1;
                  paramArrayOfByte[paramInt] = b[i1];
                }
                for (paramInt = i;; paramInt = i)
                {
                  break;
                  i1 = a.v();
                  if (i1 == 0) {
                    break;
                  }
                  if ((i1 & 0x40) == 0) {
                    i = i1 & 0x3F;
                  } else {
                    i = (i1 & 0x3F) << 8 | a.v();
                  }
                  if ((i1 & 0x80) == 0) {
                    i1 = 0;
                  } else {
                    i1 = b[a.v()];
                  }
                  i += paramInt;
                  Arrays.fill(paramArrayOfByte, paramInt, i, i1);
                }
              }
              paramArrayOfByte = Bitmap.createBitmap(paramArrayOfByte, h, i, Bitmap.Config.ARGB_8888);
              h5.a.a locala1 = new h5.a.a();
              b = paramArrayOfByte;
              float f1 = f;
              float f2 = d;
              h = (f1 / f2);
              i = 0;
              f1 = g;
              float f3 = e;
              e = (f1 / f3);
              f = 0;
              g = 0;
              l = (h / f2);
              m = (i / f3);
              paramArrayOfByte = locala1.a();
              break label1138;
            }
          }
          paramArrayOfByte = null;
          label1138:
          d = 0;
          e = 0;
          f = 0;
          g = 0;
          h = 0;
          i = 0;
          a.D(0);
          c = false;
          paramInt = j;
        }
        j = 0;
        ((u)localObject).G(i2);
      }
      if (paramArrayOfByte != null) {
        localArrayList.add(paramArrayOfByte);
      }
    }
    return new b(Collections.unmodifiableList(localArrayList));
  }
  
  public static final class a
  {
    public final u a = new u();
    public final int[] b = new int['Ā'];
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
  }
}

/* Location:
 * Qualified Name:     k5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
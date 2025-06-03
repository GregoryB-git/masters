package x5;

import java.util.ArrayList;
import java.util.zip.Inflater;
import v5.e0;
import v5.t;
import v5.u;

public final class f
{
  public static ArrayList<e.a> a(u paramu)
  {
    u localu = paramu;
    if (paramu.v() != 0) {
      return null;
    }
    localu.H(7);
    int i = paramu.f();
    boolean bool1 = true;
    Object localObject1;
    if (i == 1684433976)
    {
      paramu = new u();
      localObject1 = new Inflater(true);
    }
    boolean bool2;
    try
    {
      bool2 = e0.D(localu, paramu, (Inflater)localObject1);
      ((Inflater)localObject1).end();
      return null;
      localu = paramu;
    }
    finally
    {
      ((Inflater)localObject1).end();
    }
    return null;
    paramu = new ArrayList();
    int j = b;
    i = c;
    while (j < i)
    {
      int k = localu.f() + j;
      if ((k > j) && (k <= i))
      {
        if (localu.f() == 1835365224)
        {
          int m = localu.f();
          float[] arrayOfFloat1;
          int n;
          if (m <= 10000)
          {
            arrayOfFloat1 = new float[m];
            for (j = 0; j < m; j++) {
              arrayOfFloat1[j] = Float.intBitsToFloat(localu.f());
            }
            n = localu.f();
            if (n <= 32000) {}
          }
          else
          {
            j = i;
            bool2 = bool1;
            bool1 = bool2;
            i = j;
            break label669;
          }
          double d = Math.log(2.0D);
          int i1 = (int)Math.ceil(Math.log(m * 2.0D) / d);
          localObject1 = a;
          localObject1 = new t((byte[])localObject1, localObject1.length);
          ((t)localObject1).k(b * 8);
          float[] arrayOfFloat2 = new float[n * 5];
          Object localObject2 = new int[5];
          int i2 = 0;
          int i3 = 0;
          int i4;
          int i5;
          for (;;)
          {
            if (i2 >= n) {
              break label407;
            }
            i4 = 0;
            for (;;)
            {
              if (i4 >= 5) {
                break label401;
              }
              j = localObject2[i4];
              i5 = ((t)localObject1).g(i1);
              i5 = (-(i5 & 0x1) ^ i5 >> 1) + j;
              bool2 = bool1;
              j = i;
              if (i5 >= m) {
                break;
              }
              if (i5 < 0) {
                break label483;
              }
              arrayOfFloat2[i3] = arrayOfFloat1[i5];
              localObject2[i4] = i5;
              i4++;
              i3++;
            }
            label401:
            i2++;
          }
          label407:
          ((t)localObject1).k(((t)localObject1).e() + 7 & 0xFFFFFFF8);
          j = ((t)localObject1).g(32);
          localObject2 = new e.b[j];
          i2 = 0;
          for (;;)
          {
            if (i2 >= j) {
              break label703;
            }
            i1 = ((t)localObject1).g(8);
            i5 = ((t)localObject1).g(8);
            m = ((t)localObject1).g(32);
            if (m > 128000)
            {
              label483:
              bool2 = bool1;
              j = i;
              break;
            }
            int i6 = (int)Math.ceil(Math.log(n * 2.0D) / d);
            float[] arrayOfFloat3 = new float[m * 3];
            arrayOfFloat1 = new float[m * 2];
            i3 = 0;
            i4 = 0;
            while (i3 < m)
            {
              int i7 = ((t)localObject1).g(i6);
              i4 = (-(i7 & 0x1) ^ i7 >> 1) + i4;
              if ((i4 >= 0) && (i4 < n))
              {
                int i8 = i3 * 3;
                i7 = i4 * 5;
                arrayOfFloat3[i8] = arrayOfFloat2[i7];
                arrayOfFloat3[(i8 + 1)] = arrayOfFloat2[(i7 + 1)];
                arrayOfFloat3[(i8 + 2)] = arrayOfFloat2[(i7 + 2)];
                i8 = i3 * 2;
                arrayOfFloat1[i8] = arrayOfFloat2[(i7 + 3)];
                arrayOfFloat1[(i8 + 1)] = arrayOfFloat2[(i7 + 4)];
                i3++;
              }
              else
              {
                bool1 = true;
                label669:
                localObject1 = null;
                break label714;
              }
            }
            localObject2[i2] = new e.b(i1, arrayOfFloat3, arrayOfFloat1, i5);
            i2++;
            bool1 = true;
          }
          label703:
          localObject1 = new e.a((e.b[])localObject2);
          label714:
          if (localObject1 == null) {
            break label745;
          }
          paramu.add(localObject1);
        }
        localu.G(k);
        j = k;
        continue;
      }
      label745:
      paramu = null;
    }
    return paramu;
  }
}

/* Location:
 * Qualified Name:     x5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
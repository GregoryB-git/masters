package m4;

import java.util.Arrays;
import v3.i0;
import v3.i0.a;
import v5.t;
import v5.u;
import x6.b;

public final class h
  implements j
{
  public final u a = new u(new byte[18]);
  public final String b;
  public String c;
  public c4.v d;
  public int e = 0;
  public int f;
  public int g;
  public long h;
  public i0 i;
  public int j;
  public long k = -9223372036854775807L;
  
  public h(String paramString)
  {
    b = paramString;
  }
  
  public final void a(u paramu)
  {
    b.K(d);
    for (;;)
    {
      int m = c - b;
      if (m <= 0) {
        break;
      }
      int n = e;
      Object localObject1;
      if (n != 0)
      {
        if (n != 1)
        {
          if (n == 2)
          {
            n = Math.min(m, j - f);
            d.b(n, paramu);
            m = f + n;
            f = m;
            n = j;
            if (m == n)
            {
              long l = k;
              if (l != -9223372036854775807L)
              {
                d.c(l, 1, n, 0, null);
                k += h;
              }
              e = 0;
            }
          }
          else
          {
            throw new IllegalStateException();
          }
        }
        else
        {
          localObject1 = a.a;
          n = Math.min(m, 18 - f);
          paramu.d((byte[])localObject1, f, n);
          n = f + n;
          f = n;
          if (n == 18) {
            n = 1;
          } else {
            n = 0;
          }
          if (n != 0)
          {
            byte[] arrayOfByte1 = a.a;
            if (i == null)
            {
              String str1 = c;
              String str2 = b;
              if (arrayOfByte1[0] == Byte.MAX_VALUE)
              {
                localObject1 = new t(arrayOfByte1, arrayOfByte1.length);
              }
              else
              {
                localObject2 = Arrays.copyOf(arrayOfByte1, arrayOfByte1.length);
                n = localObject2[0];
                if ((n != -2) && (n != -1)) {
                  n = 0;
                } else {
                  n = 1;
                }
                if (n != 0) {
                  for (n = 0; n < localObject2.length - 1; n += 2)
                  {
                    m = localObject2[n];
                    i1 = n + 1;
                    localObject2[n] = ((byte)localObject2[i1]);
                    localObject2[i1] = ((byte)m);
                  }
                }
                localObject1 = new t((byte[])localObject2, localObject2.length);
                if (localObject2[0] == 31)
                {
                  t localt = new t((byte[])localObject2, localObject2.length);
                  while (localt.b() >= 16)
                  {
                    localt.m(2);
                    i1 = localt.g(14) & 0x3FFF;
                    n = Math.min(8 - c, 14);
                    int i2 = c;
                    m = 8 - i2 - n;
                    byte[] arrayOfByte2 = a;
                    i3 = b;
                    i2 = (byte)((65280 >> i2 | (1 << m) - 1) & arrayOfByte2[i3]);
                    arrayOfByte2[i3] = ((byte)i2);
                    n = 14 - n;
                    arrayOfByte2[i3] = ((byte)(byte)(i2 | i1 >>> n << m));
                    for (m = i3 + 1; n > 8; m++)
                    {
                      arrayOfByte2 = a;
                      n -= 8;
                      arrayOfByte2[m] = ((byte)(byte)(i1 >>> n));
                    }
                    i2 = 8 - n;
                    arrayOfByte2 = a;
                    i3 = (byte)(arrayOfByte2[m] & (1 << i2) - 1);
                    arrayOfByte2[m] = ((byte)i3);
                    arrayOfByte2[m] = ((byte)(byte)((i1 & (1 << n) - 1) << i2 | i3));
                    ((t)localObject1).m(14);
                    ((t)localObject1).a();
                  }
                }
                ((t)localObject1).j((byte[])localObject2, localObject2.length);
              }
              ((t)localObject1).m(60);
              n = ((t)localObject1).g(6);
              i1 = x3.v.a[n];
              n = ((t)localObject1).g(4);
              i3 = x3.v.b[n];
              n = ((t)localObject1).g(5);
              Object localObject2 = x3.v.c;
              if (n >= 29) {
                n = -1;
              } else {
                n = localObject2[n] * 1000 / 2;
              }
              ((t)localObject1).m(10);
              if (((t)localObject1).g(2) > 0) {
                m = 1;
              } else {
                m = 0;
              }
              localObject1 = new i0.a();
              a = str1;
              k = "audio/vnd.dts";
              f = n;
              x = (i1 + m);
              y = i3;
              n = null;
              c = str2;
              localObject1 = new i0((i0.a)localObject1);
              i = ((i0)localObject1);
              d.d((i0)localObject1);
            }
            int i3 = arrayOfByte1[0];
            if (i3 != -2)
            {
              if (i3 != -1)
              {
                if (i3 != 31)
                {
                  n = (0x3 & arrayOfByte1[5]) << 12 | (arrayOfByte1[6] & 0xFF) << 4;
                  m = arrayOfByte1[7];
                  break label963;
                }
                n = (0x3 & arrayOfByte1[6]) << 12 | (arrayOfByte1[7] & 0xFF) << 4;
                m = arrayOfByte1[8];
              }
              else
              {
                n = (0x3 & arrayOfByte1[7]) << 12 | (arrayOfByte1[6] & 0xFF) << 4;
                m = arrayOfByte1[9];
              }
              n = (n | (m & 0x3C) >> 2) + 1;
              m = 1;
              break label977;
            }
            else
            {
              n = (arrayOfByte1[4] & 0x3) << 12 | (arrayOfByte1[7] & 0xFF) << 4;
              m = arrayOfByte1[6];
            }
            label963:
            n = (n | (m & 0xF0) >> 4) + 1;
            m = 0;
            label977:
            int i1 = n;
            if (m != 0) {
              i1 = n * 16 / 14;
            }
            j = i1;
            if (i3 != -2)
            {
              if (i3 != -1)
              {
                if (i3 != 31)
                {
                  n = (arrayOfByte1[4] & 0x1) << 6;
                  m = arrayOfByte1[5];
                  break label1097;
                }
                n = (0x7 & arrayOfByte1[5]) << 4;
                m = arrayOfByte1[6];
              }
              else
              {
                n = arrayOfByte1[4];
                m = arrayOfByte1[7];
                n = (n & 0x7) << 4;
              }
              m &= 0x3C;
              break label1103;
            }
            else
            {
              n = (arrayOfByte1[5] & 0x1) << 6;
              m = arrayOfByte1[4];
            }
            label1097:
            m &= 0xFC;
            label1103:
            h = ((int)(((m >> 2 | n) + 1) * 32 * 1000000L / i.H));
            a.G(0);
            d.b(18, a);
            e = 2;
          }
        }
      }
      else
      {
        while (c - b > 0)
        {
          n = g << 8;
          g = n;
          m = n | paramu.v();
          g = m;
          if ((m != 2147385345) && (m != -25230976) && (m != 536864768) && (m != -14745368)) {
            n = 0;
          } else {
            n = 1;
          }
          if (n != 0)
          {
            localObject1 = a.a;
            localObject1[0] = ((byte)(byte)(m >> 24 & 0xFF));
            localObject1[1] = ((byte)(byte)(m >> 16 & 0xFF));
            localObject1[2] = ((byte)(byte)(m >> 8 & 0xFF));
            localObject1[3] = ((byte)(byte)(m & 0xFF));
            f = 4;
            g = 0;
            n = 1;
            break label1318;
          }
        }
        n = 0;
        label1318:
        if (n != 0) {
          e = 1;
        }
      }
    }
  }
  
  public final void b()
  {
    e = 0;
    f = 0;
    g = 0;
    k = -9223372036854775807L;
  }
  
  public final void c() {}
  
  public final void d(int paramInt, long paramLong)
  {
    if (paramLong != -9223372036854775807L) {
      k = paramLong;
    }
  }
  
  public final void e(c4.j paramj, d0.d paramd)
  {
    paramd.a();
    paramd.b();
    c = e;
    paramd.b();
    d = paramj.r(d, 1);
  }
}

/* Location:
 * Qualified Name:     m4.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
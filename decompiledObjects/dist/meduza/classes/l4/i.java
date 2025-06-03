package l4;

import c4.x;
import c4.y;
import c4.y.a;
import c4.y.b;
import c4.y.c;
import f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o7.t;
import p4.a;
import v3.a1;
import v3.i0;
import v3.i0.a;
import v5.m;
import v5.u;
import x6.b;

public final class i
  extends h
{
  public a n;
  public int o;
  public boolean p;
  public y.c q;
  public y.a r;
  
  public final void a(long paramLong)
  {
    g = paramLong;
    int i = 0;
    boolean bool;
    if (paramLong != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    p = bool;
    y.c localc = q;
    if (localc != null) {
      i = e;
    }
    o = i;
  }
  
  public final long b(u paramu)
  {
    Object localObject = a;
    int i = 0;
    int j = localObject[0];
    if ((j & 0x1) == 1) {
      return -1L;
    }
    localObject = n;
    b.K(localObject);
    int k = e;
    if (!d[(j >> 1 & 255 >>> 8 - k)].a) {
      k = a.e;
    } else {
      k = a.f;
    }
    if (p) {
      i = (o + k) / 4;
    }
    long l = i;
    localObject = a;
    i = localObject.length;
    j = c + 4;
    if (i < j)
    {
      localObject = Arrays.copyOf((byte[])localObject, j);
      paramu.E((byte[])localObject, localObject.length);
    }
    else
    {
      paramu.F(j);
    }
    localObject = a;
    i = c;
    localObject[(i - 4)] = ((byte)(byte)(int)(l & 0xFF));
    localObject[(i - 3)] = ((byte)(byte)(int)(l >>> 8 & 0xFF));
    localObject[(i - 2)] = ((byte)(byte)(int)(l >>> 16 & 0xFF));
    localObject[(i - 1)] = ((byte)(byte)(int)(l >>> 24 & 0xFF));
    p = true;
    o = k;
    return l;
  }
  
  public final boolean c(u paramu, long paramLong, h.a parama)
  {
    Object localObject1 = n;
    int i = 0;
    if (localObject1 != null)
    {
      a.getClass();
      return false;
    }
    Object localObject2 = q;
    int j;
    int i1;
    int i2;
    y.a locala;
    if (localObject2 == null)
    {
      y.c(1, paramu, false);
      paramu.m();
      j = paramu.v();
      k = paramu.m();
      i = paramu.i();
      m = i;
      if (i <= 0) {
        m = -1;
      }
      i1 = paramu.i();
      i = i1;
      if (i1 <= 0) {
        i = -1;
      }
      paramu.i();
      i2 = paramu.v();
      i1 = (int)Math.pow(2.0D, i2 & 0xF);
      i2 = (int)Math.pow(2.0D, (i2 & 0xF0) >> 4);
      paramu.v();
      q = new y.c(j, k, m, i, i1, i2, Arrays.copyOf(a, c));
    }
    else
    {
      locala = r;
      if (locala != null) {
        break label208;
      }
      r = y.b(paramu, true, true);
    }
    paramu = null;
    break label1748;
    label208:
    int m = c;
    localObject1 = new byte[m];
    System.arraycopy(a, 0, localObject1, 0, m);
    int i3 = a;
    y.c(5, paramu, false);
    m = paramu.v() + 1;
    Object localObject3 = new x(a);
    ((x)localObject3).e(b * 8);
    paramu = (u)localObject1;
    int i4;
    boolean bool;
    for (;;)
    {
      k = 5;
      if (i >= m) {
        break label706;
      }
      if (((x)localObject3).c(24) != 5653314) {
        break label672;
      }
      i4 = ((x)localObject3).c(16);
      i5 = ((x)localObject3).c(24);
      localObject1 = new long[i5];
      if (!((x)localObject3).b())
      {
        bool = ((x)localObject3).b();
        for (i1 = 0; i1 < i5; i1++) {
          if (bool)
          {
            if (((x)localObject3).b()) {
              localObject1[i1] = (((x)localObject3).c(k) + 1);
            } else {
              localObject1[i1] = 0L;
            }
            k = 5;
          }
          else
          {
            localObject1[i1] = (((x)localObject3).c(k) + 1);
          }
        }
      }
      else
      {
        i1 = ((x)localObject3).c(5) + 1;
        k = 0;
        while (k < i5)
        {
          j = i5 - k;
          i2 = 0;
          while (j > 0)
          {
            i2++;
            j >>>= 1;
          }
          i2 = ((x)localObject3).c(i2);
          for (j = 0; (j < i2) && (k < i5); j++)
          {
            localObject1[k] = i1;
            k++;
          }
          i1++;
        }
      }
      i1 = ((x)localObject3).c(4);
      if (i1 > 2) {
        break;
      }
      if ((i1 == 1) || (i1 == 2))
      {
        ((x)localObject3).e(32);
        ((x)localObject3).e(32);
        k = ((x)localObject3).c(4);
        ((x)localObject3).e(1);
        if (i1 == 1)
        {
          if (i4 != 0)
          {
            paramLong = i5;
            long l = i4;
            paramLong = Math.floor(Math.pow(paramLong, 1.0D / l));
          }
          else
          {
            paramLong = 0L;
          }
        }
        else {
          paramLong = i5 * i4;
        }
        ((x)localObject3).e((int)((k + 1) * paramLong));
      }
      i++;
    }
    paramu = new StringBuilder();
    paramu.append("lookup type greater than 2 not decodable: ");
    paramu.append(i1);
    throw a1.a(paramu.toString(), null);
    label672:
    paramu = f.l("expected code book to start with [0x56, 0x43, 0x42] at ");
    paramu.append(b * 8 + c);
    throw a1.a(paramu.toString(), null);
    label706:
    i = ((x)localObject3).c(6);
    m = 0;
    while (m < i + 1) {
      if (((x)localObject3).c(16) == 0) {
        m++;
      } else {
        throw a1.a("placeholder of time domain transforms not zeroed out", null);
      }
    }
    m = ((x)localObject3).c(6) + 1;
    for (i = 0; i < m; i++)
    {
      i1 = ((x)localObject3).c(16);
      if (i1 != 0)
      {
        if (i1 == 1)
        {
          i5 = ((x)localObject3).c(5);
          localObject1 = new int[i5];
          k = 0;
          for (i1 = -1; k < i5; i1 = j)
          {
            i2 = ((x)localObject3).c(4);
            localObject1[k] = i2;
            j = i1;
            if (i2 > i1) {
              j = i2;
            }
            k++;
          }
          j = i1 + 1;
          int[] arrayOfInt = new int[j];
          for (i1 = 0; i1 < j; i1++)
          {
            arrayOfInt[i1] = (((x)localObject3).c(3) + 1);
            i2 = ((x)localObject3).c(2);
            if (i2 > 0) {
              ((x)localObject3).e(8);
            }
            for (k = 0; k < 1 << i2; k++) {
              ((x)localObject3).e(8);
            }
          }
          i1 = m;
          ((x)localObject3).e(2);
          i4 = ((x)localObject3).c(4);
          k = 0;
          i2 = 0;
          j = 0;
          for (;;)
          {
            m = i1;
            if (k >= i5) {
              break;
            }
            i2 += arrayOfInt[localObject1[k]];
            while (j < i2)
            {
              ((x)localObject3).e(i4);
              j++;
            }
            k++;
          }
        }
        paramu = new StringBuilder();
        paramu.append("floor type greater than 1 not decodable: ");
        paramu.append(i1);
        throw a1.a(paramu.toString(), null);
      }
      i1 = m;
      ((x)localObject3).e(8);
      ((x)localObject3).e(16);
      ((x)localObject3).e(16);
      ((x)localObject3).e(6);
      ((x)localObject3).e(8);
      j = ((x)localObject3).c(4);
      for (k = 0;; k++)
      {
        m = i1;
        if (k >= j + 1) {
          break;
        }
        ((x)localObject3).e(8);
      }
    }
    int k = ((x)localObject3).c(6);
    m = 0;
    while (m < k + 1) {
      if (((x)localObject3).c(16) <= 2)
      {
        ((x)localObject3).e(24);
        ((x)localObject3).e(24);
        ((x)localObject3).e(24);
        j = ((x)localObject3).c(6) + 1;
        ((x)localObject3).e(8);
        localObject1 = new int[j];
        for (i = 0; i < j; i++)
        {
          i2 = ((x)localObject3).c(3);
          if (((x)localObject3).b()) {
            i1 = ((x)localObject3).c(5);
          } else {
            i1 = 0;
          }
          localObject1[i] = (i1 * 8 + i2);
        }
        for (i = 0; i < j; i++) {
          for (i1 = 0; i1 < 8; i1++) {
            if ((localObject1[i] & 1 << i1) != 0) {
              ((x)localObject3).e(8);
            }
          }
        }
        m++;
      }
      else
      {
        throw a1.a("residueType greater than 2 is not decodable", null);
      }
    }
    int i5 = ((x)localObject3).c(6);
    m = 0;
    while (m < i5 + 1)
    {
      i = ((x)localObject3).c(16);
      if (i != 0)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("mapping type other than 0 not supported: ");
        ((StringBuilder)localObject1).append(i);
        m.c("VorbisUtil", ((StringBuilder)localObject1).toString());
      }
      else
      {
        if (((x)localObject3).b()) {
          i = ((x)localObject3).c(4) + 1;
        } else {
          i = 1;
        }
        if (((x)localObject3).b())
        {
          i4 = ((x)localObject3).c(8);
          for (i1 = 0; i1 < i4 + 1; i1++)
          {
            k = i3 - 1;
            i2 = 0;
            j = k;
            while (j > 0)
            {
              i2++;
              j >>>= 1;
            }
            ((x)localObject3).e(i2);
            j = 0;
            while (k > 0)
            {
              j++;
              k >>>= 1;
            }
            ((x)localObject3).e(j);
          }
        }
        if (((x)localObject3).c(2) != 0) {
          break label1611;
        }
        if (i > 1) {
          for (i1 = 0; i1 < i3; i1++) {
            ((x)localObject3).e(4);
          }
        }
        for (i1 = 0; i1 < i; i1++)
        {
          ((x)localObject3).e(8);
          ((x)localObject3).e(8);
          ((x)localObject3).e(8);
        }
      }
      m++;
      continue;
      label1611:
      throw a1.a("to reserved bits must be zero after mapping coupling steps", null);
    }
    i = ((x)localObject3).c(6) + 1;
    localObject1 = new y.b[i];
    for (m = 0; m < i; m++)
    {
      bool = ((x)localObject3).b();
      ((x)localObject3).c(16);
      ((x)localObject3).c(16);
      ((x)localObject3).c(8);
      localObject1[m] = new y.b(bool);
    }
    if (((x)localObject3).b())
    {
      m = i - 1;
      i = 0;
      while (m > 0)
      {
        i++;
        m >>>= 1;
      }
      paramu = new a((y.c)localObject2, locala, paramu, (y.b[])localObject1, i);
      label1748:
      n = paramu;
      if (paramu == null) {
        return true;
      }
      localObject3 = a;
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).add(g);
      ((ArrayList)localObject1).add(c);
      localObject2 = y.a(t.q(b.a));
      paramu = new i0.a();
      k = "audio/vorbis";
      f = d;
      g = c;
      x = a;
      y = b;
      m = ((List)localObject1);
      i = ((a)localObject2);
      a = new i0(paramu);
      return true;
    }
    throw a1.a("framing bit after modes not set as expected", null);
  }
  
  public final void d(boolean paramBoolean)
  {
    super.d(paramBoolean);
    if (paramBoolean)
    {
      n = null;
      q = null;
      r = null;
    }
    o = 0;
    p = false;
  }
  
  public static final class a
  {
    public final y.c a;
    public final y.a b;
    public final byte[] c;
    public final y.b[] d;
    public final int e;
    
    public a(y.c paramc, y.a parama, byte[] paramArrayOfByte, y.b[] paramArrayOfb, int paramInt)
    {
      a = paramc;
      b = parama;
      c = paramArrayOfByte;
      d = paramArrayOfb;
      e = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     l4.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
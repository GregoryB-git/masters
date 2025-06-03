package okhttp3.internal.http2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import okhttp3.internal.Util;
import xc.f;

final class Hpack$Writer
{
  public final f a;
  public final boolean b = true;
  public int c = Integer.MAX_VALUE;
  public boolean d;
  public int e = 4096;
  public Header[] f = new Header[8];
  public int g = 7;
  public int h = 0;
  public int i = 0;
  
  public Hpack$Writer(f paramf)
  {
    a = paramf;
  }
  
  public final void a(int paramInt)
  {
    if (paramInt > 0)
    {
      int j = f.length - 1;
      int k = 0;
      int m = paramInt;
      paramInt = k;
      for (;;)
      {
        k = g;
        if ((j < k) || (m <= 0)) {
          break;
        }
        k = f[j].c;
        m -= k;
        i -= k;
        h -= 1;
        paramInt++;
        j--;
      }
      Header[] arrayOfHeader = f;
      m = k + 1;
      System.arraycopy(arrayOfHeader, m, arrayOfHeader, m + paramInt, h);
      arrayOfHeader = f;
      m = g + 1;
      Arrays.fill(arrayOfHeader, m, m + paramInt, null);
      g += paramInt;
    }
  }
  
  public final void b(Header paramHeader)
  {
    int j = c;
    int k = e;
    if (j > k)
    {
      Arrays.fill(f, null);
      g = (f.length - 1);
      h = 0;
      i = 0;
      return;
    }
    a(i + j - k);
    k = h;
    Header[] arrayOfHeader1 = f;
    if (k + 1 > arrayOfHeader1.length)
    {
      Header[] arrayOfHeader2 = new Header[arrayOfHeader1.length * 2];
      System.arraycopy(arrayOfHeader1, 0, arrayOfHeader2, arrayOfHeader1.length, arrayOfHeader1.length);
      g = (f.length - 1);
      f = arrayOfHeader2;
    }
    k = g;
    g = (k - 1);
    f[k] = paramHeader;
    h += 1;
    i += j;
  }
  
  public final void c(xc.i parami)
  {
    boolean bool = b;
    int j = 0;
    int k = 0;
    if (bool)
    {
      Huffman.d.getClass();
      m = 0;
      long l = 0L;
      int n;
      while (m < parami.i())
      {
        n = parami.n(m);
        l += Huffman.c[(n & 0xFF)];
        m++;
      }
      if ((int)(l + 7L >> 3) < parami.i())
      {
        f localf = new f();
        Huffman.d.getClass();
        l = 0L;
        m = 0;
        while (k < parami.i())
        {
          n = parami.n(k) & 0xFF;
          j = Huffman.b[n];
          n = Huffman.c[n];
          l = l << n | j;
          m += n;
          while (m >= 8)
          {
            m -= 8;
            localf.B0((int)(l >> m));
          }
          k++;
        }
        if (m > 0) {
          localf.B0((int)(255 >>> m | l << 8 - m));
        }
        parami = localf.c0();
        k = parami.i();
        m = 128;
        break label243;
      }
    }
    k = parami.i();
    int m = j;
    label243:
    e(k, 127, m);
    a.z0(parami);
  }
  
  public final void d(ArrayList paramArrayList)
  {
    int j;
    if (d)
    {
      j = c;
      if (j < e) {
        e(j, 31, 32);
      }
      d = false;
      c = Integer.MAX_VALUE;
      e(e, 31, 32);
    }
    int k = paramArrayList.size();
    for (int m = 0; m < k; m++)
    {
      Header localHeader = (Header)paramArrayList.get(m);
      xc.i locali1 = a.r();
      xc.i locali2 = b;
      Object localObject = (Integer)Hpack.b.get(locali1);
      int n;
      if (localObject != null)
      {
        n = ((Integer)localObject).intValue() + 1;
        if ((n > 1) && (n < 8))
        {
          localObject = Hpack.a;
          if (Util.k(1b, locali2)) {
            break label194;
          }
          if (Util.k(b, locali2))
          {
            j = n + 1;
            break label197;
          }
        }
        j = -1;
        break label197;
      }
      else
      {
        n = -1;
      }
      label194:
      j = n;
      label197:
      int i1 = n;
      int i2 = j;
      if (j == -1)
      {
        int i3 = g + 1;
        int i4 = f.length;
        for (;;)
        {
          i1 = n;
          i2 = j;
          if (i3 >= i4) {
            break;
          }
          i1 = n;
          if (Util.k(f[i3].a, locali1))
          {
            if (Util.k(f[i3].b, locali2))
            {
              j = g;
              i2 = Hpack.a.length + (i3 - j);
              i1 = n;
              break;
            }
            i1 = n;
            if (n == -1) {
              i1 = i3 - g + Hpack.a.length;
            }
          }
          i3++;
          n = i1;
        }
      }
      if (i2 != -1)
      {
        e(i2, 127, 128);
      }
      else
      {
        if (i1 == -1)
        {
          a.B0(64);
          c(locali1);
        }
        else
        {
          localObject = Header.d;
          locali1.getClass();
          ec.i.e(localObject, "prefix");
          if ((locali1.q((xc.i)localObject, a.length)) && (!Header.i.equals(locali1)))
          {
            e(i1, 15, 0);
            c(locali2);
            continue;
          }
          e(i1, 63, 64);
        }
        c(locali2);
        b(localHeader);
      }
    }
  }
  
  public final void e(int paramInt1, int paramInt2, int paramInt3)
  {
    f localf;
    if (paramInt1 < paramInt2)
    {
      localf = a;
      paramInt1 |= paramInt3;
    }
    else
    {
      a.B0(paramInt3 | paramInt2);
      paramInt1 -= paramInt2;
      while (paramInt1 >= 128)
      {
        a.B0(0x80 | paramInt1 & 0x7F);
        paramInt1 >>>= 7;
      }
      localf = a;
    }
    localf.B0(paramInt1);
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Hpack.Writer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
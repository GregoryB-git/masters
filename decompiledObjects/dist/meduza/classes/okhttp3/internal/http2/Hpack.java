package okhttp3.internal.http2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.Util;
import xc.s;
import xc.y;

final class Hpack
{
  public static final Header[] a;
  public static final Map<xc.i, Integer> b;
  
  static
  {
    Object localObject1 = new Header[61];
    Object localObject2 = new Header(Header.i, "");
    int i = 0;
    localObject1[0] = localObject2;
    localObject2 = Header.f;
    localObject1[1] = new Header((xc.i)localObject2, "GET");
    localObject1[2] = new Header((xc.i)localObject2, "POST");
    localObject2 = Header.g;
    localObject1[3] = new Header((xc.i)localObject2, "/");
    localObject1[4] = new Header((xc.i)localObject2, "/index.html");
    localObject2 = Header.h;
    localObject1[5] = new Header((xc.i)localObject2, "http");
    localObject1[6] = new Header((xc.i)localObject2, "https");
    localObject2 = Header.e;
    localObject1[7] = new Header((xc.i)localObject2, "200");
    localObject1[8] = new Header((xc.i)localObject2, "204");
    localObject1[9] = new Header((xc.i)localObject2, "206");
    localObject1[10] = new Header((xc.i)localObject2, "304");
    localObject1[11] = new Header((xc.i)localObject2, "400");
    localObject1[12] = new Header((xc.i)localObject2, "404");
    localObject1[13] = new Header((xc.i)localObject2, "500");
    localObject1[14] = new Header("accept-charset", "");
    localObject1[15] = new Header("accept-encoding", "gzip, deflate");
    localObject1[16] = new Header("accept-language", "");
    localObject1[17] = new Header("accept-ranges", "");
    localObject1[18] = new Header("accept", "");
    localObject1[19] = new Header("access-control-allow-origin", "");
    localObject1[20] = new Header("age", "");
    localObject1[21] = new Header("allow", "");
    localObject1[22] = new Header("authorization", "");
    localObject1[23] = new Header("cache-control", "");
    localObject1[24] = new Header("content-disposition", "");
    localObject1[25] = new Header("content-encoding", "");
    localObject1[26] = new Header("content-language", "");
    localObject1[27] = new Header("content-length", "");
    localObject1[28] = new Header("content-location", "");
    localObject1[29] = new Header("content-range", "");
    localObject1[30] = new Header("content-type", "");
    localObject1[31] = new Header("cookie", "");
    localObject1[32] = new Header("date", "");
    localObject1[33] = new Header("etag", "");
    localObject1[34] = new Header("expect", "");
    localObject1[35] = new Header("expires", "");
    localObject1[36] = new Header("from", "");
    localObject1[37] = new Header("host", "");
    localObject1[38] = new Header("if-match", "");
    localObject1[39] = new Header("if-modified-since", "");
    localObject1[40] = new Header("if-none-match", "");
    localObject1[41] = new Header("if-range", "");
    localObject1[42] = new Header("if-unmodified-since", "");
    localObject1[43] = new Header("last-modified", "");
    localObject1[44] = new Header("link", "");
    localObject1[45] = new Header("location", "");
    localObject1[46] = new Header("max-forwards", "");
    localObject1[47] = new Header("proxy-authenticate", "");
    localObject1[48] = new Header("proxy-authorization", "");
    localObject1[49] = new Header("range", "");
    localObject1[50] = new Header("referer", "");
    localObject1[51] = new Header("refresh", "");
    localObject1[52] = new Header("retry-after", "");
    localObject1[53] = new Header("server", "");
    localObject1[54] = new Header("set-cookie", "");
    localObject1[55] = new Header("strict-transport-security", "");
    localObject1[56] = new Header("transfer-encoding", "");
    localObject1[57] = new Header("user-agent", "");
    localObject1[58] = new Header("vary", "");
    localObject1[59] = new Header("via", "");
    localObject1[60] = new Header("www-authenticate", "");
    a = (Header[])localObject1;
    localObject1 = new LinkedHashMap(localObject1.length);
    for (;;)
    {
      localObject2 = a;
      if (i >= localObject2.length) {
        break;
      }
      if (!((Map)localObject1).containsKey(a)) {
        ((Map)localObject1).put(a, Integer.valueOf(i));
      }
      i++;
    }
    b = Collections.unmodifiableMap((Map)localObject1);
  }
  
  public static void a(xc.i parami)
  {
    int i = parami.i();
    for (int j = 0; j < i; j++)
    {
      int k = parami.n(j);
      if ((k >= 65) && (k <= 90))
      {
        StringBuilder localStringBuilder = f.l("PROTOCOL_ERROR response malformed: mixed case name: ");
        localStringBuilder.append(parami.t());
        throw new IOException(localStringBuilder.toString());
      }
    }
  }
  
  public static final class Reader
  {
    public final ArrayList a = new ArrayList();
    public final s b;
    public final int c = 4096;
    public int d = 4096;
    public Header[] e = new Header[8];
    public int f = 7;
    public int g = 0;
    public int h = 0;
    
    public Reader(y paramy)
    {
      b = new s(paramy);
    }
    
    public final int a(int paramInt)
    {
      int i = 0;
      int j = 0;
      if (paramInt > 0)
      {
        i = e.length - 1;
        int k = paramInt;
        paramInt = j;
        for (;;)
        {
          j = f;
          if ((i < j) || (k <= 0)) {
            break;
          }
          j = e[i].c;
          k -= j;
          h -= j;
          g -= 1;
          paramInt++;
          i--;
        }
        Header[] arrayOfHeader = e;
        System.arraycopy(arrayOfHeader, j + 1, arrayOfHeader, j + 1 + paramInt, g);
        f += paramInt;
        i = paramInt;
      }
      return i;
    }
    
    public final xc.i b(int paramInt)
    {
      int i;
      if ((paramInt >= 0) && (paramInt <= Hpack.a.length - 1)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        localObject = Hpack.a[paramInt];
      }
      else
      {
        i = Hpack.a.length;
        i = f + 1 + (paramInt - i);
        if (i < 0) {
          break label74;
        }
        localObject = e;
        if (i >= localObject.length) {
          break label74;
        }
        localObject = localObject[i];
      }
      return a;
      label74:
      Object localObject = f.l("Header index too large ");
      ((StringBuilder)localObject).append(paramInt + 1);
      throw new IOException(((StringBuilder)localObject).toString());
    }
    
    public final void c(Header paramHeader)
    {
      a.add(paramHeader);
      int i = c;
      int j = d;
      if (i > j)
      {
        Arrays.fill(e, null);
        f = (e.length - 1);
        g = 0;
        h = 0;
        return;
      }
      a(h + i - j);
      j = g;
      Header[] arrayOfHeader1 = e;
      if (j + 1 > arrayOfHeader1.length)
      {
        Header[] arrayOfHeader2 = new Header[arrayOfHeader1.length * 2];
        System.arraycopy(arrayOfHeader1, 0, arrayOfHeader2, arrayOfHeader1.length, arrayOfHeader1.length);
        f = (e.length - 1);
        e = arrayOfHeader2;
      }
      j = f;
      f = (j - 1);
      e[j] = paramHeader;
      g += 1;
      h += i;
    }
    
    public final xc.i d()
    {
      int i = b.readByte() & 0xFF;
      int j = 0;
      int k;
      if ((i & 0x80) == 128) {
        k = 1;
      } else {
        k = 0;
      }
      i = e(i, 127);
      if (k != 0)
      {
        Huffman localHuffman = Huffman.d;
        Object localObject1 = b;
        long l = i;
        ((s)localObject1).u0(l);
        byte[] arrayOfByte = b.b0(l);
        localHuffman.getClass();
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        localObject1 = a;
        k = 0;
        i = k;
        int m;
        Object localObject2;
        for (;;)
        {
          m = k;
          localObject2 = localObject1;
          if (j >= arrayOfByte.length) {
            break;
          }
          i = i << 8 | arrayOfByte[j] & 0xFF;
          k += 8;
          while (k >= 8)
          {
            m = k - 8;
            localObject1 = a[(i >>> m & 0xFF)];
            if (a == null)
            {
              localByteArrayOutputStream.write(b);
              k -= c;
              localObject1 = a;
            }
            else
            {
              k = m;
            }
          }
          j++;
        }
        while (m > 0)
        {
          localObject1 = a[(i << 8 - m & 0xFF)];
          if ((a != null) || (c > m)) {
            break;
          }
          localByteArrayOutputStream.write(b);
          m -= c;
          localObject2 = a;
        }
        return xc.i.o(localByteArrayOutputStream.toByteArray());
      }
      return b.l(i);
    }
    
    public final int e(int paramInt1, int paramInt2)
    {
      paramInt1 &= paramInt2;
      if (paramInt1 < paramInt2) {
        return paramInt1;
      }
      int i;
      for (paramInt1 = 0;; paramInt1 += 7)
      {
        i = b.readByte() & 0xFF;
        if ((i & 0x80) == 0) {
          break;
        }
        paramInt2 += ((i & 0x7F) << paramInt1);
      }
      return paramInt2 + (i << paramInt1);
    }
  }
  
  public static final class Writer
  {
    public final xc.f a;
    public final boolean b = true;
    public int c = Integer.MAX_VALUE;
    public boolean d;
    public int e = 4096;
    public Header[] f = new Header[8];
    public int g = 7;
    public int h = 0;
    public int i = 0;
    
    public Writer(xc.f paramf)
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
          xc.f localf = new xc.f();
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
      xc.f localf;
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
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Hpack
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
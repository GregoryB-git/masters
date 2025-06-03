package jb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import xc.i;
import xc.i.a;
import xc.s;

public final class e
{
  public static final i a;
  public static final d[] b;
  public static final Map<i, Integer> c;
  
  static
  {
    Object localObject1 = i.d;
    a = i.a.a(":");
    Object localObject2 = new d(d.h, "");
    int i = 0;
    Object localObject3 = d.e;
    localObject1 = new d((i)localObject3, "GET");
    localObject3 = new d((i)localObject3, "POST");
    Object localObject4 = d.f;
    d locald1 = new d((i)localObject4, "/");
    localObject4 = new d((i)localObject4, "/index.html");
    i locali = d.g;
    d locald2 = new d(locali, "http");
    d locald3 = new d(locali, "https");
    locali = d.d;
    b = new d[] { localObject2, localObject1, localObject3, locald1, localObject4, locald2, locald3, new d(locali, "200"), new d(locali, "204"), new d(locali, "206"), new d(locali, "304"), new d(locali, "400"), new d(locali, "404"), new d(locali, "500"), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "") };
    localObject2 = new LinkedHashMap(61);
    for (;;)
    {
      localObject1 = b;
      if (i >= localObject1.length) {
        break;
      }
      if (!((Map)localObject2).containsKey(a)) {
        ((Map)localObject2).put(a, Integer.valueOf(i));
      }
      i++;
    }
    c = Collections.unmodifiableMap((Map)localObject2);
  }
  
  public static void a(i parami)
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
  
  public static final class a
  {
    public final ArrayList a = new ArrayList();
    public final s b;
    public int c = 4096;
    public int d = 4096;
    public d[] e = new d[8];
    public int f = 7;
    public int g = 0;
    public int h = 0;
    
    public a(f.a parama)
    {
      b = new s(parama);
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
        d[] arrayOfd = e;
        System.arraycopy(arrayOfd, j + 1, arrayOfd, j + 1 + paramInt, g);
        f += paramInt;
        i = paramInt;
      }
      return i;
    }
    
    public final i b(int paramInt)
    {
      int i;
      if ((paramInt >= 0) && (paramInt <= e.b.length - 1)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        localObject = e.b[paramInt];
      }
      else
      {
        i = e.b.length;
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
    
    public final void c(d paramd)
    {
      a.add(paramd);
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
      d[] arrayOfd1 = e;
      if (j + 1 > arrayOfd1.length)
      {
        d[] arrayOfd2 = new d[arrayOfd1.length * 2];
        System.arraycopy(arrayOfd1, 0, arrayOfd2, arrayOfd1.length, arrayOfd1.length);
        f = (e.length - 1);
        e = arrayOfd2;
      }
      j = f;
      f = (j - 1);
      e[j] = paramd;
      g += 1;
      h += i;
    }
    
    public final i d()
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
        g localg = g.d;
        Object localObject1 = b;
        long l = i;
        ((s)localObject1).u0(l);
        byte[] arrayOfByte = b.b0(l);
        localg.getClass();
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
        return i.o(localByteArrayOutputStream.toByteArray());
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
  
  public static final class b
  {
    public final xc.f a;
    public d[] b = new d[8];
    public int c;
    public int d = 7;
    public int e;
    
    public b(xc.f paramf)
    {
      a = paramf;
    }
    
    public final void a(int paramInt1, int paramInt2, int paramInt3)
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
 * Qualified Name:     jb.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package okhttp3.internal.http2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import xc.i;
import xc.s;
import xc.y;

final class Hpack$Reader
{
  public final ArrayList a = new ArrayList();
  public final s b;
  public final int c = 4096;
  public int d = 4096;
  public Header[] e = new Header[8];
  public int f = 7;
  public int g = 0;
  public int h = 0;
  
  public Hpack$Reader(y paramy)
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
  
  public final i b(int paramInt)
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

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Hpack.Reader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
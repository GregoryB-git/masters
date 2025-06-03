package U3;

import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.util.Iterator;
import java.util.List;

public class b
  extends Reader
{
  public List o = null;
  public boolean p = false;
  public int q;
  public int r;
  public int s = q;
  public int t = r;
  public boolean u = false;
  
  public void a(String paramString)
  {
    if (!u)
    {
      if (paramString.length() > 0) {
        o.add(paramString);
      }
      return;
    }
    throw new IllegalStateException("Trying to add string after reading");
  }
  
  public final long b(long paramLong)
  {
    long l1 = 0L;
    while ((r < o.size()) && (l1 < paramLong))
    {
      int i = h();
      long l2 = paramLong - l1;
      long l3 = i;
      if (l2 < l3)
      {
        q = ((int)(q + l2));
        l1 += l2;
      }
      else
      {
        l1 += l3;
        q = 0;
        r += 1;
      }
    }
    return l1;
  }
  
  public final void c()
  {
    if (!p)
    {
      if (u) {
        return;
      }
      throw new IOException("Reader needs to be frozen before read operations can be called");
    }
    throw new IOException("Stream already closed");
  }
  
  public void close()
  {
    c();
    p = true;
  }
  
  public final String e()
  {
    String str;
    if (r < o.size()) {
      str = (String)o.get(r);
    } else {
      str = null;
    }
    return str;
  }
  
  public final int h()
  {
    String str = e();
    int i;
    if (str == null) {
      i = 0;
    } else {
      i = str.length() - q;
    }
    return i;
  }
  
  public void i()
  {
    if (!u)
    {
      u = true;
      return;
    }
    throw new IllegalStateException("Trying to freeze frozen StringListReader");
  }
  
  public void mark(int paramInt)
  {
    c();
    s = q;
    t = r;
  }
  
  public boolean markSupported()
  {
    return true;
  }
  
  public int read()
  {
    c();
    String str = e();
    if (str == null) {
      return -1;
    }
    int i = str.charAt(q);
    b(1L);
    return i;
  }
  
  public int read(CharBuffer paramCharBuffer)
  {
    c();
    int i = paramCharBuffer.remaining();
    String str = e();
    int j = 0;
    while ((i > 0) && (str != null))
    {
      int k = Math.min(str.length() - q, i);
      str = (String)o.get(r);
      int m = q;
      paramCharBuffer.put(str, m, m + k);
      i -= k;
      j += k;
      b(k);
      str = e();
    }
    if ((j <= 0) && (str == null)) {
      return -1;
    }
    return j;
  }
  
  public int read(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    c();
    String str = e();
    int i = 0;
    while ((str != null) && (i < paramInt2))
    {
      int j = Math.min(h(), paramInt2 - i);
      int k = q;
      str.getChars(k, k + j, paramArrayOfChar, paramInt1 + i);
      i += j;
      b(j);
      str = e();
    }
    if ((i <= 0) && (str == null)) {
      return -1;
    }
    return i;
  }
  
  public boolean ready()
  {
    c();
    return true;
  }
  
  public void reset()
  {
    q = s;
    r = t;
  }
  
  public long skip(long paramLong)
  {
    c();
    return b(paramLong);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = o.iterator();
    while (localIterator.hasNext()) {
      localStringBuilder.append((String)localIterator.next());
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     U3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
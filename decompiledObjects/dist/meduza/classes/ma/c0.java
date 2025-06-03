package ma;

import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

public final class c0
  extends InputStream
{
  public Iterator<ByteBuffer> a;
  public ByteBuffer b;
  public int c;
  public int d;
  public int e;
  public boolean f;
  public byte[] o;
  public int p;
  public long q;
  
  public c0(ArrayList paramArrayList)
  {
    a = paramArrayList.iterator();
    c = 0;
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      paramArrayList = (ByteBuffer)localIterator.next();
      c += 1;
    }
    d = -1;
    if (!f())
    {
      b = a0.c;
      d = 0;
      e = 0;
      q = 0L;
    }
  }
  
  public final boolean f()
  {
    d += 1;
    if (!a.hasNext()) {
      return false;
    }
    ByteBuffer localByteBuffer = (ByteBuffer)a.next();
    b = localByteBuffer;
    e = localByteBuffer.position();
    if (b.hasArray())
    {
      f = true;
      o = b.array();
      p = b.arrayOffset();
    }
    else
    {
      f = false;
      localByteBuffer = b;
      q = t1.c.j(localByteBuffer, t1.g);
      o = null;
    }
    return true;
  }
  
  public final void g(int paramInt)
  {
    paramInt = e + paramInt;
    e = paramInt;
    if (paramInt == b.limit()) {
      f();
    }
  }
  
  public final int read()
  {
    if (d == c) {
      return -1;
    }
    if (f) {}
    for (int i = o[(e + p)];; i = t1.h(e + q))
    {
      g(1);
      return i & 0xFF;
    }
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (d == c) {
      return -1;
    }
    int i = b.limit();
    int j = e;
    int k = i - j;
    i = paramInt2;
    if (paramInt2 > k) {
      i = k;
    }
    if (f)
    {
      System.arraycopy(o, j + p, paramArrayOfByte, paramInt1, i);
    }
    else
    {
      paramInt2 = b.position();
      b.position(e);
      b.get(paramArrayOfByte, paramInt1, i);
      b.position(paramInt2);
    }
    g(i);
    return i;
  }
}

/* Location:
 * Qualified Name:     ma.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
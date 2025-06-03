package e0;

import g0.M;
import g0.a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public class f
  implements b
{
  public int b;
  public float c = 1.0F;
  public float d = 1.0F;
  public b.a e;
  public b.a f;
  public b.a g;
  public b.a h;
  public boolean i;
  public e j;
  public ByteBuffer k;
  public ShortBuffer l;
  public ByteBuffer m;
  public long n;
  public long o;
  public boolean p;
  
  public f()
  {
    Object localObject = b.a.e;
    e = ((b.a)localObject);
    f = ((b.a)localObject);
    g = ((b.a)localObject);
    h = ((b.a)localObject);
    localObject = b.a;
    k = ((ByteBuffer)localObject);
    l = ((ByteBuffer)localObject).asShortBuffer();
    m = ((ByteBuffer)localObject);
    b = -1;
  }
  
  public final boolean a()
  {
    boolean bool;
    if ((f.a != -1) && ((Math.abs(c - 1.0F) >= 1.0E-4F) || (Math.abs(d - 1.0F) >= 1.0E-4F) || (f.a != e.a))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void b()
  {
    c = 1.0F;
    d = 1.0F;
    Object localObject = b.a.e;
    e = ((b.a)localObject);
    f = ((b.a)localObject);
    g = ((b.a)localObject);
    h = ((b.a)localObject);
    localObject = b.a;
    k = ((ByteBuffer)localObject);
    l = ((ByteBuffer)localObject).asShortBuffer();
    m = ((ByteBuffer)localObject);
    b = -1;
    i = false;
    j = null;
    n = 0L;
    o = 0L;
    p = false;
  }
  
  public final boolean c()
  {
    if (p)
    {
      e locale = j;
      if ((locale == null) || (locale.k() == 0)) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public final ByteBuffer d()
  {
    Object localObject = j;
    if (localObject != null)
    {
      int i1 = ((e)localObject).k();
      if (i1 > 0)
      {
        if (k.capacity() < i1)
        {
          ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(i1).order(ByteOrder.nativeOrder());
          k = localByteBuffer;
          l = localByteBuffer.asShortBuffer();
        }
        else
        {
          k.clear();
          l.clear();
        }
        ((e)localObject).j(l);
        o += i1;
        k.limit(i1);
        m = k;
      }
    }
    localObject = m;
    m = b.a;
    return (ByteBuffer)localObject;
  }
  
  public final void e()
  {
    e locale = j;
    if (locale != null) {
      locale.s();
    }
    p = true;
  }
  
  public final void f(ByteBuffer paramByteBuffer)
  {
    if (!paramByteBuffer.hasRemaining()) {
      return;
    }
    e locale = (e)a.e(j);
    ShortBuffer localShortBuffer = paramByteBuffer.asShortBuffer();
    int i1 = paramByteBuffer.remaining();
    n += i1;
    locale.t(localShortBuffer);
    paramByteBuffer.position(paramByteBuffer.position() + i1);
  }
  
  public final void flush()
  {
    if (a())
    {
      b.a locala = e;
      g = locala;
      Object localObject = f;
      h = ((b.a)localObject);
      if (i)
      {
        j = new e(a, b, c, d, a);
      }
      else
      {
        localObject = j;
        if (localObject != null) {
          ((e)localObject).i();
        }
      }
    }
    m = b.a;
    n = 0L;
    o = 0L;
    p = false;
  }
  
  public final b.a g(b.a parama)
  {
    if (c == 2)
    {
      int i1 = b;
      int i2 = i1;
      if (i1 == -1) {
        i2 = a;
      }
      e = parama;
      parama = new b.a(i2, b, 2);
      f = parama;
      i = true;
      return parama;
    }
    throw new b.b(parama);
  }
  
  public final long h(long paramLong)
  {
    if (o >= 1024L)
    {
      long l1 = n - ((e)a.e(j)).l();
      int i1 = h.a;
      int i2 = g.a;
      if (i1 == i2) {
        paramLong = M.W0(paramLong, l1, o);
      } else {
        paramLong = M.W0(paramLong, l1 * i1, o * i2);
      }
      return paramLong;
    }
    return (c * paramLong);
  }
  
  public final void i(float paramFloat)
  {
    if (d != paramFloat)
    {
      d = paramFloat;
      i = true;
    }
  }
  
  public final void j(float paramFloat)
  {
    if (c != paramFloat)
    {
      c = paramFloat;
      i = true;
    }
  }
}

/* Location:
 * Qualified Name:     e0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
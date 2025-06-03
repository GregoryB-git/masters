package x3;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class c0
  implements f
{
  public int b;
  public float c = 1.0F;
  public float d = 1.0F;
  public f.a e;
  public f.a f;
  public f.a g;
  public f.a h;
  public boolean i;
  public b0 j;
  public ByteBuffer k;
  public ShortBuffer l;
  public ByteBuffer m;
  public long n;
  public long o;
  public boolean p;
  
  public c0()
  {
    Object localObject = f.a.e;
    e = ((f.a)localObject);
    f = ((f.a)localObject);
    g = ((f.a)localObject);
    h = ((f.a)localObject);
    localObject = f.a;
    k = ((ByteBuffer)localObject);
    l = ((ByteBuffer)localObject).asShortBuffer();
    m = ((ByteBuffer)localObject);
    b = -1;
  }
  
  public final ByteBuffer a()
  {
    Object localObject1 = j;
    if (localObject1 != null)
    {
      int i1 = m * b * 2;
      if (i1 > 0)
      {
        if (k.capacity() < i1)
        {
          localObject2 = ByteBuffer.allocateDirect(i1).order(ByteOrder.nativeOrder());
          k = ((ByteBuffer)localObject2);
          l = ((ByteBuffer)localObject2).asShortBuffer();
        }
        else
        {
          k.clear();
          l.clear();
        }
        Object localObject2 = l;
        int i2 = Math.min(((Buffer)localObject2).remaining() / b, m);
        ((ShortBuffer)localObject2).put(l, 0, b * i2);
        int i3 = m - i2;
        m = i3;
        localObject2 = l;
        int i4 = b;
        System.arraycopy(localObject2, i2 * i4, localObject2, 0, i3 * i4);
        o += i1;
        k.limit(i1);
        m = k;
      }
    }
    localObject1 = m;
    m = f.a;
    return (ByteBuffer)localObject1;
  }
  
  public final void b(ByteBuffer paramByteBuffer)
  {
    if (!paramByteBuffer.hasRemaining()) {
      return;
    }
    b0 localb0 = j;
    localb0.getClass();
    ShortBuffer localShortBuffer = paramByteBuffer.asShortBuffer();
    int i1 = paramByteBuffer.remaining();
    n += i1;
    int i2 = localShortBuffer.remaining();
    int i3 = b;
    i2 /= i3;
    short[] arrayOfShort = localb0.b(j, k, i2);
    j = arrayOfShort;
    localShortBuffer.get(arrayOfShort, k * b, i3 * i2 * 2 / 2);
    k += i2;
    localb0.e();
    paramByteBuffer.position(paramByteBuffer.position() + i1);
  }
  
  public final void c()
  {
    b0 localb0 = j;
    if (localb0 != null)
    {
      int i1 = k;
      float f1 = c;
      float f2 = d;
      float f3 = f1 / f2;
      f1 = e;
      int i2 = m + (int)((i1 / f3 + o) / (f1 * f2) + 0.5F);
      j = localb0.b(j, i1, h * 2 + i1);
      int i4;
      for (int i3 = 0;; i3++)
      {
        i4 = h * 2;
        int i5 = b;
        if (i3 >= i4 * i5) {
          break;
        }
        j[(i5 * i1 + i3)] = ((short)0);
      }
      k = (i4 + k);
      localb0.e();
      if (m > i2) {
        m = i2;
      }
      k = 0;
      r = 0;
      o = 0;
    }
    p = true;
  }
  
  public final boolean d()
  {
    if (p)
    {
      b0 localb0 = j;
      if ((localb0 == null) || (m * b * 2 == 0)) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public final f.a e(f.a parama)
  {
    if (c == 2)
    {
      int i1 = b;
      int i2 = i1;
      if (i1 == -1) {
        i2 = a;
      }
      e = parama;
      parama = new f.a(i2, b, 2);
      f = parama;
      i = true;
      return parama;
    }
    throw new f.b(parama);
  }
  
  public final void flush()
  {
    if (isActive())
    {
      Object localObject = e;
      g = ((f.a)localObject);
      f.a locala = f;
      h = locala;
      if (i)
      {
        j = new b0(a, b, c, d, a);
      }
      else
      {
        localObject = j;
        if (localObject != null)
        {
          k = 0;
          m = 0;
          o = 0;
          p = 0;
          q = 0;
          r = 0;
          s = 0;
          t = 0;
          u = 0;
          v = 0;
        }
      }
    }
    m = f.a;
    n = 0L;
    o = 0L;
    p = false;
  }
  
  public final boolean isActive()
  {
    boolean bool;
    if ((f.a != -1) && ((Math.abs(c - 1.0F) >= 1.0E-4F) || (Math.abs(d - 1.0F) >= 1.0E-4F) || (f.a != e.a))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void reset()
  {
    c = 1.0F;
    d = 1.0F;
    Object localObject = f.a.e;
    e = ((f.a)localObject);
    f = ((f.a)localObject);
    g = ((f.a)localObject);
    h = ((f.a)localObject);
    localObject = f.a;
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
}

/* Location:
 * Qualified Name:     x3.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
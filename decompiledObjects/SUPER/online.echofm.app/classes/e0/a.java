package e0;

import X2.v;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

public final class a
{
  public final v a;
  public final List b;
  public ByteBuffer[] c;
  public b.a d;
  public b.a e;
  public boolean f;
  
  public a(v paramv)
  {
    a = paramv;
    b = new ArrayList();
    c = new ByteBuffer[0];
    paramv = b.a.e;
    d = paramv;
    e = paramv;
    f = false;
  }
  
  public b.a a(b.a parama)
  {
    if (!parama.equals(b.a.e))
    {
      for (int i = 0; i < a.size(); i++)
      {
        b localb = (b)a.get(i);
        b.a locala = localb.g(parama);
        if (localb.a())
        {
          g0.a.f(locala.equals(b.a.e) ^ true);
          parama = locala;
        }
      }
      e = parama;
      return parama;
    }
    throw new b.b(parama);
  }
  
  public void b()
  {
    b.clear();
    d = e;
    int i = 0;
    f = false;
    for (int j = 0; j < a.size(); j++)
    {
      b localb = (b)a.get(j);
      localb.flush();
      if (localb.a()) {
        b.add(localb);
      }
    }
    c = new ByteBuffer[b.size()];
    for (j = i; j <= c(); j++) {
      c[j] = ((b)b.get(j)).d();
    }
  }
  
  public final int c()
  {
    return c.length - 1;
  }
  
  public ByteBuffer d()
  {
    if (!f()) {
      return b.a;
    }
    ByteBuffer localByteBuffer = c[c()];
    if (localByteBuffer.hasRemaining()) {
      return localByteBuffer;
    }
    g(b.a);
    return c[c()];
  }
  
  public boolean e()
  {
    boolean bool;
    if ((f) && (((b)b.get(c())).c()) && (!c[c()].hasRemaining())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    if (a.size() != a.size()) {
      return false;
    }
    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) != a.get(i)) {
        return false;
      }
    }
    return true;
  }
  
  public boolean f()
  {
    return b.isEmpty() ^ true;
  }
  
  public final void g(ByteBuffer paramByteBuffer)
  {
    int j;
    do
    {
      int i = 0;
      int k;
      for (j = i; i <= c(); j = k)
      {
        if (c[i].hasRemaining())
        {
          k = j;
        }
        else
        {
          b localb = (b)b.get(i);
          if (localb.c())
          {
            k = j;
            if (!c[i].hasRemaining())
            {
              k = j;
              if (i < c())
              {
                ((b)b.get(i + 1)).e();
                k = j;
              }
            }
          }
          else
          {
            ByteBuffer localByteBuffer;
            if (i > 0) {
              localByteBuffer = c[(i - 1)];
            } else if (paramByteBuffer.hasRemaining()) {
              localByteBuffer = paramByteBuffer;
            } else {
              localByteBuffer = b.a;
            }
            long l = localByteBuffer.remaining();
            localb.f(localByteBuffer);
            c[i] = localb.d();
            if ((l - localByteBuffer.remaining() <= 0L) && (!c[i].hasRemaining())) {
              k = 0;
            } else {
              k = 1;
            }
            k = j | k;
          }
        }
        i++;
      }
    } while (j != 0);
  }
  
  public void h()
  {
    if ((f()) && (!f))
    {
      f = true;
      ((b)b.get(0)).e();
    }
  }
  
  public int hashCode()
  {
    return a.hashCode();
  }
  
  public void i(ByteBuffer paramByteBuffer)
  {
    if ((f()) && (!f)) {
      g(paramByteBuffer);
    }
  }
  
  public void j()
  {
    for (int i = 0; i < a.size(); i++)
    {
      localObject = (b)a.get(i);
      ((b)localObject).flush();
      ((b)localObject).b();
    }
    c = new ByteBuffer[0];
    Object localObject = b.a.e;
    d = ((b.a)localObject);
    e = ((b.a)localObject);
    f = false;
  }
}

/* Location:
 * Qualified Name:     e0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
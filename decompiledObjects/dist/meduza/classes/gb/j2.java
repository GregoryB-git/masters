package gb;

import eb.e1;
import eb.g1;
import eb.j.b;
import eb.j0;
import eb.l;
import eb.t;
import eb.y;
import hb.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m.e;

public final class j2
  implements t0
{
  public final c a;
  public int b = -1;
  public s3 c;
  public l d = j.b.a;
  public final b e = new b();
  public final ByteBuffer f = ByteBuffer.allocate(5);
  public final t3 g;
  public final l3 h;
  public boolean i;
  public int j;
  public int k = -1;
  public long l;
  
  public j2(c paramc, y paramy, l3 paraml3)
  {
    x6.b.y(paramc, "sink");
    a = paramc;
    g = paramy;
    h = paraml3;
  }
  
  public static int f(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    if ((paramInputStream instanceof t)) {
      return ((t)paramInputStream).f(paramOutputStream);
    }
    int m = p7.b.a;
    paramInputStream.getClass();
    paramOutputStream.getClass();
    byte[] arrayOfByte = new byte[' '];
    for (long l1 = 0L;; l1 += m)
    {
      m = paramInputStream.read(arrayOfByte);
      boolean bool = false;
      if (m == -1)
      {
        if (l1 <= 2147483647L) {
          bool = true;
        }
        x6.b.m(l1, "Message size overflow: %s", bool);
        return (int)l1;
      }
      paramOutputStream.write(arrayOfByte, 0, m);
    }
  }
  
  public final t0 a(l paraml)
  {
    x6.b.y(paraml, "Can't pass an empty compressor");
    d = paraml;
    return this;
  }
  
  public final void b(InputStream paramInputStream)
  {
    if (!i)
    {
      j += 1;
      int m = k + 1;
      k = m;
      l = 0L;
      e[] arrayOfe = h.a;
      int n = arrayOfe.length;
      int i1 = 0;
      for (int i2 = 0; i2 < n; i2++) {
        arrayOfe[i2].k(m);
      }
      if (d != j.b.a) {
        m = 1;
      } else {
        m = 0;
      }
      try
      {
        if ((!(paramInputStream instanceof j0)) && (!(paramInputStream instanceof ByteArrayInputStream))) {
          i2 = -1;
        } else {
          i2 = paramInputStream.available();
        }
        if ((i2 != 0) && (m != 0)) {
          m = d(paramInputStream);
        } else {
          m = g(paramInputStream, i2);
        }
        if ((i2 != -1) && (m != i2))
        {
          paramInputStream = String.format("Message length inaccurate %s != %s", new Object[] { Integer.valueOf(m), Integer.valueOf(i2) });
          throw new g1(e1.m.g(paramInputStream));
        }
        paramInputStream = h;
        long l1 = m;
        paramInputStream = a;
        m = paramInputStream.length;
        for (i2 = 0; i2 < m; i2++) {
          paramInputStream[i2].m(l1);
        }
        paramInputStream = h;
        long l2 = l;
        paramInputStream = a;
        m = paramInputStream.length;
        for (i2 = 0; i2 < m; i2++) {
          paramInputStream[i2].n(l2);
        }
        paramInputStream = h;
        n = k;
        l2 = l;
        paramInputStream = a;
        m = paramInputStream.length;
        for (i2 = i1; i2 < m; i2++) {
          paramInputStream[i2].l(n, l2, l1);
        }
        return;
      }
      catch (RuntimeException paramInputStream)
      {
        throw new g1(e1.m.g("Failed to frame message").f(paramInputStream));
      }
      catch (g1 paramInputStream)
      {
        throw paramInputStream;
      }
      catch (IOException paramInputStream)
      {
        throw new g1(e1.m.g("Failed to frame message").f(paramInputStream));
      }
    }
    throw new IllegalStateException("Framer already closed");
  }
  
  public final void c(a parama, boolean paramBoolean)
  {
    Object localObject = a.iterator();
    int m = 0;
    while (((Iterator)localObject).hasNext()) {
      m += ((s3)((Iterator)localObject).next()).b();
    }
    int n = b;
    if ((n >= 0) && (m > n)) {
      throw new g1(e1.k.g(String.format(Locale.US, "message too large %d > %d", new Object[] { Integer.valueOf(m), Integer.valueOf(b) })));
    }
    f.clear();
    f.put(paramBoolean).putInt(m);
    localObject = g.a(5);
    ((o)localObject).write(f.array(), 0, f.position());
    if (m == 0)
    {
      c = ((s3)localObject);
      return;
    }
    a.c((s3)localObject, false, false, j - 1);
    j = 1;
    parama = a;
    for (n = 0; n < parama.size() - 1; n++) {
      a.c((s3)parama.get(n), false, false, 0);
    }
    c = ((s3)parama.get(parama.size() - 1));
    l = m;
  }
  
  public final void close()
  {
    if (!i)
    {
      i = true;
      s3 locals3 = c;
      if ((locals3 != null) && (locals3.b() == 0))
      {
        locals3 = c;
        if (locals3 != null)
        {
          locals3.release();
          c = null;
        }
      }
      locals3 = c;
      c = null;
      a.c(locals3, true, true, j);
      j = 0;
    }
  }
  
  public final int d(InputStream paramInputStream)
  {
    a locala = new a();
    OutputStream localOutputStream = d.b(locala);
    try
    {
      int m = f(paramInputStream, localOutputStream);
      localOutputStream.close();
      int n = b;
      if ((n >= 0) && (m > n)) {
        throw new g1(e1.k.g(String.format(Locale.US, "message too large %d > %d", new Object[] { Integer.valueOf(m), Integer.valueOf(b) })));
      }
      c(locala, true);
      return m;
    }
    finally
    {
      localOutputStream.close();
    }
  }
  
  public final void e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    while (paramInt2 > 0)
    {
      s3 locals3 = c;
      if ((locals3 != null) && (locals3.a() == 0))
      {
        locals3 = c;
        c = null;
        a.c(locals3, false, false, j);
        j = 0;
      }
      if (c == null) {
        c = g.a(paramInt2);
      }
      int m = Math.min(paramInt2, c.a());
      c.write(paramArrayOfByte, paramInt1, m);
      paramInt1 += m;
      paramInt2 -= m;
    }
  }
  
  public final void flush()
  {
    s3 locals3 = c;
    if ((locals3 != null) && (locals3.b() > 0))
    {
      locals3 = c;
      c = null;
      a.c(locals3, false, true, j);
      j = 0;
    }
  }
  
  public final int g(InputStream paramInputStream, int paramInt)
  {
    if (paramInt != -1)
    {
      l = paramInt;
      int m = b;
      if ((m >= 0) && (paramInt > m)) {
        throw new g1(e1.k.g(String.format(Locale.US, "message too large %d > %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(b) })));
      }
      f.clear();
      f.put((byte)0).putInt(paramInt);
      if (c == null) {
        c = g.a(f.position() + paramInt);
      }
      e(f.array(), 0, f.position());
      return f(paramInputStream, e);
    }
    a locala = new a();
    paramInt = f(paramInputStream, locala);
    c(locala, false);
    return paramInt;
  }
  
  public final void h(int paramInt)
  {
    boolean bool;
    if (b == -1) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.I(bool, "max size already set");
    b = paramInt;
  }
  
  public final boolean isClosed()
  {
    return i;
  }
  
  public final class a
    extends OutputStream
  {
    public final ArrayList a = new ArrayList();
    public s3 b;
    
    public a() {}
    
    public final void write(int paramInt)
    {
      s3 locals3 = b;
      if ((locals3 != null) && (locals3.a() > 0))
      {
        b.c((byte)paramInt);
        return;
      }
      write(new byte[] { (byte)paramInt }, 0, 1);
    }
    
    public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      o localo;
      a locala;
      if (b == null)
      {
        localo = g.a(paramInt2);
        locala = this;
      }
      else
      {
        locala = this;
      }
      while (paramInt2 > 0)
      {
        int i = Math.min(paramInt2, b.a());
        if (i == 0)
        {
          i = Math.max(paramInt2, b.b() * 2);
          localo = c.g.a(i);
          b = localo;
          a.add(localo);
        }
        else
        {
          b.write(paramArrayOfByte, paramInt1, i);
          paramInt1 += i;
          paramInt2 -= i;
        }
      }
    }
  }
  
  public final class b
    extends OutputStream
  {
    public b() {}
    
    public final void write(int paramInt)
    {
      write(new byte[] { (byte)paramInt }, 0, 1);
    }
    
    public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      e(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
  
  public static abstract interface c
  {
    public abstract void c(s3 params3, boolean paramBoolean1, boolean paramBoolean2, int paramInt);
  }
}

/* Location:
 * Qualified Name:     gb.j2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package I4;

import M4.l;
import java.io.IOException;
import java.io.InputStream;

public final class a
  extends InputStream
{
  public final InputStream o;
  public final G4.j p;
  public final l q;
  public long r = -1L;
  public long s;
  public long t = -1L;
  
  public a(InputStream paramInputStream, G4.j paramj, l paraml)
  {
    q = paraml;
    o = paramInputStream;
    p = paramj;
    s = paramj.j();
  }
  
  public int available()
  {
    try
    {
      int i = o.available();
      return i;
    }
    catch (IOException localIOException)
    {
      p.A(q.c());
      j.d(p);
      throw localIOException;
    }
  }
  
  public void close()
  {
    long l = q.c();
    if (t == -1L) {
      t = l;
    }
    try
    {
      o.close();
      l = r;
      if (l != -1L) {
        p.y(l);
      }
    }
    catch (IOException localIOException)
    {
      break label103;
    }
    l = s;
    if (l != -1L) {
      p.B(l);
    }
    p.A(t);
    p.g();
    return;
    label103:
    p.A(q.c());
    j.d(p);
    throw localIOException;
  }
  
  public void mark(int paramInt)
  {
    o.mark(paramInt);
  }
  
  public boolean markSupported()
  {
    return o.markSupported();
  }
  
  public int read()
  {
    int i;
    long l;
    try
    {
      i = o.read();
      l = q.c();
      if (s == -1L) {
        s = l;
      }
    }
    catch (IOException localIOException)
    {
      break label104;
    }
    if ((i == -1) && (t == -1L))
    {
      t = l;
      p.A(l);
      p.g();
    }
    else
    {
      l = r + 1L;
      r = l;
      p.y(l);
    }
    return i;
    label104:
    p.A(q.c());
    j.d(p);
    throw localIOException;
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    int i;
    long l;
    try
    {
      i = o.read(paramArrayOfByte);
      l = q.c();
      if (s == -1L) {
        s = l;
      }
    }
    catch (IOException paramArrayOfByte)
    {
      break label105;
    }
    if ((i == -1) && (t == -1L))
    {
      t = l;
      p.A(l);
      p.g();
    }
    else
    {
      l = r + i;
      r = l;
      p.y(l);
    }
    return i;
    label105:
    p.A(q.c());
    j.d(p);
    throw paramArrayOfByte;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    long l;
    try
    {
      paramInt1 = o.read(paramArrayOfByte, paramInt1, paramInt2);
      l = q.c();
      if (s == -1L) {
        s = l;
      }
    }
    catch (IOException paramArrayOfByte)
    {
      break label114;
    }
    if ((paramInt1 == -1) && (t == -1L))
    {
      t = l;
      p.A(l);
      p.g();
    }
    else
    {
      l = r + paramInt1;
      r = l;
      p.y(l);
    }
    return paramInt1;
    label114:
    p.A(q.c());
    j.d(p);
    throw paramArrayOfByte;
  }
  
  public void reset()
  {
    try
    {
      o.reset();
      return;
    }
    catch (IOException localIOException)
    {
      p.A(q.c());
      j.d(p);
      throw localIOException;
    }
  }
  
  public long skip(long paramLong)
  {
    long l;
    try
    {
      paramLong = o.skip(paramLong);
      l = q.c();
      if (s == -1L) {
        s = l;
      }
    }
    catch (IOException localIOException)
    {
      break label100;
    }
    if ((paramLong == -1L) && (t == -1L))
    {
      t = l;
      p.A(l);
    }
    else
    {
      l = r + paramLong;
      r = l;
      p.y(l);
    }
    return paramLong;
    label100:
    p.A(q.c());
    j.d(p);
    throw localIOException;
  }
}

/* Location:
 * Qualified Name:     I4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
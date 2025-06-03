package I4;

import M4.l;
import java.io.IOException;
import java.io.OutputStream;

public final class b
  extends OutputStream
{
  public final OutputStream o;
  public final l p;
  public G4.j q;
  public long r = -1L;
  
  public b(OutputStream paramOutputStream, G4.j paramj, l paraml)
  {
    o = paramOutputStream;
    q = paramj;
    p = paraml;
  }
  
  public void close()
  {
    long l = r;
    if (l != -1L) {
      q.v(l);
    }
    q.z(p.c());
    try
    {
      o.close();
      return;
    }
    catch (IOException localIOException)
    {
      q.A(p.c());
      j.d(q);
      throw localIOException;
    }
  }
  
  public void flush()
  {
    try
    {
      o.flush();
      return;
    }
    catch (IOException localIOException)
    {
      q.A(p.c());
      j.d(q);
      throw localIOException;
    }
  }
  
  public void write(int paramInt)
  {
    try
    {
      o.write(paramInt);
      long l = r + 1L;
      r = l;
      q.v(l);
      return;
    }
    catch (IOException localIOException)
    {
      q.A(p.c());
      j.d(q);
      throw localIOException;
    }
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    try
    {
      o.write(paramArrayOfByte);
      long l = r + paramArrayOfByte.length;
      r = l;
      q.v(l);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      q.A(p.c());
      j.d(q);
      throw paramArrayOfByte;
    }
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      o.write(paramArrayOfByte, paramInt1, paramInt2);
      long l = r + paramInt2;
      r = l;
      q.v(l);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      q.A(p.c());
      j.d(q);
      throw paramArrayOfByte;
    }
  }
}

/* Location:
 * Qualified Name:     I4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package hb;

import c4.x;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jb.a;
import jb.c;
import xc.f;

public final class b
  implements c
{
  public static final Logger d = Logger.getLogger(i.class.getName());
  public final a a;
  public final c b;
  public final j c = new j(Level.FINE);
  
  public b(a parama, a.d paramd)
  {
    x6.b.y(parama, "transportExceptionHandler");
    a = parama;
    b = paramd;
  }
  
  public final void A(boolean paramBoolean, int paramInt, List paramList)
  {
    try
    {
      b.A(paramBoolean, paramInt, paramList);
    }
    catch (IOException paramList)
    {
      a.a(paramList);
    }
  }
  
  public final void L(x paramx)
  {
    Object localObject = c;
    if (((j)localObject).a())
    {
      Logger localLogger = a;
      localObject = b;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(a0.j.u(2));
      localStringBuilder.append(" SETTINGS: ack=true");
      localLogger.log((Level)localObject, localStringBuilder.toString());
    }
    try
    {
      b.L(paramx);
    }
    catch (IOException paramx)
    {
      a.a(paramx);
    }
  }
  
  public final void R(int paramInt, a parama)
  {
    c.e(2, paramInt, parama);
    try
    {
      b.R(paramInt, parama);
    }
    catch (IOException parama)
    {
      a.a(parama);
    }
  }
  
  public final void a0(x paramx)
  {
    c.f(2, paramx);
    try
    {
      b.a0(paramx);
    }
    catch (IOException paramx)
    {
      a.a(paramx);
    }
  }
  
  public final void close()
  {
    try
    {
      b.close();
    }
    catch (IOException localIOException)
    {
      Logger localLogger = d;
      Level localLevel;
      if (localIOException.getClass().equals(IOException.class)) {
        localLevel = Level.FINE;
      } else {
        localLevel = Level.INFO;
      }
      localLogger.log(localLevel, "Failed closing connection", localIOException);
    }
  }
  
  public final void d(int paramInt, long paramLong)
  {
    c.g(2, paramInt, paramLong);
    try
    {
      b.d(paramInt, paramLong);
    }
    catch (IOException localIOException)
    {
      a.a(localIOException);
    }
  }
  
  public final void e(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    long l2;
    Object localObject2;
    if (paramBoolean)
    {
      Object localObject1 = c;
      long l1 = paramInt1;
      l2 = paramInt2;
      if (((j)localObject1).a())
      {
        localObject2 = a;
        localObject1 = b;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(a0.j.u(2));
        localStringBuilder.append(" PING: ack=true bytes=");
        localStringBuilder.append(0xFFFFFFFF & l2 | l1 << 32);
        ((Logger)localObject2).log((Level)localObject1, localStringBuilder.toString());
      }
    }
    else
    {
      localObject2 = c;
      l2 = paramInt1;
      ((j)localObject2).d(2, 0xFFFFFFFF & paramInt2 | l2 << 32);
    }
    try
    {
      b.e(paramInt1, paramInt2, paramBoolean);
    }
    catch (IOException localIOException)
    {
      a.a(localIOException);
    }
  }
  
  public final void flush()
  {
    try
    {
      b.flush();
    }
    catch (IOException localIOException)
    {
      a.a(localIOException);
    }
  }
  
  public final void o0(a parama, byte[] paramArrayOfByte)
  {
    c.c(2, 0, parama, xc.i.o(paramArrayOfByte));
    try
    {
      b.o0(parama, paramArrayOfByte);
      b.flush();
    }
    catch (IOException parama)
    {
      a.a(parama);
    }
  }
  
  public final int t0()
  {
    return b.t0();
  }
  
  public final void u(boolean paramBoolean, int paramInt1, f paramf, int paramInt2)
  {
    j localj = c;
    paramf.getClass();
    localj.b(2, paramInt1, paramf, paramInt2, paramBoolean);
    try
    {
      b.u(paramBoolean, paramInt1, paramf, paramInt2);
    }
    catch (IOException paramf)
    {
      a.a(paramf);
    }
  }
  
  public final void w()
  {
    try
    {
      b.w();
    }
    catch (IOException localIOException)
    {
      a.a(localIOException);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(Exception paramException);
  }
}

/* Location:
 * Qualified Name:     hb.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
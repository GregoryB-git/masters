package x1;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class T
  extends FilterOutputStream
  implements U
{
  public final J o;
  public final Map p;
  public final long q;
  public final long r;
  public long s;
  public long t;
  public V u;
  
  public T(OutputStream paramOutputStream, J paramJ, Map paramMap, long paramLong)
  {
    super(paramOutputStream);
    o = paramJ;
    p = paramMap;
    q = paramLong;
    r = B.A();
  }
  
  private final void b(long paramLong)
  {
    V localV = u;
    if (localV != null) {
      localV.a(paramLong);
    }
    paramLong = s + paramLong;
    s = paramLong;
    if ((paramLong >= t + r) || (paramLong >= q)) {
      c();
    }
  }
  
  public void a(F paramF)
  {
    if (paramF != null) {
      paramF = (V)p.get(paramF);
    } else {
      paramF = null;
    }
    u = paramF;
  }
  
  public final void c()
  {
    if (s > t)
    {
      Iterator localIterator = o.T().iterator();
      while (localIterator.hasNext()) {
        J.a locala = (J.a)localIterator.next();
      }
      t = s;
    }
  }
  
  public void close()
  {
    super.close();
    Iterator localIterator = p.values().iterator();
    while (localIterator.hasNext()) {
      ((V)localIterator.next()).c();
    }
    c();
  }
  
  public void write(int paramInt)
  {
    out.write(paramInt);
    b(1L);
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfByte, "buffer");
    out.write(paramArrayOfByte);
    b(paramArrayOfByte.length);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfByte, "buffer");
    out.write(paramArrayOfByte, paramInt1, paramInt2);
    b(paramInt2);
  }
}

/* Location:
 * Qualified Name:     x1.T
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
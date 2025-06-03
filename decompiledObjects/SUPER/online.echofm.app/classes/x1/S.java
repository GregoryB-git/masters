package x1;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class S
  extends OutputStream
  implements U
{
  public final Handler o;
  public final Map p;
  public F q;
  public V r;
  public int s;
  
  public S(Handler paramHandler)
  {
    o = paramHandler;
    p = new HashMap();
  }
  
  public void a(F paramF)
  {
    q = paramF;
    if (paramF != null) {
      paramF = (V)p.get(paramF);
    } else {
      paramF = null;
    }
    r = paramF;
  }
  
  public final void b(long paramLong)
  {
    F localF = q;
    if (localF == null) {
      return;
    }
    if (r == null)
    {
      localV = new V(o, localF);
      r = localV;
      p.put(localF, localV);
    }
    V localV = r;
    if (localV != null) {
      localV.b(paramLong);
    }
    s += (int)paramLong;
  }
  
  public final int c()
  {
    return s;
  }
  
  public final Map e()
  {
    return p;
  }
  
  public void write(int paramInt)
  {
    b(1L);
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfByte, "buffer");
    b(paramArrayOfByte.length);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfByte, "buffer");
    b(paramInt2);
  }
}

/* Location:
 * Qualified Name:     x1.S
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
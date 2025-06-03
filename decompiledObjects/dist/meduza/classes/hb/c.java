package hb;

import c4.x;
import java.io.Closeable;
import java.util.List;
import jb.a;
import x6.b;
import xc.f;

public abstract class c
  implements jb.c
{
  public final jb.c a;
  
  public c(jb.c paramc)
  {
    b.y(paramc, "delegate");
    a = paramc;
  }
  
  public final void A(boolean paramBoolean, int paramInt, List paramList)
  {
    a.A(paramBoolean, paramInt, paramList);
  }
  
  public final void a0(x paramx)
  {
    a.a0(paramx);
  }
  
  public final void close()
  {
    a.close();
  }
  
  public final void d(int paramInt, long paramLong)
  {
    a.d(paramInt, paramLong);
  }
  
  public final void flush()
  {
    a.flush();
  }
  
  public final void o0(a parama, byte[] paramArrayOfByte)
  {
    a.o0(parama, paramArrayOfByte);
  }
  
  public final int t0()
  {
    return a.t0();
  }
  
  public final void u(boolean paramBoolean, int paramInt1, f paramf, int paramInt2)
  {
    a.u(paramBoolean, paramInt1, paramf, paramInt2);
  }
  
  public final void w()
  {
    a.w();
  }
}

/* Location:
 * Qualified Name:     hb.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
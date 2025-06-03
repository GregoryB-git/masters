package okhttp3.internal.http2;

import java.util.ArrayList;
import xc.h;
import xc.i;

abstract interface Http2Reader$Handler
{
  public abstract void a();
  
  public abstract void b(int paramInt1, int paramInt2, h paramh, boolean paramBoolean);
  
  public abstract void c();
  
  public abstract void d(int paramInt, long paramLong);
  
  public abstract void e(int paramInt1, int paramInt2, boolean paramBoolean);
  
  public abstract void f(Settings paramSettings);
  
  public abstract void g(int paramInt, ErrorCode paramErrorCode);
  
  public abstract void h(int paramInt, ArrayList paramArrayList);
  
  public abstract void i(int paramInt, i parami);
  
  public abstract void j(int paramInt, ArrayList paramArrayList, boolean paramBoolean);
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Http2Reader.Handler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
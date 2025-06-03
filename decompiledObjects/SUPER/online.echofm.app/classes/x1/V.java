package x1;

import android.os.Handler;

public final class V
{
  public final Handler a;
  public final F b;
  public final long c;
  public long d;
  public long e;
  public long f;
  
  public V(Handler paramHandler, F paramF)
  {
    a = paramHandler;
    b = paramF;
    c = B.A();
  }
  
  public final void a(long paramLong)
  {
    paramLong = d + paramLong;
    d = paramLong;
    if ((paramLong >= e + c) || (paramLong >= f)) {
      c();
    }
  }
  
  public final void b(long paramLong)
  {
    f += paramLong;
  }
  
  public final void c()
  {
    if (d > e) {
      b.o();
    }
  }
}

/* Location:
 * Qualified Name:     x1.V
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
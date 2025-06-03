package v3;

import android.os.SystemClock;
import v5.e0;
import x6.b;
import z4.s;
import z4.t.b;

public final class n
  extends c1
{
  public final int c;
  public final String d;
  public final int e;
  public final i0 f;
  public final int o;
  public final s p;
  public final boolean q;
  
  static
  {
    e0.E(1001);
    e0.E(1002);
    e0.E(1003);
    e0.E(1004);
    e0.E(1005);
    e0.E(1006);
  }
  
  public n(int paramInt1, int paramInt2, Throwable paramThrowable)
  {
    this(paramInt1, paramThrowable, paramInt2, null, -1, null, 4, false);
  }
  
  public n(int paramInt1, Throwable paramThrowable, int paramInt2, String paramString, int paramInt3, i0 parami0, int paramInt4, boolean paramBoolean)
  {
    this((String)localObject, paramThrowable, paramInt2, paramInt1, paramString, paramInt3, parami0, paramInt4, null, SystemClock.elapsedRealtime(), paramBoolean);
  }
  
  public n(String paramString1, Throwable paramThrowable, int paramInt1, int paramInt2, String paramString2, int paramInt3, i0 parami0, int paramInt4, t.b paramb, long paramLong, boolean paramBoolean)
  {
    super(paramString1, paramThrowable, paramInt1, paramLong);
    boolean bool1 = false;
    boolean bool2;
    if ((paramBoolean) && (paramInt2 != 1)) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    b.q(bool2);
    if (paramThrowable == null)
    {
      bool2 = bool1;
      if (paramInt2 != 3) {}
    }
    else
    {
      bool2 = true;
    }
    b.q(bool2);
    c = paramInt2;
    d = paramString2;
    e = paramInt3;
    f = parami0;
    o = paramInt4;
    p = paramb;
    q = paramBoolean;
  }
  
  public final n a(t.b paramb)
  {
    return new n(getMessage(), getCause(), a, c, d, e, f, o, paramb, b, q);
  }
  
  public final RuntimeException b()
  {
    boolean bool;
    if (c == 2) {
      bool = true;
    } else {
      bool = false;
    }
    b.H(bool);
    Throwable localThrowable = getCause();
    localThrowable.getClass();
    return (RuntimeException)localThrowable;
  }
}

/* Location:
 * Qualified Name:     v3.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
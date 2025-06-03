package k0;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import d0.B;
import d0.q;
import g0.M;
import g0.a;
import java.io.IOException;
import x0.x.b;

public final class u
  extends B
{
  public static final String E = M.w0(1001);
  public static final String F = M.w0(1002);
  public static final String G = M.w0(1003);
  public static final String H = M.w0(1004);
  public static final String I = M.w0(1005);
  public static final String J = M.w0(1006);
  public final q A;
  public final int B;
  public final x.b C;
  public final boolean D;
  public final int x;
  public final String y;
  public final int z;
  
  public u(int paramInt1, Throwable paramThrowable, int paramInt2)
  {
    this(paramInt1, paramThrowable, null, paramInt2, null, -1, null, 4, false);
  }
  
  public u(int paramInt1, Throwable paramThrowable, String paramString1, int paramInt2, String paramString2, int paramInt3, q paramq, int paramInt4, boolean paramBoolean)
  {
    this(e(paramInt1, paramString1, paramString2, paramInt3, paramq, paramInt4), paramThrowable, paramInt2, paramInt1, paramString2, paramInt3, paramq, paramInt4, null, SystemClock.elapsedRealtime(), paramBoolean);
  }
  
  public u(String paramString1, Throwable paramThrowable, int paramInt1, int paramInt2, String paramString2, int paramInt3, q paramq, int paramInt4, x.b paramb, long paramLong, boolean paramBoolean)
  {
    super(paramString1, paramThrowable, paramInt1, Bundle.EMPTY, paramLong);
    boolean bool1 = false;
    boolean bool2;
    if ((paramBoolean) && (paramInt2 != 1)) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    a.a(bool2);
    if (paramThrowable == null)
    {
      bool2 = bool1;
      if (paramInt2 != 3) {}
    }
    else
    {
      bool2 = true;
    }
    a.a(bool2);
    x = paramInt2;
    y = paramString2;
    z = paramInt3;
    A = paramq;
    B = paramInt4;
    C = paramb;
    D = paramBoolean;
  }
  
  public static u b(Throwable paramThrowable, String paramString, int paramInt1, q paramq, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    if (paramq == null) {
      paramInt2 = 4;
    }
    return new u(1, paramThrowable, null, paramInt3, paramString, paramInt1, paramq, paramInt2, paramBoolean);
  }
  
  public static u c(IOException paramIOException, int paramInt)
  {
    return new u(0, paramIOException, paramInt);
  }
  
  public static u d(RuntimeException paramRuntimeException, int paramInt)
  {
    return new u(2, paramRuntimeException, paramInt);
  }
  
  public static String e(int paramInt1, String paramString1, String paramString2, int paramInt2, q paramq, int paramInt3)
  {
    if (paramInt1 != 0)
    {
      if (paramInt1 != 1)
      {
        if (paramInt1 != 3) {
          paramString2 = "Unexpected runtime error";
        } else {
          paramString2 = "Remote error";
        }
      }
      else
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(paramString2);
        localStringBuilder.append(" error, index=");
        localStringBuilder.append(paramInt2);
        localStringBuilder.append(", format=");
        localStringBuilder.append(paramq);
        localStringBuilder.append(", format_supported=");
        localStringBuilder.append(M.Y(paramInt3));
        paramString2 = localStringBuilder.toString();
      }
    }
    else {
      paramString2 = "Source error";
    }
    paramq = paramString2;
    if (!TextUtils.isEmpty(paramString1))
    {
      paramq = new StringBuilder();
      paramq.append(paramString2);
      paramq.append(": ");
      paramq.append(paramString1);
      paramq = paramq.toString();
    }
    return paramq;
  }
  
  public u a(x.b paramb)
  {
    return new u((String)M.i(getMessage()), getCause(), o, x, y, z, A, B, paramb, p, D);
  }
  
  public Exception f()
  {
    int i = x;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    a.f(bool);
    return (Exception)a.e(getCause());
  }
  
  public IOException g()
  {
    boolean bool;
    if (x == 0) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    return (IOException)a.e(getCause());
  }
  
  public RuntimeException h()
  {
    boolean bool;
    if (x == 2) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    return (RuntimeException)a.e(getCause());
  }
}

/* Location:
 * Qualified Name:     k0.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
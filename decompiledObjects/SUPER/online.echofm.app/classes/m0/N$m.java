package m0;

import android.os.SystemClock;
import g0.o;

public final class N$m
  implements B.a
{
  public N$m(N paramN) {}
  
  public void a(int paramInt, long paramLong)
  {
    if (N.H(a) != null)
    {
      long l1 = SystemClock.elapsedRealtime();
      long l2 = N.M(a);
      N.H(a).k(paramInt, paramLong, l1 - l2);
    }
  }
  
  public void b(long paramLong)
  {
    if (N.H(a) != null) {
      N.H(a).b(paramLong);
    }
  }
  
  public void c(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Spurious audio timestamp (frame position mismatch): ");
    ((StringBuilder)localObject).append(paramLong1);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(paramLong2);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(paramLong3);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(paramLong4);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(N.K(a));
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(N.L(a));
    localObject = ((StringBuilder)localObject).toString();
    if (!N.n0)
    {
      o.h("DefaultAudioSink", (String)localObject);
      return;
    }
    throw new N.i((String)localObject, null);
  }
  
  public void d(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Spurious audio timestamp (system clock mismatch): ");
    ((StringBuilder)localObject).append(paramLong1);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(paramLong2);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(paramLong3);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(paramLong4);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(N.K(a));
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(N.L(a));
    localObject = ((StringBuilder)localObject).toString();
    if (!N.n0)
    {
      o.h("DefaultAudioSink", (String)localObject);
      return;
    }
    throw new N.i((String)localObject, null);
  }
  
  public void e(long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Ignoring impossibly large audio latency: ");
    localStringBuilder.append(paramLong);
    o.h("DefaultAudioSink", localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     m0.N.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
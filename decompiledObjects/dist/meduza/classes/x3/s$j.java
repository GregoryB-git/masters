package x3;

import android.os.Handler;
import android.os.SystemClock;
import v5.m;

public final class s$j
  implements o.a
{
  public s$j(s params) {}
  
  public final void a(long paramLong)
  {
    Object localObject = a.r;
    if (localObject != null)
    {
      localObject = a.L0;
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new h((l.a)localObject, paramLong));
      }
    }
  }
  
  public final void b(int paramInt, long paramLong)
  {
    if (a.r != null)
    {
      long l1 = SystemClock.elapsedRealtime();
      Object localObject = a;
      long l2 = a0;
      l.a locala = r).a.L0;
      localObject = a;
      if (localObject != null) {
        ((Handler)localObject).post(new k(locala, paramInt, paramLong, l1 - l2));
      }
    }
  }
  
  public final void c(long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Ignoring impossibly large audio latency: ");
    localStringBuilder.append(paramLong);
    m.f("DefaultAudioSink", localStringBuilder.toString());
  }
  
  public final void d(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Spurious audio timestamp (frame position mismatch): ");
    ((StringBuilder)localObject1).append(paramLong1);
    ((StringBuilder)localObject1).append(", ");
    ((StringBuilder)localObject1).append(paramLong2);
    ((StringBuilder)localObject1).append(", ");
    ((StringBuilder)localObject1).append(paramLong3);
    ((StringBuilder)localObject1).append(", ");
    ((StringBuilder)localObject1).append(paramLong4);
    ((StringBuilder)localObject1).append(", ");
    ((StringBuilder)localObject1).append(a.z());
    ((StringBuilder)localObject1).append(", ");
    ((StringBuilder)localObject1).append(a.A());
    localObject1 = ((StringBuilder)localObject1).toString();
    Object localObject2 = s.d0;
    m.f("DefaultAudioSink", (String)localObject1);
  }
  
  public final void e(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
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
    ((StringBuilder)localObject).append(a.z());
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(a.A());
    String str = ((StringBuilder)localObject).toString();
    localObject = s.d0;
    m.f("DefaultAudioSink", str);
  }
}

/* Location:
 * Qualified Name:     x3.s.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package c8;

import android.os.Handler;
import android.os.HandlerThread;
import i6.t;
import p6.a;
import u7.f;

public final class r
{
  public static a g = new a("TokenRefresher", new String[] { "FirebaseAuth:" });
  public volatile long a;
  public volatile long b;
  public long c;
  public HandlerThread d;
  public com.google.android.gms.internal.firebase-auth-api.zze e;
  public t f;
  
  public r(f paramf)
  {
    g.e("Initializing TokenRefresher", new Object[0]);
    HandlerThread localHandlerThread = new HandlerThread("TokenRefresher", 10);
    d = localHandlerThread;
    localHandlerThread.start();
    e = new com.google.android.gms.internal.firebase_auth_api.zze(d.getLooper());
    paramf.a();
    f = new t(this, b);
    c = 300000L;
  }
  
  public final void a()
  {
    a locala = g;
    long l1 = a;
    long l2 = c;
    StringBuilder localStringBuilder = new StringBuilder("Scheduling refresh for ");
    localStringBuilder.append(l1 - l2);
    locala.e(localStringBuilder.toString(), new Object[0]);
    e.removeCallbacks(f);
    l1 = System.currentTimeMillis();
    b = (Math.max(a - l1 - c, 0L) / 1000L);
    e.postDelayed(f, b * 1000L);
  }
}

/* Location:
 * Qualified Name:     c8.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
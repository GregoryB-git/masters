package O5;

import E5.k;
import E5.k.c;
import E5.k.d;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.firebase.messaging.T;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import y5.f;

public class e
  implements k.c
{
  public final AtomicBoolean a = new AtomicBoolean(false);
  public k b;
  public io.flutter.embedding.engine.a c;
  
  public static void m(long paramLong)
  {
    a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("callback_handle", paramLong).apply();
  }
  
  public static void n(long paramLong)
  {
    a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("user_callback_handle", paramLong).apply();
  }
  
  public void d(final Intent paramIntent, final CountDownLatch paramCountDownLatch)
  {
    if (c == null)
    {
      Log.i("FLTFireBGExecutor", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
      return;
    }
    if (paramCountDownLatch != null) {
      paramCountDownLatch = new a(paramCountDownLatch);
    } else {
      paramCountDownLatch = null;
    }
    paramIntent = (T)paramIntent.getParcelableExtra("notification");
    if (paramIntent != null)
    {
      paramIntent = z.f(paramIntent);
      b.d("MessagingBackground#onMessage", new b(paramIntent), paramCountDownLatch);
    }
    else
    {
      Log.e("FLTFireBGExecutor", "RemoteMessage instance not found in Intent.");
    }
  }
  
  public final long e()
  {
    return a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0L);
  }
  
  public final long f()
  {
    return a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("user_callback_handle", 0L);
  }
  
  public final void g(E5.c paramc)
  {
    paramc = new k(paramc, "plugins.flutter.io/firebase_messaging_background");
    b = paramc;
    paramc.e(this);
  }
  
  public boolean h()
  {
    boolean bool;
    if (e() != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean i()
  {
    return a.get() ^ true;
  }
  
  public final void l()
  {
    a.set(true);
    FlutterFirebaseMessagingBackgroundService.m();
  }
  
  public void o()
  {
    if (i())
    {
      long l = e();
      if (l != 0L) {
        p(l, null);
      }
    }
  }
  
  public void onMethodCall(E5.j paramj, k.d paramd)
  {
    if (a.equals("MessagingBackground#initialized"))
    {
      l();
      paramd.a(Boolean.TRUE);
    }
    else
    {
      paramd.c();
    }
  }
  
  public void p(long paramLong, v5.j paramj)
  {
    if (c != null)
    {
      Log.e("FLTFireBGExecutor", "Background isolate already started.");
      return;
    }
    f localf = new f();
    Handler localHandler = new Handler(Looper.getMainLooper());
    localHandler.post(new c(this, localf, localHandler, paramj, paramLong));
  }
  
  public class a
    implements k.d
  {
    public a(CountDownLatch paramCountDownLatch) {}
    
    public void a(Object paramObject)
    {
      paramCountDownLatch.countDown();
    }
    
    public void b(String paramString1, String paramString2, Object paramObject)
    {
      paramCountDownLatch.countDown();
    }
    
    public void c()
    {
      paramCountDownLatch.countDown();
    }
  }
  
  public class b
    extends HashMap
  {
    public b(Map paramMap)
    {
      put("userCallbackHandle", Long.valueOf(e.c(e.this)));
      put("message", paramMap);
    }
  }
}

/* Location:
 * Qualified Name:     O5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
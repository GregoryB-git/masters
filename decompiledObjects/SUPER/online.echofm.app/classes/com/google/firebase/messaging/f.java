package com.google.firebase.messaging;

import E2.l;
import V2.m;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import w.h.b;
import w.h.e;

public class f
{
  public final ExecutorService a;
  public final Context b;
  public final L c;
  
  public f(Context paramContext, L paramL, ExecutorService paramExecutorService)
  {
    a = paramExecutorService;
    b = paramContext;
    c = paramL;
  }
  
  public boolean a()
  {
    if (c.a("gcm.n.noui")) {
      return true;
    }
    if (b()) {
      return false;
    }
    H localH = d();
    d.a locala = d.e(b, c);
    e(a, localH);
    c(locala);
    return true;
  }
  
  public final boolean b()
  {
    boolean bool1 = ((KeyguardManager)b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (!l.f()) {
      SystemClock.sleep(10L);
    }
    int i = Process.myPid();
    Object localObject = ((ActivityManager)b.getSystemService("activity")).getRunningAppProcesses();
    bool1 = bool2;
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo;
      do
      {
        bool1 = bool2;
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      } while (pid != i);
      bool1 = bool2;
      if (importance == 100) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final void c(d.a parama)
  {
    if (Log.isLoggable("FirebaseMessaging", 3)) {
      Log.d("FirebaseMessaging", "Showing notification");
    }
    ((NotificationManager)b.getSystemService("notification")).notify(b, c, a.c());
  }
  
  public final H d()
  {
    H localH = H.e(c.p("gcm.n.image"));
    if (localH != null) {
      localH.k(a);
    }
    return localH;
  }
  
  public final void e(h.e parame, H paramH)
  {
    if (paramH == null) {
      return;
    }
    try
    {
      Bitmap localBitmap = (Bitmap)m.b(paramH.h(), 5L, TimeUnit.SECONDS);
      parame.p(localBitmap);
      h.b localb = new w/h$b;
      localb.<init>();
      parame.y(localb.i(localBitmap).h(null));
    }
    catch (ExecutionException parame) {}catch (TimeoutException parame)
    {
      Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
      paramH.close();
    }
    catch (InterruptedException parame)
    {
      Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
      paramH.close();
      Thread.currentThread().interrupt();
    }
    paramH = new StringBuilder();
    paramH.append("Failed to download image: ");
    paramH.append(parame.getCause());
    Log.w("FirebaseMessaging", paramH.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */